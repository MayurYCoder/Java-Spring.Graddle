package com.codekul.java28SeptSpring.bankProject.repository;

import com.codekul.java28SeptSpring.bankProject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
