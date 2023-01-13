package com.projetJEE.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetJEE.model.User;
import com.projetJEE.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() throws Exception{
		return userRepository.getAllUsers();		
	}
	
	public User getById(int id) throws Exception{
		return userRepository.get(id);		
	}
	
	public User addUser(User user) throws Exception{
		return userRepository.addUser(user);		
	}
	
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}
	
	public boolean deleteById(int id){
		try {
			userRepository.deleteUser(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}