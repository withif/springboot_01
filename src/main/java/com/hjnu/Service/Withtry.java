package com.hjnu.Service;

import com.hjnu.pojo.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

@RequestMapping(value = "/try",produces="application/json;charset=UTF-8")
@EnableWebMvc
@RestController
public class Withtry {
    @Value("${user}")
    String user;
    @Value("${student.name}")
    String stuName;
    @Autowired
    private Pirates pirates;

    @RequestMapping("/getValues")
    public Object try1(){
//        System.out.println(user);
//        System.out.println(stuName);
        return pirates;
    }
}
