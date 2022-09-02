/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.set;

import java.util.Set;
import java.util.Comparator;
import java.util.TreeSet;
//import java.util.
/**
 *
 * @author catax
 */
public class EjemploTreeSet 
{
    public static void main(String[] args) {
        Set<String> lista = new TreeSet<>((a,b)->b.compareTo(a));

        lista.add("uno"); 
        lista.add("dos"); 
        lista.add("tres"); 
        
        System.out.println(lista);
        
        Set<Integer> numeros = new TreeSet<>((a,b)->b.compareTo(a));
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        System.out.println(numeros);
    }
}
