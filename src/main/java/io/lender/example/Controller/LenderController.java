package io.lender.example.Controller;

import io.lender.example.Dto.LenderDto;
import io.lender.example.Dto.languageDto;
import io.lender.example.Service.LenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class LenderController {

        @Autowired
        LenderService service;

    @PostMapping("/lenderdetails")
    public ResponseEntity Details(@Valid @RequestBody LenderDto dto){
//        log.info(String.valueOf(dto));
//        return ResponseEntity.ok(dto);
        service.Details(dto);
        Map<String,String> response = new HashMap<>();
        response.put("status","200");
        response.put("message",dto.getLenderName()+" user added successfully");
        return ResponseEntity.status(200).body(response);
    }



    @PostMapping("/updatedLanguage")
    public ResponseEntity updatelanguages(@Valid @RequestBody languageDto dto){
//        log.info(String.valueOf(dto));
        service.updatelanguage(dto);
        return ResponseEntity.ok("language updated successfully");
    }

    @GetMapping("/Wallet-Balance")
    public ResponseEntity Walletbalance(@RequestParam("emailId") String emailId){
        Map<String,String> response = new HashMap<>();
        return ResponseEntity.ok(service.getWallet_balance(emailId));

    }





}
