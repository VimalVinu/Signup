package io.lender.example.Dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BalanceDto {
    @NotNull
    private String emailId;
    private String Wallet_balance;
}
