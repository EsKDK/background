package com.lcsw.background.util;

import java.util.UUID;

public class UuidUtil {
    public static String uuid() {

        return UUID.randomUUID().toString().replace("-", "").substring(16);
    }

    public static void main(String[] args) {
        String uuid = uuid();
        System.out.println("uuid = " + uuid);
    }

}




