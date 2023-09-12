/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.tareacolas;

/**
 *
 * @author us
 */
public class cliente {
    private String nombre;
    private int cantidadPedido;

    public cliente(String nombre, int cantidadPedido) {
        this.nombre = nombre;
        this.cantidadPedido = cantidadPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", cantidadPedido=" + cantidadPedido + '}';
    }
    
    
    
    
}
