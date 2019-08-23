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
public class Pasaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ventana_inicial v=new Ventana_inicial();
       Vista_pago vp=new Vista_pago();
       Fabrica_tarjetas ft=new Fabrica_tarjetas();
       Controlador c=new Controlador(ft,v,vp);
       v.agregar_Listener(c);
       vp.agregar_controlador(c);
       v.bloquear();
       v.mostrar();
    }
    
}
