package net.iqbusiness.sneakerx.persistence.entity;

import lombok.Getter;
import javax.persistence.Entity;
import javax.persistene.Id;

@Getter
@Entity
publc class UserRole {
  @Id
  private Long id;
  
  private String username;
  private String password; 
  private boolean enabled;
  prviate UserRole userRole;
}
