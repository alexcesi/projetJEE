package com.projetJEE.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetJEE.model.Project;
import com.projetJEE.repository.ProjectRepository;
import com.projetJEE.service.ProjectService;


@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	private ProjectService projectService;
	private final ProjectRepository projectRepository;
	
	public ProjectController(ProjectService projectService, ProjectRepository projectRepository) {
        this.projectService = projectService;
        this.projectRepository = projectRepository;
    }
	
	 @GetMapping
	 public ResponseEntity<Object> getProjectDetail() {
		 Project project = projectRepository.getProjectDetail();
		 return new ResponseEntity<>(project, HttpStatus.OK);
    }
}
