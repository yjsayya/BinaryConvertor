package com.example.binaryconvertor.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class DataValue {

    private boolean check = true;

    private String bitInfo;
    private String byteInfo;
    private String kbInfo;
    private String mbInfo;
    private String gbInfo;
    private String tbInfo;
    private String pbInfo;
    private String ebInfo;

    public DataValue(String bitInfo, String byteInfo, String kbInfo, String mbInfo, String gbInfo, String tbInfo, String pbInfo, String ebInfo) {
        this.bitInfo = bitInfo;
        this.byteInfo = byteInfo;
        this.kbInfo = kbInfo;
        this.mbInfo = mbInfo;
        this.gbInfo = gbInfo;
        this.tbInfo = tbInfo;
        this.pbInfo = pbInfo;
        this.ebInfo = ebInfo;
    }
} // data dto