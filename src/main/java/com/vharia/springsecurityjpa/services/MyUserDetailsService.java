package com.vharia.springsecurityjpa.services;

import com.vharia.springsecurityjpa.models.MyUserDetails;
import com.vharia.springsecurityjpa.models.User;
import com.vharia.springsecurityjpa.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);
        if(user == null){
            throw new UsernameNotFoundException("username not found - "+userName);
        }else{
            return new MyUserDetails(user);
        }
       
    }

}