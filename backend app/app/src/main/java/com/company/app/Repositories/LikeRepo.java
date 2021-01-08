package com.company.app.Repositories;

import com.company.app.entities.LikeEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepo extends CrudRepository<LikeEntity, Long> {

}
