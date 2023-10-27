/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.geekmarket.arduinoconexion;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author Maydas
 */
public class Ciudad extends javax.swing.JFrame {
    
   public int nivel = 0;
   public int PuenteNivel=0;
   PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
        SerialPortEventListener escucha = new SerialPortEventListener() {
            @Override
            public void serialEvent(SerialPortEvent spe) {
                try {
                    if(arduino.isMessageAvailable()==true){
                        //datoT.setText(arduino.printMessage());
                        String D= arduino.printMessage();
                        //System.out.println(datoT.getText());
                        //Mensaje(datoT.getText());
                    }} catch (SerialPortException ex) {
                    Logger.getLogger(Ventana_copia.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ArduinoException ex) {
                    Logger.getLogger(Ventana_copia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
    /**
     * Creates new form Ciudad
     */
    public Ciudad() {
        initComponents();
        this.setTitle("New York");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        try {
                arduino.arduinoRXTX("COM4", 9600, escucha);
            } catch (ArduinoException ex) {
                Logger.getLogger(Ventana_copia.class.getName()).log(Level.SEVERE, null, ex);
            }
        //nivel=0;
    }
    
    public void validarNivel(){
        
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Elevador = new javax.swing.JPanel();
        PantallaNivel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Puente = new javax.swing.JPanel();
        PantallaNivel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Elevador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Elevador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        PantallaNivel.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        PantallaNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PantallaNivel.setText("Bienvenido");
        PantallaNivel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jButton1.setText("Subir");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Bajar");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ElevadorLayout = new javax.swing.GroupLayout(Elevador);
        Elevador.setLayout(ElevadorLayout);
        ElevadorLayout.setHorizontalGroup(
            ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevadorLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ElevadorLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(PantallaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        ElevadorLayout.setVerticalGroup(
            ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        Puente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Puente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        PantallaNivel1.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        PantallaNivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PantallaNivel1.setText("Bienvenido");
        PantallaNivel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jButton3.setText("Subir");
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bajar");
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PuenteLayout = new javax.swing.GroupLayout(Puente);
        Puente.setLayout(PuenteLayout);
        PuenteLayout.setHorizontalGroup(
            PuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuenteLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(PuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PuenteLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(PantallaNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        PuenteLayout.setVerticalGroup(
            PuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(PuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Elevador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(Puente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Puente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Elevador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(352, 352, 352))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PantallaNivel.setText("Subir");
       //jButton1.setForeground(Color.GREEN);
       //jButton2.setForeground(Color.white);
       jButton2.setBackground(Color.white);
       jButton1.setBackground(Color.GREEN);
      
       System.out.println("Nivel: "+nivel);
       if(nivel==2){
           JOptionPane.showMessageDialog(null,"Ya te encuentras Arriba");
       }
       
       else{
           try {
               arduino.sendData("F");
           } catch (ArduinoException | SerialPortException ex) {
               Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        nivel=2;
       
       
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      PantallaNivel.setText("Abajo");
      jButton1.setBackground(Color.white);
       jButton2.setBackground(Color.GREEN);
       
        System.out.println("Nivel: "+nivel);
       if(nivel==1){
           JOptionPane.showMessageDialog(null,"Ya te encuentras Abajo");  
       }
       else{
           try {
               arduino.sendData("B");
           } catch (ArduinoException | SerialPortException ex) {
               Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       nivel=1;
       
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        PantallaNivel1.setText("Abajo");
      jButton3.setBackground(Color.white);
       jButton4.setBackground(Color.GREEN);
       
        System.out.println("Nivel: "+PuenteNivel);
       if(PuenteNivel==1){
           JOptionPane.showMessageDialog(null,"Ya esta Abajo");  
       }
       else{
           try {
               arduino.sendData("D");
           } catch (ArduinoException | SerialPortException ex) {
               Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       PuenteNivel=1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PantallaNivel1.setText("Subir");
       jButton4.setBackground(Color.white);
       jButton3.setBackground(Color.GREEN);
       
        System.out.println("Nivel: "+PuenteNivel);
       if(PuenteNivel==2){
           JOptionPane.showMessageDialog(null,"Ya esta Arriba");  
       }
       else{
           try {
               arduino.sendData("U");
           } catch (ArduinoException | SerialPortException ex) {
               Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       PuenteNivel=2;
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciudad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Elevador;
    private javax.swing.JLabel PantallaNivel;
    private javax.swing.JLabel PantallaNivel1;
    private javax.swing.JPanel Puente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
