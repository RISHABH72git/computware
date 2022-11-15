package com.example.computware.dao;

import com.example.computware.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <Users,Long> {

    Users findAllByEmail(String email);
    Users findByEmail(String email);
}
