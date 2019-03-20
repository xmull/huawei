package com.huawei;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Main {
   // private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args)
    {
//        if (args.length != 4) {
//            logger.error("please input args: inputFilePath, resultFilePath");
//            return;
//        }

//        logger.info("Start...");
//
//        String carPath = args[0];
//        String roadPath = args[1];
//        String crossPath = args[2];
//        String answerPath = args[3];
//        logger.info("carPath = " + carPath + " roadPath = " + roadPath + " crossPath = " + crossPath + " and answerPath = " + answerPath);
        String carPath="CodeCraft-2019/config/car.txt";
        String crossPath="CodeCraft-2019/config/cross.txt";
        String roadPath="CodeCraft-2019/config/road.txt";
//        ArrayList<Car> cars =readFile.readCar(carPath);
//        for(Iterator<Car> iterator=cars.iterator();iterator.hasNext();){
//            System.out.println( iterator.next().getId());
//        }
        ArrayList<Cross> crosses=readFile.readCross(crossPath);
        for(Iterator<Cross> iterator=crosses.iterator();iterator.hasNext();){
            ArrayList<Integer> rodids=(ArrayList<Integer>) iterator.next().getRoadids();
            System.out.println(rodids.toString());
        }



//        // TODO:read input files
//        logger.info("start read input files");
//
//        // TODO: calc
//
//        // TODO: write answer.txt
//        logger.info("Start write output file");
//
//        logger.info("End...");
    }
}