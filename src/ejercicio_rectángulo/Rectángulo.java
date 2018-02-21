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
public class Rectángulo {
    
    private float base;
    private float altura;
    
    
   public Rectángulo(float base, float altura){
       this.altura=altura;
       this.base=base;
   }
   
   public double getBase(){
   return this.base;
}
   
   public void setbase(float base){
       this.base=base;
   }
   
   public double getAltura(){
       return this.altura;
   }
   
   public void setAltura(float altura){
       this.altura=altura;
   }
   
   public float calculo_area(){
       return base*altura;
   }
   
   public float calculo_perimetro(){
    return (2*base)+(2*altura);   
   }
   
}
