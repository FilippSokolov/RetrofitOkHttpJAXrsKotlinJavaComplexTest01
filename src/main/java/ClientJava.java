import okhttp3.HttpUrl;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.net.MalformedURLException;
import java.net.URL;

@ApplicationPath("/")
public class ClientJava extends Application {
    private final String CONST = "users";

    public void getEndpointTest1() throws MalformedURLException {
        HttpUrl aseUrl1 = HttpUrl.get("https://localhost:8080/");
        HttpUrl url2 = HttpUrl.parse("https://localhost:8080/");
        HttpUrl.Builder builder = aseUrl1.newBuilder("http://localhost:8080/");


                //not supported (segment)
        HttpUrl baseUrl = HttpUrl.parse("https://localhost:8080/")
                .newBuilder()
                .addPathSegment("/helloworld")
                .build();

        //############### TEST - https://youtrack.jetbrains.com/issue/IDEA-225473

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://localhost:8080/classJava1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        System.out.println("sdf");

        new URL("");

    }
}
