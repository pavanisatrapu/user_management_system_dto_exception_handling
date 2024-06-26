package com.myprojects.user_management_system_dto_exception_handling.repository;

import com.myprojects.user_management_system_dto_exception_handling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserEmail(String userEmail);
}

