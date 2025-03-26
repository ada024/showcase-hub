package org.amd.showcase.service;

import org.amd.showcase.model.Skill;
import org.amd.showcase.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SkillService {
    @Autowired
    private SkillRepo repo;

    public List<Skill> getSkills() {
        return repo.findAll();
    }



}