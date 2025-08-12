package com.soultech.user_service.controllers;

import com.soultech.user_service.dtos.UserCredentialDTO;
import com.soultech.user_service.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<UserCredentialDTO> login(@RequestBody UserCredentialDTO userCredentialDto)
    {

        return ResponseEntity.ok(userCredentialDto);
    }


}
