package com.boot.spring.hello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.spring.hello.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}