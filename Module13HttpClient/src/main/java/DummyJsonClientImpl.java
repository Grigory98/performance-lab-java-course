import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DummyJsonClientImpl implements DummyJsonClient {

    private final Gson gson = new Gson();

    @Override
    public Response<User> getUser(int id) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        final HttpGet httpGet = new HttpGet("https://dummyjson.com/users/" + id);
        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String json = EntityUtils.toString(response.getEntity());
            User user = gson.fromJson(json, User.class);
            return new Response<User>(response.getCode(), user);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Response<Token> login(User u) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            final HttpPost httpPost = new HttpPost("https://dummyjson.com/auth/login");
            List<NameValuePair> params = new ArrayList<>(2);
            params.add(new BasicNameValuePair("username", u.getUsername()));
            params.add(new BasicNameValuePair("password", u.getPassword()));

            httpPost.setEntity(new UrlEncodedFormEntity(params, StandardCharsets.UTF_8));
            CloseableHttpResponse response = httpClient.execute(httpPost);

            String json = EntityUtils.toString(response.getEntity());
            Token token = gson.fromJson(json, Token.class);
            return new Response<Token>(response.getCode(), token);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Response<Post> getPosts(User u, Token token) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            final HttpGet httpGet = new HttpGet("https://dummyjson.com/auth/posts/" + u.getId());
            httpGet.addHeader("Authorization", "Bearer " + token.getToken());
            CloseableHttpResponse response = httpClient.execute(httpGet);

            String json = EntityUtils.toString(response.getEntity());
            Post post = gson.fromJson(json, Post.class);
            return new Response<Post>(response.getCode(), post);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
