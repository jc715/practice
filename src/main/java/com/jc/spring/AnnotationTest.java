package com.jc.spring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by JC on 2018/5/20.
 */
public class AnnotationTest {

    @Autowired
    private String autoWiredTest;

    @Resource
    private String resourceTest;
}
