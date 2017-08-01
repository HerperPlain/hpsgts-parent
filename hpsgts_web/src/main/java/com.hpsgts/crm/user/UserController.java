package com.hpsgts.crm.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "Hello wold";
    }
}
