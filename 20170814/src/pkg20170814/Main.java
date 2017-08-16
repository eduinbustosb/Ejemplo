/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170814;

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
        System.out.println("Hola mundo...!");
        
        
        //OPERACIONES DE BITS
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
        int i;
        for(i=0; i<5;i++) {
            System.out.println(i);
            break;
        }
        System.out.println(i);
        
    }
    
}
