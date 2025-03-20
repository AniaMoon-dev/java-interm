package com.lm2a.reflexion;

public class MiClase {

    public String unaVariableString = "Un texto cualquiera";
    private int unaBVariableInt = 5;

    public String getUnaVariableString() {
        return unaVariableString;
    }

    public int getUnaBVariableInt() {
        return unaBVariableInt;
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "unaVariableString='" + unaVariableString + '\'' +
                ", unaBVariableInt=" + unaBVariableInt +
                '}';
    }
}
