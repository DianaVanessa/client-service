package com.bisa.clients.api;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class CreatePersonalReferenceRequest implements Serializable {
  private String name;
  private String phone;
  private String relation;
}
