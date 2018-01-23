package com.sailing.config.Exception;

import com.sailing.config.enums.ConfigEnum;
import lombok.Getter;

/**
 * @auther fox
 * @date 2018/1/22 15:48
 */
@Getter
public class ConfigException extends RuntimeException{

    private Integer code;

    public ConfigException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

    public ConfigException(ConfigEnum userInfoEnum){
        super(userInfoEnum.getMsg());
        this.code = userInfoEnum.getCode();
    }
}
