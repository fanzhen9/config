package com.sailing.config.service.impl;

import com.sailing.config.Exception.ConfigException;
import com.sailing.config.entity.UserInfo;
import com.sailing.config.enums.ConfigEnum;
import com.sailing.config.reposipory.UserInfoDao;
import com.sailing.config.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther fox
 * @date 2018/1/22 15:36
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public boolean findByUserCode(String userCode,String passWord) {
        UserInfo userInfo = userInfoDao.findByUserCode(userCode);
        if(userInfo == null){
            throw new ConfigException(ConfigEnum.USER_EMPTY);
        }else if(!passWord.equals(userInfo.getPassWord())){
            throw new ConfigException(ConfigEnum.PASSWORD_ERROR);
        }
        return true;
    }
}
