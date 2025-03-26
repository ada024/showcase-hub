package org.amd.showcase.controller;


import org.amd.showcase.model.Experience;
import org.amd.showcase.model.Skill;
import org.amd.showcase.service.ExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exps")
@CrossOrigin
public class ExpController {

    @Autowired
    private ExpService service;

    @GetMapping
    public List<Experience> getExps() {
        return service.getAllExp();
    }



}
