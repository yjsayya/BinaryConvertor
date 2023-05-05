package com.example.binaryconvertor.service;

import com.example.binaryconvertor.DTO.DataValue;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class DataService {

    /**
     *  1. bit --> byte,KB,MB,GB,TB,PB,EB
     */
    public DataValue convertBit(String bitInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함

        if (Pattern.matches(pattern, bitInfo)) {
            double bit = Integer.parseInt(bitInfo);

            String byteInfo = String.format("%.9f", bit/8);
            String kbInfo = String.format("%.9f", bit/8/1024);
            String mbInfo = String.format("%.9f", bit/8/1024/1024);
            String gbInfo = String.format("%.9f", bit/8/1024/1024/1024);
            String tbInfo = String.format("%.9f", bit/8/1024/1024/1024/1024);
            String pbInfo = String.format("%.9f", bit/8/1024/1024/1024/1024/1024);
            String ebInfo = String.format("%.9f", bit/8/1024/1024/1024/1024/1024/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();
            dataValue.setCheck(false);

            return dataValue;
        }

    }

    /**
     * 2. byte --> bit / KB,MB,GB,TB,PB,EB
     */
    public DataValue convertByte(String byteInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, byteInfo)) {

            double byteNum = Integer.parseInt(byteInfo);

            String bitInfo = Integer.toString((int) (byteNum * 8.0));
            // =================================================//
            String kbInfo = String.format("%.2f", byteNum/1024);
            String mbInfo = String.format("%.2f", byteNum/1024/1024);
            String gbInfo = String.format("%.2f", byteNum/1024/1024/1024);
            String tbInfo = String.format("%.2f", byteNum/1024/1024/1024/1024);
            String pbInfo = String.format("%.2f", byteNum/1024/1024/1024/1024/1024);
            String ebInfo = String.format("%.2f", byteNum/1024/1024/1024/1024/1024/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();
            dataValue.setCheck(false);

            return dataValue;
        }

    }

    /**
     * 3. KB --> bit,byte / MB,GB,TB,PB,EB
     */
    public DataValue convertKb(String kbInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, kbInfo)) {
            double kbNum = Integer.parseInt(kbInfo);

            String bitInfo = Integer.toString((int) (kbNum * 8.0 * 1024));
            String byteInfo = Integer.toString((int) (kbNum * 1024));
            // =================================================//
            String mbInfo = String.format("%.2f", kbNum/1024);
            String gbInfo = String.format("%.2f", kbNum/1024/1024);
            String tbInfo = String.format("%.2f", kbNum/1024/1024/1024);
            String pbInfo = String.format("%.2f", kbNum/1024/1024/1024/1024);
            String ebInfo = String.format("%.2f", kbNum/1024/1024/1024/1024/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();

            dataValue.setCheck(false);
            return dataValue;
        }

    }

    /**
     * 4. MB --> bit,byte,KB / GB,TB,PB,EB
     */
    public DataValue convertMb(String mbInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, mbInfo)) {

            double mbNum = Integer.parseInt(mbInfo);

            String bitInfo = Integer.toString((int) (mbNum * 8.0 * 1024 * 1024));
            String byteInfo = Integer.toString((int) (mbNum * 1024 * 1024));
            String kbInfo = Integer.toString((int) (mbNum * 1024));
            // =================================================//
            String gbInfo = String.format("%.2f", mbNum/1024);
            String tbInfo = String.format("%.2f", mbNum/1024/1024);
            String pbInfo = String.format("%.2f", mbNum/1024/1024/1024);
            String ebInfo = String.format("%.2f", mbNum/1024/1024/1024/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();

            dataValue.setCheck(false);
            return dataValue;
        }

    }

    /**
     * 5. GB --> bit,byte,KB, MB / TB,PB,EB
     */
    public DataValue convertGb(String gbInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, gbInfo)) {
            double gbNum = Integer.parseInt(gbInfo);

            String bitInfo = Integer.toString((int) (gbNum * 8.0 * 1024 * 1024 * 1024));
            String byteInfo = Integer.toString((int) (gbNum * 1024 * 1024 * 1024));
            String kbInfo = Integer.toString((int) (gbNum * 1024 * 1024));
            String mbInfo = Integer.toString((int) (gbNum * 1024));
            // =================================================//
            String tbInfo = String.format("%.2f", gbNum/1024);
            String pbInfo = String.format("%.2f", gbNum/1024/1024);
            String ebInfo = String.format("%.2f", gbNum/1024/1024/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();

            dataValue.setCheck(false);
            return dataValue;
        }

    }

    /**
     * 6. TB --> bit,byte,KB,MB / PB,EB
     */
    public DataValue convertTb(String tbInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, tbInfo)) {
            double tbNum = Integer.parseInt(tbInfo);

            String bitInfo = Integer.toString((int) (tbNum * 8.0 * 1024 * 1024 * 1024 * 1024));
            String byteInfo = Integer.toString((int) (tbNum * 1024 * 1024 * 1024 * 1024));
            String kbInfo = Integer.toString((int) (tbNum * 1024 * 1024 * 1024));
            String mbInfo = Integer.toString((int) (tbNum * 1024 * 1024));
            String gbInfo = Integer.toString((int) (tbNum * 1024));
            // =================================================//
            String pbInfo = String.format("%.2f", tbNum/1024);
            String ebInfo = String.format("%.2f", tbNum/1024/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();

            dataValue.setCheck(false);
            return dataValue;
        }

    }

    /**
     * 7. PB --> bit,byte,KB,MB,TB / EB
     */
    public DataValue convertPb(String pbInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, pbInfo)) {

            double pbNum = Integer.parseInt(pbInfo);

            String bitInfo = Integer.toString((int) (pbNum * 8.0 * 1024 * 1024 * 1024 * 1024 * 1024));
            String byteInfo = Integer.toString((int) (pbNum * 1024 * 1024 * 1024 * 1024 * 1024));
            String kbInfo = Integer.toString((int) (pbNum * 1024 * 1024 * 1024 * 1024));
            String mbInfo = Integer.toString((int) (pbNum * 1024 * 1024 * 1024));
            String gbInfo = Integer.toString((int) (pbNum * 1024 * 1024));
            String tbInfo = Integer.toString((int) (pbNum * 1024));
            // =================================================//
            String ebInfo = String.format("%.2f", pbNum/1024);

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();

            dataValue.setCheck(false);
            return dataValue;
        }

    }

    /**
     * 8. EB --> bit,byte,KB,MB,TB,PB
     */
    public DataValue convertEb(String ebInfo) {

        String pattern = "^[0-9]*$"; // 숫자만 있어야함
        if (Pattern.matches(pattern, ebInfo)) {
            double ebNum = Integer.parseInt(ebInfo);

            String bitInfo = Integer.toString((int) (ebNum * 8.0 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024));
            String byteInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024 * 1024 * 1024 * 1024));
            String kbInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024 * 1024 * 1024));
            String mbInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024 * 1024));
            String gbInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024));
            String tbInfo = Integer.toString((int) (ebNum * 1024 * 1024));
            String pbInfo = Integer.toString((int) (ebNum * 1024));

            return new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        } else {
            DataValue dataValue = new DataValue();

            dataValue.setCheck(false);
            return dataValue;
        }

    }

} // data service