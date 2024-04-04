package Interfaces;

import Functions.Helpers;
import Functions.Pictures;
import javax.swing.ImageIcon;

/**
 *
 * @author Danna Star
 */
public class Credits extends javax.swing.JFrame {
    Pictures  pic = new Pictures();
    ImageIcon pachirisuPic = pic.getPachirisuPic();
    ImageIcon pokemonPic = pic.getPokemonPic();
    ImageIcon fondoPic = pic.getFondoPic();
    Helpers help = new Helpers();
    /**
     * Creates new form InicialMenu
     */
    public Credits() {
        initComponents();
        this.setLocationRelativeTo(null);
        pachirisuLabel.setIcon(pachirisuPic);
        pachirisuLabel.setText("");
        pokemonLabel.setIcon(pokemonPic);
        pokemonLabel.setText("");
        fondoLabel.setIcon(fondoPic);
        fondoLabel.setText("");
        help.PlayMusic("inventario.wav");
        texto.setText("""
                        Música:


                        Imagenes:
                        -https://pokemon.fandom.com/wiki/Pikachu
                      
                        -background prairie pokemon screencapture by nemotrex,
                        https://www.deviantart.com/nemotrex/art/background-prairie-
                        pokemon-screencapture-861064355 
                      
                        -https://www.pokemon.com/uk/pokedex/shinx
                      
                        -https://pokemondb.net/pokedex/pachirisu
                      
                        -https://www.pokemon.com/el/pokedex/mareep
                      


                        Todos los derechos de autor son recervados a Nintendo
                        y Pokemon resepectivamente. 

                        Este programa es una simulación de un tamagotchi,
                        hecho como proyecto de crédito extra para la materia
                        de estructura de datos.

                        Trabajo realizado por:

                        - Ares Ramírez
                        - Daniela Zambrano
                        - Diego Méndez
                      """);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        pachirisuLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pokemonLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 650));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(150, 10, 45));
        jPanel2.setForeground(new java.awt.Color(220, 10, 45));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(222, 222, 222));
        jButton4.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(36, 36, 36));
        jButton4.setText("Atrás");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 120, 40));

        pachirisuLabel.setText("jLabel4");
        jPanel2.add(pachirisuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 230, 250));

        jLabel1.setFont(new java.awt.Font("Peace Sans", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 90, 168));
        jLabel1.setText(" Créditos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 80));

        pokemonLabel.setText("jLabel3");
        jPanel2.add(pokemonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 360, 120));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto.setEditable(false);
        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        texto.setRows(5);
        texto.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jScrollPane1.setViewportView(texto);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 480, 310));

        fondoLabel.setText("jLabel1");
        jPanel3.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        InicialMenu menu = new InicialMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pachirisuLabel;
    private javax.swing.JLabel pokemonLabel;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
