package com.example.spring_security_practice.common.repository;


import com.example.spring_security_practice.common.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
