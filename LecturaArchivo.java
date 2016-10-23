package hdt8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * @author Juan Pablo Cahueque 15396
 * @author Enma Lopez 15122
 */
public class LecturaArchivo {
    public static Vector mostrarContenido(String archivo) {
        Vector parrafo = new Vector(20,5);
        try{
        String linea;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((linea = b.readLine())!=null) {
            parrafo.addElement(linea);
        }
        b.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return parrafo;
    }

}
