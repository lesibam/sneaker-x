package net.iqbusiness.sneakerx.persistence.entity;

import lombok.Getter;
import javax.persistence.Entity;
import javax.persistene.Id;

@Getter
@Entity
public class UserRole {
  @Id
  private Long id;
  
  private String username;
  private String password; 
  private boolean enabled;
  private UserRole userRole;
}
