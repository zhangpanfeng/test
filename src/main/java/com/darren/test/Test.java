package com.darren.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class Test {

    public static void main(String[] args) {
//        // 当前系统默认时区的时间：
//        Calendar calendar = new GregorianCalendar();
//        System.out.print("时区：" + calendar.getTimeZone().getID() + "  ");
//        System.out.println("时间：" + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
//        // 美国洛杉矶时区
//        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
//        
//        TimeZone phtz = TimeZone.getTimeZone("America/Phoenix");
//        
//
//        // 时区转换
//        calendar.setTimeZone(tz);
//        calendar.setTimeZone(phtz);
//        System.out.print("时区：" + calendar.getTimeZone().getID() + "  ");
//        System.out.println("时间：" + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
//        Date time = new Date();
//
//        // 1、取得本地时间：
//        java.util.Calendar cal = java.util.Calendar.getInstance();
//
//        // 2、取得时间偏移量：
//        int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
//
//        // 3、取得夏令时差：
//        int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
//        
//        System.out.println("zoneOffset = " + zoneOffset);
//        System.out.println("dstOffset = " + dstOffset);
//        
//        
//        System.out.println("zoneOffset = " + calendar.get(java.util.Calendar.ZONE_OFFSET));
//        System.out.println("dstOffset = " + calendar.get(java.util.Calendar.DST_OFFSET));
        System.out.println(Double.parseDouble("11111111111.0"));
        System.out.println((long)Double.parseDouble("11111111111.0"));
        
        String test = "111|222";
        String x = test.substring(test.indexOf("|") + 1);
        System.out.println(x);
        
        long a = 333333l;
        long b = 1999999l;
        double c = (double)a/b * 100;
        
        System.out.println(c);
        String result = String.format("%.2f", c);
        System.out.println(result);
        
        System.out.println("=======================");

        System.out.println(23&2);
        System.out.println(29&2);
        System.out.println(14&2);
        System.out.println(15&2);
        System.out.println(21&2);
        System.out.println(6&2);
        System.out.println(7&2);
        System.out.println("=======================");
        System.out.println(23&1);
        System.out.println(29&1);
        System.out.println(14&1);
        System.out.println(15&1);
        System.out.println(21&1);
        System.out.println(6&1);
        System.out.println(7&1);
        
        System.out.println("==========TV=============");
        System.out.println(16&32);
        System.out.println(24&32);
        System.out.println(17&32);
        System.out.println(16&32);
        System.out.println(16&32);
        System.out.println(68&32);
        System.out.println(34&32);
        System.out.println(24&32);
        System.out.println("==========ONLINE=============");
        System.out.println(16&16);
        System.out.println(24&16);
        System.out.println(17&16);
        System.out.println(16&16);
        System.out.println(16&16);
        System.out.println(68&16);
        System.out.println(34&16);
        System.out.println(24&16);
        System.out.println("==========XCR=============");
        System.out.println(16&64);
        System.out.println(24&64);
        System.out.println(17&64);
        System.out.println(16&64);
        System.out.println(16&64);
        System.out.println(68&64);
        System.out.println(34&64);
        System.out.println(24&64);
    }

}




