package com.mk.user.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.user.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//	List<User> findById(int id);
}
