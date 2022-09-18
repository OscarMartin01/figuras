/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obra;

import java.util.ArrayList;


/**
 *
 * @author Oscar
 */
public class Obra {

    public static ArrayList clases(ArrayList<Integer> lista){
        ArrayList<Integer> lista3= new ArrayList<>();
        
       for (Integer n:lista){
           if(!lista3.contains(n)){
               lista3.add(n);
           }
       }

        return lista3;
    }
    
    public static ArrayList meFaltanDeLaClase(ArrayList<Integer> figuras, ArrayList<Integer> categoria,int n){
        
        ArrayList<Integer> lista3= new ArrayList<>();
        
            
        for (Integer i : figuras) {
            if(categoria.get(i)==n){
                lista3.add(i);
            }
            
        }
        return lista3;
        
    }
    
    public static ArrayList noTengo(ArrayList<Integer> coleccionistaA, ArrayList<Integer> coleccionistaB){
        
       ArrayList<Integer> lista3= new ArrayList<>();
        
          
    for (Integer element : coleccionistaA) { 
        if (!coleccionistaB.contains(element)) { 
            lista3.add(element); 
        } 
    }   
        
        return lista3;
    }
    
    public static Integer puedoCambiar(ArrayList<Integer> lista, ArrayList<Integer> lista2){
        int cont;
        ArrayList<Integer> lista3= new ArrayList<>();
        
        if(lista.size()>lista2.size()){
        
        for (Integer element : lista2) { 
        if (!lista.contains(element)) { 
            lista3.add(element); 
        } }
        }
        else{
        for (Integer element : lista) { 
        if (!lista2.contains(element)) { 
            lista3.add(element); 
            } 
        }   
    }
    
        cont=lista3.size();
        return cont;
        
    }

}
