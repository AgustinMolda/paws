package ar.com.paws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.paws.dominian.User;
import ar.com.paws.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	public ResponseEntity<String> findByUsername(String username){
		
		this.userService.findByUsername(username);
		
		return ResponseEntity.ok("Usuario encontrado");
		
	}
	
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return this.userService.register(user);
	}
	
	
	@PostMapping("/login")
	public User login(@RequestParam String username, @RequestParam String password){
		return this.userService.login(username, password);
	}
}
