import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    @BeforeEach
    public void beforeEach() {
        RestAssured.baseURI = "https://httpbin.org";
    }

    @Test
    public void sendFirstQuery() {
        ExtractableResponse<Response> response = given()
                .queryParams("p1", "v1")
                .queryParams("p2", "v2")
                .when()
                .get("/anything")
                .then()
                .assertThat()
                .statusCode(200)
                .extract();

        Map<String, String> args = response.jsonPath().getMap("args");
        Assertions.assertEquals("v1", args.get("p1"), "Отличается первый аргумент.");
        Assertions.assertEquals("v2", args.get("p2"), "Отличается второй аргумент.");
    }

    @Test
    public void sendSecondQuery() {
        String requestBody = "{\n" +
                "  \"parameter\": \"value\"\n}";

        ExtractableResponse<Response> response = given()
                .body(requestBody)
                .when()
                .post("/anything")
                .then()
                .assertThat()
                .statusCode(200)
                .extract();

        Map<String, String> json = response.jsonPath().getMap("json");
        Assertions.assertEquals(json.get("parameter"), "value", "Отличается аргумент.");
    }

    @Test
    public void sendThirdQuery() {
        given()
                .auth()
                .basic("user", "password")
                .when()
                .get("/basic-auth/user/password")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void sendFourthQuery() {
        given()
                .auth()
                .oauth2("123")
                .when()
                .get("/bearer")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
