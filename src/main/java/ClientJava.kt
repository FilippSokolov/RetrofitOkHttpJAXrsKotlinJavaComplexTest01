import okhttp3.HttpUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.MalformedURLException
import javax.ws.rs.ApplicationPath

@ApplicationPath("/")
class ClientJava {
    @Throws(MalformedURLException::class, Exception::class)
    fun callEndpoint(): List<TestObject?>? {
        val httpUrl = HttpUrl.get("https://localhost:8080/")
        val retrofit = Retrofit.Builder() //.baseUrl("https://api.github.com")
                .baseUrl("https://localhost:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val service = retrofit.create(InterfaceRetrofit::class.java)
        val testObjects = service.allObjects
        return testObjects!!.execute().body()
    }
}