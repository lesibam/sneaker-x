package net.iqbusiness.sneakerx.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import javax.ws.rs.QueryParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

  @Autowired
  private EntityManager entityManager;

  @RequestMapping(method = GET)
  public String helloUser() {
    return "Hello Sneaker Head";
  }

  @GetMapping("/vulnerability")
  public String runSQLQuery(@QueryParam("sqlQuery") String sqlQuery) {
    Query namedQuery = entityManager.createNamedQuery(sqlQuery);
    entityManager.flush();
    return namedQuery.toString();
  }

}
