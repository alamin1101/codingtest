package com.bracit.codingtest.service;

import com.bracit.codingtest.entity.Battery;
import com.bracit.codingtest.repository.BatteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatteryService {

    @Autowired
    private BatteryRepository repository;

    public List<Battery> addBatteries(List<Battery> list)
    {
        List<Battery> batteryList= repository.saveAll(list);
        return batteryList;
    }
    public List<Battery> getBatteries(int a,int b)
    {
        List<Battery> batteryList= repository.findAllByPostCodeRange(a,b);
        return batteryList;
    }
}
