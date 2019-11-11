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

