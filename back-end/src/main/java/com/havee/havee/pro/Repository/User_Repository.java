package com.havee.havee.pro.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.havee.havee.pro.Entity.User;

@Repository
public interface User_Repository extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
