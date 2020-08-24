package io.genevjov.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hi")
    public ResponseEntity<String> sayHi() {
        return new ResponseEntity<>("Hi", HttpStatus.OK);
    }
}
