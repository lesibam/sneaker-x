package net.iqbusiness.sneakerx.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;

@Entity
@Getter
public class UserRole {
  
  @Id
  private Long id;
  private String role;
  
}
