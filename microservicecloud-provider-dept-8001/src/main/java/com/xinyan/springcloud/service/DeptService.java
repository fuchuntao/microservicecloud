package com.xinyan.springcloud.service;

import com.xinyan.springcloud.entities.Dept;

import java.util.List;


public interface DeptService {

    public Dept findOne(Integer deptOn);

    public List<Dept> findAll();

    public void save(Dept dept);

}
