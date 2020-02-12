/*
package com.howtodoinjava.demo.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.howtodoinjava.demo.model.Event;

import reactor.core.publisher.Flux;
 
public interface EmployeeRepository extends ReactiveMongoRepository<Event, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Event> findByName(final String name);
}*/
