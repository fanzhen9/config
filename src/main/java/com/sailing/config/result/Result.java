package com.sailing.config.result;

import lombok.Data;

/**
 * @auther fox
 * @date 2018/1/22 16:12
 */

@Data
public class Result {

    private Integer code;

    private String msg;

    private Object content;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }
}
