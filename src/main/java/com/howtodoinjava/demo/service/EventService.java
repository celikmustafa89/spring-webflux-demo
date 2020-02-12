package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.Event;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class EventService implements IEventService {

    public void create(String e) {
        //System.out.println(e);
    }
    /*public Mono<Employee> findById(Integer id) {
        return employeeRepo.findById(id);
    }

    public Flux<Employee> findByName(String name) {
        return employeeRepo.findByName(name);
    }

    public Flux<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Mono<Employee> update(Employee e) {
        return employeeRepo.save(e);
    }

    public Mono<Void> delete(Integer id) {
        return employeeRepo.deleteById(id);
    }*/
}