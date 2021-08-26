package com.springapp.springherokudocker;

import java.time.Instant;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHerokuController {
    
    @GetMapping("/date")
    public Date getdate() {
        return Date.from(Instant.now());
    }
}

