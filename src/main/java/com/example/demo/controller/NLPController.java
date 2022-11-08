package com.example.demo.controller;
import com.example.demo.entity.Person;
import com.example.demo.logic.ProcessingText;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class NLPController {

    @GetMapping("/triplets")
    public List<String> home(@RequestParam String text) {
        return ProcessingText.getTriples(text) ;
    }
    @GetMapping("/map")
    public Map<String, List<Person>> getPersonMap() {
       /* Person p=new Person(1111, "Ivan","Net");
        Person p1=new Person(1112,"Dimon" ,"Kap");
        Person p2=new Person(1113,"Alex" ,"Like");
        Person p3=new Person(1114, "Vovan","Fit");*/
        Person p1=new Person("Dimon" ,"Kap");
        Person p2=new Person("Alex" ,"Like");
        Person p3=new Person( "Vovan","Fit");
        List<Person> personList = new ArrayList<>();
        //personList.add(p);
        personList.add(p1);
        personList.add(p2);
        Map<String, List<Person>> map=new HashMap<>();
        map.put("personList",personList);
        map.put("personList1",personList);
        return map;
    }
}

