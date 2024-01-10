package com.shibam.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shibam.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
