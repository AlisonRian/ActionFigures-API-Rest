package com.projetopw.projetofinalpw.controller;

import com.projetopw.projetofinalpw.dto.security.LoginDTO;
import com.projetopw.projetofinalpw.services.security.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthenticationController {

    private final TokenService service;
    private final AuthenticationManager authenticationManager;


    @PostMapping("/token")
    public String getToken(@RequestBody LoginDTO loginDto){
        Authentication authentication = authenticationManager
                .authenticate(
                        new UsernamePasswordAuthenticationToken(loginDto.username(), loginDto.password())
                );

        return service.generateToken(authentication);
    }
}
