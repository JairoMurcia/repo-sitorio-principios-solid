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
public class Tarjeta_jubilado extends Tarjeta_personalizada {
    private String empresa;
    public Tarjeta_jubilado(int s, int p, String n,String ape, String id,String em) {
        super(s, p, n,ape, id);
        empresa=em;
    }

    public String getEmpresa() {
        return empresa;
    }
    
}
