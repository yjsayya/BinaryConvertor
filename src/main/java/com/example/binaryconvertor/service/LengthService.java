package com.example.binaryconvertor.service;

import com.example.binaryconvertor.DTO.LengthUnit;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class LengthService {


    public LengthUnit convertMm(String mmInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, mmInfo)) {
            double mmInt = Integer.parseInt(mmInfo);
            String cmInfo = String.valueOf(mmInt / 10);
            String mInfo = String.valueOf(mmInt / 1000);
            String kmInfo = String.valueOf(mmInt / 1_000_000);

            double inchInt = mmInt / 10 / 2.54;
            String inch = String.valueOf(inchInt);
            String ft = String.valueOf(inchInt / 12);
            String yard = String.valueOf(inchInt / 36);
            String mile = String.valueOf(inchInt / 63_360);


            return new LengthUnit();

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