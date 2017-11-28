/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice;

/**
 *
 * @author cice
 */
public class Main {
    
    public static void main(String... args){
    
        //operadores de comparación
        boolean esMayor = 2>4; //false
        boolean esMenor = 4<6; //true
        boolean esIgual = 4 == 5; //false
        boolean esDistinto = 4!=5;  // true
        
        //operadores de asignación
        int numero = 2;
        //numero++; // numero++ = numero + 1; numero += 1;
        System.out.println(numero++);//2
        System.out.println(--numero);//2
        //++numero;
        System.out.println(++numero);//3
        System.out.println(numero--);//3
        System.out.println(numero);//2
        
        //***************************
        
        numero *=4;//8
        System.out.println("8... "+numero);
        numero /=2;//4
        System.out.println("4... "+numero);
        numero %=3;//1
        System.out.println("1... "+numero);
        //numero <<=1; //operaciones de bites :s
        
        
    }
}
