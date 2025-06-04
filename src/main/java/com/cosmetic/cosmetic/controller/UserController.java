package com.cosmetic.cosmetic.controller;




import com.cosmetic.cosmetic.dto.UsersDTO;
import com.cosmetic.cosmetic.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Retorna os dados do usuário autenticado
    @GetMapping("/me")
    public ResponseEntity<UsersDTO> getAuthenticatedUser(@AuthenticationPrincipal Jwt jwt) {
        UsersDTO userDto = userService.getOrCreateUser(jwt);
        return ResponseEntity.ok(userDto);
    }

//    {
//        "email": "usuario@gmail.com",
//            "nome": "Usuário Exemplo",
//            "plano": "BÁSICO",
//            "ativoAte": "2025-07-01"
//    }

}

