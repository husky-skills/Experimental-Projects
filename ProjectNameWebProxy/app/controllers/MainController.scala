package controllers
import play.api._
import play.api.mvc._
import javax.inject.Inject
import play.api.libs.ws._
import scala.concurrent.ExecutionContext.Implicits.global

class MainController @Inject() (ws: WSAPI) extends Controller {
  val url = "http://www.amazon.com" 
   def index ()= Action.async {
       
    ws.url(url).get().map(r => {Ok(r.body).as("text/html")})


  }
}