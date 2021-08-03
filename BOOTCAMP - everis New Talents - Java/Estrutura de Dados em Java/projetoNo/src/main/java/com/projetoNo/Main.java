package com.projetoNo;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteudo no 1");
        No<String> no2 = new No<>("Conteudo Nó 2");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo nó 3");

        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo nó 4");

        no3.setProximoNo(no4);

        // No1 -> No2 -> No3 -> No4 -> Null;

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("-----------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
