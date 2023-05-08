package com.example.binaryconvertor.service;

import com.example.binaryconvertor.DTO.LengthUnit;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class LengthService {


    public LengthUnit convertMm(String mm) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, mm)) {

            double mmInt = Integer.parseInt(mm);
            double cmInt = mmInt / 10;
            double mInt = cmInt / 100;

            String cm = String.valueOf(mmInt / 10);
            String m = String.valueOf(mmInt / 1000);
            String km = String.valueOf(mmInt / 1_000_000);

            double inchInt = mmInt / 10 / 2.54;
            String inch = String.valueOf(inchInt);
            String ft = String.valueOf(inchInt / 12);
            String yard = String.valueOf(inchInt / 36);
            String mile = String.valueOf(inchInt / 63_360);

            // 1자 = 30.30303 cm
            // 1간 = 181.818182cm == 약 1.8m
            // 1정 = 10,909.0909cm == 약 109m
            // 1리 = 392.727273m
            double jaInt = mmInt * 0.0033;


            String ja = String.valueOf(jaInt);
            String gan = String.valueOf(181.818182 * cmInt);
            String jung = String.valueOf(mInt * 109.090909);
            String ri = String.valueOf(mInt * 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);

        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }


    }

    public LengthUnit convertCm(String cmInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, cmInfo)) {
            int mm = Integer.parseInt(cmInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }


    }

    public LengthUnit convertM(String mInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, mInfo)) {
            int mm = Integer.parseInt(mInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }


    }

    public LengthUnit convertKm(String kmInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, kmInfo)) {
            int mm = Integer.parseInt(kmInfo);
            return new LengthUnit();

        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }


    }

    public LengthUnit convertInch(String inchInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, inchInfo)) {
            int mm = Integer.parseInt(inchInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertYard(String yardInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, yardInfo)) {
            int mm = Integer.parseInt(yardInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertMile(String milemInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, milemInfo)) {
            int mm = Integer.parseInt(milemInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertFt(String ftInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, ftInfo)) {
            int mm = Integer.parseInt(ftInfo);
            return new LengthUnit();

        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertJa(String jaInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, jaInfo)) {
            int mm = Integer.parseInt(jaInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertGan(String ganInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, ganInfo)) {
            int mm = Integer.parseInt(ganInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertRi(String riInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, riInfo)) {
            int mm = Integer.parseInt(riInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertJung(String jungInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, jungInfo)) {
            int mm = Integer.parseInt(jungInfo);

            return new LengthUnit();
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

} // length service