/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.set;

import com.chernandez.modelo.Alumno;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author catax
 */
public class EjemploTreeSetComparable 
{
    public static void main(String[] args) {
        //Set<Alumno> alumnos = new TreeSet<>((a,b)->b.compareTo(a));
        Set<Alumno> alumnos = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());
        alumnos.add(new Alumno("Pedro", 4));
        alumnos.add(new Alumno("Pedro", 4));
        alumnos.add(new Alumno("Pedro", 5));
        alumnos.add(new Alumno("Cata", 5));
        alumnos.add(new Alumno("Clara", 7));
        alumnos.add(new Alumno("Pedro", 4));
        alumnos.add(new Alumno("Juan", 3));
        
        System.out.println("Estudiantes "+alumnos);
        System.out.println("Iteracion con el for each");
        for (Alumno alumno : alumnos) 
        {
            System.out.println(alumno.getNombre());
        }
    }
}
