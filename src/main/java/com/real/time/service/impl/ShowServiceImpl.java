package com.real.time.service.impl;

import com.real.time.entity.Order;
import com.real.time.service.ShowService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShowServiceImpl implements ShowService{

    @Override
    public ArrayList<Order> get_order() {
        ArrayList<Order> list = new ArrayList<>();
        list.add(new Order(786295544, 50014866, 40));
        list.add(new Order(532110457, 50018831, 80));
        list.add(new Order(249013725, 50018860, 60));
        list.add(new Order(249013745, 50018850, 70));
        list.add(new Order(786295344, 50014876, 60));
        return list;
    }
}
