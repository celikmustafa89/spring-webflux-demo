package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.service.EventService;
import com.howtodoinjava.demo.service.KafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

import reactor.core.publisher.Mono;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @Autowired
    KafkaService kafkaService;
 
    @RequestMapping(value = { "/create", "/" }, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Mono<String> create(@RequestBody String event) {
        //eventService.create(event);
        Boolean aBoolean = kafkaService.writeKafka(event);
        return Mono.just(aBoolean.toString());
    }

    @RequestMapping(value = { "/create1", "/" }, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Mono<String> create1(@RequestBody String event) {
        System.out.printf(event);
        return Mono.just(event);
    }
  /*
   @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Mono<Event>> findById(@PathVariable("id") Integer id) {
        Mono<Event> e = eventService.findById(id);
        HttpStatus status = e != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Mono<Event>>(e, status);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Flux<Event> findByName(@PathVariable("name") String name) {
        return employeeService.findByName(name);
    }
 
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<Event> findAll() {
        Flux<Event> emps = employeeService.findAll();
        return emps;
    }
 
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public Mono<Event> update(@RequestBody Event e) {
        return employeeService.update(e);
    }
 
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        employeeService.delete(id).subscribe();
    }*/
 
}
