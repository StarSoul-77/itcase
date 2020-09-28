package com.itcase.dao;

import com.itcase.pojo.LinkMan;

import java.util.List;

/**
 * @author LeiXQ
 * @version 1.0
 * @description: TODO
 * @date 2020/9/28 17:19
 */
public interface LinkManDao {

    /**
     * 查找所有用户
     * @return
     */
    List<LinkMan> findAll();

    /**
     * 添加一个用户
     * @param linkMan
     * @return
     */
    int save(LinkMan linkMan);
}
