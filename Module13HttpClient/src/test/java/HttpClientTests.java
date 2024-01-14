import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HttpClientTests {

    @Test
    public void checkGetRequest() {
        DummyJsonClientImpl dummyJsonClient = new DummyJsonClientImpl();
        Response<User> response = dummyJsonClient.getUser(1);

        Assertions.assertEquals(200, response.getCode(), "Код ответа 200");
        Assertions.assertEquals(1, response.getObject().getId(), "Id пользователя совпадает");
        Assertions.assertEquals("atuny0", response.getObject().getUsername(), "Имя пользователя совпадает");
        Assertions.assertEquals("9uQFF1Lh", response.getObject().getPassword(), "Пароль пользователя совпадает");
    }

    @Test
    public void checkAuthLogin() {
        DummyJsonClientImpl dummyJsonClient = new DummyJsonClientImpl();
        Response<User> userObj = dummyJsonClient.getUser(1);

        Response<Token> response = dummyJsonClient.login(userObj.getObject());

        Assertions.assertEquals(200, response.getCode(), "Код ответа 200");
        Assertions.assertNotNull(response.getObject(), "Объект с токеном существует");
    }

    @Test
    public void checkGetPosts() {
        DummyJsonClientImpl dummyJsonClient = new DummyJsonClientImpl();
        Response<User> user = dummyJsonClient.getUser(1);
        Response<Token> token = dummyJsonClient.login(user.getObject());
        Response<Post> post = dummyJsonClient.getPosts(user.getObject(), token.getObject());

        Assertions.assertEquals(200, post.getCode(), "Код ответа 200");
        Assertions.assertEquals("His mother had always taught him", post.getObject().getTitle(), "Заголовки сходятся");
        Assertions.assertEquals(9, post.getObject().getUserId(), "userId сходятся");
    }
}
