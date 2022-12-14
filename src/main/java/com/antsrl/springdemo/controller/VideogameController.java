package com.antsrl.springdemo.controller;

import com.antsrl.springdemo.modele.Videogame;
import com.antsrl.springdemo.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController(value = "/videogame")
public class VideogameController {

    @Autowired
    private VideogameRepository videogameRepository;
    @GetMapping(value = "/all")
    public List<Videogame>  getAllVideogame() {
        List<Videogame> videogameList = videogameRepository.findAll();
        return videogameList;
    }

    @GetMapping(value = "/all/{id}")
    public Optional  getVideogame(@PathVariable Long id) {
        try {
            Optional videogame = videogameRepository.findById(id);
            return videogame;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/add")
    public Videogame addVideogame(@RequestBody Videogame vg) {
        videogameRepository.save(vg);
        return vg;
    }


}
