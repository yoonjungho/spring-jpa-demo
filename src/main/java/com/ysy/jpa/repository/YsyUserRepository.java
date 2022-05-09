package com.ysy.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ysy.jpa.entity.YsyUser;

public interface YsyUserRepository extends JpaRepository<YsyUser, String>{

}
