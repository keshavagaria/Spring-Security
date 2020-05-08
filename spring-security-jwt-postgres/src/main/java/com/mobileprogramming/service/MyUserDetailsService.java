package com.mobileprogramming.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mobileprogramming.model.Client;
import com.mobileprogramming.model.MyUserDetails;
import com.mobileprogramming.repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Client> client=userRepository.findByUserName(username);
		  client.orElseThrow(()->new UsernameNotFoundException("Not Found:"+username));
		  return client.map(MyUserDetails::new).get(); 
	
	}

}
