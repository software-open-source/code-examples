package org.software.open.source.apis.controllers;

import org.software.open.source.apis.models.responses.Response;
import org.software.open.source.patterns.singleton.Singleton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/sigleton")
@Tag(name = "Singleton Controller", description = "API Response")
public class SingletonController {
    
    @GetMapping()
    @Operation(summary = "Singleton", description = "Singleton")
    public Response<Object> getInstance(){
        Singleton singleton = Singleton.getInstance();
        return new Response<>(singleton.toString());
    }
    
}
