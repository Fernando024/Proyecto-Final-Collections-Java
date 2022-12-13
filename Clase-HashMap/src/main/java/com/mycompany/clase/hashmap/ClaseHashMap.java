/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase.hashmap;
import java.util.HashMap;
/**
 *
 * @author MargaritaT
 */
public class ClaseHashMap {

    public static void main(String[] args) {
        System.out.println("                HashMap");
        System.out.println("======================================");
        
        HashMap<String, Integer> objeto1 = new HashMap<>();//Creamos un hashmap 
        
        objeto1.put("Fernando",24);//Ingresmos datos
        objeto1.put("Melisa",28);
        objeto1.put("Francisco",12);
        objeto1.put("Maria",3);
        objeto1.put("Ana",7);
        
        
        
         boolean existe = objeto1.containsKey("Ana");//existe Ana en el mapa
        System.out.println("En los objetos se encuntra Ana?-> " + existe);
        
        System.out.println("El tamanio del mapa es: " + objeto1.size());
        
        existe = objeto1.containsKey("Jesus");//existe Jesus en el mapa
        System.out.println("En los objetos se encuntra Jesus?->" + existe);
        System.out.println("Los elementos del mapa son:");
        System.out.println(objeto1.toString());
        System.out.println("Eliminaccion de un dato");
        objeto1.remove("Francisco");//Eliminadmos a francisco 
        System.out.println("Los nuevos elementos son:");
        System.out.println(objeto1.toString());
        
    }
}
