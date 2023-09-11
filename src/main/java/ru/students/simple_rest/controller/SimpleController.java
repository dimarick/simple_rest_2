package ru.students.simple_rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.students.simple_rest.model.Request;
import ru.students.simple_rest.model.Response;

@RestController
public class SimpleController
{
    @PostMapping(value = "/echo")
    public ResponseEntity<Response> echo(@RequestBody Request request)
    {
        var response = Response.builder()
            .uid(request.getUid())
            .operationUid(request.getOperationUid())
            .systemTime(request.getSystemTime())
            .code("success")
            .errorCode(null)
            .errorMessage(null)
            .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
