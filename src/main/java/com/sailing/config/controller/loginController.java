package com.sailing.config.controller;

import com.sailing.config.entity.UserInfo;
import com.sailing.config.result.Result;
import com.sailing.config.service.UserInfoService;
import com.sailing.config.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

import static com.sailing.config.enums.ConfigEnum.KNOWEXCEPTION;
import static com.sailing.config.enums.ConfigEnum.USERCODEORPASSWORDEMPTY;

/**
 * @auther fox
 * @date 2018/1/22 11:26
 */
@Controller
@RequestMapping("/")
public class loginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    public String initPage(Model model){
        model.addAttribute("appId","配置平台");
        //ModelAndView modelAndView = new ModelAndView("/login/login",map);
        return "/login/login";
    }

    @PostMapping("/userLogin")
    @ResponseBody
    public Result userLogin(@Valid UserInfo userInfo, BindingResult bindingResult, HttpServletRequest req){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(USERCODEORPASSWORDEMPTY);
        }
        boolean flag = userInfoService.findByUserCode(userInfo.getUserCode(),userInfo.getPassWord());
        if(flag){
            req.getSession().setAttribute("aaa","bbb");
            return ResultUtil.success();
        }else{
            return ResultUtil.error(KNOWEXCEPTION);
        }
    }
}
