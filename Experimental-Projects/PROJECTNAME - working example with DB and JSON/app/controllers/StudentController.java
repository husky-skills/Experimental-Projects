package controllers;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import models.Student;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static play.libs.Json.toJson;

public class StudentController extends Controller {

    @Transactional(readOnly = true)
    public static Result listStudents() {
        CriteriaBuilder cb = JPA.em().getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        CriteriaQuery<Student> all = cq.select(root);
        TypedQuery<Student> allQuery = JPA.em().createQuery(all);
        JsonNode jsonNodes = toJson(allQuery.getResultList());
        return ok(jsonNodes);
    }

    @Transactional
    @BodyParser.Of(BodyParser.Json.class)
    public static Result addStudent() {
        ObjectMapper mapper = new ObjectMapper();
        try {
			Student newStudent = new Student();
			newStudent.setName( "Mahendra");
			newStudent.setLastName("Shinde");
            JPA.em().persist(newStudent);
            ObjectNode result = Json.newObject();
            result.put("Student", Json.toJson(newStudent));
            return created(result);
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest("Missing information");
        }

    }


}