package com.projetJEE.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetJEE.model.User;
import com.projetJEE.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("")
    public ResponseEntity<List<User> >getAllUsers() {
    	try {
    		return ResponseEntity.ok().body(userService.getAllUsers());
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
    }
    
    @GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable(value = "id") int id){
		try {
			return ResponseEntity.ok().body(userService.getById(id));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
	}
    
	@PostMapping("/add")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		 try {
		 user = userService.addUser(user);
			return ResponseEntity.ok().body(user);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		try {
			user = userService.updateUser(user);
			return ResponseEntity.ok().body(user);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<User> delete(@PathVariable(value = "id") int id) {
		userService.deleteById(id);
		return ResponseEntity.ok().body(null);
	}
}
