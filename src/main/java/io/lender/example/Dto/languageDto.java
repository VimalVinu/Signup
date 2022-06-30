package io.lender.example.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class languageDto {
    @NotNull
    private int lenderId;
    @NotNull
    private int appLanguage;
    @NotNull
    private int customerService;
    @JsonIgnore
    //@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Enter valid email")
    private String lenderEmail;
}
