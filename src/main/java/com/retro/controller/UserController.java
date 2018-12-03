package com.retro.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retro.dto.UserDto;
import com.retro.excel.WriteToExcel;
import com.retro.service.UserService;
import com.retro.utils.Constants;


@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	
	UserService userService;

	@RequestMapping(Constants.GET_USER_BY_ID)
	public UserDto getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
		WriteToExcel we=new WriteToExcel();
		we.fetchdata(userService);
		
		/*List<UserDto> userDt= new LinkedList<>();
		userDt.addAll(userService.getAllUsers());
		System.out.println(userDt.get(1).getUserName());*/
		
	}
}
