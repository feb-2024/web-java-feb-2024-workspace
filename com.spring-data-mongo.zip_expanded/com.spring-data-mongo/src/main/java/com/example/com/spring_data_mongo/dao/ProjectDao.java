package com.example.com.spring_data_mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.com.spring_data_mongo.entity.ProjectEntity;

public interface ProjectDao extends MongoRepository<ProjectEntity, Integer>{

}
