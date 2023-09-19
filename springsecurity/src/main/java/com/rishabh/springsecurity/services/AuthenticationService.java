package com.rishabh.springsecurity.services;

import com.rishabh.springsecurity.dto.JwtAuthenticationResponse;
import com.rishabh.springsecurity.dto.RefreshTokenRequest;
import com.rishabh.springsecurity.dto.SignInRequest;
import com.rishabh.springsecurity.dto.SignUpRequest;
import com.rishabh.springsecurity.entity.User;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signIn(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
