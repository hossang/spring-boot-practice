package com.example.spring_security_practice.common.service;

import com.example.spring_security_practice.common.domain.User;
import com.example.spring_security_practice.common.dto.UserRegisteration;
import com.example.spring_security_practice.common.repository.UserRepository;
import com.github.f4b6a3.tsid.TsidCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(UserRegisteration request) {
        userRepository.save(
                User.builder()
                        .id(TsidCreator.getTsid().toLong())
                        .username(request.getUsername())
                        .password(request.getPassword())
                        .build()
        );
    }
}
