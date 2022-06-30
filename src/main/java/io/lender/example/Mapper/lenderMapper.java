package io.lender.example.Mapper;

import io.lender.example.Dto.LenderDto;
import io.lender.example.Dto.languageDto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface lenderMapper {

    @Insert("insert into lenders (lender_name,lender_email, lender_mobile, lender_password, lender_wallet, lender_active, created_at, updated_at, lender_applanguage, lender_customerservice) values(#{lenderName}, #{lenderEmail}, #{lenderMobile}, #{lenderPassword}, #{lenderWallet}, #{lenderActive}, #{createdAt}, #{updatedAt}, #{appLanguage}, #{customerService})")
    void save(LenderDto dto);

    @Update("update lenders set lender_applanguage = #{appLanguage}, lender_customerservice = #{customerService} where lender_id = #{lenderId}")
    void updatelanguages(languageDto dto);

    @Select("select lender_wallet from lenders where lender_email = #{wallet_balance}")
    String getUserWalletBalance (String email);
}
