package com.codekul.java28SeptSpring.onetoone.repository;

import com.codekul.java28SeptSpring.onetoone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
