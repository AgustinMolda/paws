package ar.com.paws.service;

import ar.com.paws.dominian.User;

public interface UserService {
	
	public User findByUsername(String name);
	
	public User register( User user);
	
	public User login(String username, String password);
}
