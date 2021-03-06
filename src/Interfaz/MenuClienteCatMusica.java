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
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tavo
 */
public class MenuClienteCatMusica extends javax.swing.JFrame {

    /**
     * Creates new form MenuClienteCatMusica
     */
    
    DefaultListModel modeloComprar = new DefaultListModel();
    String usuario;
    
    public MenuClienteCatMusica(String u) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.usuario = u;
    }

    private MenuClienteCatMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnanadir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaAlbumes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCompras = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo de música");
        setResizable(false);

        btnComprar.setText("Comprar");
        btnComprar.setEnabled(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoría: ");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "{Categoría}", "Rock", "Merengue", "Blues", "Clásica", "Jazz", "Country", "Disco", "Funk", "Pop", "Reggae", "Salsa", "Otro" }));
        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });

        jLabel2.setText("Lista de Álbumes: ");

        jLabel3.setText("Lista de Compras:");

        btnanadir.setText("Añadir a la lista");
        btnanadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar: ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        listaAlbumes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaAlbumes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlbumesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaAlbumes);

        txtCompras.setEditable(false);
        txtCompras.setColumns(20);
        txtCompras.setRows(5);
        jScrollPane2.setViewportView(txtCompras);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtDetalles.setEditable(false);
        txtDetalles.setColumns(20);
        txtDetalles.setRows(5);
        jScrollPane1.setViewportView(txtDetalles);

        jLabel5.setText("Detalles del Álbum: ");

        jLabel6.setText("Total: ");

        txtTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnanadir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(205, 205, 205))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnComprar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVolver))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComprar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnanadir)
                                .addComponent(jLabel6)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
        DefaultListModel modelolista = new DefaultListModel();
        try{
            String archivo = "CatMusica.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            
            
            while((linea = lector.readLine()) != null){
                if(linea.split(" ")[2].equalsIgnoreCase(cmbCategoria.getSelectedItem().toString())){
                    modelolista.addElement(linea.split(" ")[0].replaceAll("_", " "));
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        listaAlbumes.setModel(modelolista);
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    private void btnanadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanadirActionPerformed
        String linea = txtCompras.getText();
        txtCompras.setText(linea + (String)listaAlbumes.getSelectedValue() + "\n");
        
        if(!btnComprar.isEnabled()){
            btnComprar.setEnabled(true);
        }
        
        try {
            String archivo = "CatMusica.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea2;
            
            while((linea2 = lector.readLine())!=null){
                if(listaAlbumes.getSelectedValue().equalsIgnoreCase(linea2.split(" ")[0].replaceAll("_", " "))){
                    if(txtTotal.getText().isEmpty()){
                        txtTotal.setText(linea2.split(" ")[3]);
                    }else{     
                        int precio = Integer.parseInt(linea2.split(" ")[3]);
                        int total = Integer.parseInt(txtTotal.getText()) + precio;
                        txtTotal.setText(String.valueOf(total));
                    }
                }
            }
            
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_btnanadirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String archivo = "CatMusica.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            
            DefaultListModel modelo = new DefaultListModel();
            
            boolean bandera = false, bandera2 = false;
            
            while((linea = lector.readLine())!=null){
                //busqueda por nombre de disco
                if(txtBuscar.getText().equalsIgnoreCase(linea.split(" ")[0].replaceAll("_", " "))){
                    modelo.addElement(linea.split(" ")[0].replaceAll("_", " "));
                    bandera = true;
                    bandera2 = true;
                }//busqueda por autor
                else{
                    if(txtBuscar.getText().equalsIgnoreCase(linea.split(" ")[1].replace("_", " "))){
                        modelo.addElement(linea.split(" ")[0].replaceAll("_", " "));
                        bandera2 = true;
                    }//busqueda por precio (rango)
                    else{
                        if(!bandera){
                            if(isNumeric(txtBuscar.getText().split("-")[0])){
                                int rango1 = Integer.parseInt(txtBuscar.getText().split("-")[0]);
                                int rango2 = Integer.parseInt(txtBuscar.getText().split("-")[1]);
                                int precio = Integer.parseInt(linea.split(" ")[3]);

                                if (precio >= rango1 && precio <= rango2) {
                                    modelo.addElement(linea.split(" ")[0].replaceAll("_", " "));
                                    bandera2 = true;
                                }
                            }
                        }
                    }
                }                                         
            }
            
            if(!bandera2){
                JOptionPane.showMessageDialog(null, "Datos no encotrados.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            listaAlbumes.setModel(modelo);
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private boolean isNumeric(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    private void listaAlbumesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlbumesValueChanged
        // TODO add your handling code here:
        try {
            String archivo = ("CatMusica.txt");
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            
            while((linea=lector.readLine()) != null){
                if(linea.split(" ")[0].replaceAll("_", " ").equalsIgnoreCase((String)listaAlbumes.getSelectedValue())){
                    txtDetalles.setText("Nombre: " + linea.split(" ")[0].replaceAll("_", " ") + "\n" +
                                        "Autor: " + linea.split(" ")[1].replaceAll("_", " ") + "\n" +
                                        "Categoría: " + linea.split(" ")[2] + "\n" +
                                        "Precio: " + linea.split(" ")[3] + "\n" +
                                        "Lista de Canciones:\n\t" + linea.split(" ")[4].replaceAll("_", " ").replaceAll(",", "\n\t") );
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_listaAlbumesValueChanged

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            String archivo = "CatMusica.txt";
            
            FileReader fr = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(fr);
            
            String linea;
            ArrayList<String> listaComprar = new ArrayList();
            ArrayList<String> listaPreOrden = new ArrayList();
            
            while((linea = lector.readLine())!=null){
                for(String producto : txtCompras.getText().split("\n")){
                    if(producto.equalsIgnoreCase(linea.split(" ")[0].replaceAll("_", " "))){
                        if(Integer.parseInt(linea.split(" ")[5]) > 0){
                            listaComprar.add(producto);
                        }else{
                            listaPreOrden.add(producto);
                        }
                    }
                }
            }
            
            if (listaPreOrden.isEmpty()) {
                int opc = JOptionPane.showConfirmDialog(null, "Desea realizar la compra? (Total: " + txtTotal.getText() + ")", "Comprar", JOptionPane.YES_NO_OPTION);
                if (opc == JOptionPane.YES_OPTION) {
                    pago(listaComprar);
                    JOptionPane.showConfirmDialog(null, "Compra realizada exitosamente.", "Comprar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Compra no realizada", "Comprar", JOptionPane.DEFAULT_OPTION);
                }

            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Los siguientes albumes no estan en existencia: \n"
                        + listaPreOrden.toString() + "\nDesea agregarlo a la lista de preorden?", "PreOrden", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    for (String p : listaPreOrden) {
                        preorden(p, listaPreOrden);
                    }
                }
                if (!listaComprar.isEmpty()) {
                    int opc = JOptionPane.showConfirmDialog(null, "Desea realizar la compra? (Total: " + txtTotal.getText() + ")", "Comprar", JOptionPane.YES_NO_OPTION);
                    if (opc == JOptionPane.YES_OPTION) {
                        pago(listaComprar);
                        JOptionPane.showConfirmDialog(null, "Compra realizada exitosamente.", "Comprar", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Compra no realizada", "Comprar", JOptionPane.DEFAULT_OPTION);
                    }
                }
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        cmbCategoria.setSelectedIndex(0);
        listaAlbumes.setModel(new DefaultListModel<>());
        txtBuscar.setText(null);
        txtDetalles.setText(null);
        txtCompras.setText(null);
        txtTotal.setText(null);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void preorden(String prodcuto, ArrayList<String> listaPreOrden){
        try{
            
            String archivo = "PreMusica.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader("PreMusica.txt");
            BufferedReader lector = new BufferedReader(fr);
            
            ArrayList<String> listaPreOrdenes = new ArrayList();
            String linea;
            
            while((linea=lector.readLine()) != null){
                listaPreOrdenes.add(linea);
            }
            
            String newPreOrden = prodcuto.replaceAll(" ", "_") + " " + "Tipo:Musica" + " " + countEquals(prodcuto, listaPreOrden);
            
            listaPreOrdenes.add(newPreOrden);
            
            PrintWriter escritor = null;
            FileWriter fichero = null;
            
            try {
                fichero = new FileWriter(archivo);
                escritor = new PrintWriter(fichero);
                escritor.flush();
                
                for(String item:listaPreOrdenes){
                    pw.write(item);
                    pw.println();
                }
                                
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, "Archivo no encontrado " + e , "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            pw.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void pago(ArrayList<String> listaComprar){
        try {
            String archivo = "CatMusica.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader("CatMusica.txt");
            BufferedReader lector = new BufferedReader(fr);
            
            ArrayList<String> listaMusica = new ArrayList();
            String linea;
            
            while((linea = lector.readLine()) != null){
                listaMusica.add(linea);
            }
            
            for (int i = 0; i < listaMusica.size(); i++) {
                for (String producto : listaComprar) {
                    if (listaMusica.get(i).split(" ")[0].replaceAll("_", " ").equalsIgnoreCase(producto)) {
                        int cantidadProducto = Integer.parseInt(listaMusica.get(i).split(" ")[5]) - countEquals(producto, listaComprar);
                        String newMusic = listaMusica.get(i).split(" ")[0] + " " + listaMusica.get(i).split(" ")[1] + " "
                                + listaMusica.get(i).split(" ")[2] + " "
                                + listaMusica.get(i).split(" ")[3] + " " 
                                + listaMusica.get(i).split(" ")[4] + " " + cantidadProducto;
                        listaMusica.set(i, newMusic);
                        guardarRecibo(producto);
                    }
                }
            }

            PrintWriter escritor = null;
            FileWriter fichero = null;

            try {
                fichero = new FileWriter(archivo);
                escritor = new PrintWriter(fichero);
                escritor.flush();
                for (String pelicula : listaMusica) {
                    pw.write(pelicula);
                    pw.println();
                }
                escritor.close();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            pw.close();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Archino no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void guardarRecibo(String prodcuto){
        try{
            
            String archivo = "CompMusica.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader("CompMusica.txt");
            BufferedReader lector = new BufferedReader(fr);
            
            ArrayList<String> listaRecibo = new ArrayList();
            String linea;
            
            while((linea=lector.readLine()) != null){
                listaRecibo.add(linea);
            }
            
            Calendar c1 = Calendar.getInstance();
            int day = c1.get(Calendar.DATE),month = c1.get(Calendar.MONTH) + 1,year = c1.get(Calendar.YEAR);
            String fecha = String.valueOf( day + "/" + month+ "/" + year);
            
            String newRecibo = usuario.split(" ")[2] + " " + usuario.split(" ")[3] + " " +
                               prodcuto.replaceAll(" ", "_") + " " + fecha;
            
            listaRecibo.add(newRecibo);
            
            PrintWriter escritor = null;
            FileWriter fichero = null;
            
            try {
                fichero = new FileWriter(archivo);
                escritor = new PrintWriter(fichero);
                escritor.flush();
                
                for(String item:listaRecibo){
                    pw.write(item);
                    pw.println();
                }
                                
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, "Archivo no encontrado " + e , "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            pw.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private int countEquals(String string, ArrayList<String> arrayList){
        int count = 0;
        
        for(String item: arrayList){
            if(string.equalsIgnoreCase(item)){
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
            java.util.logging.Logger.getLogger(MenuClienteCatMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClienteCatMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClienteCatMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClienteCatMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClienteCatMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnanadir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaAlbumes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtCompras;
    private javax.swing.JTextArea txtDetalles;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
