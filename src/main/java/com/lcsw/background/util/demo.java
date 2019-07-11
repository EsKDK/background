package com.lcsw.background.util;

public class demo {
    public static String getDateByReg(String time){
        String reg = "(\\d{4})(\\d{2})(\\d{2})(\\d{6})";
        return time.replaceAll(reg, "$1-$2-$3");
    }
}
