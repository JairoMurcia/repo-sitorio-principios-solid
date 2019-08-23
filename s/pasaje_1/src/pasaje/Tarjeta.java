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
public class Tarjeta {
    protected int saldo,pasaje;

    public int getSaldo() {
        return saldo;
    }

    public int getPasaje() {
        return pasaje;
    }

    public void recargar(int saldo) {
        this.saldo += saldo;
        
    }
    public void pagar(){
        System.out.println(this.saldo+" "+this.pasaje);
        this.saldo-=this.pasaje;
       
               
    }
    public Tarjeta(int s,int p){
        this.saldo=s;
        this.pasaje=p;
    }
    
}
