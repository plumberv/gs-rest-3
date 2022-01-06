package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.restservice.model.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import com.example.restservice.controller.*;

@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan({"com.example.restservice.model","com.example.restservice.controller"})
//@EnableJpaRepositories ("com.example.restservice.model")
public class RestServiceApplication {

    //private static String PERSISTENCE_UNIT_NAME = "todos";
    //private static EntityManagerFactory factory;
	
	//public CustomerRepository cr;
    
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
        System.out.println(">>end of rest application");
    }

}
