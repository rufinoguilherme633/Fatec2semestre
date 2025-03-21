package br.edu.fateccotia.tasklist.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateccotia.tasklist.service.authService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private authService authService;
	@PostMapping
	public ResponseEntity<?> signup(@RequestBody Map<String,String> user){
		
		String email = user.get("email");
		String password = user.get("password");
		authService.signup(email,password);
		return null;
	}
}
