package com.lm2a.genericos.con;



public class Main {

    public static void main(String[] args) {

       Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(5);

        Chocolatina c1 = new Chocolatina("Canterbury");

        Chocolatina c2 = new Chocolatina("Aero");

        Chocolatina c3 = new Chocolatina("Milka");

        bolsa.add(c1);
        bolsa.add(c2);
        bolsa.add(c3);

        for (Chocolatina chocolatina : bolsa) {
            System.out.println(chocolatina.getMarca());
        }
    }
}
