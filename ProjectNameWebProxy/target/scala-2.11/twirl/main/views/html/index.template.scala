
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

    """),format.raw/*5.5*/("""<div class="well">
        <h1>"""),_display_(/*6.14*/message),format.raw/*6.21*/("""</h1>
    </div>

""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jun 23 03:00:51 IST 2016
                  SOURCE: C:/Users/Mahendra/ProjectNameWebProxy/app/views/index.scala.html
                  HASH: 95706a93413d49a99dda050f6298f9a351b75706
                  MATRIX: 745->1|857->18|885->21|926->54|965->56|997->62|1055->94|1082->101|1130->120
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|40->9
                  -- GENERATED --
              */
          