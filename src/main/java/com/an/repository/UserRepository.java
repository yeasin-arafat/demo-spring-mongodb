package com.an.repository;

import com.an.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since  : 6/15/17
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findFirstByUserName(String userName);
}
