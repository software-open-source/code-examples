package org.software.open.source.apis.controllers;

import org.software.open.source.apis.models.responses.Response;
import org.software.open.source.apis.models.responses.users.PersonResponse;
import org.software.open.source.apis.models.responses.users.StaffResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/response")
@Tag(name = "Response Controller", description = "API Response")
public class ResponseController {

    @GetMapping
    @Operation(summary = "testResponse()", description = "testResponse")
    public Response<PersonResponse> testResponse(@RequestParam(name = "i", defaultValue = "1") int i) {

        if (i == 2) {
            return new Response<>(new StaffResponse());
        }

        return new Response<>(new PersonResponse());

    }

}
