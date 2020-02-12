package com.howtodoinjava.demo.service;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Service;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Project: spring-webflux-demo Created by Mustafa Çelik on 12/24/19, Tue Contact:
 * celikmustafa89@gmail.com
 */
@Service
public class KafkaService {

    private KafkaProducer kafkaProducer;

    @PostConstruct
    public void initializeKafkaProducer(){

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        kafkaProducer = new KafkaProducer(properties);
    }

    public Boolean writeKafka(String message) {

        try{
            kafkaProducer.send(new ProducerRecord("test", "key", message));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    @PreDestroy
    public void destroy(){
        kafkaProducer.close();
    }
}
