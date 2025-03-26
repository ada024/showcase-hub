package org.amd.showcase.service;

import org.amd.showcase.model.Experience;
import org.amd.showcase.model.Project;
import org.amd.showcase.repo.ExpRepo;
import org.amd.showcase.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectService {

    @Autowired
    private ProjectRepo repo;

    public List<Project> getProjects() {
        return repo.findAll();
    }

}