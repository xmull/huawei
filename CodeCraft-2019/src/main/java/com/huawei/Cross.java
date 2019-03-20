package com.huawei;

import java.util.List;

public class Cross {
    private int id;
    private List<Integer> roadids;
    public Cross(int id,List<Integer> roadids){
        this.id=id;
        this.roadids=roadids;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getRoadids() {
        return roadids;
    }
}
