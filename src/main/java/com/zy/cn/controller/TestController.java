package com.zy.cn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/t1")
    public Object getUser(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setAge(18);
        user.setDate(new Date());
        user.setId("1");
        user.setName("张三");
        users.add(user);
        User user1 = new User();
        user1.setAge(18);
        user1.setDate(new Date());
        user1.setId("1");
        user1.setName("张三");
        users.add(user1);
        User user2 = new User();
        user2.setAge(18);
        user2.setDate(new Date());
        user2.setId("1");
        user2.setName("张三");
        users.add(user2);
        return users;
    }

    @ResponseBody
    @RequestMapping("/t2")
    public Object getUser(String id){

        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setAge(18);
        user.setDate(new Date());
        user.setId("1");
        user.setName("张三");
        users.add(user);
        User user1 = new User();

        user1.setAge(18);
        user1.setDate(new Date());
        user1.setId("1");
        user1.setName("张三");
        users.add(user1);
        User user2 = new User();
        user2.setAge(18);
        user2.setDate(new Date());
        user2.setId("1");
        user2.setName("张三");
        users.add(user2);
        return users;
    }



}
