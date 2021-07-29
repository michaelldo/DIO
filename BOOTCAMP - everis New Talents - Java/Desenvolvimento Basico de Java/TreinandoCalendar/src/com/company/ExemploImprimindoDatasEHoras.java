package com.company;

import java.util.Calendar;

public class ExemploImprimindoDatasEHoras {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();


        //Formas de saida do Calendar
        System.out.printf("%tc\n", agora); //qua jul 28 16:07:01 BRT 2021
        System.out.printf("%tF\n", agora); //2021-07-28
        System.out.printf("%tD\n", agora); //07/28/21
        System.out.printf("%tr\n", agora); //04:07:01 PM
        System.out.printf("%tT\n", agora); //16:07:01
    }
}
