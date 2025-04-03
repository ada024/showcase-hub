package org.amd.showcase.controller;

import org.amd.showcase.model.Skill;
import org.amd.showcase.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/skills/")
@CrossOrigin
public class SkillController {

    @Autowired
    private SkillService service;

    @GetMapping("skill")
    public List<Skill> getProducts() {
        return service.getSkills();
    }



}
