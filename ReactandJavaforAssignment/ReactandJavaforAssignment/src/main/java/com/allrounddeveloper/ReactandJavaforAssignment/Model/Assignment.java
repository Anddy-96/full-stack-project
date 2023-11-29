package com.allrounddeveloper.ReactandJavaforAssignment.Model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Assignment
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String status;

	private String branch;

	private String gitHubUrl;

	private String codeReview;

	@ManyToOne(optional = false)
	private User user;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getBranch()
	{
		return branch;
	}

	public void setBranch(String branch)
	{
		this.branch = branch;
	}

	public String getGitHubUrl()
	{
		return gitHubUrl;
	}

	public void setGitHubUrl(String gitHubUrl)
	{
		this.gitHubUrl = gitHubUrl;
	}

	public String getCodeReview()
	{
		return codeReview;
	}

	public void setCodeReview(String codeReview)
	{
		this.codeReview = codeReview;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
}
