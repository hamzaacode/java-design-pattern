package com.example.lazyinitialization;

public class Client {

    public static void main(String[] args) {

        Singletone singletone=Singletone.getInstance();

        Singletone singletone2=Singletone.getInstance();
        singletone2.setInfo("new info of class");

        System.out.println(singletone2.getInfo());
        System.out.println(singletone.getInfo());
    }
}
