package com.bisa.clients.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="personal_reference")
public class PersonalReferenceEntity implements Serializable {
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdClient() {
    return idClient;
  }

  public void setIdClient(Long idClient) {
    this.idClient = idClient;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long idClient;
  private String name;
  private String phone;
  private String relation;
}
