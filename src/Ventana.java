
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class Ventana extends javax.swing.JFrame {
public Grafo grafo1= new Grafo();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Unidad 4 | Práctica 1");
        setResizable(false);
        
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
        txtQuitarLazo2 = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        txtCrear = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        btnEnlazar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        txtQuitarLazo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnQuitarLazo = new javax.swing.JButton();
        btnGenerarLista = new javax.swing.JButton();
        tbnCamino = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtLista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCamino = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Crear dato:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Quitar enlace:");

        txtQuitarLazo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnCrear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtCrear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("Crea un grafo");

        btnSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMatriz.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMatriz.setText("Generar matriz de adyacencia");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Con:");

        txtValor2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnEnlazar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEnlazar.setText("Enlazar");
        btnEnlazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnlazarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Enlazar:");

        txtValor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Eliminar dato:");

        txtEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtQuitarLazo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Con:");

        btnQuitarLazo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnQuitarLazo.setText("Desenlazar");
        btnQuitarLazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarLazoActionPerformed(evt);
            }
        });

        btnGenerarLista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGenerarLista.setText("Generar lista de adyacencia");
        btnGenerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarListaActionPerformed(evt);
            }
        });

        tbnCamino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbnCamino.setText("Verificar camino");
        tbnCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCaminoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese un camino:");

        txtLista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Genere una lista:");

        txtCamino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingrese un camino (EJEMPLO: Vertice1, Vertice2, Vertice3,....)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuitarLazo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuitarLazo2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuitarLazo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtValor1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCrear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEnlazar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCamino)
                            .addComponent(txtLista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGenerarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbnCamino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnEnlazar)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel5)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuitarLazo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtQuitarLazo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnQuitarLazo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarLista)
                    .addComponent(jLabel8)
                    .addComponent(txtLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tbnCamino)
                    .addComponent(txtCamino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int datos;
    String c="";
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try{
            datos++;
            char valor=txtCrear.getText().toUpperCase().charAt(0);
            boolean respuesta = grafo1.insertarVertice(valor);
            c+=valor+"/";
            String mensaje="Error, no se insertó el dato.";
            if(respuesta) mensaje="Se insertó correctamente.";
            lblMensaje.setText("Se creó '"+valor+"' correctamente.");
            txtCrear.setText("");
            
        }catch(java.lang.StringIndexOutOfBoundsException error1){
            showMessageDialog(null,"Ingrese un valor a crear.");
            datos--;
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
            char valor=txtEliminar.getText().toUpperCase().charAt(0);
            boolean respuesta = grafo1.eliminarVertice(valor);
            String mensaje="Error, no se eliminó el dato.";
            if(respuesta){
                mensaje="Se eliminó '"+valor+"' correctamente.";
                datos--;
            }
            lblMensaje.setText(mensaje);
            txtEliminar.setText("");
       }catch(java.lang.StringIndexOutOfBoundsException error1){
           datos++;
           showMessageDialog(this,"No se eliminó el dato.");
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        boolean matriz[][]=grafo1.generarMatriz();
        String vector[]=c.split("/");
        String cad="  ";
        for (int i = 0; i < datos; i++) {
            cad+=vector[i]+" ";
        }
        for (int i = 0; i < datos; i++) {
            cad+="\n"+vector[i]+" ";
            for (int j = 0; j < datos; j++) {
                cad+=matriz[i][j] ? " 1 " : " 0 ";
            }
        }
        showMessageDialog(this,cad);
        
    }//GEN-LAST:event_btnMatrizActionPerformed

    private void btnEnlazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnlazarActionPerformed
        try{
            char v1=txtValor1.getText().toUpperCase().charAt(0),v2=txtValor2.getText().toUpperCase().charAt(0);
            boolean respuesta = grafo1.insertarArista(v1, v2);
            String mensaje="Error, no se enlazó el dato";
            if(respuesta)mensaje="Se enlazó '"+v1+"' con '"+v2+"'.";
            lblMensaje.setText(mensaje);
            txtValor1.setText("");txtValor2.setText("");
        }catch(java.lang.StringIndexOutOfBoundsException error1){
            showMessageDialog(this,"Verifique los datos.");
        }
        
    }//GEN-LAST:event_btnEnlazarActionPerformed

    private void btnQuitarLazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarLazoActionPerformed
        try{
            char v1=txtQuitarLazo1.getText().toUpperCase().charAt(0),v2=txtQuitarLazo2.getText().toUpperCase().charAt(0);
            boolean respuesta = grafo1.eliminarArista(v1, v2);
            String mensaje="Error, no se quitó el enlace";
            if(respuesta)mensaje="Se quitó el enlace de '"+v1+"' con '"+v2+"'.";
            lblMensaje.setText(mensaje);
            txtQuitarLazo1.setText("");txtQuitarLazo2.setText("");
        }catch(java.lang.StringIndexOutOfBoundsException error1){
            showMessageDialog(this,"No se quitaron los lazos.");
        }
    }//GEN-LAST:event_btnQuitarLazoActionPerformed

    private void btnGenerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarListaActionPerformed
        try{
        
            char d=txtLista.getText().toUpperCase().charAt(0);
            if(datos>0){
                showMessageDialog(this,grafo1.generarLista((char)d));
            }
        }catch(java.lang.NullPointerException error1){
            showMessageDialog(null,"Ocurrió un error.");
        }catch(java.lang.StringIndexOutOfBoundsException error2){
            showMessageDialog(null,"Ocurrió un error.");
        }
    }//GEN-LAST:event_btnGenerarListaActionPerformed

    private void tbnCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCaminoActionPerformed
        String cad = txtCamino.getText().trim();
        
        if(cad.equals("")){
            showMessageDialog(null,lblMensaje);
            return;
        }
        if(cad.matches("^\\S[A-z0-9]?[,]?([A-z0-9][,])*[A-z0-9]?$")){
            String t = txtCamino.getText().trim().toUpperCase().replaceAll(",", "");
            boolean respuesta = grafo1.validarCamino(t.toCharArray());
            String res="Error, camino no encontrado.";
            if(respuesta)res="El camino sí existe.";
            showMessageDialog(null,res);
            
        }
        txtCamino.setText("");
    }//GEN-LAST:event_tbnCaminoActionPerformed

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
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnlazar;
    private javax.swing.JButton btnGenerarLista;
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnQuitarLazo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JButton tbnCamino;
    private javax.swing.JTextField txtCamino;
    private javax.swing.JTextField txtCrear;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtLista;
    private javax.swing.JTextField txtQuitarLazo1;
    private javax.swing.JTextField txtQuitarLazo2;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables

    private void showMessageDialgo(Ventana aThis, String error_verifique_los_datos_a_llenar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}