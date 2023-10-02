package com.example.pattern.api.dto;

import lombok.Builder;

@Builder
public class UserRequestDto {
    private String name;
    private String lastName;
}
