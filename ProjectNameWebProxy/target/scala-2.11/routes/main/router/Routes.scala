
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mahendra/ProjectNameWebProxy/conf/routes
// @DATE:Thu Jun 23 03:25:37 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ScalaApplication_3: controllers.ScalaApplication,
  // @LINE:7
  Application_2: controllers.Application,
  // @LINE:8
  MainController_0: controllers.MainController,
  // @LINE:12
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ScalaApplication_3: controllers.ScalaApplication,
    // @LINE:7
    Application_2: controllers.Application,
    // @LINE:8
    MainController_0: controllers.MainController,
    // @LINE:12
    Assets_1: controllers.Assets
  ) = this(errorHandler, ScalaApplication_3, Application_2, MainController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ScalaApplication_3, Application_2, MainController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """google""", """controllers.ScalaApplication.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """amazon""", """controllers.MainController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ScalaApplication_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("google")))
  )
  private[this] lazy val controllers_ScalaApplication_index0_invoker = createInvoker(
    ScalaApplication_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaApplication",
      "index",
      Nil,
      "GET",
      """GET     /                           controllers.WSApplication.index()""",
      this.prefix + """google"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_MainController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("amazon")))
  )
  private[this] lazy val controllers_MainController_index2_invoker = createInvoker(
    MainController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """amazon"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ScalaApplication_index0_route(params) =>
      call { 
        controllers_ScalaApplication_index0_invoker.call(ScalaApplication_3.index())
      }
  
    // @LINE:7
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(Application_2.index())
      }
  
    // @LINE:8
    case controllers_MainController_index2_route(params) =>
      call { 
        controllers_MainController_index2_invoker.call(MainController_0.index())
      }
  
    // @LINE:12
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_1.at(path, file))
      }
  }
}
