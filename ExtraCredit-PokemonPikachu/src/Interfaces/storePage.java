package Interfaces;

import Functions.Pictures;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

/**
 *
 * @author Danna Star
 */
public class storePage extends javax.swing.JFrame {
    Pictures pic= new Pictures();
    /**
     * Creates new form InicialMenu
     */
    public storePage(){}
    public storePage(int wattsGame) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        BayaAranjaLabel.setIcon(pic.getBayaAranjaPic());
        BayaCaquicLabel.setIcon(pic.getBayaCaquicPic());
        BayaEnigmaLabel.setIcon(pic.getBayaEnigmaPic());
        BayaZanamaLabel.setIcon(pic.getBayaZanamaPic());
        BayaZidraLabel.setIcon(pic.getBayaZidraPic());
        BayaZiuelaLabel.setIcon(pic.getBayaZiuelaPic());
        BayaZrezaLabel.setIcon(pic.getBayaZrezaPic());
        pokeballLabel.setIcon(pic.getPokeballPic());
        candyLabel.setIcon(pic.getCarameloPic());
        
        moneyLabelPic.setText("");
        moneyLabelPic.setIcon(pic.getWattPic());
        watts.setText(String.valueOf(wattsGame));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BayaZidraLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ziuela = new javax.swing.JButton();
        PanelPikachu = new javax.swing.JPanel();
        tiendaTitle = new javax.swing.JLabel();
        aranja = new javax.swing.JButton();
        caquic = new javax.swing.JButton();
        caramelo = new javax.swing.JButton();
        zreza = new javax.swing.JButton();
        pokeball = new javax.swing.JButton();
        moneyLabelPic = new javax.swing.JLabel();
        enigma = new javax.swing.JButton();
        zanama = new javax.swing.JButton();
        zidra = new javax.swing.JButton();
        backButtom1 = new javax.swing.JButton();
        watts = new javax.swing.JLabel();
        candyLabel = new javax.swing.JLabel();
        BayaZidraLabel = new javax.swing.JLabel();
        pokeballLabel = new javax.swing.JLabel();
        BayaEnigmaLabel = new javax.swing.JLabel();
        BayaZrezaLabel = new javax.swing.JLabel();
        BayaZanamaLabel = new javax.swing.JLabel();
        BayaZiuelaLabel = new javax.swing.JLabel();
        BayaAranjaLabel = new javax.swing.JLabel();
        BayaCaquicLabel = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        BayaZidraLabel6.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 90, 168));
        jPanel2.setForeground(new java.awt.Color(220, 10, 45));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ziuela.setBackground(new java.awt.Color(222, 222, 222));
        ziuela.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        ziuela.setForeground(new java.awt.Color(36, 36, 36));
        ziuela.setText("Baya Ziuela");
        ziuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ziuelaActionPerformed(evt);
            }
        });
        jPanel2.add(ziuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 130, 40));

        PanelPikachu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(PanelPikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        tiendaTitle.setFont(new java.awt.Font("Peace Sans", 0, 60)); // NOI18N
        tiendaTitle.setForeground(new java.awt.Color(213, 213, 213));
        tiendaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiendaTitle.setText("Tienda");
        jPanel2.add(tiendaTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 80));

        aranja.setBackground(new java.awt.Color(222, 222, 222));
        aranja.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        aranja.setForeground(new java.awt.Color(36, 36, 36));
        aranja.setText("Baya Aranja");
        aranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aranjaActionPerformed(evt);
            }
        });
        jPanel2.add(aranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 40));

        caquic.setBackground(new java.awt.Color(222, 222, 222));
        caquic.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        caquic.setForeground(new java.awt.Color(36, 36, 36));
        caquic.setText("Baya Caquic");
        caquic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caquicActionPerformed(evt);
            }
        });
        jPanel2.add(caquic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 130, 40));

        caramelo.setBackground(new java.awt.Color(222, 222, 222));
        caramelo.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        caramelo.setForeground(new java.awt.Color(36, 36, 36));
        caramelo.setText("Caramelo raro");
        caramelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carameloActionPerformed(evt);
            }
        });
        jPanel2.add(caramelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 150, 40));

        zreza.setBackground(new java.awt.Color(222, 222, 222));
        zreza.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        zreza.setForeground(new java.awt.Color(36, 36, 36));
        zreza.setText("Baya Zreza");
        zreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrezaActionPerformed(evt);
            }
        });
        jPanel2.add(zreza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 40));

        pokeball.setBackground(new java.awt.Color(222, 222, 222));
        pokeball.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        pokeball.setForeground(new java.awt.Color(36, 36, 36));
        pokeball.setText("Pokeball");
        pokeball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokeballActionPerformed(evt);
            }
        });
        jPanel2.add(pokeball, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 130, 40));

        moneyLabelPic.setText("jLabel2");
        jPanel2.add(moneyLabelPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 40, 50));

        enigma.setBackground(new java.awt.Color(222, 222, 222));
        enigma.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        enigma.setForeground(new java.awt.Color(36, 36, 36));
        enigma.setText("Baya Enigma");
        enigma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enigmaActionPerformed(evt);
            }
        });
        jPanel2.add(enigma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 130, 40));

        zanama.setBackground(new java.awt.Color(222, 222, 222));
        zanama.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        zanama.setForeground(new java.awt.Color(36, 36, 36));
        zanama.setText("Baya Zanama");
        zanama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zanamaActionPerformed(evt);
            }
        });
        jPanel2.add(zanama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 130, 40));

        zidra.setBackground(new java.awt.Color(222, 222, 222));
        zidra.setFont(new java.awt.Font("Pokemon Solid", 0, 14)); // NOI18N
        zidra.setForeground(new java.awt.Color(36, 36, 36));
        zidra.setText("Baya Zidra");
        zidra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zidraActionPerformed(evt);
            }
        });
        jPanel2.add(zidra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 130, 40));

        backButtom1.setBackground(new java.awt.Color(222, 222, 222));
        backButtom1.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        backButtom1.setForeground(new java.awt.Color(36, 36, 36));
        backButtom1.setText("Atrás");
        backButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtom1ActionPerformed(evt);
            }
        });
        jPanel2.add(backButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 100, -1));

        watts.setFont(new java.awt.Font("Peace Sans", 0, 17)); // NOI18N
        watts.setForeground(new java.awt.Color(213, 213, 213));
        watts.setText("...");
        jPanel2.add(watts, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 100, 30));

        candyLabel.setText("jLabel2");
        jPanel2.add(candyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 90, 70));

        BayaZidraLabel.setText("jLabel2");
        jPanel2.add(BayaZidraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 90, 90));

        pokeballLabel.setText("jLabel2");
        jPanel2.add(pokeballLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 90, 90));

        BayaEnigmaLabel.setText("jLabel2");
        jPanel2.add(BayaEnigmaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 90, 90));

        BayaZrezaLabel.setText("jLabel2");
        jPanel2.add(BayaZrezaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, 90));

        BayaZanamaLabel.setText("jLabel2");
        jPanel2.add(BayaZanamaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 90, 90));

        BayaZiuelaLabel.setText("jLabel2");
        jPanel2.add(BayaZiuelaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 90, 90));

        BayaAranjaLabel.setText("jLabel2");
        jPanel2.add(BayaAranjaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, 90));

        BayaCaquicLabel.setText("jLabel2");
        jPanel2.add(BayaCaquicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 90, 90));

        title2.setFont(new java.awt.Font("Peace Sans", 0, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(213, 213, 213));
        title2.setText("Watts: ");
        jPanel2.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jPanel1.setBackground(new java.awt.Color(97, 42, 7));
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 600, 40));

        jPanel3.setBackground(new java.awt.Color(97, 42, 7));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 600, 40));

        jPanel4.setBackground(new java.awt.Color(97, 42, 7));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 600, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ziuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ziuelaActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Ziuela.\nCosto: 600 Watts.\nEfecto: +850 relación.\n¿Desea comprar una Baya Ziuela?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Ziuela", 600, 850);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_ziuelaActionPerformed

    private void aranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aranjaActionPerformed
       String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Aranja.\nCosto: 100 Watts.\nEfecto: +100 relación.\n¿Desea comprar una Baya Aranja?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Aranja", 100, 100);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_aranjaActionPerformed

    private void caquicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caquicActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Caquic.\nCosto: 200 Watts.\nEfecto: +250 relación.\n¿Desea comprar una Baya Caquic?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Caquic", 200, 250);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_caquicActionPerformed

    private void carameloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carameloActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Caramelo raro.\nCosto: 900 Watts.\nEfecto: +1300 relación.\n¿Desea comprar una Caramelo Raro?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Caramelo Raro", 900, 1300);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_carameloActionPerformed

    private void zrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrezaActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Zreza.\nCosto: 400 Watts.\nEfecto: +550 relación.\n¿Desea comprar una Baya Zreza?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Zreza", 400, 550);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_zrezaActionPerformed

    private void pokeballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokeballActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Pokeball.\nCosto: 300 Watts.\nEfecto: +400 relación.\n¿Desea comprar una Pokeball?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Pokeball", 300, 400);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_pokeballActionPerformed

    private void zanamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zanamaActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Zanama.\nCosto: 500 Watts.\nEfecto: +700 relación.\n¿Desea comprar una Baya Zanama?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Zanama", 500, 700);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_zanamaActionPerformed

    private void zidraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zidraActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Zidra.\nCosto: 700 Watts.\nEfecto: +1000 relación.\n¿Desea comprar una Baya Zidra?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Zidra", 700, 1000);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_zidraActionPerformed

    private void enigmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enigmaActionPerformed
        String[] options = {"Sí", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Baya Enigma.\nCosto: 800 Watts.\nEfecto: +1150 relación.\n¿Desea comprar una Baya Enigma?\nPresionse sí, para realizar la compra.\nPresione no, en el caso contrario.", "Confirmación de Compra", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);

        if (answer == 0) {
            MainMenu.CurrentGame.buyGiftInShop("Baya Enigma", 800, 1150);
            watts.setText(String.valueOf(MainMenu.CurrentGame.getWatts()));
        }
    }//GEN-LAST:event_enigmaActionPerformed

    private void backButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtom1ActionPerformed
        MainMenu menu = new MainMenu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_backButtom1ActionPerformed

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
            java.util.logging.Logger.getLogger(storePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(storePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(storePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(storePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new storePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BayaAranjaLabel;
    private javax.swing.JLabel BayaCaquicLabel;
    private javax.swing.JLabel BayaEnigmaLabel;
    private javax.swing.JLabel BayaZanamaLabel;
    private javax.swing.JLabel BayaZidraLabel;
    private javax.swing.JLabel BayaZidraLabel6;
    private javax.swing.JLabel BayaZiuelaLabel;
    private javax.swing.JLabel BayaZrezaLabel;
    private javax.swing.JPanel PanelPikachu;
    private javax.swing.JButton aranja;
    private javax.swing.JButton backButtom1;
    private javax.swing.JLabel candyLabel;
    private javax.swing.JButton caquic;
    private javax.swing.JButton caramelo;
    private javax.swing.JButton enigma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel moneyLabelPic;
    private javax.swing.JButton pokeball;
    private javax.swing.JLabel pokeballLabel;
    private javax.swing.JLabel tiendaTitle;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel watts;
    private javax.swing.JButton zanama;
    private javax.swing.JButton zidra;
    private javax.swing.JButton ziuela;
    private javax.swing.JButton zreza;
    // End of variables declaration//GEN-END:variables
}
