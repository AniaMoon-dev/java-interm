package com.lm2a.opcionales.sin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Nota> notas = new ArrayList<>();

        notas.add(new Nota("Matematicas", 4));
        notas.add(new Nota("Fisica", 5));
        notas.add(new Nota("Literatura", 8));
        notas.add(new Nota("Musica", 7));

        Optional<Nota> oN = buscarSobresaliente(notas);
        if (oN.isPresent()) {
            Nota sobresaliente = oN.get();
            System.out.println("Asignatura en la que sobresale el alumno: "+sobresaliente.getAsignatura());
        }else{
            System.out.println("Asignatura no encontrada");
        }

    }


    public static Optional<Nota> buscarSobresaliente(List<Nota> notas){
        for(Nota n : notas){
            if(n.getValor() >= 9){
                return Optional.of(n);
            }
        }
        return Optional.empty();
    }

}
