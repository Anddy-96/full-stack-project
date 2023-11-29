package com.allrounddeveloper.ReactandJavaforAssignment.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allrounddeveloper.ReactandJavaforAssignment.DTO.AuthCreationRequest;
import com.allrounddeveloper.ReactandJavaforAssignment.Model.User;
import com.allrounddeveloper.ReactandJavaforAssignment.util.JwtUtil;

@RestController
@RequestMapping("/api/auth")
public class AuthController
{

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtUtil jwtUtil;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthCreationRequest authCreationRequest)
	{
		try
		{
			Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authCreationRequest.getUsername(),
					authCreationRequest.getPassword()));
			User user = (User) authentication.getPrincipal();

			return ResponseEntity.ok()
				.header(HttpHeaders.AUTHORIZATION,
					jwtUtil.generateToken(user))
				.body(user);

		}catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}

	}
}
