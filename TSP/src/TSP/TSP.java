/*
 * To change license header, choose License Headers in Project Properties.
 * To change template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.util.ArrayList;
/**
 *
 * @author Mouxes13
 */
public class TSP
{
    int pos, cont, mejor, tamaño;
    int[] camino = new int [10];

    public TSP() {
        pos = 0; //posicion inicial en j
        cont = 0;//contador 
        mejor = 0;
    }
  
    

    public void MejorCamino (int n) //creamos el metodo para buscar el mejor camino
    {
        pos=n;

        int[][] matriz = { //damos por la matriz que nos había puesto
            { 0, 13,  33,  28,  37,   7,  32,  40,  80,  26},
            { 0,  0,  39,  83,  50,  68,  16,  98,  81,  55},
            { 0,  0,   0,  80,  88,  49,  53,  75,  63,  55},
            { 0,  0,   0,   0,  94,   4,  20,   6,  59,  76},
            { 0,  0,   0,   0,   0,  81,  87,  85,   4,  19},
            { 0,  0,   0,   0,   0,   0,  96,  53,  40,  37},
            { 0,  0,   0,   0,   0,   0,   0,  80,  57,  68},
            { 0,  0,   0,   0,   0,   0,   0,   0,  65,  41},
            { 0,  0,   0,   0,   0,   0,   0,   0,   0,  97},
            { 0,  0,   0,   0,   0,   0,   0,   0,   0,   0}
        };

        for (int i =0; i < camino.length; i++) //llenamos el camino de ceros
        {
            camino[i]=0;
        }
        camino [cont] = pos; // igualamos el camino en cont a la posicion inicial
        while (cont<9) //hasta que cont vaya de 0 a 9
        {
            int aux=pos; //hacemos un aux con la posicion
         int valor=100; // le damos un valor random 
            for (int j =pos; j>0;j--){ //Revisamos que la matriz vaya revisando de la posicion inicial hasta que sea 0 donde ya no entrara
             
                if (valor > matriz[j][pos] && matriz[j][pos]!=0){ // se comprueba que el valor sea mayor a la matriz en la posicion j, pos y tambien que la matriz no tenga un cero
                    valor = matriz[j][pos]; //igualamos el valor a lo que tenga la posicion
                   aux=j;
                }
            }
            for (int j =pos; j<10;j++){
                 if (valor > matriz[pos][j] && matriz[pos][j]>0){
                    valor = matriz[pos][j];
                    aux=j;
                }
            }


          for (int x =0; x < camino.length;x++){
               matriz[pos][x]=0;
                    matriz[x][pos]=0;
          }
            pos=aux;
                mejor+=valor;
                valor=100;
                cont++;
                camino[cont]=pos;
        }

       
        for (int i =0; i < camino.length; i++)
        {
            System.out.print((char)(65+camino[i]) +" , ");
        }
       
        System.out.println((char)(65+camino[0])+"\n TOTAL: "+mejor + "\n");
        cont=0;
        mejor=0;
        pos=0;


    }
  
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

