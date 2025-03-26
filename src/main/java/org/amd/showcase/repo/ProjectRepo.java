package org.amd.showcase.repo;

import org.amd.showcase.model.Experience;
import org.amd.showcase.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo  extends JpaRepository<Project, Integer> { }
