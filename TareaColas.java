/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uabc.labs.tareacolas;
import java.util.Random;

/**
 *
 * @author us
 */
public class TareaColas {
    cola<cliente> pedidos;
    cola<cliente> pedidosTemp;
    public static void main(String[] args) {
       TareaColas t1 = new TareaColas();
    }

    public TareaColas() {
        Random rd = new Random();
        this.pedidos= new cola<>();
        String[] nombres = {"Steve","Bill","RBR Inc.","AlphaTauri S.p.A","Williams Ltd."};
        
        for(int k=0;k<nombres.length;k++){
            cliente c1=new cliente(nombres[rd.nextInt(nombres.length)],rd.nextInt(99));
            System.out.println(k+": "+c1);
            pedidos.add(c1);
        }
        System.out.println(" ");
        viewPedidos();
    }
    public void viewPedidos(){
        cliente c1;
        this.pedidosTemp= new cola<>();
            for(int k=0;k<5;k++){
                c1 = pedidos.remove();
               System.out.println(c1);
               
            }
        }
}
