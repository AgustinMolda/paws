package ar.com.paws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.paws.Repository.UserRepository;
import ar.com.paws.dominian.User;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;


    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	
	
	@Override
	public User findByUsername(String name) {
		
		return this.userRepository.findByUser(name);
	}



	@Override
	public User register(User user) {
		
		return this.userRepository.save(user);
	}



	@Override
	public User login(String username, String password) {
		User user =  this.findByUsername(username);
			
		if(user != null &&  user.getPassword().equals(password)) {
			return user;
		}
		
		return null;
	}

}
