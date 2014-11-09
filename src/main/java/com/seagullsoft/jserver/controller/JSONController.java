package com.seagullsoft.jserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seagullsoft.jserver.service.SampleService;

@Controller
@RequestMapping("/poop")
public class JSONController {
    @Autowired
    private SampleService sampleService;
    
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String getShopInJSON() {
        return sampleService.say("herro preez");
    }
}