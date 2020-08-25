package com.example.securitytest.service;

import com.example.securitytest.modals.Role;
import com.example.securitytest.modals.User;

public interface AccountService {
    //user
	public User saveUser(User appUser);
	public Role saveRole(Role approle);
	public void addRoleToUser(String username, String role);
	public User findUserByUsername(String username);
}