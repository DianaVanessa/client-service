package com.bisa.clients.api;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CreateClientResponse {
  private Long id;
  private String status;
}
