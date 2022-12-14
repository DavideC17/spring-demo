package com.antsrl.springdemo.controller;

import com.antsrl.springdemo.modele.SoftwareHouse;
import com.antsrl.springdemo.repository.SoftwareHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shouse")
public class SoftwareHouseController {

    @Autowired
    private SoftwareHouseRepository softwareHouseRepository;

    @GetMapping(value = "/all")
    public List<SoftwareHouse> softwareHousesAll() {
        return softwareHouseRepository.findAll();
    }

    @PostMapping("/add")
    public SoftwareHouse addSoftwareHouse(@RequestBody SoftwareHouse softwareHouse) {
        return softwareHouseRepository.save(softwareHouse);
    }
}
