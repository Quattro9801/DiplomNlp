package com.example.demo.controller;
import com.example.demo.logic.Nlp;
import edu.stanford.nlp.ling.CoreLabel;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class Hello {

    @GetMapping("/hello")
    public  List<String> home() {
      //List<String> world =  Nlp.getTriples();
        List<String > worlds = Nlp.getTriples();
        return worlds ;
    }

}
