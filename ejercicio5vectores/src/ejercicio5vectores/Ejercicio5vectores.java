
package ejercicio5vectores;

import java.util.Scanner;
public class Ejercicio5vectores {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Ingrese cantidad de empleado");
        n=entrada.nextInt();
        
        String[] E = new String[n];
        int[] H = new int[n];
        double[] T = new double[n];
        double[] SB = new double[n];
        System.out.println("Ingrese informacio de los empleados");
        for(int i=0;i<n;i++)
        {
            System.out.println("Nombre: ");E[i]=entrada.next();
            System.out.println("Horas: ");H[i]=entrada.nextInt();
            System.out.println("Tarifa x Hora: ");T[i]=entrada.nextDouble();
        }

        for(int i=0;i<n;i++)
        {
         if(H[i] == 40)
         {
           SB[i]=40*T[i];  
         }
         if(H[i]>40)
         {
           SB[i]=((T[i]/2)+T[i])*H[i];  
         }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Nombre: "+E[i]);
            System.out.println("Horas: "+H[i]);
            System.out.println("Tarifa x Hora: "+T[i]);
            System.out.println("Sueldo Bruto es: "+SB[i]);
        }
    }
    
}
