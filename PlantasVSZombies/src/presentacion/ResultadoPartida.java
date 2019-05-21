/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author admin
 */
public class ResultadoPartida extends javax.swing.JDialog {

    private static String mensaje;
    private static String resultado;
    private static int soles;
    private static int ngirasoles;
    private static int puntuacion;
    /**
     * Creates new form ResultadoPartida
     */
    public ResultadoPartida(java.awt.Frame parent, boolean modal, String mensaje, String resultado, int soles, int ngirasoles) {
        super(parent, modal);
        initComponents();
        
        this.mensaje = mensaje;
        this.resultado = resultado;
        this.soles = soles;
        this.ngirasoles = ngirasoles;
        
        mensajeLabel.setText(mensaje);
        resultadoLabel.setText(resultado);
        
        if (resultado.equals("Victoria")) {
            puntuacion = soles + ngirasoles*20;
            puntuacionLabel.setText("Puntuacion: "  + puntuacion);

        }
        
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirPartida = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();
        puntuacionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        salirPartida.setText("Salir");
        salirPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPartidaActionPerformed(evt);
            }
        });

        resultadoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoLabel.setText("jLabel1");

        mensajeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mensajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeLabel.setText("jLabel1");

        puntuacionLabel.setText("Puntuacion Total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(salirPartida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puntuacionLabel)
                            .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(mensajeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addGap(104, 104, 104)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(resultadoLabel)
                .addGap(43, 43, 43)
                .addComponent(puntuacionLabel)
                .addGap(34, 34, 34)
                .addComponent(salirPartida)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(mensajeLabel)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPartidaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        super.dispose();
    }//GEN-LAST:event_salirPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(ResultadoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultadoPartida dialog = new ResultadoPartida(new javax.swing.JFrame(), true, mensaje, resultado, soles, ngirasoles);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JLabel puntuacionLabel;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JButton salirPartida;
    // End of variables declaration//GEN-END:variables
}