package com.project.vm.serviceInterfaces;

import com.project.vm.entities.User;

public interface IUserService {

	public User validateUser( User user);
	User updateUser(int id,User user);
	void deleteUser(Long id);	
	
}
