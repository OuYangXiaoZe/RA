package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;
import com.cn.hnust.service.impl.UserServiceImpl;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	@Resource
    private UserServiceImpl userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        System.out.println(userId);
       if(userService!=null){
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user); 
       }
        return "showUser";  
    }  
}  