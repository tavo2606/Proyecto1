/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Tavo
 */
public class Reporte4 extends javax.swing.JFrame {

    /**
     * Creates new form Reporte4
     */
    public Reporte4() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        grafic();
    }
    
    private void grafic() {
        DefaultPieDataset porciones;
        JFreeChart torta;

        porciones = new DefaultPieDataset();
        String[] listaCategorias = {"Terror","Acción","Suspenso","Comedia","Romance","Thriller","Animado","Drama","Otro"};

        for (String c : listaCategorias) {
            if (valor(c) > 0) {
                porciones.setValue(c + "(" + String.valueOf(valor(c)) + ")", valor(c));
            }
        }

        torta = ChartFactory.createPieChart3D("Discos de películas más vendidos y menos vendidos por categoría", porciones, true, true, false);
        BufferedImage graficoTorta = torta.createBufferedImage(panelGraficoTorta.getWidth(), panelGraficoTorta.getHeight());
        lblTorta.setSize(panelGraficoTorta.getSize());
        lblTorta.setIcon(new ImageIcon(graficoTorta));
        panelGraficoTorta.updateUI();
    }

    private int valor(String producto) {
        int cantidad = 0;
        try {
            String archivo = "CompPeliculas.txt";

            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);

            ArrayList<String> listaCompPeliculas = new ArrayList();
            String linea;

            while ((linea = lector.readLine()) != null) {
                listaCompPeliculas.add(linea);
            }

            for (int i = 0; i < listaCompPeliculas.size(); i++) {
                try {
                    String a = "CatPeliculas.txt";

                    FileReader fl2 = new FileReader(a);
                    BufferedReader lector2 = new BufferedReader(fl2);

                    ArrayList<String> listaPeliculas = new ArrayList();
                    String l;

                    while ((l = lector2.readLine()) != null) {
                        listaPeliculas.add(l);
                    }

                    for (int y = 0; y < listaPeliculas.size(); y++) {
                        if (listaCompPeliculas.get(i).split(" ")[2].equalsIgnoreCase(listaPeliculas.get(y).split(" ")[0])) {
                            if (listaPeliculas.get(y).split(" ")[2].equals(producto)) {
                                cantidad += 1;
                            }
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return cantidad;
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGraficoTorta = new javax.swing.JPanel();
        lblTorta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelGraficoTorta.setPreferredSize(new java.awt.Dimension(672, 349));

        javax.swing.GroupLayout panelGraficoTortaLayout = new javax.swing.GroupLayout(panelGraficoTorta);
        panelGraficoTorta.setLayout(panelGraficoTortaLayout);
        panelGraficoTortaLayout.setHorizontalGroup(
            panelGraficoTortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoTortaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTorta)
                .addContainerGap(701, Short.MAX_VALUE))
        );
        panelGraficoTortaLayout.setVerticalGroup(
            panelGraficoTortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoTortaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTorta)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGraficoTorta, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGraficoTorta, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTorta;
    private javax.swing.JPanel panelGraficoTorta;
    // End of variables declaration//GEN-END:variables
}