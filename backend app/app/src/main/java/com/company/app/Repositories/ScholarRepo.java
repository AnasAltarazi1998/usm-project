package com.company.app.Repositories;

import com.company.app.entities.ScholarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScholarRepo extends CrudRepository<ScholarEntity,Long>{
    
}
