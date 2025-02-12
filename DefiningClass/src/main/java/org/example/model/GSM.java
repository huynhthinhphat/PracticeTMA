package org.example.model;

import org.example.service.GSMService;

import java.util.ArrayList;
import java.util.List;

public class GSM {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Battery battery;
    private Display display;
    private List<Call> CallHistory;

    public GSM(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = 0.0f;
        this.owner = null;
        this.battery = null;
        this.display = null;
    }

    public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Model: " + model + " - Manufacturer: " + manufacturer + " - Price: " + price + " - Owner: " + owner + " - Battery: " + battery + " - Display: " + display;
    }

    //Tạo danh sách CallHistory
    public void addList(List<Call> listCall){
        GSMService.addList(listCall);
    }

    //Lấy danh sách CallHistory
    public List<Call> getList(){
        return GSMService.getList();
    }

    //Xóa một đối tượng Call trong danh sách CallHistory
    public void delete(){
        GSMService.delete();
    }

    //Làm sạch danh sách CallHistory
    public void clear(){
        GSMService.clear();
    }

    //Tính tổng tiền cần trả sau mỗi phút gọi
    public double sumTotalPrice(double price){
        return GSMService.sumTotalPrice(price);
    }
}
