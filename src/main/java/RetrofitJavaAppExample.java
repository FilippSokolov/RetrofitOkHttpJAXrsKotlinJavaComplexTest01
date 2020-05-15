import okhttp3.ResponseBody;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import retrofit2.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;


//###################### TEST - https://youtrack.jetbrains.com/issue/IDEA-232889

public class RetrofitJavaAppExample {

    interface GithubGistService {
        @GET("https://gist.githubusercontent.com/FilippSokolov/f5b81b5c07ef5f73bd40c964295c9e9b/raw/9edc125ec113d74bc2144e5640c42eaaa3cb0837/{id}")
        Call<Task> getGithubGist(@Path("id") String id);
    }

    @Root(name = "task")
    public static class Task {
        @Element(name = "id")
        private long id;
        @Element(name = "author")
        private String author;
        @Element(name = "title")
        private String title;

        public Task() {
        }
    }


    public static void main(String[] args) {

        System.out.println("Test - xml converter");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:3000")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        GithubGistService gistService = retrofit.create(GithubGistService.class);



        try {
            Response<Task> response = gistService.getGithubGist("test1.xml").execute();
            Task task = response.body();
            System.out.println("Request done");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
