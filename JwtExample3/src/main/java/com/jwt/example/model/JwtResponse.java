package com.jwt.example.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {

   private String jwtToken;

   private String username;

}
