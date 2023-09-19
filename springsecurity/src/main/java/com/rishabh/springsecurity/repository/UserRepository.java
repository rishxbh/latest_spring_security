package com.rishabh.springsecurity.repository;

import com.rishabh.springsecurity.entity.Role;
import com.rishabh.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
