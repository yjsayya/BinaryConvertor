package com.example.binaryconvertor.service;

import com.example.binaryconvertor.DTO.length.LengthUnit;
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
            double cmDouble = Integer.parseInt(cmInfo);
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 100.0;
            double kmDouble = mDouble / 1000.0;

            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(mmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertM(String mInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, mInfo)) {
            double mDouble = Integer.parseInt(mInfo);

            double cmDouble = mDouble / 100.0;
            double mmDouble = cmDouble * 10.0;
            double kmDouble = mDouble / 1000.0;

            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(mmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }


    }

    public LengthUnit convertKm(String kmInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, kmInfo)) {
            double kmDouble = Integer.parseInt(kmInfo);
            double mDouble = kmDouble * 1000.0;
            double cmDouble = mDouble * 100.0;
            double mmDouble = cmDouble * 10.0;

            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(mmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }


    }

    public LengthUnit convertInch(String inchInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함



        if (Pattern.matches(pattern, inchInfo)) {
            double inchDouble = Integer.parseInt(inchInfo);

            double cmDouble = inchDouble * 2.54;
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 10.0;
            double kmDouble = mDouble / 1000.0;

            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inchInfo, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertYard(String yardInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, yardInfo)) {

            double yardDouble = Integer.parseInt(yardInfo);

            double cmDouble = yardDouble * 91.44;
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 10.0;
            double kmDouble = mDouble / 1000.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertMile(String mileInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, mileInfo)) {
            double mileDouble = Integer.parseInt(mileInfo);

            double kmDouble = mileDouble * 1.609344;
            double mDouble = kmDouble / 1000.0;
            double cmDouble = mDouble / 100.0;
            double mmDouble = cmDouble * 10.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mileInfo, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertFt(String ftInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, ftInfo)) {
            double ftDouble = Integer.parseInt(ftInfo);

            double cmDouble = ftDouble * 30.48;
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 10.0;
            double kmDouble = mDouble / 1000.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ftInfo, yard, mile, ja, gan, jung, ri);

        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertJa(String jaInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, jaInfo)) {
            double jaDouble = Integer.parseInt(jaInfo);

            double cmDouble = jaDouble * 30.30303;
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 10.0;
            double kmDouble = mDouble / 1000.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertGan(String ganInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, ganInfo)) {
            double ganDouble = Integer.parseInt(ganInfo);

            double cmDouble = ganDouble * 181.818182;
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 10.0;
            double kmDouble = mDouble / 1000.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertJung(String jungInfo) {
        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, jungInfo)) {
            double jungDouble = Integer.parseInt(jungInfo);

            double cmDouble = jungDouble * 181.818182;
            double mmDouble = cmDouble * 10.0;
            double mDouble = cmDouble / 10.0;
            double kmDouble = mDouble / 1000.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }

    public LengthUnit convertRi(String riInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        // 1자 = 30.30303 cm
        // 1간 = 181.818182cm == 약 1.8m
        // 1정 = 10,909.0909cm == 약 109m
        // 1리 = 392.727273m

        // 1inch = 2.54cm
        // 1ft = 30.48cm
        // 1yard = 91.44cm
        // 1mile = 1.609344

        if (Pattern.matches(pattern, riInfo)) {
            double riDouble = Integer.parseInt(riInfo);

            double mDouble = riDouble * 392.727273;
            double cmDouble = mDouble / 100.0;
            double mmDouble = cmDouble * 10.0;
            double kmDouble = mDouble / 1000.0;
            // SI
            String mm = String.valueOf(mmDouble);
            String cm = String.valueOf(cmDouble);
            String m = String.valueOf(mDouble);
            String km = String.valueOf(kmDouble);
            // inch, ft, yard, mile
            String inch = String.valueOf(cmDouble / 2.54);
            String ft = String.valueOf(cmDouble / 30.48);
            String yard = String.valueOf(cmDouble / 91.48);
            String mile = String.valueOf(kmDouble / 1.609344);
            // 자 간 정 리
            String ja = String.valueOf(cmDouble / 30.30303);
            String gan = String.valueOf(cmDouble / 181.818182);
            String jung = String.valueOf(mDouble / 109.090909);
            String ri = String.valueOf(mDouble / 392.727273);

            return new LengthUnit(mm, cm, m, km, inch, ft, yard, mile, ja, gan, jung, ri);
        } else {
            LengthUnit lengthUnit = new LengthUnit();
            lengthUnit.setCheck(false);
            return lengthUnit;
        }

    }


} // length service