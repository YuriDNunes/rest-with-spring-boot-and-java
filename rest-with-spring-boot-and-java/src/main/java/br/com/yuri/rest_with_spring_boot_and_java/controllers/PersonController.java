package br.com.yuri.rest_with_spring_boot_and_java.controllers;

import br.com.yuri.rest_with_spring_boot_and_java.PersonServices;
import br.com.yuri.rest_with_spring_boot_and_java.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonServices service;

    @RequestMapping(value = "/{id}",
    method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findByID(@PathVariable("id") String id){
        return service.findById(id);
    }

}
