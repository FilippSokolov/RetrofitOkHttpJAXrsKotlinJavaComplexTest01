import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/hello")
class Endpoints : InterfaceEndpoints {
    @GET
    @Path("/doSomeInterfaceMethod")
    @Produces("text/plain")
    override fun doSomething(): String {
        return "!!!";
    }

    @GET
    @Path("/test")
    @Produces("text/plain")
     fun doSomething2(): String {
        return "!!!!";
    }

    //    @GET
    //    @Path("/doSomeClassMethod")
    //    @Produces("text/plain")
    //    public String doSomething1() {
    //        return ("test");
    //    }
}