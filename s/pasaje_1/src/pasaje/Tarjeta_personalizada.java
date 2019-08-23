/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaje;

import java.sql.Timestamp;

/**
 *
 * @author jairo
 */
public class Tarjeta_personalizada extends Tarjeta {
    
    protected String nombre,apellido,id;
    protected long  ultima_vez=0;
    protected int descuento;
    
    public Tarjeta_personalizada(int s,int p,String n,String ape,String id) {
        super(s,p);
        this.nombre=n;
        this.id=id;
        this.apellido=ape;
    }

    public void setUltima_vez(long ultima_vez) {
        this.ultima_vez = ultima_vez;
    }

   
    public void verificar(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long t=timestamp.getTime();
        if(t-ultima_vez<=10000 && ultima_vez!=0){
            descuento=400;
           
        }else{
            descuento=0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }
    public void pagar(){
        verificar();
        this.saldo-=this.pasaje;
        this.saldo+=this.descuento;
    }
    
    
    
}
