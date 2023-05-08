package com.example.binaryconvertor.controller;

import com.example.binaryconvertor.DTO.LengthUnit;
import com.example.binaryconvertor.service.LengthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LengthController {

    private final LengthService lengthService;


    @PostMapping("/mm")
    public LengthUnit convertMm(@RequestParam String mm) {
        System.out.println("받은 mm 값 : " + mm);
        return lengthService.convertMm(mm);
    }

    @PostMapping("/cm")
    public LengthUnit convertCm(@RequestParam String cmInfo) {
        System.out.println("받은 mm 값 : " + cmInfo);
        return lengthService.convertCm(cmInfo);
    }

    @PostMapping("/m")
    public LengthUnit convertM(@RequestParam String mInfo) {
        System.out.println("받은 m 값 : " + mInfo);
        return lengthService.convertM(mInfo);
    }

    @PostMapping("/km")
    public LengthUnit convertKm(@RequestParam String kmInfo) {
        System.out.println("받은 km 값 : " + kmInfo);
        return lengthService.convertKm(kmInfo);
    }


    @PostMapping("/inch")
    public LengthUnit convertInch(@RequestParam String inchInfo) {
        System.out.println("받은 inch 값 : " + inchInfo);
        return lengthService.convertInch(inchInfo);
    }
    @PostMapping("/ft")
    public LengthUnit convertFt(@RequestParam String ftInfo) {
        System.out.println("받은 ft 값 : " + ftInfo);
        return lengthService.convertFt(ftInfo);
    }
    @PostMapping("/yard")
    public LengthUnit convertYard(@RequestParam String yardInfo) {
        System.out.println("받은 yard 값 : " + yardInfo);
        return lengthService.convertYard(yardInfo);
    }
    @PostMapping("/mile")
    public LengthUnit convertMile(@RequestParam String milemInfo) {
        System.out.println("받은 mile 값 : " + milemInfo);
        return lengthService.convertMile(milemInfo);
    }


    @PostMapping("/ja")
    public LengthUnit convertJa(@RequestParam String jaInfo) {
        System.out.println("받은 자 값 : " + jaInfo);
        return lengthService.convertJa(jaInfo);
    }
    @PostMapping("/gan")
    public LengthUnit convertGan(@RequestParam String ganInfo) {
        System.out.println("받은 간 값 : " + ganInfo);
        return lengthService.convertGan(ganInfo);
    }
    @PostMapping("/ri")
    public LengthUnit convertRi(@RequestParam String riInfo) {
        System.out.println("받은 리 값 : " + riInfo);
        return lengthService.convertRi(riInfo);
    }
    @PostMapping("/jung")
    public LengthUnit convertJung(@RequestParam String jungInfo) {
        System.out.println("받은 정 값 : " + jungInfo);
        return lengthService.convertJung(jungInfo);
    }


} // length controller