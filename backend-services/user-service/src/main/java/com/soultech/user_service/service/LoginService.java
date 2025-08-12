package com.soultech.user_service.service;

import com.soultech.user_service.dtos.LoginResponseDTO;
import com.soultech.user_service.dtos.UserCredentialDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private LoginResponseDTO loginResponseDTO;

    public LoginResponseDTO  userLogin(UserCredentialDTO userCredentialDTO)
    {
        return loginResponseDTO;
    }
}
