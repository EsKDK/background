package com.lcsw.background;

public class test {
    public static void main(String[] args) {
        String em="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String ph="^[0-9]*$";
        String username="12312a313123";
        System.out.println(username.matches(ph));
    }
}
