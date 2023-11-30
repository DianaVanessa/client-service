package com.bisa.clients.service;

import com.bisa.clients.api.*;
import com.bisa.clients.entity.ClientEntity;
import com.bisa.clients.entity.PersonEntity;
import com.bisa.clients.repository.ClientRepository;
import com.bisa.clients.repository.PersonRepository;
import com.bisa.clients.repository.PersonalReferenceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
  @Autowired
  private PersonRepository personRepository;
  @Autowired
  private ClientRepository clientRepository;
  @Autowired
  private PersonalReferenceRepository personalReferenceRepository;

  private static final Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);
  @Override
  public CreatePersonResponse createPerson(CreatePersonRequest request) throws Exception {
    try{
      PersonEntity entity = new PersonEntity();
      entity.setName(request.getName());
      entity.setLastname(request.getLastname());
      entity.setSecondLastName(request.getSecondLastName());
      entity.setDateBirth(request.getDateBirth());
      entity.setZone(request.getZone());
      entity.setGeograficAddress(request.getGeograficAddress());
      entity.setAddressReference(request.getAddressReference());
      entity.setNumberAddress(request.getNumberAddress());
      entity = personRepository.save(entity);
      return new CreatePersonResponse().setId(entity.getId());
    } catch (Exception ex) {
      logger.error(ex.getMessage());
      throw new Exception(ex.getMessage());
    }
  }

  @Override
  public CreateClientResponse createClient(CreateClientRequest request) throws Exception {
    try{
      PersonEntity person = new PersonEntity();
      person = personRepository.getById(request.getIdPerson());
      if (person.getId() == null) {
        throw new Exception("La persona no existe");
      }
      ClientEntity entity = new ClientEntity();
      entity.setIdPerson(request.getIdPerson());
      entity.setClientStatus("CREADO");
      entity.setEmail(request.getEmail());
      entity.setPhone(request.getPhone());
      entity.setProfession(request.getProfession());
      entity = clientRepository.save(entity);
      return new CreateClientResponse().setId(entity.getId()).setStatus(entity.getClientStatus());
    } catch (Exception ex) {
      logger.error(ex.getMessage());
      throw new Exception(ex.getMessage());
    }
  }

  @Override
  public CreatePersonalReferenceResponse createPersonalReference(CreatePersonalReferenceRequest request) {
    return null;
  }

  @Override
  public RemovePersonalReferenceResponse removePersonalReference(RemovePersonalReferenceRequest request) {
    return null;
  }
}
