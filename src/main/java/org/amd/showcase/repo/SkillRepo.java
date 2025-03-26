package org.amd.showcase.repo;
import org.amd.showcase.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepo  extends JpaRepository<Skill, Integer> { }
