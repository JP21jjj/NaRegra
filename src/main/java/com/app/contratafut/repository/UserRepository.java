package com.app.contratafut.repository;

import com.app.contratafut.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByType(String type);
}