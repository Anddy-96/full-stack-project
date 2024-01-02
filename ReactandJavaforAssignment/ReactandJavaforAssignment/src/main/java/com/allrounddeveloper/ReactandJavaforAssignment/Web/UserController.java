package com.allrounddeveloper.ReactandJavaforAssignment.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allrounddeveloper.ReactandJavaforAssignment.Service.UserDetailsServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserController
{
	@Autowired
	UserDetailsServiceImpl userDetailsService;

	@GetMapping("/")
	public UserDetails getUserByUsername(@RequestHeader
		String username)
	{
		return userDetailsService.loadUserByUsername(username);
	}
}
