import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;


public interface InterfaceRetrofit {

    @GET("RclassJava")
    Call<List<TestObject>> getAllObjects();

    @GET("group/{id}/users")
    Call<List<TestObject>> groupList(@Path("id") int groupId, @Query("sort") String sort);

    @GET("https://localhost:8080/")
    String getMessage2();

    @GET("RclassJava/test")
    String getMessage3();

    @GET("/classJava1/test")
    String getMessage4();

    @GET("/")
    String getMessage5();
}
