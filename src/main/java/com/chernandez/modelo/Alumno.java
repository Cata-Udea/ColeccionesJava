/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chernandez.modelo;

import java.util.Objects;

/**
 *
 * @author catax
 */
public class Alumno implements Comparable<Alumno>
{
    String nombre;
    int nota;

    public Alumno() {}

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  nombre + ", nota=" + nota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.nota != other.nota) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre)&&
                Objects.equals(nota, other.nota);
    }

    @Override
    public int compareTo(Alumno o) 
    {
//        if(this.nombre == null)
//        {
//            return 0;
//        }
//        return this.nombre.compareTo(o.nombre);
        if(this.nota == o.nota)
        {
            return 0;
        }
        if(this.nota > o.nota)
        {
            return 1;
        }else
        {
            return -1;
        }
        
    }
    
    
    
    
}
