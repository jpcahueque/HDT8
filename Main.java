/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import java.util.*;

/**
 *
 * @author JuanPablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Se leen el archivo que contiene la lista de pacientes*/
        Vector listaEntrante = LecturaArchivo.mostrarContenido("C:\\Users\\JuanPablo\\Documents\\NetBeansProjects\\HDT8\\src\\hdt8\\Pacientes.txt");
        VectorHeap <Paciente> listaFinal = new VectorHeap();
        Iterator itr = listaEntrante.iterator();
        System.out.println("Pacientes ingresados");
        /*Por cada linea de texto se crea un objeto tipo Paciente y se ingresa al VectorHeap Final*/
        while (itr.hasNext()){
            String descripcion = (String) itr.next();
            String nombre = descripcion.substring(0, descripcion.indexOf(","));
            String diagnostico = descripcion.substring(descripcion.indexOf(",")+2,descripcion.lastIndexOf(","));
            String codigo = descripcion.substring(descripcion.lastIndexOf(",")+2);
            System.out.println(nombre+", "+diagnostico+", "+codigo);
            Paciente dummy = new Paciente(nombre, diagnostico,codigo.charAt(0));
            listaFinal.add(dummy);
        }
        /*Se remueven del vectorHeap para desplegarlos en pantalla*/
        System.out.println("\n --------------------------------- ATENCION: Lista ordenada de pacientes: -------------------------");
        while(listaFinal.isEmpty()==false){
            System.out.println(listaFinal.remove());
        }
        
    }
    
}
