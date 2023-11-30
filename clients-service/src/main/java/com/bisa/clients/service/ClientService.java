package com.bisa.clients.service;

import com.bisa.clients.api.*;

public interface ClientService {

  CreatePersonResponse createPerson(CreatePersonRequest request) throws Exception;
  CreateClientResponse createClient(CreateClientRequest request) throws Exception;
  CreatePersonalReferenceResponse createPersonalReference(CreatePersonalReferenceRequest request);
  RemovePersonalReferenceResponse removePersonalReference(RemovePersonalReferenceRequest request);
}
