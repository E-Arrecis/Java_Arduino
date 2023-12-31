/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.geekmarket.arduinoconexion;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author Arrecis
 */
public class Ventana extends javax.swing.JFrame {
        int Encender;
        ImageIcon Usuario = new ImageIcon("troyano.png");
        ImageIcon Usuario1 = new ImageIcon("logo2.png");
        ImageIcon IconoLavado = new ImageIcon("Lavado.png");
        ImageIcon IconoEnjuagado = new ImageIcon("Enjuagado.png");
        ImageIcon IconoSecado = new ImageIcon("Secado.png");
        ImageIcon IconoFinalizado = new ImageIcon("Finalizado.png");
        ImageIcon IconoEnjabonado = new ImageIcon("Enjabonado.png");
        ImageIcon IconoInicio = new ImageIcon("Inicio.png");
       ImageIcon IconoAvanzar = new ImageIcon("Avanzar.png");
        PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
       
              
        
        SerialPortEventListener escucha = new SerialPortEventListener() {
            @Override
            public void serialEvent(SerialPortEvent spe) {
                try {
                    if(arduino.isMessageAvailable()==true){
                        
                        try{//parts = arduino.printMessage().split("$");
                            
                            
                        datoT.setText(arduino.printMessage());
                        String mensaje =  datoT.getText();
                         System.err.println(mensaje);
                        String[] parts = mensaje.split("\\*");
                        //String D= arduino.printMessage();
                        //System.out.println(datoT.getText());
                        if(parts.length>=5){
                            DatoTemperatura.setText(parts[0]+" °C");
                        CantdiadHumedad.setText(parts[1]+" % ");
                       DatoMovimiento1.setText(parts[2]+" PPM ");
                       DatoLuz.setText(parts[3]+" LM ");
                       DatoMovimiento.setText(parts[4]);
                       //CantdiadHumedad.setText(parts[1]+" % ");
                        System.err.println(parts[0]);
                        // System.err.println(parts[1]);
                        //Mensaje(datoT.getText());+
                        }
                        
                        }catch(Exception e){}
                    }} catch (SerialPortException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ArduinoException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
    
    public Ventana() {
        initComponents();
        datoT.setVisible(false);
        this.setTitle("Data Centro");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        Icono.setIcon((new ImageIcon(Usuario.getImage().getScaledInstance(Icono.getWidth(),Icono.getHeight(),Image.SCALE_SMOOTH))));
        Icono1.setIcon((new ImageIcon(Usuario1.getImage().getScaledInstance(Icono1.getWidth(),Icono1.getHeight(),Image.SCALE_SMOOTH))));
        //Imagen.setIcon((new ImageIcon(IconoInicio.getImage().getScaledInstance(Icono.getWidth(),Icono.getHeight(),Image.SCALE_SMOOTH))));
        
            try {
                arduino.arduinoRXTX("COM5", 9600, escucha);
            } catch (ArduinoException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Servidores = new javax.swing.JPanel();
        Humedad = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        CantdiadHumedad = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Temperatura = new javax.swing.JLabel();
        DatoTemperatura = new javax.swing.JLabel();
        Movimiento = new javax.swing.JLabel();
        DatoMovimiento = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        DatoMovimiento1 = new javax.swing.JLabel();
        Movimiento1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Jardín = new javax.swing.JPanel();
        Luz = new javax.swing.JLabel();
        DatoLuz = new javax.swing.JLabel();
        datoT = new javax.swing.JLabel();
        Icono1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());

        Servidores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Servidores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 3, 36), new java.awt.Color(2, 2, 2))); // NOI18N

        Humedad.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        Humedad.setText("Humedad");

        CantdiadHumedad.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        CantdiadHumedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantdiadHumedad.setText("50%");

        Temperatura.setFont(new java.awt.Font("Agency FB", 2, 24)); // NOI18N
        Temperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Temperatura.setText("Temperatura");

        DatoTemperatura.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        DatoTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatoTemperatura.setText("10.01 °C");

        Movimiento.setFont(new java.awt.Font("Agency FB", 2, 24)); // NOI18N
        Movimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Movimiento.setText("Movimiento");

        DatoMovimiento.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        DatoMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatoMovimiento.setText("Sin Movimiento");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        DatoMovimiento1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        DatoMovimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatoMovimiento1.setText("10000 PPM");

        Movimiento1.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        Movimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Movimiento1.setText("Concentración de Gaz y Humo");

        javax.swing.GroupLayout ServidoresLayout = new javax.swing.GroupLayout(Servidores);
        Servidores.setLayout(ServidoresLayout);
        ServidoresLayout.setHorizontalGroup(
            ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServidoresLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Humedad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantdiadHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(ServidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ServidoresLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ServidoresLayout.createSequentialGroup()
                                .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DatoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ServidoresLayout.createSequentialGroup()
                                        .addComponent(Movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServidoresLayout.createSequentialGroup()
                                        .addComponent(DatoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DatoMovimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Movimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ServidoresLayout.setVerticalGroup(
            ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServidoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Humedad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CantdiadHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServidoresLayout.createSequentialGroup()
                        .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DatoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServidoresLayout.createSequentialGroup()
                        .addComponent(Movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DatoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ServidoresLayout.createSequentialGroup()
                        .addComponent(Movimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DatoMovimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Jardín.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "iluminación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 3, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        Luz.setFont(new java.awt.Font("Agency FB", 2, 24)); // NOI18N
        Luz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Luz.setText("Nivel de Luz");

        DatoLuz.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        DatoLuz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatoLuz.setText("Sin Movimiento");

        javax.swing.GroupLayout JardínLayout = new javax.swing.GroupLayout(Jardín);
        Jardín.setLayout(JardínLayout);
        JardínLayout.setHorizontalGroup(
            JardínLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(JardínLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JardínLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(JardínLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Luz, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DatoLuz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        JardínLayout.setVerticalGroup(
            JardínLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
            .addGroup(JardínLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JardínLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(Luz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(DatoLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        datoT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        datoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(datoT, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Jardín, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(datoT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 262, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(Icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Servidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Jardín, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantdiadHumedad;
    private javax.swing.JLabel DatoLuz;
    private javax.swing.JLabel DatoMovimiento;
    private javax.swing.JLabel DatoMovimiento1;
    private javax.swing.JLabel DatoTemperatura;
    private javax.swing.JLabel Humedad;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Icono1;
    private javax.swing.JPanel Jardín;
    private javax.swing.JLabel Luz;
    private javax.swing.JLabel Movimiento;
    private javax.swing.JLabel Movimiento1;
    private javax.swing.JPanel Servidores;
    private javax.swing.JLabel Temperatura;
    private javax.swing.JLabel datoT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
