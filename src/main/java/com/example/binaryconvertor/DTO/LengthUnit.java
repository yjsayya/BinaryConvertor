package com.example.binaryconvertor.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LengthUnit {

    private boolean check;

    private String mm;
    private String cm;
    private String m;
    private String km;

    private String inch;
    private String mile;
    private String yard;
    private String ft;

    private String ja;
    private String gan;
    private String ri;
    private String jung;

    public LengthUnit(String mm, String cm, String m, String km, String inch, String mile, String yard, String ft, String ja, String gan, String ri, String jung) {
        this.mm = mm;
        this.cm = cm;
        this.m = m;
        this.km = km;
        this.inch = inch;
        this.mile = mile;
        this.yard = yard;
        this.ft = ft;
        this.ja = ja;
        this.gan = gan;
        this.ri = ri;
        this.jung = jung;
    }
}