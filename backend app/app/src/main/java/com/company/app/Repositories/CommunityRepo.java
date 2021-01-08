package com.company.app.Repositories;

import java.util.List;
import java.util.Optional;

import com.company.app.entities.CommunityEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepo extends CrudRepository<CommunityEntity, Long> {
    Optional<CommunityEntity> findByName(String name);

    @Query("SELECT c FROM CommunityEntity c  ")
    Optional<List<CommunityEntity>> getAllCommunities();

    @Query("SELECT c FROM CommunityEntity c WHERE c.name LIKE %:val% ")
    Optional<List<CommunityEntity>> search(@Param("val") String val);

}
