package net.iqbusiness.sneakerx.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.QueryParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

  private final EntityManager entityManager;

  public UsersController(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @RequestMapping(method = GET)
  public String helloUser() {
    return "Hello Sneaker Head";
  }

  @GetMapping("/vulnerability")
  public String runSQLQuery(@QueryParam("sqlQuery") String sqlQuery) {
    List resultList = entityManager.createNativeQuery("SELECT * FROM poop where id='" + sqlQuery + "';").getResultList();
    entityManager.flush();
    return resultList.toString();
  }

}
