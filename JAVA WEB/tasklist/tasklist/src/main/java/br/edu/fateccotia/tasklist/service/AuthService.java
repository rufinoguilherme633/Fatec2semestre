package br.edu.fateccotia.tasklist.service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fateccotia.tasklist.model.Token;
import br.edu.fateccotia.tasklist.model.User;
import br.edu.fateccotia.tasklist.repository.TokenRepository;
import br.edu.fateccotia.tasklist.repository.UserRepository;

@Service
public class AuthService {
	private Integer TOKEN_TTL = 60*2;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TokenRepository tokenRepository;
	
	
	public void signup(String email, String password) throws Exception{
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		Optional<User> userFoud = userRepository.findByEmail(email);
		
		if(userFoud.isPresent()) {
			throw new Exception("E-mail already exixtgs");
		}
		userRepository.save(user);
	}

	public Token signin(String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		Optional<User> userFoud = userRepository.findByEmail(email);
		if(userFoud.isPresent() && userFoud.get().getPassword().equals(password)) {
			Token token = new Token();
			token.setUser(userFoud.get());
			token.setToken(UUID.randomUUID().toString());
			token.setExpirationTime(Instant.now().plusSeconds(TOKEN_TTL).toEpochMilli());
			token = tokenRepository.save(token);
			
			return token;
		}
		return null;
	}

	public Boolean validate(String token) {
		
	
		
		Optional<Token> tokenFound = tokenRepository.findByToken(token);
		System.out.println(tokenFound.get().getExpirationTime());
		System.out.println(Instant.now().toEpochMilli());
		System.out.println(tokenFound.get().getExpirationTime() > Instant.now().toEpochMilli());
		
		if(tokenFound.isPresent() && tokenFound.get().getExpirationTime() > Instant.now().toEpochMilli()) {
			return false;
		}
		
		return true;
	}

	public void signout(String token) {
	    Optional<Token> found = tokenRepository.findByToken(token);

	    found.ifPresent(t -> {
	        t.setExpirationTime(Instant.now().toEpochMilli());
	        tokenRepository.save(t);
	    });
	}


}
