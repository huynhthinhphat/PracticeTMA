package org.example.controller;

import org.example.model.*;
import org.example.service.GSMService;

import java.util.*;

public class GSMCallHistoryTest {

    public static void main(String[] args) {
        //Tạo danh sách Call
        List<Call> call = new ArrayList<>();
        Call call1 = new Call(new Date(), 10, "0912345678", 120);
        Call call2 = new Call(new Date(), 11, "0987654321", 150);
        Call call3 = new Call(new Date(), 14, "0123456789", 250);
        call.add(call1);
        call.add(call2);
        call.add(call3);

        //Tạo đối tượng GSM
        GSM gsm = new GSM("bcd", "HTP", 13.5f, "Me", new Battery("model_1", 3, 5, BatteryType.Li_lon), new Display(7f, 5));

        //Thêm danh sách call vào CallHistory của đối tượng GSM
        gsm.addList(call);

        //In danh sách call
        System.out.println(gsm.getList());

        //In tổng tiền cần trả mỗi phút
        System.out.println("Sum total price before remove the longest call: " + GSMService.sumTotalPrice(0.37));

        //Xóa cuộc gọi (call) có duration lớn nhất
        gsm.delete();

        //In tổng tiền cần trả mỗi phút sau khi xóa cuộc gọi (call) có duration lớn nhất
        System.out.println("Sum total price after remove the longest call: " + GSMService.sumTotalPrice(0.37));

        //Làm sạch CallHistory
        gsm.clear();

        //In danh sách call
        System.out.println(gsm.getList());
    }
}
