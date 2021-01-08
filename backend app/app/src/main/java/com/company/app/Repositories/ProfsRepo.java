package com.company.app.Repositories;

import java.util.Optional;

import com.company.app.entities.ProfsEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfsRepo extends CrudRepository<ProfsEntity, Long> {
    public Optional<ProfsEntity> findByEmail(String email);
}
