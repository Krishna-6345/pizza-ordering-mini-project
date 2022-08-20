package com.niit.example.JwtDemo.repository;



import com.niit.example.JwtDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmailAddress(String emailAddress);
}

