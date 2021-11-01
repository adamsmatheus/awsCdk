package com.adams.aws.repository;

import com.adams.aws.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {

    Optional<User> findById(String id);
}
