package org.example;

import java.util.*;

public class GSMCallHistoryTest {

    public static void main(String[] args) {
        List<Call> call = new ArrayList<>();
        Call call1 = new Call(new Date(), 10, "0912345678", 120);
        Call call2 = new Call(new Date(), 11, "0987654321", 150);
        Call call3 = new Call(new Date(), 14, "0123456789", 250);
        call.add(call1);
        call.add(call2);
        call.add(call3);

        GSM gsm = new GSM("bcd", "HTP", 13.5f, "Me", new Battery("model_1", 3, 5, BatteryType.Li_lon), new Display(7f, 5));
        
        gsm.addList(call);
        System.out.println(gsm.getList());

        System.out.println("Sum total price before remove the longest call: " + gsm.sumTotalPrice(0.37));

        Optional<Call> callMaxDuration = gsm.getList().stream().max(Comparator.comparingInt(Call::getDuration));
        callMaxDuration.ifPresent(gsm::delete);

        System.out.println("Sum total price after remove the longest call: " + gsm.sumTotalPrice(0.37));

        gsm.clearList();

        System.out.println(gsm.getList());
    }
}
