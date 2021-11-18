package com.naveen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naveen.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
