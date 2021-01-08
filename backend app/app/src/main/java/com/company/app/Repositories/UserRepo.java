package com.company.app.Repositories;

import java.util.List;
import java.util.Optional;

import com.company.app.entities.BoardEntity;
import com.company.app.entities.UserEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity,Long>{
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByName(String name);
    @Query("SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :pass")
    Optional<UserEntity> signInFun(@Param("email") String email, @Param("pass") String password);
    @Query("SELECT u.boards FROM UserEntity u WHERE u.id = :id")
    List<BoardEntity> getBoards(@Param("id") Long id);
    @Query("SELECT u FROM UserEntity u WHERE u.name LIKE %:val% ")
    Optional<List<UserEntity>> search(@Param("val") String val);
   
}
