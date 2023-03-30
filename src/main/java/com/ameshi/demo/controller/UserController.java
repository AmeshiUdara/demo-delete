package com.ameshi.demo.controller;

import com.ameshi.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @DeleteMapping( "/api/1/user/{userId}")
    public Boolean deleteUser(@PathVariable("userId") String userId)  {

        log.info( "Deleted User Id : {} " , userId );
        return userService.deleteUserLogin( userId);
    }

}
