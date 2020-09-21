package com.zlt.bilibili.controller;

import com.zlt.bilibili.bean.User;
import com.zlt.bilibili.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    @CrossOrigin
    @RequestMapping("/login")
    public String userLogin(@RequestBody User user) {
        System.out.println("User : " + user);
        String str = "error";
        int count = userDao.getUserByMassage(user.getUsername(), user.getPassword());
        if (count > 0) {
            str = "ok";
        }
        return str;
    }
}
