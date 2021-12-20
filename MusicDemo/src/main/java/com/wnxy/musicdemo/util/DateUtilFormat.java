package com.wnxy.musicdemo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期跑龙套
 *
 * @author AndyZhou
 * @date 2021-11-22 14:33:20
 */
public class DateUtilFormat {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 格式化日期(年月日)
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        if (date == null) {
            return "";
        }
        return sdf.format(date);
    }

    /**
     * 格式化日期（年月日 时分秒）
     *
     * @param date
     * @return
     */
    public static String formatDateTime(Date date) {
        if (date == null) {
            return "";
        }
        return sdf2.format(date);
    }

    /**
     * 将字符串类型转Date类型
     *
     * @param str
     * @return
     */
    public static Date parseDate(String str) {
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
