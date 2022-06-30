package io.lender.example.Service.impl;

import io.lender.example.Dto.LenderDto;
import io.lender.example.Dto.languageDto;
import io.lender.example.Mapper.lenderMapper;
import io.lender.example.Service.LenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LenderServiceImpl implements LenderService {

    @Autowired
    lenderMapper mapper;

    @Override
    public void Details(LenderDto dto) {
        log.info(String.valueOf(dto));
        if(dto.getLenderPassword().equalsIgnoreCase(dto.getConfirmPassword())) {
            dto.setLenderPassword(BCrypt.hashpw(dto.getLenderPassword(), BCrypt.gensalt()));
            mapper.save(dto);
        }
        else
            throw new RuntimeException("Not a valid password");
    }

    @Override
    public void updatelanguage(languageDto dto) {
            mapper.updatelanguages(dto);
    }

    @Override
    public Object getWallet_balance(String emailId) {
        return mapper.getUserWalletBalance(emailId);
    }

}
