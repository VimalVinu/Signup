package io.lender.example.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Timestamp;

@Data
public class LenderDto {

    @JsonIgnore
    private int lenderId;

    @NotNull
    private String lenderName;
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Enter valid email")
    private String lenderEmail;
    @NotNull
    private String lenderMobile;
    @NotNull
    private String lenderPassword;
    @NotNull
    private String confirmPassword;
    @NotNull
    private String lenderWallet;
    @JsonIgnore
    private Boolean lenderActive;
    @JsonIgnore
    private Timestamp createdAt;
    @JsonIgnore
    private Timestamp updatedAt;
    @NotNull
    private int appLanguage;
    @NotNull
    private int customerService;
}
