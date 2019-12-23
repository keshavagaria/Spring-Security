package com.mobileprogramming.SpringSecurityJpaMySQL;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService{

	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	Optional<User> user=userRepository.findByUserName(username);
	user.orElseThrow(()->new UsernameNotFoundException("Not Found:"+username));
	return user.map(MyUserDetails::new).get();
	}

}
