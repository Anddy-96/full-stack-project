package com.allrounddeveloper.ReactandJavaforAssignment.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.allrounddeveloper.ReactandJavaforAssignment.Model.User;
import com.allrounddeveloper.ReactandJavaforAssignment.repository.UserRepository;
import com.allrounddeveloper.ReactandJavaforAssignment.util.CustomPasswordEncoder;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{

		Optional<User> userOpt = userRepository.findByUsername(username);
		return userOpt.orElseThrow(() -> new UsernameNotFoundException("wrong credentials"));

	}
}
