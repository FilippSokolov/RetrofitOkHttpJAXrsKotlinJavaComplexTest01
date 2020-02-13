import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface InterfaceRetrofit {
    @get:GET("RclassJava")
    val allObjects: Call<List<TestObject?>?>?

    @GET("group/{id}/users")
    fun groupList(@Path("id") groupId: Int, @Query("sort") sort: String?): Call<List<TestObject?>?>?

    @get:GET("https://localhost:8080/")
    val getMessage2: String?

    @get:GET("RclassJava/test")
    val getMessage3: String?

    @get:GET("/classJava1/test")
    val getMessage4: String?

    @get:GET("/")
    val getMessage5: String?
}