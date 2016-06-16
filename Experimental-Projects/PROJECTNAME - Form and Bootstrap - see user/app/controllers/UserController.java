package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

import java.util.List;
import java.util.ArrayList;

import play.data.Form;

import views.html.users.*;

public class UserController extends Controller {
	
	public static final Form<User>userForm=Form.form(User.class);
	Context	ctx=Context.current();
	Request request=ctx.request();
	
	
	public static Result list(){
		List<User>users=User.findAll();
		return ok(list.render(users));
	}
	public static Result newUser(){
		return ok(details.render(userForm));
		
	}
	
	public static Result details(String ean){
		final User user = User.findByEan(ean);
		if(user==null){
			return notFound(String.format("User %s does not exist", ean));
			
		}
		Form<User>filledForm=userForm.fill(user);
		return ok(details.render(filledForm));
		
	}
	
	public static Result save(){
		Form<User>boundForm=userForm.bindFromRequest(); /*bining from form*/
		User user=boundForm.get();
		
		if(boundForm.hasErrors()){
			flash("error","pleace correct the form below");
			return badRequest(details.render(boundForm));
			
		}
		
		flash("success",String.format("Successfully added user %s", user));
		return redirect(routes.UserController.list());
		
	}
}