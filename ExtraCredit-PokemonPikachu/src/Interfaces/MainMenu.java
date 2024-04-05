package Interfaces;

import Classes.Game;
import Classes.ThreadForTime;
import Functions.Pictures;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

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
        pokeball.setIcon(pic.getPokeballPic());
        pokeball.setText("");
        pokemon2Buttom.setVisible(false);
        
        
        this.mainPhoto.setText("");

        // Movi esto aqui arriba afuera del ciclo para probar
        this.mainPhoto.setIcon(MainMenu.CurrentGame.getRelationship().getCurrentPokemon().getCurrentState().getImage());

        MainMenu.running = true;
        MainMenu.threadToActualize = new ThreadForTime(this);
        MainMenu.threadToActualize.start(); // Inicia el hilo de actualización.
        
        
        //if(MainMenu.CurrentGame.canSecondPokemon){pokemon2Buttom.setVisible(true);}

    }

    public void updateLabels() {
        timeLabel.setText(CurrentGame.getTimeToShow());
        wattsLabel.setText(String.valueOf(CurrentGame.getWatts()));
        relationshipLabel.setText(String.valueOf(CurrentGame.getRelationship().getRelationShipRange()));
        pokemonStatus.setText(CurrentGame.getRelationship().getCurrentPokemon().getCurrentState().getName());
        mainPhoto.setIcon(MainMenu.CurrentGame.getRelationship().getCurrentPokemon().getCurrentState().getImage());
        mainPhoto.setIcon(MainMenu.CurrentGame.getRelationship().getCurrentPokemon().getCurrentState().getImage());
        //if(MainMenu.CurrentGame.canSecondPokemon){pokemon2Buttom.setVisible(true);}
        
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
        pokemonStatus = new javax.swing.JLabel();
        mainPhoto = new javax.swing.JLabel();
        panelStatus = new javax.swing.JPanel();
        fondoLabel = new javax.swing.JLabel();
        storeButtom1 = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        wattsLabel = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        relationshipLabel = new javax.swing.JLabel();
        pokemon2Buttom = new javax.swing.JButton();
        Historial1 = new javax.swing.JButton();
        pokeball = new javax.swing.JLabel();

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
        jPanel2.add(inventoryButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 180, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pokemonStatus.setFont(new java.awt.Font("Peace Sans", 0, 24)); // NOI18N
        pokemonStatus.setForeground(new java.awt.Color(213, 213, 213));
        pokemonStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonStatus.setText("...");
        jPanel3.add(pokemonStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 210, -1));

        mainPhoto.setText("jLabel1");
        jPanel3.add(mainPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 180));

        panelStatus.setBackground(new java.awt.Color(57, 90, 168));
        jPanel3.add(panelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 60));

        fondoLabel.setText("jLabel1");
        jPanel3.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 410));

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

        pokemon2Buttom.setBackground(new java.awt.Color(222, 222, 222));
        pokemon2Buttom.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        pokemon2Buttom.setForeground(new java.awt.Color(36, 36, 36));
        pokemon2Buttom.setText("2do Pokémon");
        pokemon2Buttom.setToolTipText("");
        pokemon2Buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon2ButtomActionPerformed(evt);
            }
        });
        jPanel2.add(pokemon2Buttom, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 180, 40));

        Historial1.setBackground(new java.awt.Color(222, 222, 222));
        Historial1.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        Historial1.setForeground(new java.awt.Color(36, 36, 36));
        Historial1.setText("Historial");
        Historial1.setToolTipText("");
        Historial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Historial1ActionPerformed(evt);
            }
        });
        jPanel2.add(Historial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 180, 40));

        pokeball.setText("jLabel1");
        jPanel2.add(pokeball, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 90, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        if (MainMenu.CurrentGame.getNamePokemonOfRelationShip() == "Shinx") {
            WattsBet ne = new WattsBet();
            ne.setVisible(true);
            
        } else if (MainMenu.CurrentGame.getNamePokemonOfRelationShip() == "Pikachu"){
            
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void saveButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtomActionPerformed
        MainMenu.CurrentGame.increaseWatts(10);
        MainMenu.CurrentGame.SaveGame();
    }//GEN-LAST:event_saveButtomActionPerformed

    private void storeButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtom1ActionPerformed
        MainMenu.CurrentGame.increaseWatts(10);
        MainMenu.running=false;
        storePage store = new storePage(MainMenu.CurrentGame.getWatts());
        this.setVisible(false);
        store.setVisible(true);
    }//GEN-LAST:event_storeButtom1ActionPerformed

    private void inventoryButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtomActionPerformed
        MainMenu.CurrentGame.increaseWatts(10);
        MainMenu.running=false;
        
        InventoryPage invt = new InventoryPage();
        this.setVisible(false);
        
        invt.setVisible(true);
        //agregar inventario
        /**
         */
    }//GEN-LAST:event_inventoryButtomActionPerformed

    private void menuButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtomActionPerformed
        
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "¡Cuidado! Si sale al menú no se guardaran de manera automtáica los datos del juego hasta el momento.\n¿Esta segur@ que quiere salir al menú?\nPresionse sí, si quiere salir al menú.\nPresione no, en el caso contrario.", "Confirmación Ir al Menú Inicial", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.running=false;
            MainMenu.threadToActualize.stopThread();
            this.setVisible(false);
            InicialMenu menu = new InicialMenu();
            menu.setVisible(true);
        }
    }//GEN-LAST:event_menuButtomActionPerformed

    private void pokemon2ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon2ButtomActionPerformed
        // TODO add your handling code here:
        /*Terminar de definir que sucede con la vaina de creacion
        
        
        */
    }//GEN-LAST:event_pokemon2ButtomActionPerformed

    private void Historial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Historial1ActionPerformed
        MainMenu.CurrentGame.increaseWatts(1000);
        //MainMenu.running=false;
        //Aqui se llama a la pagina historial
        
    }//GEN-LAST:event_Historial1ActionPerformed

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
    private javax.swing.JButton Historial1;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton inventoryButtom;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mainPhoto;
    private javax.swing.JButton menuButtom;
    private javax.swing.JPanel panelStatus;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel pokeball;
    private javax.swing.JButton pokemon2Buttom;
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
