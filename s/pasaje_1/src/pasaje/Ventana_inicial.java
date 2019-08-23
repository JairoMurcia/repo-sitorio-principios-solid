/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaje;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jairo
 */
public class Ventana_inicial extends JFrame {
    JLabel mensaje=new JLabel();
    JButton boton =new JButton("Nueva tarjeta"); 
    JTextField tNombre=new JTextField();
    JLabel lNombre=new JLabel("Nombre:");
    
    JTextField tApe=new JTextField();
    JLabel lApe=new JLabel("Apellido:");
    
    JTextField tId=new JTextField();
    JLabel lId=new JLabel("Identificación:");
    
    JTextField tCen=new JTextField();
    JLabel lCen=new JLabel("Centro educativo:");
    
    JTextField tEmp=new JTextField();
    JLabel lEmp=new JLabel("Empresa:");
    
    
    JTextField tSaldo=new JTextField();
    JLabel lSaldo=new JLabel("Saldo(opc)");
    
    JRadioButton normal=new JRadioButton("Tarjeta normal");
   
    JRadioButton perso=new JRadioButton("Tarjeta personalizada");
    JRadioButton estu=new JRadioButton("Tarjeta estudiante");
    JRadioButton jubi=new JRadioButton("Tarjeta jubilado");
    ButtonGroup group = new ButtonGroup();
    public Ventana_inicial(){
        super("pasajes");
        Container c=getContentPane();
        c.setLayout(null);
        c.add(lNombre);
        lNombre.setBounds(10,10,50,20);
        
        c.add(tNombre);
        tNombre.setBounds(70,10,100,20);
        
        c.add(lApe);
        lApe.setBounds(10,30,50,20);
        c.add(tApe);
        tApe.setBounds(70,30,100,20);
        
        c.add(lId);
        lId.setBounds(10,50,90,20);
        c.add(tId);
       
        tId.setBounds(100,50,100,20);
        c.add(lSaldo);
        lSaldo.setBounds(10,70,70,20);
        c.add(tSaldo);
        tSaldo.setBounds(90,70,100,20);
        c.add(tCen);
        tCen.setBounds(110,90,100,20);
        c.add(lCen);
        lCen.setBounds(10,90,100,20);
        
         c.add(lEmp);
        lEmp.setBounds(10,110,100,20);
        c.add(tEmp);
        tEmp.setBounds(110,110,100,20);
      
        normal.setSelected(true);
       
        group.add(normal);
        group.add(perso);
        group.add(estu);
        group.add(jubi);
        
        c.add(normal);
        normal.setBounds(10,130,150,20);
        c.add(perso);
        perso.setBounds(10,150,150,20);
        c.add(estu);
        estu.setBounds(10,170,150,20);
        c.add(jubi);
        jubi.setBounds(10,190,150,20);
        
        
        c.add(mensaje);
        mensaje.setBounds(10,210,250,20);
        c.add(boton);
        boton.setBounds(25,230,200,20);
    }
    
    
    public void mostrar(){
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void bloquear(){
        tNombre.setEnabled(false);
        tApe.setEnabled(false);
        tId.setEnabled(false);
        tCen.setEnabled(false);
        tEmp.setEnabled(false);
    }
    public void desbloquear(){
        tNombre.setEnabled(true);
        tApe.setEnabled(true);
        tId.setEnabled(true);
    }
    public void agregar_Listener(ActionListener e){
        boton.addActionListener(e);
        normal.addActionListener(e);
        perso.addActionListener(e);
        estu.addActionListener(e);
        jubi.addActionListener(e);
    }
}
