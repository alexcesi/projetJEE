package com.projetJEE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.projetJEE.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
    //Vue pour récupérer le détail d'un projet et le détail de ses contributeurs
	  @Query(value = "SELECT * FROM project_detail", nativeQuery = true)
	    public Project getProjectDetail();

    // Procedure pour mettre à jour le taux de financement d'un projet en fonction des contributions reçues
    @Procedure(name = "project_funding_rate")
    void updateFundingRate(@Param("project_id") Long projectId);

    // Vue pour récupérer la liste des projets en cours de financement classés par taux de financement (du plus élevé au plus bas)
    @Procedure(name = "funded_projects")
    List<Project> getFundedProjects();
}
