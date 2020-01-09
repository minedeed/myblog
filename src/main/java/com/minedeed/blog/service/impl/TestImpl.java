package com.minedeed.blog.service.impl;

import com.minedeed.blog.dao.TestDao;
import com.minedeed.blog.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements Test {
    @Autowired
    TestDao testDao;
    @Override
    public void insertTest(String one, String two) {
        testDao.insertTest(one,two);
    }
}
