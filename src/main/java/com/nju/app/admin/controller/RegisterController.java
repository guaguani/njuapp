package com.nju.app.admin.controller;

import com.nju.app.dao.TeacherDao;
import com.nju.app.dao.UserDao;
import com.nju.app.entities.Result;
import com.nju.app.entities.Teacher;
import com.nju.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

    @Autowired
    UserDao userDao;

    @Autowired
    TeacherDao teacherDao;

    @ResponseBody
    @RequestMapping("/register")
    public Result register(@RequestParam(value = "username") String username,
                           @RequestParam(value = "e_mail") String e_mail,
                           @RequestParam(value = "password") String password,
                           @RequestParam(value = "type") String type) {

        User user = userDao.findByUsername(username);

        //身份证
        Teacher teacher = teacherDao.findByTId(username);

        if (teacher.getId_card().equals(e_mail)){
            user.setPassword(password);
            userDao.saveAndFlush(user);
            return new Result(true, "更新数据成功");
        }else {
            return new Result(false, "发生未知错误");
        }


    }
}
