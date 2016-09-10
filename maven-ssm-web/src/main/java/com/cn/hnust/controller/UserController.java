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
    private UserService userService;  
      
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
    @RequestMapping("/addUser")  
    public String toIndex1(HttpServletRequest request,Model model){  
        User user=new User();
        user.setAge(20);
        user.setId(4);
        user.setPassword("123456789");
        user.setUserName("п║уе");
       if(userService!=null){
       this.userService.insertUser(user);
        model.addAttribute("user", user); 
       }
        return "showUser";  
    }  
}  