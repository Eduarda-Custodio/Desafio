/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
public class FaturamentoMensal {
    public static void main(String[] args) {
        
        double faturamentoTotal = 181759.98;
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;
        
        
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;
        
        
        System.out.println("Percentual SP: \n" + percentualSP);
        System.out.println("Percentual RJ: \n"+ percentualRJ);
        System.out.println("Percentual MG: \n"+ percentualMG);
        System.out.println("Percentual ES: \n"+ percentualES);
        System.out.println("Percentual de outros estados: \n"+ percentualOutros);
    }
}

