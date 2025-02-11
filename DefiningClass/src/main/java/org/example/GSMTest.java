package org.example;

public class GSMTest {
    public static void main(String[] args) {
        GSM[] listGSM = {
                new GSM("abc", "TPhat"),
                new GSM("bcd", "HTP", 13.5f, "Me", new Battery("model_1", 3, 5, BatteryType.Li_lon), new Display(7f, 5))
        };

        for(GSM gsm : listGSM){
            System.out.println(gsm);
        }
    }
}
