package com.company.app.Repositories;

import java.util.List;
import java.util.Optional;

import com.company.app.entities.BoardEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepo extends CrudRepository<BoardEntity, Long> {
    public Optional<BoardEntity> findByName(String name);

    @Query("SELECT b FROM BoardEntity b WHERE b.name LIKE %?1% ")
    List<BoardEntity> search(String val);
}
