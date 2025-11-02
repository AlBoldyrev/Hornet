package io.hornet.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    /**
     * UUID string. Unique identifier for the user.
     */
    private String id;

    /**
     * First name of the user.
     */
    private String firstName;

    /**
     * Last name of the user.
     */
    private String lastName;

    /**
     * E-mail address of the user.
     */
    private String email;
}
