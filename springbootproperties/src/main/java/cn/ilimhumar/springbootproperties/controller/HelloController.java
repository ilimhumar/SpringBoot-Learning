package cn.ilimhumar.springbootproperties.controller;

import cn.ilimhumar.springbootproperties.property.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "Welcome Spring Boot Properties!!!";
    }




    @Autowired
    HomeProperties homeProperties;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getDesc(){

        return homeProperties.getDesc();

    }


}
