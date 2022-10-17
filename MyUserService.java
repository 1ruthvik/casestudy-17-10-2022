package com.gl.caseStudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.caseStudy.bean.MyUser;
import com.gl.caseStudy.dao.MyUserRepository;


@Service
public class MyUserService implements UserDetailsService{

	@Autowired
	private MyUserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		return repository.findById(username).get();
	}
	public void save(MyUser users) {
		repository.save(users);
	}
}
