import retrofit2.Call;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/classJava")
public class EndpointsJava implements InterfaceEndpointsJava, InterfaceRetrofit {

    @retrofit2.http.GET("/retroinClass")
    Call<List<TestObject>> getRetroTest(){
        return null;
    }

    @Path("test")
    @GET
    public String getMessage0() {
        return "Hello";
    }

    @Override
    public Call<List<TestObject>> getAllObjects() {
        return null;
    }


//    @Override
//    public String getMessage() {
//        return null;
//    }

//    @Override
//    public String getMessage1() {
//        return null;
//    }

    @Override
    public String getMessage2() {
        return null;
    }

    @Override
    public String getMessage3() {
        return null;
    }

    @Override
    public String getMessage4() {
        return null;
    }

    @Override
    public String getMessage5() {
        return null;
    }
}
