package org.example;

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

    public void addList(List<Call> listCall){
        if(CallHistory == null){
            CallHistory = new ArrayList<>(listCall);
        }
    }

    public List<Call> getList(){
        return CallHistory;
    }

    public void delete(Call callDelete){
        CallHistory.removeIf(call -> call.equals(callDelete));
    }

    public void clearList(){
        CallHistory.clear();
    }

    //tổng tiền cần trả mỗi phút
    public double sumTotalPrice(double price){
        int totalDuration = 0;
        for(Call call : CallHistory){
            totalDuration += call.getDuration()/60;
        }

        return (double) totalDuration * price;
    }
}
