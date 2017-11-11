/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author Tavo
 */
public class Reporte3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Reporte3() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        panelGraficoTorta = new javax.swing.JPanel();
        lblTorta = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha2 = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrado[Reporte 5]");
        setResizable(false);

        jLabel1.setText("Rango de fecha: ");

        javax.swing.GroupLayout panelGraficoTortaLayout = new javax.swing.GroupLayout(panelGraficoTorta);
        panelGraficoTorta.setLayout(panelGraficoTortaLayout);
        panelGraficoTortaLayout.setHorizontalGroup(
            panelGraficoTortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoTortaLayout.createSequentialGroup()
                .addComponent(lblTorta, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGraficoTortaLayout.setVerticalGroup(
            panelGraficoTortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoTortaLayout.createSequentialGroup()
                .addComponent(lblTorta, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtFecha1.setText("00/0000");

        jLabel2.setText("-");

        txtFecha2.setText("00/0000");

        btnMostrar.setText("Mostrar Gráfico");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar))
                    .addComponent(panelGraficoTorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGraficoTorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        grafic();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void grafic() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        JFreeChart lineaG;
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                          "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        try{
            String archivo = "CompMusica.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            ArrayList<String> listaCompMusica = new ArrayList();
            String linea;
            
            while((linea = lector.readLine()) != null){
                listaCompMusica.add(linea);
            }
            
            int mes1,mes2,year1,year2;
            mes1 = Integer.parseInt(txtFecha1.getText().split("/")[0]);
            year1 = Integer.parseInt(txtFecha1.getText().split("/")[1]);
            
            mes2 = Integer.parseInt(txtFecha2.getText().split("/")[0]);
            year2 = Integer.parseInt(txtFecha2.getText().split("/")[1]);
            
            ArrayList<String> listaCantidad = new ArrayList();
            
            for(int i = 0; i<listaCompMusica.size();i++){
                // pos 3
                int mes,year;
                mes = Integer.parseInt(listaCompMusica.get(i).split(" ")[3].split("/")[1]);
                year = Integer.parseInt(listaCompMusica.get(i).split(" ")[3].split("/")[2]);
                
                if (mes >= mes1 && year >= year1) { // revisar
                    if (mes <= mes2 && year <= year2) {
                        listaCantidad.add(listaCompMusica.get(i).split(" ")[3]);
                    }
                }
            }
            
            dataset.setValue(0, "Meses", meses[mes1-1]);
            
            for(String fecha : listaCantidad){
                int m = Integer.parseInt(fecha.split("/")[1]);
                dataset.setValue(countEquals(fecha, listaCantidad), "Meses", meses[m-1]);
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        lineaG = ChartFactory.createLineChart("Cantidad de discos de música vendidas por rango de fecha", 
                "Mes", "Cantidad", dataset, PlotOrientation.VERTICAL, true, true ,false);

        BufferedImage graficoLinea = lineaG.createBufferedImage(panelGraficoTorta.getWidth(), panelGraficoTorta.getHeight());

        lblTorta.setSize(panelGraficoTorta.getSize());
        lblTorta.setIcon(new ImageIcon(graficoLinea));

        panelGraficoTorta.updateUI();
    }
    
    private int countEquals(String string, ArrayList<String> arrayList) {
        int count = 0;

        for (String item : arrayList) {
            if (string.split("/")[1].equalsIgnoreCase(item.split("/")[1])) {
                count += 1;
            }
        }

        return count;
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
            java.util.logging.Logger.getLogger(Reporte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTorta;
    private javax.swing.JPanel panelGraficoTorta;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtFecha2;
    // End of variables declaration//GEN-END:variables
}
