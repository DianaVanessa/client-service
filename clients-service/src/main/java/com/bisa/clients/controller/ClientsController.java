package com.bisa.clients.controller;

import com.bisa.clients.api.*;
import com.bisa.clients.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/management",consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
public class ClientsController {
  @Autowired
  private ClientService clientService;

  @PostMapping("/createPerson")
  @Operation(summary = "Registra a una persona", description = "Registra a una persona")
  public ResponseEntity<CreatePersonResponse> createPerson(@RequestBody @Valid CreatePersonRequest request) throws Exception {
    return ResponseEntity.ok(clientService.createPerson(request));
  }

  @PostMapping("/createClient")
  @Operation(summary = "Registra a un cliente", description = "Registra a un cliente")
  public ResponseEntity<CreateClientResponse> createClient(@RequestBody @Valid CreateClientRequest request) throws Exception {
    return ResponseEntity.ok(clientService.createClient(request));
  }

  @PostMapping("/createPersonalReference")
  @Operation(summary = "Registra una referencia", description = "Registra una reference")
  public ResponseEntity<CreatePersonalReferenceResponse> createPersonalReference(@RequestBody @Valid CreatePersonalReferenceRequest request) throws Exception {
    return ResponseEntity.ok(clientService.createPersonalReference(request));
  }

  @PostMapping("/removePersonalReference")
  @Operation(summary = "Remueve una referencia", description = "Remueve una referencia")
  public ResponseEntity<RemovePersonalReferenceResponse> createPerson(@RequestBody @Valid RemovePersonalReferenceRequest request) throws Exception {
    return ResponseEntity.ok(clientService.removePersonalReference(request));
  }
}
