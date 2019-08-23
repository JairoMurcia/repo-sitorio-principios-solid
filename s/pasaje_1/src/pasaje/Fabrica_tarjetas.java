/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaje;

/**
 *
 * @author jairo
 */
public class Fabrica_tarjetas {
    
   private Tarjeta t;
   
   
   public Tarjeta crear_tarjeta(int s){
       t=new Tarjeta(s,2400);
       return t;
   }
    public Tarjeta crear_tarjeta(int s,String usu,String ape,String cod){
       t=new Tarjeta_personalizada(s,2400,usu,ape,cod);
       return t;
   }
    public Tarjeta crear_tarjeta(int s,String usu,String ape,String cod,String tipo,String dato){
       if(tipo.equals("j")){
            t=new Tarjeta_jubilado(s,2000,usu,ape,cod,dato);
       }else{
           t=new Tarjeta_estudiante(s,1800,usu,ape,cod,dato);
       }
       return t;
   }  
    
}
