package com.lm2a.lambdas;

public class UsaMiInterfaz {

    public static void main(String[] args) {


        MiInterfaz miInterfaz = (p) -> "------"+p;

        MiInterfaz miInterfaz2 = (p) -> p+"||||||||";

        System.out.println(process("Martes", miInterfaz2));
    }


    public static String process(String str, MiInterfaz miInterfaz) {
        return miInterfaz.processString(str);
    }
}
