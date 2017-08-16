/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170814;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Hola mundo...!");
        
        
        //OPERACIONES DE BITS
        System.out.println("");
        System.out.println("<<<< OPERACIONES DE BITS >>>>");
        // &  = AND
        // |  = OR
        // ^  = XOR
        int a = 33;
        int b;
        
        System.out.println(a);
        b = a << 2; // Desplaza 2 bit (binario) hacia la izquierda
        System.out.println(b);
        
        b = a >> 2; // Desplaza 2 bit (binario) hacia la derecha
        System.out.println(b);
        
        b = a & 2; // Desplaza 2 bit (binario) hacia la izquierda
        System.out.println(b);
        
        
        //CICLOS FOR
        System.out.println("");
        System.out.println("<<<< CICLO FOR >>>>");
        
        int i;        
        for(i=0; i<5;i++) {
            if(i == 3)
                continue;
            System.out.println(i);
        }
        System.out.println(i);
        
        System.out.println("");
        System.out.println("<<<< CICLO WHILE >>>>");
        
        i = 2;
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
        
        System.out.println("");
        System.out.println("<<<< CICLO DO WHILE >>>>");
        
        i = 3;
        do {
            System.out.println(i);
            i += 3;
        } while (i<15);
        
        switch (i) {
            
        }*/
        
        System.out.println("<<<< PROGRAMA QUE LEE UN NUMERO ENTERO Y DETERMINA SI SUS DIGITOS ESTAN EN ORDEN ASCENDENTE O NO >>>>");
        System.out.println("");
        
        Scanner vscan = new Scanner(System.in); 
        
        int digi;
        System.out.println("Introduzca el tamaño en digitos para el numero: ");
        digi = vscan.nextInt();
        
        int n;
        
        int lon, ban = 0;
        String cad_valor;
        do {
            System.out.println("Introduzca un número entero de "+digi+" cifras: ");
            n = vscan.nextInt();
            
            lon = Integer.toString(n).length();
            if(lon == digi)
                ban = 1;
            else 
                System.out.println("Numero Incorrecto...!");
                        
        } while (ban == 0);
        
        
        
        int max = 100;
        int tipo = 0;
        int res;
        int temp;
        temp = n;
        do {
            res = n % 10;
            n = n / 10;
            //System.out.println(n);
            if(res < max) {
                tipo = 1;
                max = res;
            } else {
                tipo = 2;
                n=0;
            }
        } while (n>0);
        
        String cadena;
        if(tipo == 1)
            cadena = "Esta Ordenado Ascendentemente";
        else
            cadena = "NO esta Ordenado Ascendentemente";
        
        System.out.println("El numero '"+temp+"' "+cadena);
    }
    
}
