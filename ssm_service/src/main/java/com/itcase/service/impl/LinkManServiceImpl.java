package com.itcase.service.impl;

import com.itcase.dao.LinkManDao;
import com.itcase.pojo.LinkMan;
import com.itcase.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LeiXQ
 * @version 1.0
 * @description: TODO
 * @date 2020/9/28 17:29
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class LinkManServiceImpl implements LinkManService {

    @Autowired
    private LinkManDao linkManDao;

    @Override
    public List<LinkMan> findAll() {
        return linkManDao.findAll();
    }

    @Override
    public void save(LinkMan linkMan) {
        linkManDao.save(linkMan);
    }

}
