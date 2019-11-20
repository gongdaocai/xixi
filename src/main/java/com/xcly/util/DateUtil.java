package com.xcly.util;

import com.sun.org.apache.bcel.internal.generic.FNEG;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private final static String YEAR_MONTH_DAY_HOUR_MINUTE_SECONDS = "yyyy-MM-dd HH:mm:ss";

    public static String format1(Date date, String reg) {
        SimpleDateFormat format = new SimpleDateFormat(reg == null ? YEAR_MONTH_DAY_HOUR_MINUTE_SECONDS : reg);

        return format.format(date);
    }
}
