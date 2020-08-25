package com.example.securitytest.repo;
import com.example.securitytest.modals.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);
    
}