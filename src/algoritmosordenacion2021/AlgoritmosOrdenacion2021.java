/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion2021;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class AlgoritmosOrdenacion2021 {

    public void ordenacionBurbuja( int[] numeros){
        int num_elementos = numeros.length;
        for (int i=1; i < num_elementos; i++){
            for (int j = 0; j < num_elementos - i; j++){
                if (numeros[j] > numeros[j+1]){ 
                    //tengo que intercambiarlos
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] lista1 = {13, 27, 455, 621, 23, 1, 15};
        //primero imprimimos el array sin ordenar:
        
        System.out.println("array original: " + Arrays.toString(lista1));
        
        AlgoritmosOrdenacion2021 ordenacion = new AlgoritmosOrdenacion2021();
        
        //ordeno el array usando la burbuja
        ordenacion.ordenacionBurbuja(lista1);
        
        System.out.println("array ordenado: " + Arrays.toString(lista1));
        
        
    }
    
}
