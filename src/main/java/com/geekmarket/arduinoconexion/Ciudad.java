/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.geekmarket.arduinoconexion;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.awt.Image;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
   public int NivelLuz=0;
   
   ImageIcon SubirElevador = new ImageIcon("ElevadorUP.png");
   ImageIcon BajarElevador = new ImageIcon("ElevadorDown.png");
   ImageIcon ProcesoElevador = new ImageIcon("ArribaAbajo.png");
   ImageIcon SubirPuente = new ImageIcon("NoPasar.png");
   ImageIcon BajarPuente = new ImageIcon("Pasar.png");
   ImageIcon ProcesoPuente = new ImageIcon("Proceso.png");
   ImageIcon EncenderLuz = new ImageIcon("Encendido.png");
   ImageIcon ApagarLuz = new ImageIcon("Apagado.png");
   
   PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
        SerialPortEventListener escucha = new SerialPortEventListener() {
            @Override
            public void serialEvent(SerialPortEvent spe) {
                try {
                    if(arduino.isMessageAvailable()==true){
                        MensajeAR.setText(arduino.printMessage());
                        String D= arduino.printMessage();
                        System.out.println(MensajeAR.getText());
                        informacion(MensajeAR.getText());
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
        MensajeAR.setVisible(false);
        
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

        MensajeAR = new javax.swing.JLabel();
        Elevador = new javax.swing.JPanel();
        PantallaNivel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ElevadorIcono = new javax.swing.JLabel();
        Puente = new javax.swing.JPanel();
        PantallaNivel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PuenteIcono = new javax.swing.JLabel();
        Luces = new javax.swing.JPanel();
        PantallaNivel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        LucesIcono = new javax.swing.JLabel();

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
                    .addComponent(ElevadorIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addGroup(ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PantallaNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addGroup(ElevadorLayout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        ElevadorLayout.setVerticalGroup(
            ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElevadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(ElevadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(ElevadorIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
                    .addComponent(PantallaNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PuenteIcono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        PuenteLayout.setVerticalGroup(
            PuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(PuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(26, 26, 26)
                .addComponent(PuenteIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Luces.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Luces", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        PantallaNivel2.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        PantallaNivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PantallaNivel2.setText("Bienvenido");
        PantallaNivel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jButton5.setText("Encender");
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Apagar");
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LucesLayout = new javax.swing.GroupLayout(Luces);
        Luces.setLayout(LucesLayout);
        LucesLayout.setHorizontalGroup(
            LucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LucesLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(LucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LucesLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addComponent(PantallaNivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LucesIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        LucesLayout.setVerticalGroup(
            LucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LucesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PantallaNivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(LucesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(LucesIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Elevador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Puente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(MensajeAR, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Luces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MensajeAR)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Elevador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Puente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Luces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
               ElevadorIcono.setIcon((new ImageIcon(SubirElevador.getImage().getScaledInstance(ElevadorIcono.getWidth(),ElevadorIcono.getHeight(),Image.SCALE_SMOOTH))));
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PantallaNivel2.setText("Endendida");
       jButton6.setBackground(Color.white);
       jButton5.setBackground(Color.GREEN);
       
        System.out.println("Nivel: "+PuenteNivel);
       if(NivelLuz==2){
           JOptionPane.showMessageDialog(null,"Ya esta Encendida");  
       }
       else{
           try {
               arduino.sendData("L");
           } catch (ArduinoException | SerialPortException ex) {
               Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       NivelLuz=2;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         PantallaNivel2.setText("Apagada");
       jButton5.setBackground(Color.white);
       jButton6.setBackground(Color.GREEN);
       
        System.out.println("Nivel: "+NivelLuz);
       if(NivelLuz==1){
           JOptionPane.showMessageDialog(null,"Ya esta Apagado");  
       }
       else{
           try {
               arduino.sendData("O");
           } catch (ArduinoException | SerialPortException ex) {
               Logger.getLogger(Ciudad.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       NivelLuz=1;
    }//GEN-LAST:event_jButton6ActionPerformed

    
    private void informacion(String dato){
    
        switch(dato){
        
            case "U,Finalizado" -> {
                ElevadorIcono.setIcon((new ImageIcon(ProcesoElevador.getImage().getScaledInstance(ElevadorIcono.getWidth(),ElevadorIcono.getHeight(),Image.SCALE_SMOOTH))));
                JOptionPane.showMessageDialog(null, "Finalizo Proceso de Subida del Puente");
           }
            case "D,Finalizado" -> {
                JOptionPane.showMessageDialog(null, "Finalizo Proceso de Bajada del Puente");
           }
            case "F,Finalizado" -> {
                JOptionPane.showMessageDialog(null, "Finalizo Proceso de Subida de Elevador");
           }
            case "B,Finalizado" -> {
                JOptionPane.showMessageDialog(null, "Finalizo Proceso de Bajada de Elevador");
           }
            case "L" -> {
                JOptionPane.showMessageDialog(null, "lUZ Encendida");
           }
            case "O" -> {
                JOptionPane.showMessageDialog(null, "Luz Apagada");
           }
        }
    }
    
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
    private javax.swing.JLabel ElevadorIcono;
    private javax.swing.JPanel Luces;
    private javax.swing.JLabel LucesIcono;
    private javax.swing.JLabel MensajeAR;
    private javax.swing.JLabel PantallaNivel;
    private javax.swing.JLabel PantallaNivel1;
    private javax.swing.JLabel PantallaNivel2;
    private javax.swing.JPanel Puente;
    private javax.swing.JLabel PuenteIcono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
