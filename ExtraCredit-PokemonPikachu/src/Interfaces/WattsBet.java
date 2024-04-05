
package Interfaces;

import Functions.Helpers;
import Functions.Pictures;
import MiniGames.CartaAlta;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela y Diego
 */
public class WattsBet extends javax.swing.JFrame {
    Helpers help = new Helpers();
    Pictures pic = new Pictures();
    int  mainWatts;
    Clip mainClip;
    /**
     * Creates new form JuegoCartaMasAlta
     */
    public WattsBet() {
        initComponents();
        this.setLocationRelativeTo(null);
        pokemonLabel1.setIcon(pic.getPokemonPic());
        pokemonLabel1.setText("");
        fondo.setIcon(pic.getForestPic());
        fondo.setText("");
        moneyLabelPic.setText("");
        moneyLabelPic.setIcon(pic.getWattPic());
        pruebaWatts.setText("El valor es: ");
        mainClip=help.PlayMusic("juego1.wav");
        mainWatts=100;
        watts.setText(String.valueOf(mainWatts));
    }

    public WattsBet(int wattsGame) {
        initComponents();
        this.setLocationRelativeTo(null);
        pokemonLabel1.setIcon(pic.getPokemonPic());
        pokemonLabel1.setText("");
        fondo.setIcon(pic.getForestPic());
        fondo.setText("");
        moneyLabelPic.setText("");
        moneyLabelPic.setIcon(pic.getWattPic());
        pruebaWatts.setText("El valor es: ");
        watts.setText(String.valueOf(wattsGame));
        mainWatts=wattsGame;
        mainClip=help.PlayMusic("juego1.wav");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pokemonLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pruebaWatts = new javax.swing.JTextPane();
        wattsBet = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        watts = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        moneyLabelPic = new javax.swing.JLabel();
        betAccepted = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 650));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(105, 185, 120));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Peace Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 231, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡La Carta Más Alta!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 610, 80));

        pokemonLabel1.setText("jLabel3");
        jPanel1.add(pokemonLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 330, 120));

        atras.setBackground(new java.awt.Color(163, 39, 39));
        atras.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        atras.setForeground(new java.awt.Color(204, 204, 204));
        atras.setText("Atrás");
        atras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                atrasStateChanged(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 120, 40));

        jPanel2.setBackground(new java.awt.Color(56, 112, 83));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pruebaWatts.setEditable(false);
        pruebaWatts.setBackground(new java.awt.Color(13, 67, 194));
        pruebaWatts.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        pruebaWatts.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(pruebaWatts);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 40));

        wattsBet.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        wattsBet.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999999, 1));
        wattsBet.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wattsBetStateChanged(evt);
            }
        });
        jPanel2.add(wattsBet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 160, 40));

        jLabel2.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Coloque la cantidad de Watts que desea apostar: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        watts.setFont(new java.awt.Font("Peace Sans", 0, 22)); // NOI18N
        watts.setForeground(new java.awt.Color(204, 204, 204));
        watts.setText("12");
        jPanel2.add(watts, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 90, 30));

        title2.setFont(new java.awt.Font("Peace Sans", 0, 20)); // NOI18N
        title2.setForeground(new java.awt.Color(204, 204, 204));
        title2.setText("Cantidad Actual de Watts: ");
        jPanel2.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        moneyLabelPic.setText("jLabel2");
        jPanel2.add(moneyLabelPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 50));

        betAccepted.setBackground(new java.awt.Color(13, 67, 194));
        betAccepted.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        betAccepted.setForeground(new java.awt.Color(204, 204, 204));
        betAccepted.setText("Apostar!");
        betAccepted.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                betAcceptedStateChanged(evt);
            }
        });
        betAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betAcceptedActionPerformed(evt);
            }
        });
        jPanel2.add(betAccepted, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 420, 260));

        fondo.setText("jLabel2");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -10, 1020, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wattsBetStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wattsBetStateChanged
        pruebaWatts.setText("El valor es: " + wattsBet.getValue().toString());// TODO add your handling code here:
    }//GEN-LAST:event_wattsBetStateChanged

    private void betAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betAcceptedActionPerformed
        int wattsBetted = (int) wattsBet.getValue();
        if (mainWatts>=wattsBetted) {
            CartaAlta Carta = new CartaAlta();
            int wattsGanados;
            wattsGanados = Carta.cartaAlta(wattsBetted);
            MainMenu.CurrentGame.increaseWatts(wattsGanados);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
            mainWatts=MainMenu.CurrentGame.getWatts();

        } else {
            JOptionPane.showMessageDialog(null, "No tienes sufiecientes watts para apostar esa cantidad.");
            mainClip.stop();
            MainMenu menu = new MainMenu();
            this.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_betAcceptedActionPerformed

    private void betAcceptedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_betAcceptedStateChanged

    }//GEN-LAST:event_betAcceptedStateChanged

    private void atrasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_atrasStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasStateChanged

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
       mainClip.stop();
        MainMenu menu = new MainMenu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(WattsBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WattsBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WattsBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WattsBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WattsBet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton betAccepted;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabelPic;
    private javax.swing.JLabel pokemonLabel1;
    private javax.swing.JTextPane pruebaWatts;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel watts;
    private javax.swing.JSpinner wattsBet;
    // End of variables declaration//GEN-END:variables
}
