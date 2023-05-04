package com.example.binaryconvertor.controller;

import com.example.binaryconvertor.DTO.Num;
import com.example.binaryconvertor.service.BinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class BInaryController {

    BinaryService binaryService;

    @Autowired
    public BInaryController(BinaryService binaryService) {
        this.binaryService = binaryService;
    }


    @PostMapping("/decimal")
    @ResponseBody
    public Num decimal(@RequestParam String decimalNum) {
        Optional<String> optional = Optional.ofNullable(decimalNum);
        System.out.println("받은 10진수 : " + decimalNum);
        return binaryService.changeDeciamlNum(decimalNum);
    }


    @PostMapping("/binary")
    @ResponseBody
    public Num binary(@RequestParam String binaryNum) {
        System.out.println("받은 2진수 : " + binaryNum);
        return binaryService.changeBinaryNum(binaryNum);
    }

    @PostMapping("/hexaDecimal")
    @ResponseBody
    public Num hexa(@RequestParam String hexaDecimalNum) {
        System.out.println("받은 16진수 : " + hexaDecimalNum);
        return binaryService.changeHexaDeciamlNum(hexaDecimalNum);
    }

} // page controller