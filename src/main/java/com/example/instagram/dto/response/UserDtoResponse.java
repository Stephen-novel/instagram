package com.example.instagram.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDtoResponse {

    private String username;

    private LocalDateTime localDateTime;
}
