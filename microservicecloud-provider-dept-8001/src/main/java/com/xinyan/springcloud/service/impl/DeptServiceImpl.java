package com.xinyan.springcloud.service.impl;

import com.xinyan.springcloud.dao.DeptDao;
import com.xinyan.springcloud.entities.Dept;
import com.xinyan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept findOne(Integer deptOn) {
        return deptDao.findOne(deptOn);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    @Override
    @Transactional
    public void save(Dept dept) {
        deptDao.save(dept);
    }
}
