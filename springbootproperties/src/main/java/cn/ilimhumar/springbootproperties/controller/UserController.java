package cn.ilimhumar.springbootproperties.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @Value("${user.desc}")
    private String desc;



    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getDesc(){

        return desc;

    }

}
