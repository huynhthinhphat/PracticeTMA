package org.example;

import java.util.Date;

public class Call {
    private Date date;
    private int time;
    private String numberPhone;
    private int duration;

    public Call(Date date, int time, String numberPhone, int duration) {
        this.date = date;
        this.time = time;
        this.numberPhone = numberPhone;
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString(){
        return "Date: " + date + " - Time: " + time + " - NumberPhone: " + numberPhone + " - Duration: " + duration;
    }
}
