package controllers
import play.api._
import play.api.libs.ws.WSClient
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import javax.inject.Inject

 class ScalaApplication @Inject() (ws: WSClient) extends Controller {
  def index = Action.async {
    ws.url("http://google.com").get().map(r => Ok(r.body).as("text/html"))
  }

}