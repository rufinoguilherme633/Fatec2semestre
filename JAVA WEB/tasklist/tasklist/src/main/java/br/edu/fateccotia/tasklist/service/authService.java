package br.edu.fateccotia.tasklist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fateccotia.tasklist.model.User;
import br.edu.fateccotia.tasklist.repository.TaskRepository;
import br.edu.fateccotia.tasklist.repository.UserRepository;

@Service
public class authService {
	@Autowired
	private UserRepository userRepository;
	public void signup(String email, String password) {
		User user = new User();

		user.setEmail(email);
		user.setPassword(password);
		userRepository.save(user);
		
	}

}
