package com.ameshi.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    /**
     * The service call to delete user login
     * @param userId
     * @return
     */
    Boolean deleteUserLogin(String userId);
}
