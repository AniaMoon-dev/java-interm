package com.lm2a.genericos.sin;

public class Main {

    public static void main(String[] args) {

        Bolsa bolsa = new Bolsa(5);

        Chocolatina c1 = new Chocolatina("Canterbury");

        Chocolatina c2 = new Chocolatina("Aero");

        Chocolatina c3 = new Chocolatina("Milka");

        Golosina g1 = new Golosina("Gominola");

        Golosina g2 = new Golosina("Chicle");

        Golosina g3 = new Golosina("Cookies");

        bolsa.add(c1);
        bolsa.add(c2);
        bolsa.add(c3);
        bolsa.add(g1);
        bolsa.add(g2);

        for (Object o : bolsa) {
            if (o instanceof Chocolatina) {
                Chocolatina chocolatina = (Chocolatina) o;
                System.out.println(chocolatina.getMarca());
            } else {
                Golosina golosina = (Golosina) o;
                System.out.println(golosina.getNombre());
            }
        }
    }
}
