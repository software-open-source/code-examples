package org.software.open.source.apis.controllers;

import java.util.Objects;

import org.software.open.source.apis.models.responses.Response;
import org.software.open.source.utils.DateTimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/date-time")
@Tag(name = "Date Time Controller", description = "API Date Time")
public class DateTimeController {

    @GetMapping("/utc-now")
    @Operation(summary = "UTC Time", description = "UTC Time Now")
    public Response<Object> hello(@RequestParam(name = "pattern", required = false, defaultValue = "yyyy-MM-dd HH:mm:ss") String pattern) {
        if (!Objects.isNull(pattern)) {
            return new Response<>(DateTimeUtils.now(pattern));
        }
        return new Response<>(DateTimeUtils.now());
    }

}
