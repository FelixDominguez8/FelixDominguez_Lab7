/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_felixdominguez_12131043;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo I7
 */
public class Principio extends javax.swing.JFrame {
    static ArrayList<Equipo> equipos=new ArrayList();
    Random r=new Random();
    

    /**
     * Creates new form Principio
     */
    public Principio() {
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

        Simular = new javax.swing.JDialog();
        Equipo1 = new javax.swing.JComboBox<>();
        Equipo2 = new javax.swing.JComboBox<>();
        Puntos1 = new javax.swing.JLabel();
        Puntos2 = new javax.swing.JLabel();
        BotonSimular = new javax.swing.JButton();
        TablaPosiciones = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        Posiciones = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Crear = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Modificar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Eliminar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Cargar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Simulacion = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Tabla = new javax.swing.JMenuItem();

        Equipo1.setMinimumSize(new java.awt.Dimension(100, 22));

        Equipo2.setMinimumSize(new java.awt.Dimension(100, 22));

        Puntos1.setText("0");

        Puntos2.setText("0");

        BotonSimular.setText("Simular");
        BotonSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSimularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SimularLayout = new javax.swing.GroupLayout(Simular.getContentPane());
        Simular.getContentPane().setLayout(SimularLayout);
        SimularLayout.setHorizontalGroup(
            SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimularLayout.createSequentialGroup()
                .addGroup(SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SimularLayout.createSequentialGroup()
                        .addGroup(SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SimularLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SimularLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(Puntos1)))
                        .addGroup(SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SimularLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SimularLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Puntos2)
                                .addGap(33, 33, 33))))
                    .addGroup(SimularLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BotonSimular)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        SimularLayout.setVerticalGroup(
            SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimularLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Puntos1)
                    .addComponent(Puntos2))
                .addGap(39, 39, 39)
                .addComponent(BotonSimular)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PJ", "PG", "PE", "PP", "GF", "GC", "DG", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Posiciones);

        javax.swing.GroupLayout TablaPosicionesLayout = new javax.swing.GroupLayout(TablaPosiciones.getContentPane());
        TablaPosiciones.getContentPane().setLayout(TablaPosicionesLayout);
        TablaPosicionesLayout.setHorizontalGroup(
            TablaPosicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablaPosicionesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        TablaPosicionesLayout.setVerticalGroup(
            TablaPosicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaPosicionesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Equipos");

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jMenu1.add(Crear);
        jMenu1.add(jSeparator1);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jMenu1.add(Modificar);
        jMenu1.add(jSeparator2);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jMenu1.add(Eliminar);
        jMenu1.add(jSeparator3);

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jMenu1.add(Cargar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Partidos");

        Simulacion.setText("Simulacion");
        Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulacionActionPerformed(evt);
            }
        });
        jMenu2.add(Simulacion);
        jMenu2.add(jSeparator4);

        Tabla.setText("Tabla");
        Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaActionPerformed(evt);
            }
        });
        jMenu2.add(Tabla);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
        String nombre=(JOptionPane.showInputDialog("Ingrese el nombre del equipo"));
        Equipo equi= new Equipo(nombre);
        equipos.add(equi);
        try {
            archivos();
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error fatal");
        }
        
    }//GEN-LAST:event_CrearActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarActionPerformed

    private void SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulacionActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel<String> equipobox=new DefaultComboBoxModel ();
        for(int i=0;i<equipos.size();i++){
            equipobox.addElement(equipos.get(i).getNombre());
        }
        Equipo1.setModel(equipobox);
        
        DefaultComboBoxModel<String> equipobox2=new DefaultComboBoxModel ();
        for(int i=0;i<equipos.size();i++){
            equipobox2.addElement(equipos.get(i).getNombre());
        }
        Equipo2.setModel(equipobox2);
        Simular.setVisible(rootPaneCheckingEnabled);
        Simular.pack();
    }//GEN-LAST:event_SimulacionActionPerformed

    private void TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaActionPerformed
        // TODO add your handling code here:
        ordenar();
        Posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PJ", "PG", "PE", "PP", "GF", "GC", "DG", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Posiciones);

        for(int i=0;i<equipos.size();i++){
            Object[] fila={
                equipos.get(i).getNombre(),
                equipos.get(i).getJugados(),
                equipos.get(i).getGanados(),
                equipos.get(i).getEmpatados(),
                equipos.get(i).getPerdidos(),
                equipos.get(i).getFavor(),
                equipos.get(i).getContra(),
                equipos.get(i).getDiferencia(),
                equipos.get(i).getPuntos(),
            };
            DefaultTableModel model = (DefaultTableModel) Posiciones.getModel();
            model.addRow(fila);
            Posiciones.setModel(model);
        }
        TablaPosiciones.setVisible(rootPaneCheckingEnabled);
        TablaPosiciones.pack();
    }//GEN-LAST:event_TablaActionPerformed

    private void BotonSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSimularActionPerformed
        // TODO add your handling code here:
        if(equipos.get(Equipo1.getSelectedIndex())==equipos.get(Equipo2.getSelectedIndex())){
            
        }else{
            SimularPartido(equipos.get(Equipo1.getSelectedIndex()),equipos.get(Equipo2.getSelectedIndex()));
            try {
                archivos();
            } catch (IOException ex) {
                System.out.println("Ha ocurrido un error fatal");
            }
        }
    }//GEN-LAST:event_BotonSimularActionPerformed

    public void SimularPartido(Equipo e1, Equipo e2){
        e1.setJugados(e1.getJugados()+1);
        e2.setJugados(e2.getJugados()+1);
        int gol1=0+r.nextInt(5);
        int gol2=0+r.nextInt(5);
        e1.setFavor(e1.getFavor()+gol1);
        e2.setFavor(e2.getFavor()+gol2);
        e1.setContra(e1.getContra()+gol2);
        e2.setContra(e2.getContra()+gol1);
        if(e1.getFavor()>e2.getFavor()){
            e1.setPuntos(e1.getPuntos()+3);
            e1.setGanados(e1.getGanados()+1);
            e2.setPerdidos(e2.getPerdidos()+1);
        }else if(e2.getFavor()>e1.getFavor()){
            e2.setPuntos(e2.getPuntos()+3);
            e2.setGanados(e2.getGanados()+1);
            e1.setPerdidos(e1.getPerdidos()+1);
        }else if(e1.getFavor()==e2.getFavor()){
            e1.setPuntos(e1.getPuntos()+1);
            e2.setPuntos(e2.getPuntos()+1);
            e1.setEmpatados(e1.getEmpatados()+1);
            e2.setEmpatados(e2.getEmpatados()+1);
        }
        e1.setDiferencia(e1.getDiferencia()+(gol1-gol2));
        e2.setDiferencia(e2.getDiferencia()+(gol2-gol1));
        String p1=String.valueOf(gol1);
        String p2=String.valueOf(gol2);
        Puntos1.setText(p1);
        Puntos2.setText(p2);
    }
    
    public void archivos() throws IOException{
        File archivo=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        String s="";
        for(int i=0;i<equipos.size();i++){
            s=s+equipos.get(i).toString()+"\n";
        } 
        try{
            archivo=new File("./Equipos.txt");
            fw=new FileWriter(archivo);
            bw=new BufferedWriter(fw);
            bw.write(s);
            bw.newLine();
            bw.flush();

        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error fatal");
        }
        bw.close();
        fw.close();
    }
    
    public void ordenar(){
        for (int i = 0; i < equipos.size() - 1; i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                System.out.println();
                if (equipos.get(i).getPuntos() < equipos.get(j).getPuntos()) {
                    Equipo temp=equipos.get(i);
                    equipos.set(i,equipos.get(j));
                    equipos.set(j, temp);
                    /*int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;*/
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        equipos.add(new Equipo("Hola"));
        equipos.add(new Equipo("Adios"));
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSimular;
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenuItem Crear;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JComboBox<String> Equipo1;
    private javax.swing.JComboBox<String> Equipo2;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JTable Posiciones;
    private javax.swing.JLabel Puntos1;
    private javax.swing.JLabel Puntos2;
    private javax.swing.JMenuItem Simulacion;
    private javax.swing.JDialog Simular;
    private javax.swing.JMenuItem Tabla;
    private javax.swing.JDialog TablaPosiciones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
