package com.nsbm.xyzhotelmanagment.service;

import com.nsbm.xyzhotelmanagment.model.TestObj;

import java.util.List;

public interface TestObjService {

    public String save(TestObj testObj);

    public String  edit(TestObj testObj);

    public  TestObj findByID(int id);

    public List<TestObj> findAll();




}
