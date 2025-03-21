package br.edu.fateccotia.tasklist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tokens")

public class Token {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String token;
	@ManyToOne
	private User user;
	private Long expirationTime;
	
	public Token() {
		
	}
	
	public Token(Integer id, String token, User user, Long expirationTime) {
		super();
		this.id = id;
		this.token = token;
		this.user = user;
		this.expirationTime = expirationTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Long expirationTime) {
		this.expirationTime = expirationTime;
	}
	

}
