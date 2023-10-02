package com.example.pattern.service;

import com.example.pattern.api.dto.UserRequestDto;
import com.example.pattern.persistence.entity.User;
import com.example.pattern.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRequestDto getUserDtoById(Long id) {
        User userEntity = userRepository.findFirstById(id);

        return UserRequestDto.builder()
                .name(userEntity.getName())
                .lastName(userEntity.getLastName())
                .build();
    }
}
