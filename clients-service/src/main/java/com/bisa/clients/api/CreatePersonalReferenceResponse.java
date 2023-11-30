package com.bisa.clients.api;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class CreatePersonalReferenceResponse implements Serializable {
  private Long id;
}
