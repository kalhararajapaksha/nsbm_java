package com.nsbm.xyzhotelmanagment.controller;


import com.nsbm.xyzhotelmanagment.model.TestObj;
import com.nsbm.xyzhotelmanagment.service.TestObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private TestObjService testObjService;

    @PostMapping
    public String saveTest(@RequestBody TestObj testObj) {
        return testObjService.save(testObj);
    }

    @PutMapping
    public String editTest(@RequestBody TestObj testObj){
        return testObjService.edit(testObj);
    }

    @GetMapping(value ="/{id}" )
    public  TestObj getTest(@PathVariable int id){
        return testObjService.findByID(id);
    }

    @GetMapping
    public List<TestObj> findAll(){
        return testObjService.findAll();
    }
}
