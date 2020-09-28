package com.itcase.service;

import com.itcase.pojo.LinkMan;

import java.util.List;

/**
 * @author LeiXQ
 * @version 1.0
 * @description: TODO
 * @date 2020/9/28 17:29
 */
public interface LinkManService {

    /**
     * 查询所有
     * @return
     */
    List<LinkMan> findAll();

    /**
     * 添加一个用户
     * @param linkMan
     * @return
     */
    void save(LinkMan linkMan);
}
