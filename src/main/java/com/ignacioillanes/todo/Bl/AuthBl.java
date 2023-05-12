package com.ignacioillanes.todo.Bl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;


import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.ignacioillanes.todo.Dto.LoginDto;
import com.ignacioillanes.todo.Dto.TokenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthBl {

    public static final String key = "modeladomateriademierda";


    public String generateToken(String username) {
        try{
            Algorithm algorithm = Algorithm.HMAC256(key);
            String token = JWT.create()
                    .withIssuer("www.ucb.edu.bo")
                    .withClaim("username", username)
                    .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                    .sign(algorithm);
            return token;
        } catch (JWTCreationException exception){
            System.out.println("Error al generar el token");
            throw new RuntimeException("Error al generar el token", exception);
        }
    }

    public TokenDto login(LoginDto login) {
        TokenDto tokenDto = new TokenDto();
        if(login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
            tokenDto.setToken(generateToken(login.getUsername()));
        }
        return tokenDto;
    }

    public boolean isValid(String token) {
        if(token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        DecodedJWT decodedJWT;
        try {
            Algorithm algorithm = Algorithm.HMAC256(key);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("www.ucb.edu.bo")
                    .build();
            return true;
        } catch (Exception e){
            System.out.println("Error al validar el token");
        }
        return false;
    }
}
