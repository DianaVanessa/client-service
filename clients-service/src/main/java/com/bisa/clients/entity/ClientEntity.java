package com.bisa.clients.entity;

import javax.persistence.*;

@Entity
@Table(name="client")
public class ClientEntity {
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdPerson() {
    return idPerson;
  }

  public void setIdPerson(Long idPerson) {
    this.idPerson = idPerson;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public String getClientStatus() {
    return clientStatus;
  }

  public void setClientStatus(String clientStatus) {
    this.clientStatus = clientStatus;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long idPerson;
  private String email;
  private String phone;
  private String profession;
  private String clientStatus;
}
