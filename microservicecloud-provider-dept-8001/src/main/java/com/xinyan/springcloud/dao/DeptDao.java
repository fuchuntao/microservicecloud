package com.xinyan.springcloud.dao;

import com.xinyan.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface DeptDao {

    public void save(Dept dept);

    public Dept findOne(Integer deptOn);

    public List<Dept> findAll();

}
