import okhttp3.HttpUrl
import java.net.MalformedURLException
import java.util.*
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("/")
class Client : Application() {


    @Throws(MalformedURLException::class)
    fun callEndpoint() {
        val httpUrl = HttpUrl.get("https://localhost:8080/hello/test")
    }
}