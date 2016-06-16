package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class About extends Controller {

    public static Result index() {
        return ok(views.html.about2.render("About Company Page"));
    }

}
