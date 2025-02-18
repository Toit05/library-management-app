package com.hit.library.management.repository;

import com.hit.library.management.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}