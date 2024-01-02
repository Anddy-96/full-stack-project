package com.allrounddeveloper.ReactandJavaforAssignment.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_personal_details")
public class UserPersonalDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

}
