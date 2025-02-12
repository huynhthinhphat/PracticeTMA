package org.example.controller;

import org.example.model.Battery;
import org.example.model.BatteryType;
import org.example.model.Display;
import org.example.model.GSM;

public class GSMTest {
    public static void main(String[] args) {
        //Tạo danh sách GSM
        GSM[] listGSM = {
                new GSM("abc", "TPhat"),
                new GSM("bcd", "HTP", 13.5f, "Me", new Battery("model_1", 3, 5, BatteryType.Li_lon), new Display(7f, 5))
        };

        //In thông tin GSM
        for(GSM gsm : listGSM){
            System.out.println(gsm);
        }
    }
}
