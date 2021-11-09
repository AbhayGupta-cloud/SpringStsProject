package com.example.demo.STS;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("/users") // hit http://localhost:8080/users
	public List<User> getAllUsers(){
		DBUser db=new DBUser();
		return db.getAllUsers();
	}
	@GetMapping("/user")// hit http://localhost:8080/user?q=Abhay
	public User getAUser(@RequestParam String q) {
		DBUser db=new DBUser();
		return db.getAUserByName(q);
	}
	@DeleteMapping("/users/{id}")
	public boolean deleteAUser(@PathVariable int id) {
		DBUser db=new DBUser();
		return db.deleteAUser(id);
	}
}
