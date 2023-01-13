package com.projetJEE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetJEE.model.Project;

@Service
public class ProjectService {

	@Autowired
	private ProjectService projectRepository;

	public List<Project> getAllProjects() throws Exception{
		return projectRepository.getAllProjects();		
	}
}
