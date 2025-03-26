package org.amd.showcase.repo;


import org.amd.showcase.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepo extends JpaRepository<Experience, Integer> { }
