/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.list;

import com.chernandez.modelo.Alumno;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author catax
 */
public class EjemploLinkedList 
{
    public static void main(String[] args) {
        LinkedList<Alumno> alum = new LinkedList<>();
        System.out.println(alum+"size= "+alum.size());
        System.out.println("Esta vacia: "+alum.isEmpty());
        alum.add(new Alumno("Chad",5));
        alum.add(new Alumno("Benny",5));
        alum.add(new Alumno("Cata",5));
        alum.add(new Alumno("Juan",5));
        alum.add(new Alumno("Maria",5));
        System.out.println(alum+"size= "+alum.size());
        System.out.println("Esta vacia: "+alum.isEmpty());
        alum.addFirst(new Alumno("Katy",10));
        alum.addLast(new Alumno("Alex",10));
        System.out.println("El primero "+alum.getFirst());//El getfirst si maneja excepciones //peekFirst no maneja excepciones
        System.out.println("El ultimo "+alum.getLast());
        System.out.println("El segundo "+alum.get(1));
        alum.removeFirst(); //Otra forma es el pollfirst pero retrna null, el otro no
        Alumno eliminado = alum.pollLast();
        alum.pop(); //elimina el primero
        System.out.println(alum+"size= "+alum.size());
        System.out.println("eliminado: "+eliminado);
        alum.remove(new Alumno("Maria",5));
        System.out.println(alum);
        Alumno b = new Alumno("Diego",1);
        alum.add(b);
        System.out.println(alum);
        System.out.println(alum+"size= "+alum.size());
        System.out.println("Indice de Diego: "+alum.indexOf(b));
        alum.remove(2);
        System.out.println(alum);
        System.out.println(alum+"size= "+alum.size());
        System.out.println("Indice de Diego: "+alum.indexOf(b));
        
        alum.set(1,new Alumno("Carlos",10));
        System.out.println(alum);
        System.out.println(alum+"size= "+alum.size());
        
        ListIterator<Alumno> cIt=alum.listIterator();
        System.out.println("\nNext");
        while (cIt.hasNext()) {
            Alumno c = cIt.next();
            System.out.println(c);
        }
        System.out.println("\nPrevious");
        while (cIt.hasPrevious()) {
            Alumno c = cIt.previous();
            System.out.println(c);
        }
    }
    
}
