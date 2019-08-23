/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jairo
 */
public class Controlador implements ActionListener {
    private Fabrica_tarjetas ft;
    private Ventana_inicial vi;
    private Vista_pago vp;
    private Tarjeta t=null;
    private String m;
    public Controlador(Fabrica_tarjetas ft, Ventana_inicial vi, Vista_pago vp) {
        this.ft = ft;
        this.vi = vi;
        this.vp = vp;
    }
    public void escribir(){
        m=""; 
        if(vi.perso.isSelected()){
                
                    
                    m="<html><body>Nombre: "+get_n()+" Apellido: "+get_a()
                            + "<br>Codigo: "+get_c();
                
            }
            if(vi.jubi.isSelected()){
               
               
                    
                    m="<html><body>Nombre: "+get_n()+" Apellido: "+get_a()
                            + "<br>Codigo: "+get_c()+" Empresa: "+get_e();
                
            }
            
            if(vi.estu.isSelected()){
               
                
                   m="<html><body>Nombre: "+get_n()+" Apellido: "+get_a()
                            + "<br>Codigo: "+get_c()+" Centro educativo: "+get_ce();
                
            }
    }
    private int get_saldo(){
        String s=vi.tSaldo.getText();
                if(!s.equals("")){
                   return Integer.parseInt(s);
                }
                return 0;
    } 
    private String get_n(){
        return vi.tNombre.getText();
    }
    private String get_a(){
        return vi.tApe.getText();
    }
    private String get_c(){
        return vi.tId.getText();
    }
    
    private String get_e(){
        return vi.tEmp.getText();
    }
    private String get_ce(){
        return vi.tCen.getText();
    }
    private boolean verificar(){
        if (vi.tNombre.isEnabled() && vi.tNombre.getText().equals("")){
            return true;
        }
        if (vi.tApe.isEnabled() && vi.tApe.getText().equals("")){
            return true;
        }
        if (vi.tId.isEnabled() && vi.tId.getText().equals("")){
            return true;
        }
        if( vi.tEmp.isEnabled() && vi.tEmp.getText().equals("") ){
            return true;
        }
        if( vi.tCen.isEnabled() && vi.tCen.getText().equals("") ){
            return true;
        }
        return false;
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vi.boton){
            if(verificar()){
            vi.mensaje.setText("Debe llenar los campos que aparecen disponibles");
            }else{
            escribir();    
            if (vi.normal.isSelected()){
                t=ft.crear_tarjeta(get_saldo());
                vp.info.setText("Saldo: "+t.getSaldo());
            }
            if(vi.perso.isSelected()){
                
                    t=ft.crear_tarjeta(get_saldo(),get_n(),get_a(),get_c());
                    vp.info.setText(m+"Saldo: "+t.getSaldo()+"</body></html>");
                
            }
            if(vi.jubi.isSelected()){
               
               
                    t=ft.crear_tarjeta(get_saldo(),get_n(),get_a(),get_c(),"j",get_e());
                     vp.info.setText(m+"Saldo: "+t.getSaldo()+"</body></html>");
                
            }
            
            if(vi.estu.isSelected()){
               
                
                    t=ft.crear_tarjeta(get_saldo(),get_n(),get_a(),get_c(),"e",get_e());
                      vp.info.setText(m+"Saldo: "+t.getSaldo()+"</body></html>");
                
            }
           
            vi.setVisible(false);
            vi.tNombre.setText("");
            vi.tApe.setText("");
            vi.tId.setText("");
            vi.tEmp.setText("");
            vi.tCen.setText("");
            vi.tSaldo.setText("");
            vp.mostrar();
        }
            
            
        } 
        if(e.getSource()==vi.normal){
            vi.bloquear();
        }
        if(e.getSource()==vi.perso){
            vi.bloquear();
            vi.desbloquear();
        }
        if(e.getSource()==vi.estu){
            vi.bloquear();
            vi.desbloquear();
            vi.tCen.setEnabled(true);
        }
        if(e.getSource()==vi.jubi){
            vi.bloquear();
            vi.desbloquear();
            vi.tEmp.setEnabled(true);
        }
        if(e.getSource()==vp.volver){
            vp.mensaje.setText("");
            vp.info.setText("");
            vp.setVisible(false);
            vi.mostrar();
        }
        if(e.getSource()==vp.bRe){
            String r=vp.tRe.getText();
            if(r.equals("") ){
                vp.mensaje.setText("Ingrese un numero");
            }else{
                t.recargar(Integer.parseInt(r));
                 vp.info.setText(m+"Saldo: "+t.getSaldo()+"</body></html>");
                 vp.mensaje.setText("Recarga hecha");
            }
            
        }
        
        if(e.getSource()==vp.pagar){
            if(t.getPasaje()>t.getSaldo()){
                vp.mensaje.setText("No tiene saldo");
            }else{
                int p=t.getPasaje();
                int s=t.getSaldo();
                
                t.pagar();
                if(t.getSaldo()+p==s){
                    vp.mensaje.setText("Pasaje pagado");
                }else{
                    vp.mensaje.setText("Pasaje con descuento por transbordo");
                }
                 vp.info.setText(m+"Saldo: "+t.getSaldo()+"</body></html>");
                
            }
        }
    }
        
}
