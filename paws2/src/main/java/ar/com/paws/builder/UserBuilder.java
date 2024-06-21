package ar.com.paws.builder;

import java.util.List;

import ar.com.paws.dominian.Rol;
import ar.com.paws.dominian.User;

public class UserBuilder {
	private static Long id;
	private static String user;
	private static String password;
	private static List<Rol> role;
	
	
	public UserBuilder id(Long id){
		this.id = id;
		return this;
	}
	
	public UserBuilder user(String user){
		this.user = user;
		return this;
	}
	
	public UserBuilder password(String password){
		this.password = password;
		return this;
	}
	
	public UserBuilder rol(List<Rol> role){
		this.role = role;
		return this;
	}
	
	public static User build(){
		return new User(id,user,password,role);
	}
}
