package com.sailing.config.utils;

import com.sailing.config.enums.ConfigEnum;
import com.sailing.config.result.Result;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @auther fox
 * @date 2018/1/22 16:15
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ConfigEnum.SUCCESS.getCode());
        result.setMsg(ConfigEnum.SUCCESS.getMsg());
        result.setContent(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(ConfigEnum configEnum){
        Result result = new Result();
        result.setCode(configEnum.getCode());
        result.setMsg(configEnum.getMsg());
        return result;
    }
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
