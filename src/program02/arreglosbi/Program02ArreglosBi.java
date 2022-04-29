/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program02.arreglosbi;

/**
 *
 * @author Yair
 */
public class Program02ArreglosBi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a[][] = {{2,5,6}, {2,2,2}, {3,5,6}};
        int b[][] = new int [20][20];
        char c[] = {'h', 'o', 'l', 'a', 's'};
        double d[] = {10.3, 34.5};
        String nombre = "Yair";
        System.out.println(d[0]);
        System.out.println(d[1]);
        
        int i,j, x=0;
        
        for(i=0;i<50;i++){
            for(j=i;j<50;j++){
                x++;
            }
        }
        
        for(i=1;i<4;i++){
            
        }
        for(i=0; i<5; i++){
            System.out.println(b[i][i]);
            System.out.println(c[i]);
        }
        
        System.out.println(nombre);
        //Imprime el tamaño del arreglo
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
        
        //Transformar la cadena de caracteres a arreglo
        System.out.print(nombre.length());
       
    }
    
}
