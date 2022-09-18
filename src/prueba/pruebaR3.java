/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;
import java.util.ArrayList;

import static obra.Obra.clases;
import static obra.Obra.meFaltanDeLaClase;
import static obra.Obra.noTengo;
import static obra.Obra.puedoCambiar;
/**
 *
 * @author Oscar
 */
public class pruebaR3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista= new ArrayList<>();
        
        int[]clases={1,2,5,5,5,1,2,5,5,5};
        
        for (int i=0;i<clases.length;i++){
            lista.add(clases[i]);
        }
        
        System.out.println("Lista clases:");
        System.out.println(clases(lista));

        /*-------------------------------------------------------------------------------------------*/
        
        ArrayList<Integer> figuras= new ArrayList<>();
        
        int[] figura={1,3,6,8};
        for (int i=0;i<figura.length;i++){
            figuras.add(figura[i]);
        }

        ArrayList<Integer> cat= new ArrayList<>();
        
        int[] categ={1,2,5,5,5,1,2,5,5,5};
        for (int i=0;i<categ.length;i++){
            cat.add(categ[i]);
        }

        int eval=5;
        
        System.out.println("Faltantes de clase:");
        System.out.println(meFaltanDeLaClase(figuras,cat,eval));
        
        /*-------------------------------------------------------------------------------------------*/
        
        ArrayList<Integer> usuarioa= new ArrayList<>();
        
        int[] usera={3,5,7,10,15,16};
        for (int i=0;i<usera.length;i++){
            usuarioa.add(usera[i]);
        }
        
        int [] userb={4,10,5,8};
        
        ArrayList<Integer> usuariob= new ArrayList<>();
        for (int i=0;i<userb.length;i++){
            usuariob.add(userb[i]);
        }
        
        
        System.out.println("Figuras faltantes de otro usuario");
        System.out.println(noTengo(usuarioa,usuariob));
        
        /*-------------------------------------------------------------------------------------------*/
        
        System.out.println("Figuras a cambiar");
        System.out.println(puedoCambiar(usuarioa,usuariob));
        
    }
}
