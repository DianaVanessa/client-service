package com.bisa.clients.api;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Data
@Accessors(chain = true)
public class CreateClientRequest implements Serializable {
  @NotNull
  @Min(1)
  private Long idPerson;
  @NotNull
  @NotBlank
  private String email;
  @NotNull
  @NotBlank
  private String phone;
  @NotNull
  @NotBlank
  private String profession;
  @NotNull
  @NotBlank
  private String clientStatus;
}
