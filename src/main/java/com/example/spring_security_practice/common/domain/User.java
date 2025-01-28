package com.example.spring_security_practice.common.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Getter
@Table(name = "USERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private Long id;

    private String username;
    private String password;
}
