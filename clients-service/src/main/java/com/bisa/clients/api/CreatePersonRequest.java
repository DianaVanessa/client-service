package com.bisa.clients.api;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class CreatePersonRequest implements Serializable {
  @NotNull
  @NotBlank
  private String name;
  @NotNull
  @NotBlank
  private String lastname;
  @NotNull
  @NotBlank
  private String secondLastName;
  private Date dateBirth;
  @NotNull
  @NotBlank
  private String geograficAddress;
  @NotNull
  @NotBlank
  private String zone;
  @NotNull
  @NotBlank
  private String numberAddress;
  @NotNull
  @NotBlank
  private String addressReference;
}
