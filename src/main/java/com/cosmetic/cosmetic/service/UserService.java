package com.cosmetic.cosmetic.service;

import com.cosmetic.cosmetic.dto.UsersDTO;
import com.cosmetic.cosmetic.mappers.UserMapper;
import com.cosmetic.cosmetic.model.Users;
import com.cosmetic.cosmetic.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.oauth2.jwt.Jwt; // Correct import for Jwt




import java.time.LocalDate;

@Service
public class UserService {

     private UserRepository userRepository;

     private UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }
    public UserService() {
    }


    public UsersDTO getOrCreateUser(Jwt jwt) {
        String email = jwt.getClaimAsString("email"); // Corrected method name and variable name
        String name = jwt.getClaimAsString("name");   // Corrected variable name
        String googleId = jwt.getSubject();

        Users user = userRepository.findByEmail(email)
                .orElseGet(() -> {
                    Users novo = new Users();
                    novo.setEmail(email);
                    novo.setName(name);
                    novo.setGoogleId(googleId);
                    novo.setPlano("BÁSICO");
                    novo.setAtivoAte(LocalDate.now().plusDays(7));
                    return userRepository.save(novo);
                });

        return userMapper.toDTO(user);
}


}
