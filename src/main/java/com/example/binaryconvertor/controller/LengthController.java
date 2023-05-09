package com.example.binaryconvertor.controller;

import com.example.binaryconvertor.DTO.length.LengthUnit;
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
    public LengthUnit convertCm(@RequestParam String cm) {
        System.out.println("받은 mm 값 : " + cm);
        return lengthService.convertCm(cm);
    }

    @PostMapping("/m")
    public LengthUnit convertM(@RequestParam String m) {
        System.out.println("받은 m 값 : " + m);
        return lengthService.convertM(m);
    }

    @PostMapping("/km")
    public LengthUnit convertKm(@RequestParam String km) {
        System.out.println("받은 km 값 : " + km);
        return lengthService.convertKm(km);
    }


    @PostMapping("/inch")
    public LengthUnit convertInch(@RequestParam String inch) {
        System.out.println("받은 inch 값 : " + inch);
        return lengthService.convertInch(inch);
    }
    @PostMapping("/ft")
    public LengthUnit convertFt(@RequestParam String ft) {
        System.out.println("받은 ft 값 : " + ft);
        return lengthService.convertFt(ft);
    }
    @PostMapping("/yard")
    public LengthUnit convertYard(@RequestParam String yard) {
        System.out.println("받은 yard 값 : " + yard);
        return lengthService.convertYard(yard);
    }
    @PostMapping("/mile")
    public LengthUnit convertMile(@RequestParam String mile) {
        System.out.println("받은 mile 값 : " + mile);
        return lengthService.convertMile(mile);
    }


    @PostMapping("/ja")
    public LengthUnit convertJa(@RequestParam String ja) {
        System.out.println("받은 자 값 : " + ja);
        return lengthService.convertJa(ja);
    }
    @PostMapping("/gan")
    public LengthUnit convertGan(@RequestParam String gan) {
        System.out.println("받은 간 값 : " + gan);
        return lengthService.convertGan(gan);
    }
    @PostMapping("/jung")
    public LengthUnit convertJung(@RequestParam String jung) {
        System.out.println("받은 정 값 : " + jung);
        return lengthService.convertJung(jung);
    }
    @PostMapping("/ri")
    public LengthUnit convertRi(@RequestParam String ri) {
        System.out.println("받은 리 값 : " + ri);
        return lengthService.convertRi(ri);
    }

} // length controller