
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png")),format.raw/*7.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*8.35*/routes/*8.41*/.Assets.at("bootstrap.min.css")),format.raw/*8.72*/("""'>
    <script type='text/javascript' src='"""),_display_(/*9.42*/routes/*9.48*/.Assets.at("bootstrap.min.js")),format.raw/*9.78*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*10.42*/routes/*10.48*/.Assets.at("jquery.min.js")),format.raw/*10.75*/("""'></script>
    <style>
    body """),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
        """),format.raw/*13.9*/("""margin-top: 50px;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</style>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(/*21.59*/title),format.raw/*21.64*/("""</a>
            </div>
        </div>
    </div>
    <div class="container">
        """),_display_(/*26.10*/content),format.raw/*26.17*/("""
    """),format.raw/*27.5*/("""</div>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jun 23 03:00:51 IST 2016
                  SOURCE: C:/Users/Mahendra/ProjectNameWebProxy/app/views/main.scala.html
                  HASH: 5487339791b021ab0d49d4be7e98cd9067d10e12
                  MATRIX: 748->1|873->31|901->33|969->75|994->80|1083->143|1097->149|1149->181|1212->218|1226->224|1277->255|1347->299|1361->305|1411->335|1491->388|1506->394|1554->421|1615->454|1644->455|1680->464|1729->486|1757->487|1789->492|2017->693|2043->698|2157->785|2185->792|2217->797
                  LINES: 27->1|32->1|34->3|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|44->13|45->14|45->14|46->15|52->21|52->21|57->26|57->26|58->27
                  -- GENERATED --
              */
          