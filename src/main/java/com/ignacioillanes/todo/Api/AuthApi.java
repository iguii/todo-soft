package com.ignacioillanes.todo.Api;

import com.ignacioillanes.todo.Bl.AuthBl;
import com.ignacioillanes.todo.Dto.LoginDto;
import com.ignacioillanes.todo.Dto.ResponseDto;
import com.ignacioillanes.todo.Dto.TokenDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthApi {

    @PostMapping("/login")
    public ResponseDto<TokenDto> login(
            @RequestBody LoginDto login
    ){
        ResponseDto<TokenDto> response = new ResponseDto<>();
        AuthBl authBl = new AuthBl();
        TokenDto tokenDto = authBl.login(login);
        if(tokenDto == null) {
            response.setCode(0001);
            response.setData(null);
            response.setMessage("Invalid credentials");
        } else{
            response.setCode(0000);
            response.setData(tokenDto);
            response.setMessage("Login successful");
        }
        return response;
    }

}
