package controllers;

import javax.inject.Inject;

import play.mvc.*;
import play.libs.ws.*;
import java.util.concurrent.*;
import org.w3c.dom.Document;

// Need to debug this example 

public class WSApplication extends Controller {
		String url = "http://www.google.com";		
		@Inject 
		WSClient ws;	
	public CompletionStage<Document> index(){
		/*
		WSRequest request = ws.url(url);
		WSResponse response = request.get();
		return Ok(response.map(
		new Function<CompletionStage<WSResponse> r, WSResponse>(){
			return r.getBody();
		}
		));	 */
			CompletionStage<Document> documentPromise = ws.url(url).get()
        .thenApply(WSResponse::asXml);
		
		return documentPromise;
	}
	
}
