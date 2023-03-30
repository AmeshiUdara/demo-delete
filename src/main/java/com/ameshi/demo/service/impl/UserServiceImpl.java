package com.ameshi.demo.service.impl;

import com.ameshi.demo.repository.UserRepository;
import com.ameshi.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Boolean deleteUserLogin( String userId ) {

        if (userRepository.existsByUserId(userId  )) {

            userRepository.deleteUser( userId );
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return null;
//    }
}
