package com.example.demo.controller;
import com.example.demo.logic.ProcessingText;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class NlpController {

    @GetMapping("/hello")
    public List<String> home(@RequestParam String text) {
        return ProcessingText.getTriples(text) ;
    }
    @ResponseBody
    @GetMapping("/hello1")
    public String home1(@RequestParam String text) {
        return text ;
    }

    @PostMapping("/triplets{lang}")//добавление расписания
    public List<Integer> getTriplets(@PathVariable(value = "lang") Integer lang) {
        //List<String > worlds = Nlp.getTriples(lang);
        List<Integer> newList = new ArrayList<>();
        newList.add(lang);
        //List<String > worlds = Nlp.getTriples(lang);
        return newList;

    }

}
