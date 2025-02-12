package org.example.model;

public class Battery {
    private String model;
    private int hoursIdle;
    private int hoursTalk;
    private BatteryType type;

    public Battery(String model, int hoursIdle, int hoursTalk, BatteryType type) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHoursIdle() {
        return hoursIdle;
    }

    public void setHoursIdle(int hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    public int getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(int hoursTalk) {
        this.hoursTalk = hoursTalk;
    }

    public BatteryType getType() {
        return type;
    }

    public void setType(BatteryType type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Model: " + model + " - HoursIdle: " + hoursIdle + " - HoursTalk: " + hoursTalk + " - Type: " + type;
    }
}
