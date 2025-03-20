package com.lm2a.enums.despues;

import static com.lm2a.enums.despues.Mes.*;


public class FestividadesPorMes {

    public void festividades(Mes mes) {

        switch (mes) {

            case ENERO:
                System.out.println("New Year's Day is January 1st!");
                break;
            case FEBRERO:
                System.out.println("Valentine's Day is February 14th!");
                break;
            case MARZO:
                System.out.println("Saint Patrick's Day is March 17th!");
                break;
            case ABRIL:
                System.out.println("New Year's Day is April 1st!");
                break;
            case MAYO:
                System.out.println("Worker's Day is MAY 1st!");
                break;
            case JUNIO:
                System.out.println("Hot's Day is JUNE 17th!");
                break;
            case JULIO:
                System.out.println("Very Hot's Day is JULY 1st!");
                break;
            case AGOSTO:
                System.out.println("Nothing's Day is August 14th!");
                break;
            case SEPTIEMBRE:
                System.out.println("Spring's Day is September 21th!");
                break;
            case OCTUBRE:
                System.out.println("Race's Day is October 12th!");
                break;
            case NOVIEMBRE:
                System.out.println("Fiambre's Day is November 1th!");
                break;
            case DICIEMBRE:
                System.out.println("Christmas Day is March 24th!");
                break;
        }
    }
}
