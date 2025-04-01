package com.dan.shoe.perfume.dtos.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdatetionByAdmin {
    String name;
    String username;
    String email;
    String phoneNumber;
    String role;
    Set<String> roles;
    // MultipartFile avatar;
    boolean enabled;
}
