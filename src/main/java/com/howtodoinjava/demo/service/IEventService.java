package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.Event;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface IEventService
{
    void create(String e);
    /*
    Mono<Employee> findById(Integer id);

    Flux<Employee> findByName(String name);

    Flux<Employee> findAll();

    Mono<Employee> update(Employee e);

    Mono<Void> delete(Integer id);*/
}