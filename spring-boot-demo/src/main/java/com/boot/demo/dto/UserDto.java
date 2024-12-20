package com.boot.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Schema(description = "Unique Identifier for user")
    private Long id;

    @NotBlank(message = "The firstName is required.")
    private String firstName;

    @NotBlank(message = "The lastName is required.")
    private String lastName;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    private String email;

//    @NotBlank(message = "The field isMarried is required.")
    private Boolean isMarried;

}
