/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, x=0, y=1, z=1;
        System.out.println("Informe um número: ");
        num = sc.nextInt();
        System.out.println("Sequência Fibonacci");
        while (num > z)
        {
            
            System.out.println( z);
            z = x + y;
            x = y;
            y = z;
        }
        if (num == 0 || num == 1){
            System.out.println("Faz parte da sequência do fibonacci");
        }
        else if (num ==  z)
        {
            System.out.println("Faz parte da sequência do fibonacci");
        }
        else{
            System.out.println("Não pertence a sequência do fibonacci");
        }
        
    }
    
    
}
