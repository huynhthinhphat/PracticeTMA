package org.example.service;

import org.example.model.Call;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GSMService {
    private static List<Call> CallHistory;

    //Tạo danh sách mới
    public static void addList(List<Call> listCall){
        if(CallHistory == null){
            CallHistory = new ArrayList<>(listCall);
        }
    }

    //Lấy danh sách CallHistory
    public static List<Call> getList(){
        return CallHistory;
    }

    //Tìm cuộc gọi có duration lớn nhất
    private static Optional<Call> findCallByMaxDuration(){
        return CallHistory.stream().max(Comparator.comparingInt(Call::getDuration));
    }

    //Xóa một đối tượng call trong danh sách CallHistory
    public static void delete(){
        Optional<Call> callDelete = findCallByMaxDuration();
        CallHistory.removeIf(call -> call.equals(callDelete.get()));
    }

    //Làm sạch danh sách CallHistory
    public static void clear(){
        CallHistory.clear();
    }

    //Tính tổng tiền cần trả sau mỗi phút gọi
    public static double sumTotalPrice(double price){
        int totalDuration = 0;
        for(Call call : CallHistory){
            totalDuration += call.getDuration()/60;
        }

        return (double) totalDuration * price;
    }
}
