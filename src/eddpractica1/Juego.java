/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import java.awt.*;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Rodolfo
 */
public class Juego extends javax.swing.JFrame {

    Lista_Jugador jugadores;
    ListaPlanta plantas;
    ListaZombie zombies;
    public static ColaPlantas cola;
    public static PilaZombies pila;
    
    int Tamx,Tamy, trecx=96, trecy=96;
    int Tamvx=1, Tamvy=5;
    
    int panelx=604, panely=546;
    int panel2x=100, panel2y=548;
    JLabel[][] mGrafica;
    JLabel[][] ColaGrafica = new JLabel[1][5];
    JLabel[][] PilaGrafica = new JLabel[1][5];
    /**
     * Creates new form Juego
     */
   public JLabel label = new JLabel();
    
        
    
    public Juego() {
        initComponents();        
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
        PanelTablero = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PanePlanta = new javax.swing.JPanel();
        PaneZombie = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SketchFlow Print", 0, 18)); // NOI18N
        jLabel1.setText("Juego Plantas vs Zombies");

        PanelTablero.setAutoscrolls(true);
        PanelTablero.setEnabled(false);

        javax.swing.GroupLayout PanelTableroLayout = new javax.swing.GroupLayout(PanelTablero);
        PanelTablero.setLayout(PanelTableroLayout);
        PanelTableroLayout.setHorizontalGroup(
            PanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        PanelTableroLayout.setVerticalGroup(
            PanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jButton1.setText("Start!!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanePlantaLayout = new javax.swing.GroupLayout(PanePlanta);
        PanePlanta.setLayout(PanePlantaLayout);
        PanePlantaLayout.setHorizontalGroup(
            PanePlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanePlantaLayout.setVerticalGroup(
            PanePlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PaneZombieLayout = new javax.swing.GroupLayout(PaneZombie);
        PaneZombie.setLayout(PaneZombieLayout);
        PaneZombieLayout.setHorizontalGroup(
            PaneZombieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PaneZombieLayout.setVerticalGroup(
            PaneZombieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setText("Extraer Pila");

        jButton3.setText("Extraer Cola");

        jMenu1.setText("File");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Reportes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanePlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaneZombie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTablero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneZombie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanePlanta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columnas"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Filas"));
        Tamx = x;
        Tamy= y;
        mGrafica = new JLabel[Tamx][Tamy];
        desplegar2();
        desplegarCola();
        desplegarPila();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try{
        GraphvizJugadores();
        }catch(IOException e){}
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    public void desplegarCola(){
        for(int i=0;i<1;i++){
            for( int j=0; j<5; j++){
                ColaGrafica[i][j] = new JLabel();           
                ColaGrafica[i][j].setBounds(i *(panel2x / Tamvx), j * (panel2y / Tamvy), panel2x / Tamvx, panel2y / Tamvy);
                CrearPlantas.plantas.nodo(i);
                ColaGrafica[i][j].setIcon(ajustarImagen2("pasto2.jpg"));
                ColaGrafica[i][j].setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                this.PanePlanta.add(ColaGrafica[i][j]);
                this.PanePlanta.repaint();           
            }
        } 
    }
    
    public void desplegarPila(){
        for(int i=0;i<1;i++){
            for( int j=0; j<5; j++){
                PilaGrafica[i][j] = new JLabel();           
                PilaGrafica[i][j].setBounds(i *(panel2x / Tamvx), j * (panel2y / Tamvy), panel2x / Tamvx, panel2y / Tamvy);
                PilaGrafica[i][j].setIcon(ajustarImagen2("pasto2.jpg"));
                PilaGrafica[i][j].setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                this.PaneZombie.add(PilaGrafica[i][j]);
                this.PaneZombie.repaint();           
            }
        } 
    }
    
    public void desplegar2(){
        for(int i=0;i<Tamx;i++){
            for(int j=0;j<Tamy;j++){ 
                mGrafica[i][j] = new JLabel();           
                mGrafica[i][j].setBounds(i *(panelx / Tamx), j * (panely / Tamvy), panelx / Tamx, panely / Tamy);
                mGrafica[i][j].setIcon(ajustarImagen("pasto.jpg"));
                mGrafica[i][j].setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
                this.PanelTablero.add(mGrafica[i][j]);
                this.PanelTablero.repaint();
           }
        } 
    }
    
    private ImageIcon ajustarImagen2(String image){
        ImageIcon TempIconEx = new ImageIcon(image);     
        ImageIcon TempIcon;
        
        TempIcon = new ImageIcon(TempIconEx.getImage().getScaledInstance(panel2x / Tamvx, panel2y / Tamvy, Image.SCALE_DEFAULT));
        return TempIcon;
    }
    
    private ImageIcon ajustarImagen(String image){
        ImageIcon TempIconEx = new ImageIcon(image);     
        ImageIcon TempIcon;
        TempIcon = new ImageIcon(TempIconEx.getImage().getScaledInstance(panelx / Tamx, panely / Tamy, Image.SCALE_DEFAULT));
        return TempIcon;
    }
    
    public void GraphvizJugadores() throws FileNotFoundException{
        String texto = "Digraph G {";
        File archivo = new File("C:\\Images\\Jugadores.dot");
        PrintWriter Fw = new PrintWriter(archivo);
        Fw.println(texto);
        Fw.println(graficarJugadores(JugPlantas.jugadores.primero.Nombre));
        Fw.println("}");
        graphListPlan = "";
        Fw.close();
        ExDot("Jugadores.dot", "Jugadores.png");
        
    }
    
    public void GraphvizLP() throws IOException{
        
        String texto = "Digraph G {";
        File archivo = new File("C:\\Images\\LPlantas.dot");
        FileWriter Fw = new FileWriter(archivo);
        Fw.append(texto);
        Fw.append(graficarLP(plantas.primero.nombre));
        Fw.append("}");
        graphListPlan = "";
        Fw.close();
        ExDot("", texto);
    }
    
    public void GraphvizLZ() throws IOException{
        
        String texto = "Digraph G {";
        File archivo = new File("C:\\Images\\LZombies.dot");
        FileWriter Fw = new FileWriter(archivo);
        Fw.append(texto);
        Fw.append(graficarLP(zombies.inicio.nombre));
        Fw.append("}");
        graphListPlan = "";
        Fw.close();
        ExDot("", texto);
    }
    
    String graphListPlan, graphListZom, graphJugadores;
    public String graficarLP(String raiz){
        Planta aux = plantas.primero;
        
        if(aux == null){
            graphListPlan = "";
        }else if(aux.siguiente == null){
            graphListPlan += raiz + "->" + aux.nombre + " ";
        }else{
            graphListPlan += raiz + "->"+ aux.nombre + " ";
            while(aux.siguiente != null){
                graphListPlan += aux.nombre + "->" + aux.siguiente.nombre + " ";
                aux = aux.siguiente;
            }
        }        
        return graphListPlan;
    }
    
    public String graficarLP(Planta raiz){
        Planta aux = plantas.primero;
        
        if(aux == null){
            graphListPlan = "";
        }else if(aux.siguiente == null){
            graphListPlan += raiz + "->" + aux.nombre + " ";
        }else{
            graphListPlan += raiz + "->"+ aux.nombre + " ";
            while(aux.siguiente != null){
                graphListPlan += aux.nombre + "->" + aux.siguiente.nombre + " ";
                aux = aux.siguiente;
            }
        }        
        return graphListPlan;
    }
    
    public String graficarJugadores(String raiz){
        NodoJugador aux = JugPlantas.jugadores.primero;
        while(aux != null){
            graphJugadores += raiz + "->" + aux.sig.Nombre +" \n";
            graphJugadores += aux.campos.recorrer(aux.Nombre);
            aux = aux.sig;            
            if(aux.sig == null){
                break;
            }
        }
        return graphJugadores;
    }
    
    public String graficarLZ(String incio){
        Zombie aux = zombies.inicio;
        
        if(aux == null){
            graphListZom = "";
        }else if(aux.siguiente == null){
            graphListZom += incio + "->" + aux.nombre + " ";
        }else{
            graphListZom += incio + "->"+ aux.nombre + " ";
            while(aux.siguiente != null){
                graphListZom += aux.nombre + "->" + aux.siguiente.nombre + " ";
                aux = aux.siguiente;
            }
        }        
        return graphListZom;
    }
    
    private void ExDot(String archivodot, String img){
         try {

            //String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = "C:\\Images\\"+archivodot;
            String fileOutputPath = "C:\\Images\\"+img;
            ProcessBuilder pb;
            pb = new ProcessBuilder("dot", "-Tpng", "-o", fileOutputPath, fileInputPath);
            pb.redirectErrorStream(true);
            pb.start();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }
    
    
    public void insertarPila(){
        Zombie actual;
        for(int i=0; i<CrearZombies.zombies.Size(); i++){
            actual = CrearZombies.zombies.nodo(i);
            pila.Push(actual);
        }
    }
    
    public void insertarCola(){
        Planta actual;
        for(int i=0; i<CrearPlantas.plantas.Size(); i++){
            actual = CrearPlantas.plantas.nodo(i);
            cola.add(actual);
        }
    }
    
    public void eliminarCola(){
        cola.poll();
    }
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanePlanta;
    private javax.swing.JPanel PaneZombie;
    private javax.swing.JPanel PanelTablero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

    
}
