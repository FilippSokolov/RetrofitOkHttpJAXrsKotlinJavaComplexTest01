import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.ws.rs.ApplicationPath;
import java.net.MalformedURLException;
import java.util.List;

@ApplicationPath("/")
public class ClientJava {
    public List<TestObject> callEndpoint() throws MalformedURLException, Exception {
        HttpUrl httpUrl = HttpUrl.get("https://localhost:8080/");

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("https://api.github.com")
                .baseUrl("https://localhost:8080/classJava1/interfaceGetMessagePathJava")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceRetrofit service = retrofit.create(InterfaceRetrofit.class);
        Call<List<TestObject>> testObjects = service.getAllObjects();
        return testObjects.execute().body();

    }


}
