package com.sailing.config.reposipory;

import com.sailing.config.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther fox
 * @date 2018/1/22 15:33
 */
public interface UserInfoDao extends JpaRepository<UserInfo,Integer>{
    UserInfo findByUserCode(String userCode);
}
