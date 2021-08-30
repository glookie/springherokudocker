package com.springapp.springherokudocker;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHerokuController {
    
    @Autowired
    Environment env;

    @GetMapping("/date")
    public Date getdate() {
        return Date.from(Instant.now());
    }

    @GetMapping("/")
    public String getInfo(){

        if(System.getenv("MYCUSTOM")!=null && System.getenv("MYCUSTOM")!="")
            return System.getenv("MYCUSTOM");
        else
            return env.toString();
        
    }
}

