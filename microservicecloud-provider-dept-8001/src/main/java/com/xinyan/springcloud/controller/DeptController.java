package com.xinyan.springcloud.controller;

import com.xinyan.springcloud.entities.Dept;
import com.xinyan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public List<Dept> list() {
        List<Dept> list = deptService.findAll();
        return list;
    }

    @GetMapping("/dept/{deptOn}")
    public Dept findOne(@PathVariable("deptOn") Integer deptOn) {
        Dept dept = deptService.findOne(deptOn);
        return dept;
    }

    @PostMapping("/dept")
    public void save(@RequestBody Dept dept) {
         deptService.save(dept);

    }
}
