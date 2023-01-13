package com.projetJEE.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;
  
  @Column(name = "title", nullable = false)
  private String title;
  
  @Column(name = "description", nullable = false)
  private String description;
  
  @Column(name = "goal_amount", nullable = false)
  private Integer goalAmount;
  
  @Column(name = "deadline", nullable = false)
  private Date deadline;
  
  @Column(name = "launch_date", nullable = false)
  private Date launchDate;
  
  @Column(name = "photo_presentation", nullable = false)
  private String photoPresentation;
  
  @Column(name = "rate", nullable = false)
  private Integer rate;
  
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;
  
  public Integer getId() {
	return id;
}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getGoalAmount() {
		return goalAmount;
	}
	
	public void setGoalAmount(Integer goalAmount) {
		this.goalAmount = goalAmount;
	}
	
	public Date getDeadline() {
		return deadline;
	}
	
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	public Date getLaunchDate() {
		return launchDate;
	}
	
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	
	public String getPhotoPresentation() {
		return photoPresentation;
	}
	
	public void setPhotoPresentation(String photoPresentation) {
		this.photoPresentation = photoPresentation;
	}
	
	public Integer getRate() {
		return rate;
	}
	
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}