

package com.mycompany.claselinkedhashmap;
import java.util.LinkedHashMap;

public class ClaseLinkedHashMap {

    public static void main(String[] args) {
        System.out.println("                    LinkedHashMap");
        System.out.println("=================================================");
        
           LinkedHashMap<Integer, String> objeto1 = new LinkedHashMap<>();
           
        //Se acomodan los datos confrome se van metiendo esa es la difrencia con los anteriores map
        objeto1.put(24,"Fernando");//Ingresmos datos
        objeto1.put(28,"Melisa");
        objeto1.put(12,"Francisco");
        objeto1.put(3,"Maria");
        objeto1.put(7,"Ana");
        
        System.out.println("Se encuntra vacio el mapa?"+objeto1.isEmpty());
        System.out.println("Tamanio del mapa:"+objeto1.size());
        System.out.println("Los elementos que se ecuentran son:");
        System.out.println(objeto1.toString()); //los muestra con forme los metemos 
        
        System.out.println("Limpiamos los campos:");
        objeto1.clear();
        System.out.println(objeto1.toString());
        System.out.println("Se encuntra vacio el mapa?"+objeto1.isEmpty());
    }
}
