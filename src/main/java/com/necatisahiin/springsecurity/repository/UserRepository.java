package com.necatisahiin.springsecuritybasicauth.repository;

import com.necatisahiin.springsecuritybasicauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
