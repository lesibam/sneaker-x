package net.iqbusiness.sneakerx.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

  @RequestMapping(method = GET)
  public String helloUser() {
    return "Hello Sneaker Head";
  }
  
}
