package com.driver;

public class Main {
    public static void main(String[] args){

        RWOnly obj = new RWOnly();
        //obj.name = "Tushar";
        //java: name has private access in com.driver.RWOnly
        obj.setName("Tushar");
        System.out.println(obj.getName());
    }
  
}