package com.huawei;

public class Road {
    private int id;
    private int length;
    private int speed;
    private int channel;
    private int from;
    private int to;
    private int isduplex;
    Car[] cars;
    public Road(int id,int length,int speed,int channel,int from,int to,int isduplex){
        this.id=id;
        this.length=length;
        this.speed=speed;
        this.channel=channel;
        this.from=from;
        this.to=to;
        this.isduplex=isduplex;
    }
    public Road(){
    }

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getChannel() {
        return channel;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getIsduplex() {
        return isduplex;
    }
}
