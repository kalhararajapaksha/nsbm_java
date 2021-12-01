package com.nsbm.xyzhotelmanagment.service.impl;

import com.nsbm.xyzhotelmanagment.model.TestObj;
import com.nsbm.xyzhotelmanagment.repository.TestObjRepository;
import com.nsbm.xyzhotelmanagment.service.TestObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestObjService {

    @Autowired
    private TestObjRepository testObjRepository;

    @Override
    public String save(TestObj testObj) {

        testObj = testObjRepository.save(testObj);
        return testObj.getId() > 0 ? "Save Success : " + testObj.getId() : "Fail";
    }


    @Override
    public String edit(TestObj testObj) {

        if (findByID(testObj.getId()) != null) {
            testObj = testObjRepository.save(testObj);
            return testObj.getId() > 0 ? "Edit Success : " + testObj.getId() : "Fail";
        }
        return "Item Not Exist";

    }

    @Override
    public TestObj findByID(int id) {

        Optional<TestObj> optionalTestObj = testObjRepository.findById(id);

        if (optionalTestObj.isPresent()) {
            return optionalTestObj.get();
        }
        return null;
    }

    @Override
    public List<TestObj> findAll() {
        return testObjRepository.findAll();
    }


}
