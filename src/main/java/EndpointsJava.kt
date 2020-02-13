import retrofit2.Call
import retrofit2.http.GET
import javax.ws.rs.Path

@Path("/classJava1")
class EndpointsJava : InterfaceEndpointsJava, InterfaceRetrofit {
    @get:GET("/retroinClass")
    val retroTest: Call<List<TestObject>>?
        get() = null

    @Path("test")
    @javax.ws.rs.GET
     fun getMessage0(): String {
        return "Hello"
    }

    override fun getAllObjects(): Call<List<TestObject>> {
        return null
    }

    override fun groupList(groupId: Int, sort: String?): Call<List<TestObject?>?>? {
        return null
    }

    //    @Override
    //    public String getMessage() {
    //        return null;
    //    }
    //    @Override
    //    public String getMessage1() {
    //        return null;
    //    }
//    override fun getMessage2(): String {
//        return null
//    }
//
//    override fun getMessage3(): String {
//        return null
//    }
//
//    override fun getMessage4(): String {
//        return null
//    }
//
//    override fun getMessage5(): String {
//        return null
//    }
}