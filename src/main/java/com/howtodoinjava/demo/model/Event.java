package com.howtodoinjava.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Event {
 
    String event;
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "Event["+ event +"]";
    }
}
