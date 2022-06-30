package io.lender.example.Service;

import io.lender.example.Dto.LenderDto;
import io.lender.example.Dto.languageDto;


public interface LenderService {

    void Details(LenderDto dto);

    void updatelanguage(languageDto dto);

    Object getWallet_balance(String emailId);
}
