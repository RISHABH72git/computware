package com.example.computware.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class addUserDto {

    private String fullname;

    private String email;

    private String password;

    private String schoolname;

    private int keyvalue;

    private Long mobileno;

    private String country;

    private String State;

    private String district;
}
