/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_rectángulo;

/**
 *
 * @author Estudiante
 */

import java.util.Scanner;

public class Prueba_Rectángulo {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese base");
        float base= lectura.nextFloat();
        System.out.println("Ingrese altura");
        float altura=lectura.nextFloat();
        Rectángulo r1= new Rectángulo(base, altura);
        float area=r1.calculo_area();
        float perimetro=r1.calculo_perimetro();
        
        
        System.out.println("El area es "+ area+ " cm");
        System.out.println("El perimetro es "+perimetro+ " cm4");
    }
       

    
   
}

