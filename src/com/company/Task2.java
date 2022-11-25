package com.company;

public class Task2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3  =new Phone();
        phone1.model ="Ксяоми";
        phone1.number =1;
        phone1.weight=252;
        phone2.model ="Айфон";
        phone2.number =2;
        phone2.weight=202;
        phone3.model ="Хонор";
        phone3.number =3;
        phone3.weight=231;
        System.out.println(phone1.model+" "+phone1.number+" "+ phone1.weight);
        System.out.println(phone2.model+" "+phone2.number+" "+ phone2.weight);
        System.out.println(phone3.model+" "+phone3.number+" "+ phone3.weight);
        phone1.receiveCall("Алек");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Макс");
        System.out.println(phone1.getNumber());
        phone3.receiveCall("Антоша");
        System.out.println(phone1.getNumber());
        phone3.receiveCall("Гоша",2332443);
        phone2.sendMessage(123,34,654643,254,35);

    }
    }