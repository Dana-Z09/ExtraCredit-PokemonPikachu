package Interfaces;

import Classes.Game;
import Classes.ThreadForTime;
import Functions.Pictures;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Danna Star
 */
public class MainMenu extends javax.swing.JFrame {

    public static Game CurrentGame = new Game();
    public static ThreadForTime threadToActualize;
    public static boolean running;

    Pictures pic = new Pictures();

    /**
     * Creates new form InicialMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        pokemonLabel1.setIcon(pic.getPokemonPic());
        pokemonLabel1.setText("");
        fondoLabel.setIcon(pic.getFondoPic());
        fondoLabel.setText("");
        this.mainPhoto.setText("");

        // Movi esto aqui arriba afuera del ciclo para probar
        this.mainPhoto.setIcon(MainMenu.CurrentGame.getRelationship().getCurrentPokemon().getCurrentState().getImage());

        MainMenu.running = true;
        MainMenu.threadToActualize = new ThreadForTime(this);
        MainMenu.threadToActualize.start(); // Inicia el hilo de actualización.

        
    }

    public void updateLabels() {
        timeLabel.setText(CurrentGame.getTimeToShow());
        wattsLabel.setText(String.valueOf(CurrentGame.getWatts()));
        relationshipLabel.setText(String.valueOf(CurrentGame.getRelationship().getRelationShipRange()));
        pokemonStatus.setText(CurrentGame.getRelationship().getCurrentPokemon().getCurrentState().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokemonLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pokemonLabel1 = new javax.swing.JLabel();
        saveButtom = new javax.swing.JButton();
        menuButtom = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        inventoryButtom = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fondoLabel = new javax.swing.JLabel();
        mainPhoto = new javax.swing.JLabel();
        pokemonStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        storeButtom1 = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        wattsLabel = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        relationshipLabel = new javax.swing.JLabel();

        pokemonLabel.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(150, 10, 45));
        jPanel2.setForeground(new java.awt.Color(220, 10, 45));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pokemonLabel1.setText("jLabel3");
        jPanel2.add(pokemonLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 330, 120));

        saveButtom.setBackground(new java.awt.Color(222, 222, 222));
        saveButtom.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        saveButtom.setForeground(new java.awt.Color(36, 36, 36));
        saveButtom.setText("Guardar");
        saveButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtomActionPerformed(evt);
            }
        });
        jPanel2.add(saveButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 180, 40));

        menuButtom.setBackground(new java.awt.Color(222, 222, 222));
        menuButtom.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        menuButtom.setForeground(new java.awt.Color(36, 36, 36));
        menuButtom.setText("Menú Inicial");
        menuButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtomActionPerformed(evt);
            }
        });
        jPanel2.add(menuButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        playButton.setBackground(new java.awt.Color(222, 222, 222));
        playButton.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        playButton.setForeground(new java.awt.Color(36, 36, 36));
        playButton.setText("Minijuego");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel2.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, 40));

        inventoryButtom.setBackground(new java.awt.Color(222, 222, 222));
        inventoryButtom.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        inventoryButtom.setForeground(new java.awt.Color(36, 36, 36));
        inventoryButtom.setText("Inventario");
        inventoryButtom.setToolTipText("");
        inventoryButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtomActionPerformed(evt);
            }
        });
        jPanel2.add(inventoryButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 180, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoLabel.setText("jLabel1");
        jPanel3.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 410));

        mainPhoto.setText("jLabel1");
        jPanel3.add(mainPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 180, 180));

        pokemonStatus.setFont(new java.awt.Font("Peace Sans", 0, 24)); // NOI18N
        pokemonStatus.setForeground(new java.awt.Color(213, 213, 213));
        pokemonStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonStatus.setText("...");
        jPanel3.add(pokemonStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 210, -1));
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 320, 370));

        storeButtom1.setBackground(new java.awt.Color(222, 222, 222));
        storeButtom1.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        storeButtom1.setForeground(new java.awt.Color(36, 36, 36));
        storeButtom1.setText("Tienda");
        storeButtom1.setToolTipText("");
        storeButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeButtom1ActionPerformed(evt);
            }
        });
        jPanel2.add(storeButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 180, 40));

        timeLabel.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(213, 213, 213));
        timeLabel.setText("...");
        jPanel2.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        wattsLabel.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        wattsLabel.setForeground(new java.awt.Color(213, 213, 213));
        wattsLabel.setText("...");
        jPanel2.add(wattsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        title3.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        title3.setForeground(new java.awt.Color(213, 213, 213));
        title3.setText("Cantidad de Relación:");
        jPanel2.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        title2.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(213, 213, 213));
        title2.setText("Watts: ");
        jPanel2.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        title1.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(213, 213, 213));
        title1.setText("Tiempo: ");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        relationshipLabel.setFont(new java.awt.Font("Peace Sans", 0, 24)); // NOI18N
        relationshipLabel.setForeground(new java.awt.Color(213, 213, 213));
        relationshipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        relationshipLabel.setText("...");
        jPanel2.add(relationshipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 210, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed

    }//GEN-LAST:event_playButtonActionPerformed

    private void saveButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtomActionPerformed
        boolean saveAll = true;
        //=Funcion de guardar juego 

        if (saveAll) {
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente la información de la partida.", "Guardado Exitoso", INFORMATION_MESSAGE, null);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha guardado correctamente la información de la partida.\nInténtelo nuevamente.", "Eror de Guardado", ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_saveButtomActionPerformed

    private void storeButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtom1ActionPerformed

        //parar el tiempo
        storePage store = new storePage();
        this.setVisible(false);
        store.setVisible(true);
    }//GEN-LAST:event_storeButtom1ActionPerformed

    private void inventoryButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtomActionPerformed

    }//GEN-LAST:event_inventoryButtomActionPerformed

    private void menuButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtomActionPerformed
        ////option pane con una cofirmation 

        this.setVisible(false);
        InicialMenu menu = new InicialMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_menuButtomActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                MainMenu.running = true;
                MainMenu.threadToActualize = new ThreadForTime(mainMenu);
                MainMenu.threadToActualize.start(); // Inicia el hilo de actualización.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton inventoryButtom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mainPhoto;
    private javax.swing.JButton menuButtom;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel pokemonLabel;
    private javax.swing.JLabel pokemonLabel1;
    private javax.swing.JLabel pokemonStatus;
    private javax.swing.JLabel relationshipLabel;
    private javax.swing.JButton saveButtom;
    private javax.swing.JButton storeButtom1;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel wattsLabel;
    // End of variables declaration//GEN-END:variables
}
