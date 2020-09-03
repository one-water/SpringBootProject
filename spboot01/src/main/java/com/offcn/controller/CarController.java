package com.offcn.controller;

import com.offcn.pojo.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CarController {

    private List<Car> list = new ArrayList<>();
    @RequestMapping("/getcar1")
    public List<Car> getCar(@RequestBody Car car) {
        Car car1 = new Car();
        car1.setId(1);
        car1.setName("兰博基尼");
        car1.setPrice(100000.99F);
        car1.setCreateDate(new Date());
        car1.setMemo("汽车描述");
        car1.setIsnull(null);
        list.add(car1);
        list.add(car);
        return list;
    }


    @RequestMapping("/getcar2")
    public Car getCarById4(Car car) {
        return car;
    }
}
