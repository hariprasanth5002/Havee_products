package com.havee.havee.pro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.havee.havee.pro.Entity.User;
import com.havee.havee.pro.Repository.User_Repository;

@Service

public class AuthService {
	@Autowired
    private User_Repository userRepo;
	 public boolean validateUser(String email, String password) {
	        return userRepo.findByEmail(email)
	                .map(user -> user.getPassword().equals(password))
	                .orElse(false);
	    }

	    public String registerUser(String email, String password) {
	        if (userRepo.findByEmail(email).isPresent()) {
	            return "Email already exists";
	        }
	        User newUser = new User();
	        newUser.setEmail(email);
	        newUser.setPassword(password); // Plain text for now (we'll hash later)
	        userRepo.save(newUser);
	        return "Signup successful";
	    }
}
