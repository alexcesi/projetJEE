package com.projetJEE.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;
    
    @Column(name = "mail", nullable = false)
    private String mail;

	@ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "is_project_owner", nullable = false)
    private boolean isProjectOwner;

    @Column(name = "link_project_owner")
    private String linkProjectOwner;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isProjectOwner() {
		return isProjectOwner;
	}

	public void setProjectOwner(boolean isProjectOwner) {
		this.isProjectOwner = isProjectOwner;
	}

	public String getLinkProjectOwner() {
		return linkProjectOwner;
	}

	public void setLinkProjectOwner(String linkProjectOwner) {
		this.linkProjectOwner = linkProjectOwner;
	}

}