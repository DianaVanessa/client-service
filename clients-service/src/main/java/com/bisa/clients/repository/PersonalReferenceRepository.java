package com.bisa.clients.repository;

import com.bisa.clients.entity.PersonalReferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalReferenceRepository extends JpaRepository<PersonalReferenceEntity, Long> {
}
