package com.jwt.example.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userId;

    private String name;

    private  String email;
}
