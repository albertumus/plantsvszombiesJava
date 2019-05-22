/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import NPC.*;
import JuegoPrincipal.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class JuegoPrincipal extends javax.swing.JFrame {
    
    private static String dificultad;
    private static Jugador j;
    private static Tablero tableroJuego;

    /**
     * Creates new form JuegoPrincipal
     */
    public JuegoPrincipal(String Dificultad, Jugador j) {
        initComponents();
                
        this.dificultad = Dificultad;
        this.j = j;
        this.userLogged.setText(j.getNombre());
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
        jLabel2 = new javax.swing.JLabel();
        userLogged = new javax.swing.JLabel();
        C00 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C14 = new javax.swing.JLabel();
        C15 = new javax.swing.JLabel();
        C16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        tableroLabel.setTabSize(2);
        tableroLabel.setFocusable(false);
        tableroLabel.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tableroLabel);
        tableroLabel.getAccessibleContext().setAccessibleDescription("");

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

        jLabel2.setText("Usuario Logueado:");

        userLogged.setText("jLabel3");

        C00.setText("C|00");

        jLabel5.setBackground(new java.awt.Color(240, 240, 0));
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        C1.setText("C|01");

        C2.setText("C|02");

        C3.setText("C|03");

        C4.setText("C|04");

        C5.setText("C|05");

        C6.setBackground(new java.awt.Color(240, 240, 0));
        C6.setText("C|06");

        jLabel11.setBackground(new java.awt.Color(240, 240, 0));
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel12.setBackground(new java.awt.Color(240, 240, 0));
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel13.setBackground(new java.awt.Color(240, 240, 0));
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        C10.setText("C|10");

        C11.setText("C|11");

        C12.setText("C|12");

        C13.setText("C|13");

        C14.setText("C|14");

        C15.setText("C|15");

        C16.setText("C|16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(54, 54, 54))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C10)
                                        .addGap(35, 35, 35)
                                        .addComponent(C11)
                                        .addGap(35, 35, 35)
                                        .addComponent(C12)
                                        .addGap(33, 33, 33)
                                        .addComponent(C13)
                                        .addGap(35, 35, 35)
                                        .addComponent(C14)
                                        .addGap(36, 36, 36)
                                        .addComponent(C15)
                                        .addGap(47, 47, 47)
                                        .addComponent(C16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(C00)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(turnoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(girasolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userLogged)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C1)
                                        .addGap(31, 31, 31)
                                        .addComponent(C2)
                                        .addGap(31, 31, 31)
                                        .addComponent(C3)
                                        .addGap(33, 33, 33)
                                        .addComponent(C4)
                                        .addGap(39, 39, 39)
                                        .addComponent(C5)
                                        .addGap(44, 44, 44)
                                        .addComponent(C6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dificultadLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(turnoLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(solesLabel)
                                    .addComponent(salirButton))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(comandosButton)
                                .addContainerGap())))))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(turnoButton)
                        .addGap(18, 18, 18)
                        .addComponent(girasolButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C00)
                            .addComponent(C1)
                            .addComponent(C2)
                            .addComponent(C3)
                            .addComponent(C4)
                            .addComponent(C5)
                            .addComponent(C6))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(salirButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comandosButton)
                        .addContainerGap(218, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C10)
                            .addComponent(C11)
                            .addComponent(C12)
                            .addComponent(C13)
                            .addComponent(C14)
                            .addComponent(C15)
                            .addComponent(C16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel12)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userLogged)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girasolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girasolButtonActionPerformed
        // TODO add your handling code here:
        ColocarPlanta colocarPlanta = new ColocarPlanta(this, true,tableroJuego);
        tableroLabel.setText(tableroJuego.pintarTablero());
        pintarTableroIconos();
        
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
            pintarTableroIconos();
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
            pintarTableroIconos();
            solesLabel.setText("Soles: " + Integer.toString(tableroJuego.getSoles()));
            turnoLabel.setText("Turno: " + String.valueOf(tableroJuego.getTurno()));
            
            // Revisa Acciones de Victoria
            if(tableroJuego.getnZombies() == tableroJuego.getZombiesMatados() && !tableroJuego.isTerminado()){
                    tableroJuego.setTerminado(true);
                    tableroLabel.setText(tableroJuego.pintarTablero());
                    pintarTableroIconos();
                    String mensaje = "¡¡HAN GANADO LAS PLANTAS!!";
                    ResultadoPartida r = new ResultadoPartida(this, true, mensaje, "Victoria", tableroJuego.getSoles(), 
                            tableroJuego.getnGirasoles(), tableroJuego.getlLanzaGuisantes().size(), tableroJuego.getDificultad(),
                            j);
                    this.dispose();
                }
            if(tableroJuego.getlZombie().size() == 0 && tableroJuego.getTurno() > 30 && !tableroJuego.isTerminado()){
                    tableroJuego.setTerminado(true);
                    tableroLabel.setText(tableroJuego.pintarTablero());
                    pintarTableroIconos();
                    String mensaje = "¡¡HAN GANADO LAS PLANTAS!!";
                    ResultadoPartida r = new ResultadoPartida(this, true, mensaje, "Victoria", tableroJuego.getSoles(), 
                            tableroJuego.getnGirasoles(), tableroJuego.getlLanzaGuisantes().size(), tableroJuego.getDificultad(),
                            j);
                    this.dispose();
                    
                }
            for (Zombie z : tableroJuego.getlZombie() ) {
                if (z.getPosCol() == 0 && !tableroJuego.isTerminado()) {
                    tableroJuego.setTerminado(true);
                    tableroLabel.setText(tableroJuego.pintarTablero());
                    pintarTableroIconos();
                    String mensaje = "¡¡HAN GANADO LOS ZOMBIES!!";
                    ResultadoPartida r = new ResultadoPartida(this, true, mensaje, "Derrota", tableroJuego.getSoles(), 
                            tableroJuego.getnGirasoles(), tableroJuego.getlLanzaGuisantes().size(), tableroJuego.getDificultad(),
                             j);
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

    public void pintarTableroIconos() {
        this.C00.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][0]));
        this.C1.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][1]));
        this.C2.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][2]));
        this.C3.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][3]));
        this.C4.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][4]));
        this.C5.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][5]));
        this.C6.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[0][6]));
        
        this.C10.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][0]));
        this.C11.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][1]));
        this.C12.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][2]));
        this.C13.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][3]));
        this.C14.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][4]));
        this.C15.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][5]));
        this.C16.setIcon(pintarIconos(tableroJuego.getCasillasTablero()[1][6]));


    }
    
    public ImageIcon pintarIconos(Casilla c) {
        ImageIcon ic = new ImageIcon("");
        if (c.isOcupado()) {
            if(c.getNpc() instanceof Girasol) {
                String ruta = "";
                switch(c.getNpc().getVida()) {
                    case 0:
                        ruta = "girasol1.jpg";
                    break;
                }
                ImageIcon icG = new ImageIcon("./Iconos/" +ruta);
                return icG;
            } else if(c.getNpc() instanceof LanzaGuisantes) {
                String ruta = "";
                switch(c.getNpc().getVida()) {
                    case 0:
                        ruta = "lanzaguisantes1.jpg";
                    break;
                    case 1:
                        ruta = "lanzaguisantes2.jpg";
                    break;
                    case 2:
                        ruta = "lanzaguisantes3.jpg";
                    break;
                }
                ImageIcon icG = new ImageIcon("./Iconos/" +ruta);
                return icG;
            } else if(c.getNpc() instanceof Zombie) {
                ImageIcon icG = new ImageIcon("./Iconos/zombie.jpg");
                return icG;
            }
        }
        
        return ic;
        
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
                new JuegoPrincipal(dificultad,j).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C00;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C11;
    private javax.swing.JLabel C12;
    private javax.swing.JLabel C13;
    private javax.swing.JLabel C14;
    private javax.swing.JLabel C15;
    private javax.swing.JLabel C16;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JButton comandosButton;
    private javax.swing.JLabel dificultadLabel;
    private javax.swing.JButton girasolButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel solesLabel;
    private javax.swing.JTextArea tableroLabel;
    private javax.swing.JButton turnoButton;
    private javax.swing.JLabel turnoLabel;
    private javax.swing.JLabel userLogged;
    // End of variables declaration//GEN-END:variables
}
