package com.company;

import java.util.Arrays;

public class Phone {
    int number;
    String model;
    int weight;
    public void receiveCall(String name){
        System.out.println("Звонит "+name);
        return;
    }
    public int  getNumber(){
        return number;
    }
    public Phone() {
    }
    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public void receiveCall(String name,int phone_number){
        System.out.println("Звонит "+name+" С телефона: "+phone_number);
        return;
    }
    public void sendMessage(int...number){
        System.out.println(Arrays.toString(number));

    }
}
