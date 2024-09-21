package com.gtp2.KubernetesLab;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AppController {
    @GetMapping
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("The app is running 👌", HttpStatus.OK);
    }
}
