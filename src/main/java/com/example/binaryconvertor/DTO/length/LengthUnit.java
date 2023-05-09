package com.example.binaryconvertor.DTO.length;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LengthUnit {

    private boolean check = true;

    private String mm;
    private String cm;
    private String m;
    private String km;

    private String inch;
    private String ft;
    private String yard;
    private String mile;

    private String ja;
    private String gan;
    private String jung;
    private String ri;


    public LengthUnit(String mm, String cm, String m, String km, String inch, String ft, String yard, String mile, String ja, String gan, String jung, String ri) {
        this.mm = mm;
        this.cm = cm;
        this.m = m;
        this.km = km;
        this.inch = inch;
        this.ft = ft;
        this.yard = yard;
        this.mile = mile;
        this.ja = ja;
        this.gan = gan;
        this.jung = jung;
        this.ri = ri;
    }
} // length DTO