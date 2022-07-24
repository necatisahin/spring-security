package com.necatisahiin.springsecurity.repository;

import com.necatisahiin.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
