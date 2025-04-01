package com.dan.shoe.perfume.dtos.responses;

import com.dan.shoe.perfume.models.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AccountStaffResponse {
    Long id;
    String name;
    String username;
    boolean enabled;
    String verificationCode;
    String resetPasswordToken;
    String email;
    String phoneNumber;
    String avatarCode;
    boolean status;

    String staffName;
    String staffPhoneNumber;
    LocalDate staffDob;
    String staffAddress;
    Gender staffGender;
    String staffCccd;
    String staffImageCode;
    boolean staffStatus;
}
