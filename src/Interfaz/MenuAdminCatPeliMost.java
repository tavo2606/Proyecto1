/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tavo
 */
public class MenuAdminCatPeliMost extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdminCatPeliMost
     */
    public MenuAdminCatPeliMost() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        llenarTabla();
    }
    
    private void llenarTabla(){
        // Cambios en la tabla
        String[] columnas = new String[] {"Nombre de película", "Autor", "Categoría", "Precio", "Cantidad"}; // columnas de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas); // asignar el modelo con las columnas
        jTable1.setModel(modelo);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS); // Las columnas se ajustan automaticamente
        jTable1.setFillsViewportHeight(true); // ajustar las casillas de la tabla para que no se corte los datos de la tabla
        jScrollPane1.setHorizontalScrollBarPolicy(
                jScrollPane1.HORIZONTAL_SCROLLBAR_AS_NEEDED); // Scroll pane vertical y horizontalmente como se necesiten
        jScrollPane1.setVerticalScrollBarPolicy(
                jScrollPane1.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        
        //Datos de la tabla
        try{
            String archivo = "CatPeliculas.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            
            while( (linea = lector.readLine()) != null ){
                String nom, aut, cate, preci, canti;
                nom = linea.split(" ")[0].replaceAll("_", " ");
                aut = linea.split(" ")[1].replaceAll("_", " ");
                cate = linea.split(" ")[2];
                preci = linea.split(" ")[3];
                canti = linea.split(" ")[4];
                modelo.addRow(new Object[]{nom, aut, cate, preci, canti});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo de películas[Mostrar]");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setDragEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(MenuAdminCatPeliMost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminCatPeliMost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminCatPeliMost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminCatPeliMost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminCatPeliMost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
