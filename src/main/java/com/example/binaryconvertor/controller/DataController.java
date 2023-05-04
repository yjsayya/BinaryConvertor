package com.example.binaryconvertor.controller;

import com.example.binaryconvertor.DTO.DataValue;
import com.example.binaryconvertor.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;

    @PostMapping("/bit")
    public DataValue convertBit(@RequestParam String bitInfo) {
        System.out.println("받은 bit 값 : " + bitInfo);
        return dataService.convertBit(bitInfo);
    }

    @PostMapping("/byte")
    public DataValue convertByte(@RequestParam String byteInfo) {
        System.out.println("받은 byte 값 : " + byteInfo);
        return dataService.convertByte(byteInfo);
    }

    @PostMapping("/kb")
    public DataValue convertKb(@RequestParam String kbInfo) {
        System.out.println("받은 byte 값 : " + kbInfo);
        return dataService.convertKb(kbInfo);
    }

    @PostMapping("/mb")
    public DataValue convertMb(@RequestParam String mbInfo) {
        System.out.println("받은 MB 값 : " + mbInfo);
        return dataService.convertMb(mbInfo);
    }

    @PostMapping("/gb")
    public DataValue convertGb(@RequestParam String gbInfo) {
        System.out.println("받은 GB 값 : " + gbInfo);
        return dataService.convertGb(gbInfo);
    }

    @PostMapping("/tb")
    public DataValue convertTb(@RequestParam String tbInfo) {
        System.out.println("받은 TB 값 : " + tbInfo);
        return dataService.convertTb(tbInfo);
    }

    @PostMapping("/pb")
    public DataValue convertPb(@RequestParam String pbInfo) {
        System.out.println("받은 TB 값 : " + pbInfo);
        return dataService.convertPb(pbInfo);
    }

    @PostMapping("/eb")
    public DataValue convertEb(@RequestParam String ebInfo) {
        System.out.println("받은 TB 값 : " + ebInfo);
        return dataService.convertEb(ebInfo);
    }


/*
    bit
    byte
    KB
    MB
    GB
    TB
    PB
    EB
*/

} // data unit convertor controller