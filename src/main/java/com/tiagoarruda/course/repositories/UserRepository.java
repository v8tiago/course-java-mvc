package com.tiagoarruda.course.repositories;

import com.tiagoarruda.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
