package com.bracit.codingtest.controller;

import com.bracit.codingtest.entity.Battery;
import com.bracit.codingtest.service.BatteryService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class HomeController {

    @Autowired
    private BatteryService service;

    @RequestMapping(value = "/batteries", method = RequestMethod.POST)
    public List<Battery> addBattery(@RequestBody List<Battery> batteryList) {
        List<Battery> lst = service.addBatteries(batteryList);
        return lst;
    }

    @RequestMapping(value = "/batteries", method = RequestMethod.GET)
    public List<Battery> getBattery(@RequestParam("postcodeRange") String postStr) {
        int a=0;
        int i=0;
        for( i=0; i<postStr.length();i++){
            if(postStr.charAt(i)=='-' ){
                break;
            }
            a= 10*a+(int)(postStr.charAt(i)-48);
        }
        int b=0;
        for(int j=i; j<postStr.length();j++){
            b= 10*b+(int)(postStr.charAt(j)-48);
        }
       List<Battery> list = service.getBatteries(a,b);

        return list;
    }
}
