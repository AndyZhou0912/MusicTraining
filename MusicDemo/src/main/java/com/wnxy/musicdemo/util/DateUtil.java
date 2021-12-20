package com.wnxy.musicdemo.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期跑龙套
 * 日历类的工具类
 *
 * @author AndyZhou
 * @date 2021-11-22 14:48:48
 */
public class DateUtil {

    private static Calendar calendar = Calendar.getInstance();  //创建一个日历对象

    /**
     * 获取指定的年月日时分秒
     * @param year
     * @param month
     * @param date
     * @param hourOfDay
     * @param minute
     * @param second
     * @return
     */
    public static Date getDate(int year, int month, int  date, int hourOfDay, int minute, int second) {
        calendar.set(year, month-1, date, hourOfDay, minute, second);
        return calendar.getTime();
    }

    /**
     * 获取指定的时间 ： 年月日
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static Date getDate(int year, int month,int  date) {
        return getDate(year,month,date,0,0,0 );
    }
}