package com.mauroroncata.course.repositories;

import com.mauroroncata.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
