/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.tareacolas;

/**
 *
 * @author Hector Duran
 */
public class cola <T>{
    private T[] cola;
    private int tope;
    private T dato;
    private int inicio;
    private int fin;

    public cola() {
        this.cola = (T[])new Object[99];
        this.tope = -1;
        this.inicio = -1;
        this.fin = -1;
    }
  
    public void add(T dato) {
        if (fin == cola.length - 1) {
            System.out.println("Error: la cola está llena");
        } else {
            cola[++fin] = dato;
            if (inicio == -1) {
                inicio = 0;
            }
        }
    }

    public T remove() {
        if (inicio == -1) {
            System.out.println("Error: la cola está vacía");
            return null;
        } else {
            T dato = cola[inicio];
            if (inicio == fin) {
                inicio = -1;
                fin = -1;
            } else {
                inicio++;
            }
            return dato;
        }
    }

    public T view() {
        if (inicio == -1) {
            System.out.println("Error: la cola está vacía");
            return null;
        } else {
            return cola[inicio];
        }
    }
}