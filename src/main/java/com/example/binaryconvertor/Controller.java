package com.example.binaryconvertor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {

    Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }


    @GetMapping("/")
    public String index() {
        return "index";
    }


    @PostMapping("/decimal")
    @ResponseBody
    public Num decimal(@RequestParam String decimalNum) {
        Optional<String> optional = Optional.ofNullable(decimalNum);
        System.out.println("받은 10진수 : " + decimalNum);
        return service.changeDeciamlNum(decimalNum);
    }


    @PostMapping("/binary")
    @ResponseBody
    public Num binary(@RequestParam String binaryNum) {
        System.out.println("받은 2진수 : " + binaryNum);
        return service.changeBinaryNum(binaryNum);
    }

    @PostMapping("/hexaDecimal")
    @ResponseBody
    public Num hexa(@RequestParam String hexaDecimalNum) {
        System.out.println("받은 16진수 : " + hexaDecimalNum);
        return service.changeHexaDeciamlNum(hexaDecimalNum);
    }

} // page controller