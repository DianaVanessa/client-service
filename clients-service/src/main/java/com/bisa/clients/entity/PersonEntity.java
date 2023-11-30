package com.bisa.clients.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="person")
public class PersonEntity {
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getSecondLastName() {
    return secondLastName;
  }

  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }

  public Date getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(Date dateBirth) {
    this.dateBirth = dateBirth;
  }

  public String getGeograficAddress() {
    return geograficAddress;
  }

  public void setGeograficAddress(String geograficAddress) {
    this.geograficAddress = geograficAddress;
  }

  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public String getNumberAddress() {
    return numberAddress;
  }

  public void setNumberAddress(String numberAddress) {
    this.numberAddress = numberAddress;
  }

  public String getAddressReference() {
    return addressReference;
  }

  public void setAddressReference(String addressReference) {
    this.addressReference = addressReference;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String lastname;
  private String secondLastName;
  private Date dateBirth;
  private String geograficAddress;
  private String zone;
  private String numberAddress;
  private String addressReference;
}
