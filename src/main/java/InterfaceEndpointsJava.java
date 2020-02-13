import retrofit2.Call;
import retrofit2.http.GET;

import javax.ws.rs.Path;
import java.util.List;

public interface InterfaceEndpointsJava {

    @Path("interfaceGetMessagePathJava")
    @javax.ws.rs.GET
    String getMessage0();

//    @GET("classJava")
//    String getMessage();

    @GET("RclassJava")
    Call<List<TestObject>> getAllObjects();

    @GET("RclassJava2")
    String getMessage2();

    @GET("RclassJava/test")
    String getMessage3();

    @GET("/classJava/test")
    String getMessage4();

    @GET("/")
    String getMessage5();


}
