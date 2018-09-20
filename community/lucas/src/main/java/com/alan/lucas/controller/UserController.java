package com.alan.lucas.controller;


import com.base.core.msg.R;
import com.alan.lucas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Alan
 * @since 2018-09-17
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public R get(@PathVariable Long id){
        return R.succ("ok", userService.getById(id));
    }
}

