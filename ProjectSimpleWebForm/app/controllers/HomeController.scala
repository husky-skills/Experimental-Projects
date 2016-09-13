package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import models.Stock
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport{

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  val stockForm = Form(mapping(
    "symbol" -> nonEmptyText,
    "company" -> optional(text)
  )(Stock.apply)(Stock.unapply))

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def add = Action {
    Ok(views.html.form(stockForm))
  }
  /**
    * Handle the 'add' form submission.
    */
  def save = Action { implicit request =>
    stockForm.bindFromRequest.fold(
      // (1) on a validation error go back to the form
      errors => BadRequest(views.html.form(errors)),
      // (2) on success create the stock, go to another page
      stock => {
        Stock.save(stock)
        Redirect(routes.HomeController.index)

      }
    )
  }
}
