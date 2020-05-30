package com.real.time.controller;

import com.real.time.entity.Order;
import com.real.time.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {

    @Autowired
    private ShowService showService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String show_index(){
        return "index";
    }
    @RequestMapping(value = "/show_order",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<Order> show_order(){
        ArrayList<Order> list = showService.get_order();
        return list;
    }
}
