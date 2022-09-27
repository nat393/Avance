/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner caracter = new Scanner(System.in);
      // System.out.println("ingrese la letra: ");
       // char letra = caracter.next().charAt(0);
        
        Scanner numero1 = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int n1 = numero1.nextInt();
        //Scanner numero2 = new Scanner(System.in);
       // System.out.println("ingrese el segundo numero: ");
       //int n2 = numero2.nextInt();
        //System.out.println(MayusculaOMinuscula(letra));
       // System.out.println("la suma es:" + SumaDeIntervalos(n1, n2));
        Potencias(n1);
    }
    
    public static String MayusculaOMinuscula(char letra){
       if (letra >= 'a' && letra <= 'z') return "es minuscula";
       if (letra >= 'A' && letra <= 'Z') return "es mayuscula";
       return "no es letra";
    }
    
    //Escriba un programa que pida al usuario dos números enteros,
    //y luego entregue la suma de todos los números que están entre ellos.
    //Por ejemplo, si los números son 1 y 7, debe entregar como resultado 2 + 3 + 4 + 5 + 6 = 20.
    
    public static int SumaDeIntervalos (int n, int m){
        int suma = 0;
        for (int i = n + 1 ; i < m; i++){
        suma = suma + i;
        }
        return suma;
    }
    
    //Escriba un algoritmo que genere todas las potencias de 2, 
    //desde la 0-ésima hasta la ingresada por el usuario:
    public static void Potencias (int n){
        for (int i = 0; i <= n; i++){
            double s = Math.pow(2,i);
            System.out.println(" " + s);
        }
    }
    
    
}


