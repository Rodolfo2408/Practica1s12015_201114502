/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Rodolfo
 */
public class CrearPlantasZombies extends javax.swing.JFrame {

    public ListaPlanta plantas;
    public ListaZombie zombies;
    
    public Lista_Jugador jugadores;
    
    PilaZombies pila = new PilaZombies();
    ColaPlantas cola = new ColaPlantas();
    public JChomboBox jchombobox;
    
    /**
     *Array Imagenes de Plantas
     */
    public ImageIcon[] ItemsPlantas = {
        new ImageIcon(getClass().getResource("/Images/planta 1.png")),
        new ImageIcon(getClass().getResource("/Images/planta2.png")),
        new ImageIcon(getClass().getResource("/Images/planta3.png")),
        new ImageIcon(getClass().getResource("/Images/planta4.png")),
        new ImageIcon(getClass().getResource("/Images/planta5.png")),
        new ImageIcon(getClass().getResource("/Images/planta6.png")),
        new ImageIcon(getClass().getResource("/Images/planta7.png"))
    };
    
    /**
     *Array Imagenes de Zombies
     */
    public ImageIcon[] ItemsZombies = {
        new ImageIcon(getClass().getResource("/Images/zombie1.png")),
        new ImageIcon(getClass().getResource("/Images/zombie2.png")),
        new ImageIcon(getClass().getResource("/Images/zombie3.png")),
        new ImageIcon(getClass().getResource("/Images/zombie4.png")),
        new ImageIcon(getClass().getResource("/Images/zombie5.png")),
        new ImageIcon(getClass().getResource("/Images/zombie6.png")),
        new ImageIcon(getClass().getResource("/Images/zombie7.png"))
    };
    
    /**
     * Creates new form CrearPlantasZombies
     */
    public CrearPlantasZombies() {
        initComponents();
        jchombobox = new JChomboBox(ItemsPlantas.length);
        jComboRender render = new jComboRender(ItemsPlantas);
        jchombobox.setRenderer(render);
        jchombobox.setAlignmentX((float)0.5);
        jchombobox.setAlignmentY((float) 0.5);
        this.add(jchombobox);
        jchombobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Se Selecciono la Imagen "+ jchombobox.getSelectedItem());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btbAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        ComboDisparo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPtsAtaque = new javax.swing.JTextField();
        txtPtsDefensa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btbModificar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SketchFlow Print", 2, 12)); // NOI18N
        jLabel1.setText("Imagen");

        jLabel2.setFont(new java.awt.Font("SketchFlow Print", 2, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("SketchFlow Print", 2, 12)); // NOI18N
        jLabel3.setText("Puntos Ataque");

        jLabel4.setFont(new java.awt.Font("SketchFlow Print", 2, 12)); // NOI18N
        jLabel4.setText("Puntos Defensa");

        btbAdd.setText("Agregar");
        btbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        ComboDisparo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disparo", "Directo" }));

        jLabel5.setFont(new java.awt.Font("SketchFlow Print", 2, 12)); // NOI18N
        jLabel5.setText("Ataque");

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 0, 24)); // NOI18N
        jLabel6.setText("Creacion de Personajes");

        btnSiguiente.setText("Siguiente>>");

        btbModificar.setText("Modificar");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                                .addComponent(btbAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btbModificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPtsAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPtsDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboDisparo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel6)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboDisparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPtsAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPtsDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btbAdd)
                    .addComponent(btnSiguiente)
                    .addComponent(btbModificar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAddActionPerformed
        String imagen,nombre, ataque;
        int ptsAtaque, ptsDefensa;
        imagen = jTextField1.getText();
        //imagen = (String) jchombobox.getSelectedItem();
        nombre = txtNombre.getText();
        ataque = (String) ComboDisparo.getSelectedItem();
        ptsAtaque = Integer.parseInt(txtPtsAtaque.getText());
        ptsDefensa = Integer.parseInt(txtPtsDefensa.getText());
        
        cola.add(new Planta(nombre, ataque, imagen, ptsDefensa, ptsAtaque, true));
        
    }//GEN-LAST:event_btbAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        cola.poll();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPlantasZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPlantasZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPlantasZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPlantasZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPlantasZombies().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboDisparo;
    private javax.swing.JButton btbAdd;
    private javax.swing.JButton btbModificar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPtsAtaque;
    private javax.swing.JTextField txtPtsDefensa;
    // End of variables declaration//GEN-END:variables
}
