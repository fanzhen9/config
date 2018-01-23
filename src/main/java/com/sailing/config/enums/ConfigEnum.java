package com.sailing.config.enums;

import lombok.Getter;

/**
 * @auther fox
 * @date 2018/1/22 15:43
 */
@Getter
public enum  ConfigEnum {


    USER_EMPTY(1,"用户不存在"),
    PASSWORD_ERROR(2,"密码错误"),

    USERCODEORPASSWORDEMPTY(100,"用户名或密码为空"),

    SUCCESS(1000,"请求成功"),
    KNOWEXCEPTION(9999,"未知异常");

    private Integer code;

    private String msg;

    ConfigEnum() {
    }

    ConfigEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
