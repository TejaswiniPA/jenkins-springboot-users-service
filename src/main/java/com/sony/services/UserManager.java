package com.sony.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sony.model.User;

@Service
public class UserManager {
	private Map<String, User> users;
	
	public UserManager() {
		users=new HashMap<>();
		User user;
		
		user = new User("Teju", "Angadi", "tpa@xmpl.com", "Bangalore");
		users.put(user.getId(), user);
		
		user = new User("Anu", "Angadi", "anu@xmpl.com", "Hubli");
		users.put(user.getId(), user);
		
		user = new User("Nidhi", "Angadi", "jna@xmpl.com", "Mysore");
		users.put(user.getId(), user);
	}
	
	public Iterable<User> getAllUsers(){
		return this.users.values();
	}
	
	public User getUserById(String id){
		return this.users.get(id);
	}

}
