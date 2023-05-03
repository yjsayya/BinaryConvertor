package com.example.binaryconvertor;

import java.util.regex.Pattern;

@org.springframework.stereotype.Service
public class Service {

    /**
     * 10진수 --> 2진수, 16진수
     */
    public Num changeDeciamlNum(String decimalNum) {

        String pattern = "^[0-9]*$"; // 숫자만 등장하는지
        Num num = new Num();

        if (Pattern.matches(pattern, decimalNum)) {
            int decimal = Integer.parseInt(decimalNum);
            String hexa = Integer.toHexString(decimal);
            String binary = Integer.toBinaryString(decimal);

            num.setDecimalNum(decimalNum);
            num.setHexaDecimalNum(hexa);
            num.setBinaryNum(binary);

            num.setThree(Integer.toString(decimal,3));
            num.setFour(Integer.toString(decimal,4));
            num.setFive(Integer.toString(decimal,5));
            num.setSix(Integer.toString(decimal,6));
            num.setSeven(Integer.toString(decimal,7));
            num.setEight(Integer.toString(decimal,8));
            num.setNine(Integer.toString(decimal,9));

            num.setEleven(Integer.toString(decimal,11));
            num.setTwelve(Integer.toString(decimal,12));
            num.setThirteen(Integer.toString(decimal,13));
            num.setFourteen(Integer.toString(decimal,14));
            num.setFifthteen(Integer.toString(decimal,15));

        } else if (decimalNum.equals("")) {
            num.setCheck(false);
        } else {
            num.setCheck(false);
        }

        return num;
    }

    /**
     * 2진수 --> 10진수, 16진수
     */
    public Num changeBinaryNum(String binaryNum) {

        String pattern = "^[0-1]*$"; // 숫자만 등장하는지
        Num num = new Num();

        if (Pattern.matches(pattern, binaryNum)) {
            int decimal = Integer.parseInt(binaryNum,2);
            String hexa = Integer.toHexString(decimal);
            String decimalString = Integer.toString(decimal);

            num.setDecimalNum(decimalString);
            num.setHexaDecimalNum(hexa);
            num.setBinaryNum(binaryNum);

            num.setThree(Integer.toString(decimal,3));
            num.setFour(Integer.toString(decimal,4));
            num.setFive(Integer.toString(decimal,5));
            num.setSix(Integer.toString(decimal,6));
            num.setSeven(Integer.toString(decimal,7));
            num.setEight(Integer.toString(decimal,8));
            num.setNine(Integer.toString(decimal,9));

            num.setEleven(Integer.toString(decimal,11));
            num.setTwelve(Integer.toString(decimal,12));
            num.setThirteen(Integer.toString(decimal,13));
            num.setFourteen(Integer.toString(decimal,14));
            num.setFifthteen(Integer.toString(decimal,15));
        } else if (binaryNum.equals("")) {
            num.setCheck(false);
        } else {
            num.setCheck(false);
        }

        return num;
    }

    /**
     * 16진수 --> 10진수, 2진수
     */
    public Num changeHexaDeciamlNum(String hexaDecimalNum) {

        String pattern = "^[0-9A-Fa-f]*$"; // 숫자만 등장하는지
        Num num = new Num();

        if (Pattern.matches(pattern, hexaDecimalNum)) {
            int decimal = Integer.parseInt(hexaDecimalNum, 16);

            String decimalString = Integer.toString(decimal);
            String binary = Integer.toBinaryString(decimal);
            String hexa = Integer.toHexString(decimal);

            num.setDecimalNum(decimalString);
            num.setHexaDecimalNum(hexa);
            num.setBinaryNum(binary);

            num.setThree(Integer.toString(decimal,3));
            num.setFour(Integer.toString(decimal,4));
            num.setFive(Integer.toString(decimal,5));
            num.setSix(Integer.toString(decimal,6));
            num.setSeven(Integer.toString(decimal,7));
            num.setEight(Integer.toString(decimal,8));
            num.setNine(Integer.toString(decimal,9));

            num.setEleven(Integer.toString(decimal,11));
            num.setTwelve(Integer.toString(decimal,12));
            num.setThirteen(Integer.toString(decimal,13));
            num.setFourteen(Integer.toString(decimal,14));
            num.setFifthteen(Integer.toString(decimal,15));
        } else if (hexaDecimalNum.equals("")) {
            num.setCheck(false);
        } else {
            num.setCheck(false);
        }

        return num;
    }

} // Service