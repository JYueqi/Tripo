package com.db.demo01.Controller;

import com.db.demo01.Mapper.routehitMapper;
import com.db.demo01.Mapper.userMapper;
import com.db.demo01.pojo.routehit;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SigninController {

    @Autowired
    private userMapper userMapper;

    @Autowired
    private com.db.demo01.Mapper.routehitMapper routehitMapper;

    @Autowired
    private com.db.demo01.Mapper.spothitMapper spothitMapper;

    @GetMapping("/login")
    public String getSignin(@RequestParam("name") String username, @RequestParam("pwd") String pwd, Model model){

        if(userMapper.getUserPassword(username).equals(pwd)){

            List<routehit> routehits = routehitMapper.getRoutehit();
            model.addAttribute("rhits",routehits);

            List<String> spothits = spothitMapper.getSpothit();
            model.addAttribute("shits",spothits);

            return "index";
        }
        else{
            model.addAttribute("msg","用户名或密码错误");
            return "signin";
        }


    }

}



