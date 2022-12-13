/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasetreemap;
import java.util.TreeMap;
/**
 *
 * @author MargaritaT
 */
public class ClaseTreeMap {

    public static void main(String[] args) {
        System.out.println("                           TreeMap");
        System.out.println("===============================================================");
        TreeMap<Integer, String> objeto1 = new TreeMap<>();//CReamos un TreeMap
       
        objeto1.put(3,"Rama padre");
        objeto1.put(1,"Raiz");
        objeto1.put(7,"hojas");
        objeto1.put(5,"rama hijo");
        
        //objeto1.ceilingEntry(5)
        //Muestra el elemento que solicitamos en el indice del mismo 
        System.out.println("Se encuntra vacio el mapa?"+objeto1.isEmpty());
        System.out.println("Tamanio del mapa:"+objeto1.size());
        System.out.println(objeto1.ceilingEntry(7));
        System.out.println("Los elementos que se encuentran en el campo son:");
        System.out.println(objeto1.toString());//SE muestran de forma ordenda dentro del mapa
        System.out.println("Eliminamos " +objeto1.remove(5)+" del mapa;");
       
        System.out.println("Limpiamos los campos:");
        objeto1.clear();
        System.out.println(objeto1.toString());
        System.out.println("Se encuntra vacio el mapa?"+objeto1.isEmpty());
    }
}
