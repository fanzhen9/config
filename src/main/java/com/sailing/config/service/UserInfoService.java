package com.sailing.config.service;

import com.sailing.config.entity.UserInfo;

/**
 * @auther fox
 * @date 2018/1/22 15:36
 */
public interface UserInfoService {

    boolean findByUserCode(String userCode,String passWord);
}
