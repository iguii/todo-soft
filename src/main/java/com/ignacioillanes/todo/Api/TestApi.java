package com.ignacioillanes.todo.Api;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/saludar")
public class TestApi {
    @GetMapping("")
    public ResponseEntity<String> saludar() {
        ResponseEntity<String> response = ResponseEntity.status(HttpStatusCode.valueOf(201)).body("Hola mundo");
        return response;
    }
}
