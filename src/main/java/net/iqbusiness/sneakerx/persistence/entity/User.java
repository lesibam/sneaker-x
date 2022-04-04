package net.iqbusiness.sneakerx.persistence.entity;

import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Entity
public class User {
  @Id
  private Long id;
  
  private String username;
  private String password; 
  private boolean enabled;

  @OneToOne
  private UserRole userRole;
}
