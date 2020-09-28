package com.itcase;

import com.itcase.dao.LinkManDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LeiXQ
 * @version 1.0
 * @description: TODO
 * @date 2020/9/28 17:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestLinkManDao {

    @Autowired
    private LinkManDao linkManDao;

    @Test
    public void findAll() {
        System.out.println(linkManDao.findAll());
    }
}
