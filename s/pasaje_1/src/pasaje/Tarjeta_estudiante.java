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
public class Tarjeta_estudiante extends Tarjeta_personalizada{
    private String centro_educativo;
    public Tarjeta_estudiante(int s,int p, String n,String ape, String id,String centro) {
        super(s,p, n,ape, id);
        centro_educativo=centro;
    }

    public String getCentro_educativo() {
        return centro_educativo;
    }
    
}
