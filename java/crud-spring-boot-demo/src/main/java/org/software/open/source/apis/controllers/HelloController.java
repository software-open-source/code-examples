package org.software.open.source.apis.controllers;

import org.software.open.source.apis.models.responses.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/hello")
@Tag(name = "Hello Controller", description = "API Hello")
public class HelloController {
    
    @GetMapping
    @Operation(summary = "Function hello()", description = "Print Hello World")
    public Response<String> hello(){
        return new Response<>("Hello World");
    }

}
