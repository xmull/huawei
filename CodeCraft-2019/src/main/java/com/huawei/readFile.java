package com.huawei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile {
    //存入汽车
    public static ArrayList<Car> readCar(String path){
        String pathname = path;
        ArrayList<Car> cars=new ArrayList<>();
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                if (line.charAt(0)=='#') line=br.readLine();
                String cart[]=line.replace("(","").replace(")","").split(",");
                Car car=new Car(Integer.parseInt(cart[0].trim()),Integer.parseInt(cart[1].trim()),Integer.parseInt(cart[2].trim()),Integer.parseInt(cart[3].trim()),Integer.parseInt(cart[4].trim()));
                cars.add(car);
            }



        } catch (IOException e) {
            e.printStackTrace();

        }
        return cars;
    }
    //存入道路信息
    public static ArrayList<Road> readRoad(String path){
        String pathname = path;
        ArrayList<Road> roads=new ArrayList<>();
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                if (line.charAt(0)=='#') line=br.readLine();
                String roadt[]=line.replace("(","").replace(")","").split(",");
                Road road=new Road(Integer.parseInt(roadt[0].trim()),Integer.parseInt(roadt[1].trim()),Integer.parseInt(roadt[2].trim()),Integer.parseInt(roadt[3].trim()),Integer.parseInt(roadt[4].trim()),Integer.parseInt(roadt[5].trim()),Integer.parseInt(roadt[6].trim()));
                roads.add(road);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return roads;
    }
    //存入路口信息
    public static ArrayList<Cross> readCross(String path){
        String pathname = path;
        ArrayList<Cross> crosses=new ArrayList<>();
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                if (line.charAt(0)=='#') line=br.readLine();
                String roadt[]=line.replace("(","").replace(")","").split(",");
                List<Integer> roadids=new ArrayList<>();
                roadids.add(Integer.parseInt(roadt[1].trim()));
                roadids.add(Integer.parseInt(roadt[2].trim()));
                roadids.add(Integer.parseInt(roadt[3].trim()));
                roadids.add(Integer.parseInt(roadt[4].trim()));
                Cross cross=new Cross(Integer.parseInt(roadt[0].trim()),roadids);
                crosses.add(cross);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return crosses;
    }

}
