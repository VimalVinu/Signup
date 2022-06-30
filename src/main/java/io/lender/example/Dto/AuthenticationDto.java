package io.lender.example.Dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class AuthenticationDto {
    @NotEmpty(message = "email_id_required")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Enter valid email")
    private String email_id;

    @NotEmpty(message = "password_required")
    @Size(min = 8, max = 32, message = "password_length")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8,32})",
            message = "password_pattern")
    private String password;

    @NotNull(message = "grant_type_required")
    @Pattern(regexp = "password|refreshToken", flags = Pattern.Flag.CANON_EQ,
            message = "Invalid grantType. Accepted values are password and refreshToken")
    private String grantType;

    private String refreshToken;
}
