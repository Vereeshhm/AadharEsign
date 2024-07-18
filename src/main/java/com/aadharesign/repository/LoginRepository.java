package com.aadharesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadharesign.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, String> {

}
