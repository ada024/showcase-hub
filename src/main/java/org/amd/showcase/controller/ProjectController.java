package org.amd.showcase.controller;
import org.amd.showcase.model.Project;
import org.amd.showcase.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
@RequestMapping("/api/public/projects")
@CrossOrigin
public class ProjectController {


    @Autowired
    private ProjectService service;



    @GetMapping
    public List<Project> getProjects() {
        return service.getProjects();
    }


}
