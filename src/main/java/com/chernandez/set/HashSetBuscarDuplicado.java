/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author catax
 */
public class HashSetBuscarDuplicado 
{
    public static void main(String[] args) {
        String[] carro = {"Toyota","Nissan","Renault","Kia","Spark","Renault","Kia"};
        
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        
        for(String car:carro)
        {
            if(!unicos.add(car))
            {
                duplicados.add(car);
                //System.out.println("Duplicado: "+car);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println(unicos.size()+" marcas de tipo unico: "+unicos);
        System.out.println("Marcas que se repiten: "+duplicados);
    }
}
