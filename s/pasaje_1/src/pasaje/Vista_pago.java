/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaje;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jairo
 */
public class Vista_pago extends JFrame {
    
    JLabel info =new JLabel();
    JLabel lRe=new JLabel ("Valor a recargar");
    
    JTextField tRe=new JTextField();
    JButton bRe=new JButton("Recargar");
    JButton volver=new JButton("Volver");
    JButton pagar=new JButton("pagar");
    JLabel mensaje=new JLabel();
    public Vista_pago(){
        Container c=getContentPane();
        c.setLayout(null);
        c.add(info);
        info.setBounds(10,10,280,40);
        c.add(lRe);
        lRe.setBounds(10,50,100,20);
        c.add(tRe);
        tRe.setBounds(110,50,70,20);
        c.add(bRe);
        bRe.setBounds(180,50,100,20);
        c.add(mensaje);
        mensaje.setBounds(10,70,100,20);
        c.add(pagar);
        pagar.setBounds(115,90,70,20);
        c.add(volver);
        volver.setBounds(115,110,70,20);
        
    }
     public void mostrar(){
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public void agregar_controlador(ActionListener e){
         volver.addActionListener(e);
         bRe.addActionListener(e);
         pagar.addActionListener(e);
     }
}
