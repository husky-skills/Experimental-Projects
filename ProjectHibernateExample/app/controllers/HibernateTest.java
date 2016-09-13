package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import play.db.jpa.JPAApi;
import javax.inject.Inject;
import play.db.jpa.Transactional;
import play.db.jpa.JPA;
import javax.persistence.EntityManager;
import models.UserDetails;
import play.Logger;

public class HibernateTest extends Controller {

   JPAApi jpaApi;
    @Inject
    public HibernateTest(JPAApi api) {
        this.jpaApi = api;
    }

    @Transactional(readOnly = true)
    public Result index() {
        Logger.info("***************** Hi Mahendra ***************************");
        final EntityManager em = jpaApi.em();
        UserDetails userDetails = new UserDetails(10, "Mahendra Shinde ");
        em.getTransaction().begin();
        em.persist(userDetails);
        em.getTransaction().commit();


        userDetails = null;
        userDetails = JPA.em().find(UserDetails.class, 10);
        Logger.info("Got userDetail: {} {}", userDetails.getUserId(), userDetails.getUserName());
        return ok(views.html.index.render(" Hello from "+userDetails.getUserName()+" ID: "+ userDetails.getUserId()));


    }
   
}
