package by.tms.musicshop.dto;

import by.tms.musicshop.entity.user.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private long userId;
    private String email;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String postCode;
    private Role role;
}
