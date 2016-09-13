package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Company extends Controller {
    
    public static Result index() {
        return ok(views.html.company.render(" Hello Mahendra"));
    }
    
}
