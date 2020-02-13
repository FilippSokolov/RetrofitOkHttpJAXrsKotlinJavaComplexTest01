import retrofit2.Call
import javax.ws.rs.GET
import javax.ws.rs.Path

interface InterfaceEndpointsJava {
    @get:GET
    @get:Path("interfaceGetMessagePathJava")
    val getMessage0: String?

    //    @GET("classJava")
    //    String getMessage();
    @get:retrofit2.http.GET("RclassJava")
    val allObjects: Call<List<TestObject?>?>?

    @get:retrofit2.http.GET("RclassJava2")
    val getMessage2: String?

    @get:retrofit2.http.GET("RclassJava/test")
    val getMessage3: String?

    @get:retrofit2.http.GET("/classJava1/test")
    val getMessage4: String?

    @get:retrofit2.http.GET("/")
    val getMessage5: String?
    fun getAllObjects(): Call<List<TestObject>>
}