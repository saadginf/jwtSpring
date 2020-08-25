package com.example.securitytest.service;
import com.example.securitytest.modals.Role;
import com.example.securitytest.modals.User;
import com.example.securitytest.repo.RoleRepo;
import com.example.securitytest.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	private RoleRepo appRoleRepo;
	
	@Autowired
	private UserRepo appUserRepo;
	
	
	@Override
	public User saveUser(User appUser) {
		appUser.setPassword(appUser.getPassword());
		return appUserRepo.save(appUser);
	}

	@Override
	public Role saveRole(Role approle) {
		return appRoleRepo.save(approle);
	}

	@Override
	public void addRoleToUser(String username, String role) {
		appUserRepo.findByUsername(username).getRoles().add(appRoleRepo.findByRoleName(role));
	}

	@Override
	public User findUserByUsername(String username) {
		return appUserRepo.findByUsername(username);
	}
}