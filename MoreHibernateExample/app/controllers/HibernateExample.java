package controllers;

import models.Department;
import models.UserDetails;
import models.Address;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


import play.db.jpa.JPAApi;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import javax.persistence.EntityManager;
import play.Logger;
import javax.inject.Inject;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mahendra on 30-06-2016.
 */
public class HibernateExample  extends Controller{
    JPAApi jpaApi;
    @Inject

    public HibernateExample(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }
    @Transactional(readOnly = true)
    public Result index(){
        HashSet<Address> addressHashSet = new HashSet<Address>();
        addressHashSet.add(new Address("A-104", "Pipeline Road", "Pune"));
        addressHashSet.add(new Address("ABBB", "New LandMark", "MyCity"));

        UserDetails userDetails = new UserDetails("Mahendra Shinde", addressHashSet, new Department("IT", "DLF3DA"), new Date(), "He is duffer");
        EntityManager em = jpaApi.em();
        em.getTransaction().begin();
        em.persist(userDetails);
        em.getTransaction().commit();

        return ok(views.html.index.render("User is stored...!"));

    }
    @Transactional
    public Result read(){
        List<UserDetails> returnUser  = null;
        //returnUser = JPA.em().find(UserDetails.class, 1);
        //Logger.error(returnUser.getFullName());
         returnUser = jpaApi.em().createQuery("SELECT c FROM UserDetails c",  UserDetails.class).getResultList();
        return ok(Json.toJson(returnUser));
    }
}
