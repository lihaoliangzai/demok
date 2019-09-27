package com.qf.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.demo.dao.StuMapper;
import com.qf.demo.entity.Student;
import com.qf.demo.service.Stuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuImplservice  extends ServiceImpl<StuMapper, Student> implements Stuservice {
    @Autowired
    private  StuMapper stuMapper;
}
