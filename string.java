/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
public class string {
    public static void main(String[] args) {
        String palavra = "eduarda"; 
        String resultado = ""; 
        
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            resultado += palavra.charAt(i);
        }
        
        System.out.println(resultado); 
    }
}



