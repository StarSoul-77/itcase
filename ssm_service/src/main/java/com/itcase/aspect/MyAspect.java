package com.itcase.aspect;

import org.springframework.stereotype.Component;

/**
 * @author LeiXQ
 * @version 1.0
 * @description: TODO
 * @date 2020/9/28 17:31
 */
@Component
public class MyAspect {

    public void checkPermissions() {
        System.out.println("权限校验.....");
    }
}
