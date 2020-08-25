package com.example.securitytest.repo;

import com.example.securitytest.modals.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface RoleRepo extends JpaRepository<Role, Long>{
    public Role findByRoleName(String roleName);
} 