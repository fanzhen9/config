package com.sailing.config.handle;

import com.sailing.config.Exception.ConfigException;
import com.sailing.config.result.Result;
import com.sailing.config.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.sailing.config.enums.ConfigEnum.KNOWEXCEPTION;

/**
 * @auther fox
 * @date 2018/1/22 16:34
 */
@ControllerAdvice
public class ExceptionHandle{

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof ConfigException){
            ConfigException configException = (ConfigException) e;
            return ResultUtil.error(configException.getCode(),configException.getMessage());
        }else{
            return ResultUtil.error(KNOWEXCEPTION);
        }
    }
}
