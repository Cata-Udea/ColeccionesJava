/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.list;

import com.chernandez.set.*;
import com.chernandez.modelo.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author catax
 */
public class EjemploListComparableComparator 
{
    public static void main(String[] args) {
        //Set<Alumno> alumnos = new HashSet<>();
        List<Alumno> alumnos = new LinkedList<>();
        alumnos.add(new Alumno("Pedro", 4));
        alumnos.add(new Alumno("Cata", 5));
        alumnos.add(new Alumno("Clara", 7));
        alumnos.add(new Alumno("Pedro", 4));
        alumnos.add(new Alumno("Juan", 3));
        
        
        //Collections.sort(alumnos,(a,b)->a.compareTo(b));
        alumnos.sort(comparing(Alumno::getNombre).reversed());
        
        System.out.println("Estudiantes "+alumnos);
        System.out.println("Iteracion con el for each");
        for (Alumno alumno : alumnos) 
        {
            System.out.println(alumno.getNombre());
        }
        alumnos.forEach(System.out::println);
        /*
        System.out.println("Iteracion con el toString");
        System.out.println(alumnos);
        System.out.println();
        System.out.println("Iterando con el for clasico");
        for(int i =0;i<alumnos.size();i++){
            Alumno a = alumnos.get(i);
            System.out.println(a.getNombre());
        }
        System.out.println();
        System.out.println("Iterando usando el for each");
        for(Alumno a: alumnos){
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Iterando usando el while y el iterator");
        Iterator<Alumno> it = alumnos.iterator();
        
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre()+" "+a.getNota());
        }
        System.out.println();
        System.out.println("Iterando usando stream con for each");
        alumnos.forEach(System.out::println );
*/

    }
}
