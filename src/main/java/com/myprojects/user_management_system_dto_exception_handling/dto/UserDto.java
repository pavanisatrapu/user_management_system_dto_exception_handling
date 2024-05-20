package com.myprojects.user_management_system_dto_exception_handling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserDto {
    private Long userId;
    private String userName;
    private String userEmail;
    private int userAge;
}
