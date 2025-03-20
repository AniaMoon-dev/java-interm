package com.lm2a.enums;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jose", 3, TipoEmpleado.INGENIERO);
        Empleado e2 = new Empleado("Juan", 5, TipoEmpleado.OBRERO);
        Empleado e3 = new Empleado("Javier", 6, TipoEmpleado.ADMINISTRATIVO);
        Empleado e4 = new Empleado("Jorge", 7, TipoEmpleado.EJECUTIVO);

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        for (Empleado e : empleados){
            switch(e.getTipoEmpleado()){
                case INGENIERO:
                    System.out.println(e.getNombre()+" es ingeniero"); break;
                    case OBRERO:
                        System.out.println(e.getNombre()+" es obrero"); break;
                        case ADMINISTRATIVO:
                            System.out.println(e.getNombre()+" es administrativo"); break;
                            case EJECUTIVO:
                                System.out.println(e.getNombre()+" es ejecutivo"); break;
                                default:
                                    System.out.println("Tipo desconocido"); break;
            }
        }
    }
}
