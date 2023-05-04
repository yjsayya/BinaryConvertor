package com.example.binaryconvertor.service;

import com.example.binaryconvertor.DTO.DataValue;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    /**
     * bit --> byte,KB,MB,GB,TB,PB,EB
     */
    public DataValue convertBit(String bitInfo) {

        double bit = Integer.parseInt(bitInfo);

        String byteInfo = String.format("%.9f", bit/8);
        String kbInfo = String.format("%.9f", bit/8/1024);
        String mbInfo = String.format("%.9f", bit/8/1024/1024);
        String gbInfo = String.format("%.9f", bit/8/1024/1024/1024);
        String tbInfo = String.format("%.9f", bit/8/1024/1024/1024/1024);
        String pbInfo = String.format("%.9f", bit/8/1024/1024/1024/1024/1024);
        String ebInfo = String.format("%.9f", bit/8/1024/1024/1024/1024/1024/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);

        return dataValue;
    }

    /**
     * byte --> bit / KB,MB,GB,TB,PB,EB
     */
    public DataValue convertByte(String byteInfo) {

        double byteNum = Integer.parseInt(byteInfo);

        String bitInfo = Integer.toString((int) (byteNum * 8.0));
        // =================================================//
        String kbInfo = String.format("%.2f", byteNum/1024);
        String mbInfo = String.format("%.2f", byteNum/1024/1024);
        String gbInfo = String.format("%.2f", byteNum/1024/1024/1024);
        String tbInfo = String.format("%.2f", byteNum/1024/1024/1024/1024);
        String pbInfo = String.format("%.2f", byteNum/1024/1024/1024/1024/1024);
        String ebInfo = String.format("%.2f", byteNum/1024/1024/1024/1024/1024/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);

        return dataValue;
    }

    /**
     * KB --> bit,byte / MB,GB,TB,PB,EB
     */
    public DataValue convertKb(String kbInfo) {

        double kbNum = Integer.parseInt(kbInfo);

        String bitInfo = Integer.toString((int) (kbNum * 8.0 * 1024));
        String byteInfo = Integer.toString((int) (kbNum * 1024));
        // =================================================//
        String mbInfo = String.format("%.2f", kbNum/1024);
        String gbInfo = String.format("%.2f", kbNum/1024/1024);
        String tbInfo = String.format("%.2f", kbNum/1024/1024/1024);
        String pbInfo = String.format("%.2f", kbNum/1024/1024/1024/1024);
        String ebInfo = String.format("%.2f", kbNum/1024/1024/1024/1024/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);

        return dataValue;
    }

    /**
     * MB --> bit,byte,KB / GB,TB,PB,EB
     */
    public DataValue convertMb(String mbInfo) {

        double mbNum = Integer.parseInt(mbInfo);

        String bitInfo = Integer.toString((int) (mbNum * 8.0 * 1024 * 1024));
        String byteInfo = Integer.toString((int) (mbNum * 1024 * 1024));
        String kbInfo = Integer.toString((int) (mbNum * 1024));
        // =================================================//
        String gbInfo = String.format("%.2f", mbNum/1024);
        String tbInfo = String.format("%.2f", mbNum/1024/1024);
        String pbInfo = String.format("%.2f", mbNum/1024/1024/1024);
        String ebInfo = String.format("%.2f", mbNum/1024/1024/1024/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);

        return dataValue;
    }

    /**
     * GB --> bit,byte,KB, MB / TB,PB,EB
     */
    public DataValue convertGb(String gbInfo) {

        double gbNum = Integer.parseInt(gbInfo);

        String bitInfo = Integer.toString((int) (gbNum * 8.0 * 1024 * 1024 * 1024));
        String byteInfo = Integer.toString((int) (gbNum * 1024 * 1024 * 1024));
        String kbInfo = Integer.toString((int) (gbNum * 1024 * 1024));
        String mbInfo = Integer.toString((int) (gbNum * 1024));
        // =================================================//
        String tbInfo = String.format("%.2f", gbNum/1024);
        String pbInfo = String.format("%.2f", gbNum/1024/1024);
        String ebInfo = String.format("%.2f", gbNum/1024/1024/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);
        return dataValue;
    }

    /**
     * TB --> bit,byte,KB,MB / PB,EB
     */
    public DataValue convertTb(String tbInfo) {

        double tbNum = Integer.parseInt(tbInfo);

        String bitInfo = Integer.toString((int) (tbNum * 8.0 * 1024 * 1024 * 1024 * 1024));
        String byteInfo = Integer.toString((int) (tbNum * 1024 * 1024 * 1024 * 1024));
        String kbInfo = Integer.toString((int) (tbNum * 1024 * 1024 * 1024));
        String mbInfo = Integer.toString((int) (tbNum * 1024 * 1024));
        String gbInfo = Integer.toString((int) (tbNum * 1024));
        // =================================================//
        String pbInfo = String.format("%.2f", tbNum/1024);
        String ebInfo = String.format("%.2f", tbNum/1024/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);

        return dataValue;
    }


    public DataValue convertPb(String pbInfo) {

        double pbNum = Integer.parseInt(pbInfo);

        String bitInfo = Integer.toString((int) (pbNum * 8.0 * 1024 * 1024 * 1024 * 1024 * 1024));
        String byteInfo = Integer.toString((int) (pbNum * 1024 * 1024 * 1024 * 1024 * 1024));
        String kbInfo = Integer.toString((int) (pbNum * 1024 * 1024 * 1024 * 1024));
        String mbInfo = Integer.toString((int) (pbNum * 1024 * 1024 * 1024));
        String gbInfo = Integer.toString((int) (pbNum * 1024 * 1024));
        String tbInfo = Integer.toString((int) (pbNum * 1024));
        // =================================================//
        String ebInfo = String.format("%.2f", pbNum/1024);

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);;

        return dataValue;
    }

    public DataValue convertEb(String ebInfo) {

        double ebNum = Integer.parseInt(ebInfo);

        String bitInfo = Integer.toString((int) (ebNum * 8.0 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024));
        String byteInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024 * 1024 * 1024 * 1024));
        String kbInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024 * 1024 * 1024));
        String mbInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024 * 1024));
        String gbInfo = Integer.toString((int) (ebNum * 1024 * 1024 * 1024));
        String tbInfo = Integer.toString((int) (ebNum * 1024 * 1024));
        String pbInfo = Integer.toString((int) (ebNum * 1024));

        DataValue dataValue = new DataValue(bitInfo, byteInfo, kbInfo, mbInfo, gbInfo, tbInfo, pbInfo, ebInfo);

        return dataValue;
    }

} // data service