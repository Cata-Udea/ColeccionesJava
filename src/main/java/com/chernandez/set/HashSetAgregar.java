/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author catax
 */

//Set: no duplica valor ni tampoco lo ordena

public class HashSetAgregar {
    public static void main(String[] args) {
        //Set<String> cadena = new HashSet<>();
        List<String> cadena = new ArrayList<>();
        System.out.println(cadena.add("uno"));
        System.out.println(cadena.add("uno"));
        System.out.println(cadena.add("dos"));
        System.out.println(cadena.add("tres"));
        System.out.println(cadena.add("cuatro"));
        System.out.println(cadena.add("cinco"));
        boolean duplicado = cadena.add("cinco");
        System.out.println("Permite elementos duplicados "+duplicado);
        System.out.println(cadena);
    }
}
