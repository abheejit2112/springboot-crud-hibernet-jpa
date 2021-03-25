package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.repository.Userrepository;



@RestController
@RequestMapping("/api/users")
public class UserController {
 
	@Autowired
	private Userrepository userRepository;
	//get all user
	
	@GetMapping
	public List<User>getAllUsers(){
		
		return  this.userRepository.findAll();
	}
	//get user by id
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable (value= "id")long userId) {
		
		return this.userRepository.findById(userId)
				.orElseThrow(() ->new ResourceNotFoundException("User not found with id:"+userId));
	}
	//create user
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		
		return this.userRepository.save(user);
		
	}
	//update user 
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user, @PathVariable("id") long userId) {
		
		User existingUser=this.userRepository.findById(userId)
				.orElseThrow(() ->new ResourceNotFoundException("User not found with id:"+userId)); 
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setEmploymentid(user.getEmploymentid());
		existingUser.setStartdate(user.getStartdate());
		existingUser.setDesignation(user.getDesignation());
		existingUser.setDepartment(user.getDepartment());
		existingUser.setStatus(user.getStatus());
		existingUser.setDOB(user.getDOB());
		existingUser.setReportingmanager(user.getReportingmanager());
		existingUser.setGender(user.getGender());
		existingUser.setBloodgroup(user.getBloodgroup());
		existingUser.setAddress(user.getAddress());
		
		return this.userRepository.save(existingUser);
	}
	//delete user by id
	
	public ResponseEntity<User> deleteUser(@PathVariable ("id") long userId){
		
		User existingUser=this.userRepository.findById(userId)
				.orElseThrow(() ->new ResourceNotFoundException("User not found with id:"+userId)); 
		this.userRepository.delete(existingUser);
		return ResponseEntity.ok().build();
		
	}
	
}
