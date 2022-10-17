package com.gl.caseStudy.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy.bean.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String> {
	Optional<MyUser> findUserByUsername(String username);
}
