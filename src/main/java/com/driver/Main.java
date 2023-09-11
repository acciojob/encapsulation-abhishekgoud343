package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        obj.name = "New_name"; //error: 'name' has private access in 'com.driver.RWOnly'
//        System.out.println(obj.name); //error: 'name' has private access in 'com.driver.RWOnly'

        obj.setName("New_name");
        System.out.println(obj.getName());
    }
}