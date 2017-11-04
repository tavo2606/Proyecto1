/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.jfr.events.FileWriteEvent;
/**
 *
 * @author Tavo
 */
public class MenuAdminCatMusicaModif extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdminCatMusicaMostr
     */
    public MenuAdminCatMusicaModif() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        llenarCombo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListaCanciones = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        cmbNombre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo de música[Modificar]");
        setResizable(false);

        jLabel1.setText("Nombre de álbum: ");

        jLabel2.setText("Autor: ");

        jLabel3.setText("Categoría: ");

        jLabel4.setText("Precio: ");

        txtListaCanciones.setColumns(20);
        txtListaCanciones.setRows(5);
        jScrollPane1.setViewportView(txtListaCanciones);

        jLabel5.setText("Lista de canciones: ");

        jLabel6.setText("Cantidad disponible:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "{Categoría}", "Rock", "Merengue", "Blues", "Clásica", "Jazz", "Country", "Disco", "Funk", "Pop", "Reggae", "Salsa", "Otro" }));

        cmbNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "{Nombre}" }));
        cmbNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNombreItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad)
                            .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed
    
    private void llenarCombo(){
        try{
            String archivo = "CatMusica.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            
            while(  (linea = lector.readLine()) != null ){
                cmbNombre.addItem(linea.split(" ")[0].replaceAll("_", " "));
            }
        }catch(Exception e){JOptionPane.showMessageDialog(null, "No se encontro el archivo" + e, "Error", JOptionPane.ERROR_MESSAGE);}
    }
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String archivo = "CatMusica.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader("CatMusica.txt");
            BufferedReader lector = new BufferedReader(fr);

            ArrayList<String> listaMusica = new ArrayList();
            String linea;

            while ((linea = lector.readLine()) != null) {
                listaMusica.add(linea);
            }

            for (int i = 0; i < listaMusica.size(); i++) {
                if (listaMusica.get(i).split(" ")[0].replaceAll("_", " ").equals(cmbNombre.getSelectedItem().toString())) {
                    PrintWriter escritor = null;
                    FileWriter fichero = null;
                    String modMusic = cmbNombre.getSelectedItem().toString().replaceAll(" ", "_") + " "
                            + txtAutor.getText().replaceAll(" ", "_") + " "
                            + cmbCategoria.getSelectedItem().toString() + " "
                            + txtPrecio.getText() + " " + txtListaCanciones.getText().replaceAll(" ", "_").replaceAll("\n", ",") + " "
                            + txtCantidad.getText();
                    listaMusica.set(i, modMusic);
                    try {
                         fichero = new FileWriter(archivo);
                        escritor = new PrintWriter(fichero);
                        escritor.flush();
                        for (String musica : listaMusica) {
                            pw.write(musica);
                            pw.println();
                        }
                        escritor.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,);
                    }
                    JOptionPane.showMessageDialog(null, "Música modificado del catálogo", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            pw.close();

        } catch (Exception e) {
            String error = "No se encontro archivo " + e;
            JOptionPane.showConfirmDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        cmbNombre.setSelectedIndex(0);
        /*txtAutor.setText(null);
        txtCantidad.setText(null);
        txtListaCanciones.setText(null);
        txtPrecio.setText(null);
        cmbCategoria.setSelectedIndex(0);*/
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNombreItemStateChanged
        if(cmbNombre.getSelectedIndex() != 0){
            try {
                String archivo = "CatMusica.txt";
                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                FileReader fr = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(fr);

                String linea;

                while ((linea = lector.readLine()) != null) {
                    if (linea.split(" ")[0].replaceAll("_", " ").equals(cmbNombre.getSelectedItem().toString())) {
                        txtAutor.setText(linea.split(" ")[1].replaceAll("_", " "));
                        cmbCategoria.setSelectedItem(linea.split(" ")[2]);
                        txtPrecio.setText(linea.split(" ")[3]);
                        txtListaCanciones.setText(linea.split(" ")[4].replaceAll("_", " ").replaceAll(",", "\n"));
                        txtCantidad.setText(linea.split(" ")[5]);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se encontro el archivo" + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            txtAutor.setText(null);
            txtCantidad.setText(null);
            txtListaCanciones.setText(null);
            txtPrecio.setText(null);
            cmbCategoria.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_cmbNombreItemStateChanged

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
            java.util.logging.Logger.getLogger(MenuAdminCatMusicaModif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminCatMusicaModif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminCatMusicaModif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminCatMusicaModif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminCatMusicaModif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtListaCanciones;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
