/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import NPC.*;
import JuegoPrincipal.*;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class JuegoPrincipal extends javax.swing.JFrame {
    
    private static String dificultad;
    private static Tablero tableroJuego;

    /**
     * Creates new form JuegoPrincipal
     */
    public JuegoPrincipal(String Dificultad) {
        initComponents();
        
        this.dificultad = Dificultad;
        // Creacion de un nuevo tablero
        this.tableroJuego = new Tablero(dificultad.toLowerCase());
        System.out.println(tableroJuego.getTurnoInificialZombies());
        System.out.println(tableroJuego.getDificultad());
        
        // Colocacion de los textos en los labels
        this.tableroLabel.setText(tableroJuego.pintarTablero());
        this.dificultadLabel.setText(Dificultad);
        this.solesLabel.setText("Soles: " + Integer.toString(tableroJuego.getSoles()));
        this.turnoLabel.setText("Turno: "  + Integer.toString(tableroJuego.getTurno()));
        
        
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

        girasolButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dificultadLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableroLabel = new javax.swing.JTextArea();
        turnoLabel = new javax.swing.JLabel();
        solesLabel = new javax.swing.JLabel();
        turnoButton = new javax.swing.JButton();
        comandosButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        girasolButton.setText("Colocar Planta");
        girasolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girasolButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Partida: 7x7");

        dificultadLabel.setText("Dificultad");

        tableroLabel.setEditable(false);
        tableroLabel.setColumns(15);
        tableroLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tableroLabel.setRows(2);
        tableroLabel.setFocusable(false);
        tableroLabel.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tableroLabel);

        turnoLabel.setText("Turno:");

        solesLabel.setText("Soles:");

        turnoButton.setText("Siguiente Turno");
        turnoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoButtonActionPerformed(evt);
            }
        });

        comandosButton.setText("Ayuda");
        comandosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comandosButtonActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(turnoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(girasolButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(comandosButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dificultadLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turnoLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solesLabel)
                    .addComponent(salirButton))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dificultadLabel)
                    .addComponent(turnoLabel)
                    .addComponent(solesLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(turnoButton)
                        .addGap(18, 18, 18)
                        .addComponent(girasolButton)
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comandosButton)
                            .addComponent(salirButton))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girasolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girasolButtonActionPerformed
        // TODO add your handling code here:
        ColocarPlanta colocarPlanta = new ColocarPlanta(this, true,tableroJuego);
        tableroLabel.setText(tableroJuego.pintarTablero());
        this.solesLabel.setText("Soles: " + Integer.toString(tableroJuego.getSoles()));
    }//GEN-LAST:event_girasolButtonActionPerformed

    private void turnoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoButtonActionPerformed
        // TODO add your handling code here:
        
            boolean saleZombieC = tableroJuego.saleZombie(tableroJuego.getTurnoZombies(), tableroJuego.getTurno());
            int numeroZombiesSalen = tableroJuego.zombiesaInstanciar();
            for(int j=0;j<numeroZombiesSalen;j++) {
                if(saleZombieC) {
                    tableroJuego.instanciarZombie();
                }   
            }
            System.out.println("Sale zombie = " + saleZombieC);
            System.out.println("Numero zombies salen: " + numeroZombiesSalen);
            
            tableroLabel.setText(tableroJuego.pintarTablero());
            System.out.println(tableroJuego.pintarTablero());

            // Acciones Repetitivas
            tableroJuego.setSoles(tableroJuego.getnGirasoles()*10);
            tableroJuego.dispararLanzaGuisantes();
            tableroJuego.moverZombies();
            tableroJuego.setPuedeColocarLanzaGuisantes(true);
            tableroJuego.setPuedeColocarGirasol(true);
            tableroJuego.setPuedeColocarNuez(true);
            tableroJuego.setTurno(1);
            
            // Actualizacion de tablero
            tableroLabel.setText(tableroJuego.pintarTablero());
            solesLabel.setText("Soles: " + Integer.toString(tableroJuego.getSoles()));
            turnoLabel.setText("Turno: " + String.valueOf(tableroJuego.getTurno()));
            
            // Revisa Acciones de Victoria
            if(tableroJuego.getnZombies() == tableroJuego.getZombiesMatados() && !tableroJuego.isTerminado()){
                    tableroJuego.setTerminado(true);
                    tableroLabel.setText(tableroJuego.pintarTablero());
                    String mensaje = "¡¡HAN GANADO LAS PLANTAS!!";
                    ResultadoPartida r = new ResultadoPartida(this, true, mensaje, "Victoria", tableroJuego.getSoles(), 
                            tableroJuego.getnGirasoles(), tableroJuego.getlLanzaGuisantes().size(), tableroJuego.getDificultad());
                    this.dispose();
                }
            if(tableroJuego.getlZombie().size() == 0 && tableroJuego.getTurno() > 30 && !tableroJuego.isTerminado()){
                    tableroJuego.setTerminado(true);
                    tableroLabel.setText(tableroJuego.pintarTablero());
                    String mensaje = "¡¡HAN GANADO LAS PLANTAS!!";
                    ResultadoPartida r = new ResultadoPartida(this, true, mensaje, "Victoria", tableroJuego.getSoles(), 
                            tableroJuego.getnGirasoles(), tableroJuego.getlLanzaGuisantes().size(), tableroJuego.getDificultad());
                    this.dispose();
                    
                }
            for (Zombie z : tableroJuego.getlZombie() ) {
                if (z.getPosCol() == 0 && !tableroJuego.isTerminado()) {
                    tableroJuego.setTerminado(true);
                    tableroLabel.setText(tableroJuego.pintarTablero());
                    String mensaje = "¡¡HAN GANADO LOS ZOMBIES!!";
                    ResultadoPartida r = new ResultadoPartida(this, true, mensaje, "Derrota", tableroJuego.getSoles(), 
                            tableroJuego.getnGirasoles(), tableroJuego.getlLanzaGuisantes().size(), tableroJuego.getDificultad());
                    this.dispose();
                } 
            }

    }//GEN-LAST:event_turnoButtonActionPerformed

    private void comandosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comandosButtonActionPerformed
        // TODO add your handling code here:
        //ComandosAyuda comandosAyuda = new ComandosAyuda(this,true);
        String infoBasica = "N <filas> <columnas> <Dificultad>: Nueva partida (Dificultad: BAJA, MEDIA,\n" +
        "        ALTA, IMPOSIBLE).\n" +
        "        G <fila> <columna>: colocar girasol. Únicamente se podrá añadir un nuevo\n" +
        "        Girasol por turno y si tiene el número suficiente de soles. No podrá añadir un\n" +
        "        Girasol en una casilla ocupada por otra planta o por un zombi.\n" +
        "        L <fila> <columna>: colocar LanzaGuisantes. Únicamente se podrá añadir un\n" +
        "        nuevo LanzaGuisantes por turno y si tiene el número suficiente de soles. No\n" +
        "        podrá añadir un LanzaGuisantes en una casilla ocupada por otra planta o por un\n" +
        "        zombi.\n" +
        "        S: Salir de la aplicación.\n" +
        "        <Enter> (Ahora 'E'): Pasar Turno\n";
        JOptionPane.showMessageDialog(this, infoBasica, "Informacion Básica", WIDTH);
    }//GEN-LAST:event_comandosButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPrincipal(dificultad).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comandosButton;
    private javax.swing.JLabel dificultadLabel;
    private javax.swing.JButton girasolButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel solesLabel;
    private javax.swing.JTextArea tableroLabel;
    private javax.swing.JButton turnoButton;
    private javax.swing.JLabel turnoLabel;
    // End of variables declaration//GEN-END:variables
}
