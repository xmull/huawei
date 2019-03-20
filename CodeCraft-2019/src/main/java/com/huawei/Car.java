package com.huawei;

public class Car {
    private int id;
    private int begin;
    private int end;
    private int max_speed;
    private int time;
    public int way;
    public int road;
    public Car(int id,int begin,int end,int max_speed,int time){
        this.id=id;
        this.begin=begin;
        this.end=end;
        this.max_speed=max_speed;
        this.time=time;
    }

    public int getId() {
        return id;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public int getTime() {
        return time;
    }
}
