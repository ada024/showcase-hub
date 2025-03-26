package org.amd.showcase.service;

import org.amd.showcase.model.Experience;
import org.amd.showcase.repo.ExpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExpService {
    @Autowired
    private ExpRepo repo;

    public List<Experience> getAllExp() {
        return repo.findAll();
    }


}