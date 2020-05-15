import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//############## TEST - https://youtrack.jetbrains.com/issue/IDEA-232324

@Path("/helloworld")
public class SingleEndpoint {

    @GET
    @Produces
    public String getMessage() {
        return "Hello World";
    }

}