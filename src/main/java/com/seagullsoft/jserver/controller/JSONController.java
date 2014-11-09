package com.seagullsoft.jserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/poop")
public class JSONController {
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String getShopInJSON() {
        return "YO BITCH";
    }
}