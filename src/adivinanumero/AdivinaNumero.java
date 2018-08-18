/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

import java.util.*;

/**
 *
 * @author Amarico
 */
public class AdivinaNumero {
    
    private String nombre;
    
    private int numeroIntroducido;
    
    private double numero =(int)((Math.random())*100);
    
    int contador = 0;
    
    Scanner entrada = new Scanner(System.in);
    
   public void ejecutaPrograma(){
       
       introduceNombre();
       
       introduceNumero();
       
       imprimeResultados();
        
        
    }
   public void introduceNombre(){
       
       System.out.println("Dime tu nombre: ");
       
       nombre = entrada.nextLine();
   }
   
   public void introduceNumero(){
       
      
   }
   
   public void imprimeResultados() {
       
       do  {
           
            System.out.println("Dame un número: ");
           
           numeroIntroducido = entrada.nextInt();
           
           
           if (numero > numeroIntroducido){
               
               System.out.println("El numero es mayor");
               
               contador++;
           }else if (numero < numeroIntroducido){
               
               System.out.println("El número es menor");
               
               contador++;
           }else
               
               System.out.println("Muy bien"+ nombre+" has acertado el número en "+ contador + " intentos");
       }while (numero!= numeroIntroducido);
   }
    
    
    
}
