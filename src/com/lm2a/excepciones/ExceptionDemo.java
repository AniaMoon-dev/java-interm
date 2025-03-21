package com.lm2a.excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

//    public void readFile(String name) throws FileNotFoundException {
//            File f = new File(name);
//            FileInputStream fis = new FileInputStream(f);
//            //....
//    }

    public void readFile(String name)  {
        try {
            File f = new File(name);
            FileInputStream fis = new FileInputStream(f);
            //....
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }



}
