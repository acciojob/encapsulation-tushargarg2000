package com.driver;

public class Main {
    public static void main(String[] args){

        RWOnly obj  = new RWOnly();

        //'name' has private access in 'com.driver.RWOnly'
        //obj.name = "Tushar";

        obj.setName("Rauch");

        System.out.println(obj.getName());
    }
  
}