package GUI;

import DAO.GerantDAO;
import Entity.Gerant;
import GUI.Gerant.Adapters.GerantAdapter;
import GUI.Gerant.Adapters.GerantAdapterInstant;
import GUI.Gerant.Adapters.GerantAdapterName;
import GUI.Gerant.Adapters.GerantAdapterPrenom;
import com.alee.extended.image.WebImage;
import com.alee.laf.optionpane.WebOptionPane;
import com.alee.laf.text.WebTextField;
import com.alee.managers.notification.NotificationManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ShujiX
 */
public class Gerant_Panel extends javax.swing.JPanel {

    /**
     * Creates new form test_panel_gerant
     */
    public Gerant_Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_trie = new javax.swing.JButton();
        combo_trie = new javax.swing.JComboBox();
        bt_chercher = new javax.swing.JButton();
        txt_chercher = new WebTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_gerants = new javax.swing.JTable();
        bt_delete = new javax.swing.JButton();
        lbl_nom = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_pwd = new javax.swing.JTextField();
        txt_mobile = new javax.swing.JTextField();
        txt_fix = new javax.swing.JTextField();
        bt_modifier = new javax.swing.JButton();
        contacterButton = new javax.swing.JButton();
        listOffresButton = new javax.swing.JButton();

        bt_trie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sort.png"))); // NOI18N
        bt_trie.setText("Trier par");
        bt_trie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_trieActionPerformed(evt);
            }
        });

        combo_trie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nom", "Prenom" }));

        bt_chercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        bt_chercher.setText("Chercher");
        bt_chercher.setMargin(new java.awt.Insets(2, 5, 2, 10));
        bt_chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chercherActionPerformed(evt);
            }
        });

        table_gerants.setModel(new GerantAdapter()
        );
        table_gerants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_gerantsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_gerants);

        bt_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        bt_delete.setText("Supprimer");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        lbl_nom.setText("Nom ");

        jLabel2.setText("Prenom");

        jLabel3.setText("Mail");

        jLabel4.setText("Mot de passe");

        jLabel5.setText("Numero Mobile");

        jLabel6.setText("Numero Fix");

        bt_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        bt_modifier.setText("Modifier");
        bt_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifierActionPerformed(evt);
            }
        });

        contacterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        contacterButton.setText("Contacter");
        contacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacterButtonActionPerformed(evt);
            }
        });

        listOffresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/offer.png"))); // NOI18N
        listOffresButton.setText("Offres");
        listOffresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOffresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_trie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_trie, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_prenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_mail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_fix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txt_pwd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_mobile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(bt_modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contacterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listOffresButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, bt_delete, listOffresButton);

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_trie)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_trie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_chercher)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nom)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_fix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_modifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listOffresButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, bt_delete, listOffresButton);

        WebTextField txt_chercher_aux = (WebTextField) txt_chercher;
        txt_chercher_aux.setTrailingComponent(new WebImage(getClass().getResource("/images/search.png")));
        txt_chercher_aux.setInputPrompt("Chercher par");
        txt_chercher = txt_chercher_aux;
    }// </editor-fold>//GEN-END:initComponents

    private void bt_trieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_trieActionPerformed
        if (String.valueOf(combo_trie.getSelectedItem()).equalsIgnoreCase("nom")) {
            table_gerants.setModel(new GerantAdapterName());
        } else if (String.valueOf(combo_trie.getSelectedItem()).equalsIgnoreCase("prenom")) {
            table_gerants.setModel(new GerantAdapterPrenom());
        }
    }//GEN-LAST:event_bt_trieActionPerformed

    private void bt_chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_chercherActionPerformed
        table_gerants.setModel(new GerantAdapterInstant(txt_chercher.getText()));
    }//GEN-LAST:event_bt_chercherActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        if (table_gerants.getSelectedRow() == -1) {
            NotificationManager.showNotification ( "Veuillez sélectionnez une ligne" ).setDisplayTime(2000);
        } else {
            int dialogResult = WebOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce gérant ?", "Confirmer", WebOptionPane.YES_NO_OPTION,
                    WebOptionPane.QUESTION_MESSAGE);
            if (dialogResult == 0) {
                int i = Integer.parseInt(table_gerants.getValueAt(table_gerants.getSelectedRow(), 0) + "");
                GerantDAO gerantDAO = new GerantDAO();
                gerantDAO.deleteGerant(i);
                JOptionPane.showMessageDialog(this, "Suppression effectuée avec succés");
                table_gerants.setModel(new GerantAdapter());
            }
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void table_gerantsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_gerantsMousePressed
        int i = Integer.parseInt(table_gerants.getValueAt(table_gerants.getSelectedRow(), 0) + "");
        String mail = (String) table_gerants.getValueAt(table_gerants.getSelectedRow(), 1);
        String password = (String) table_gerants.getValueAt(table_gerants.getSelectedRow(), 2);
        String nom = (String) table_gerants.getValueAt(table_gerants.getSelectedRow(), 3);
        String prenom = (String) table_gerants.getValueAt(table_gerants.getSelectedRow(), 4);
        String num_mob = (String) table_gerants.getValueAt(table_gerants.getSelectedRow(), 5);
        String num_fix = (String) table_gerants.getValueAt(table_gerants.getSelectedRow(), 6);
        txt_nom.setText(nom);
        txt_prenom.setText(prenom);
        txt_mail.setText(mail);
        txt_pwd.setText(password);
        txt_mobile.setText(num_mob);
        txt_fix.setText(num_fix);
        this.id_g = i;
    }//GEN-LAST:event_table_gerantsMousePressed

    private void bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifierActionPerformed
        if ((!txt_nom.getText().isEmpty()) && (!txt_prenom.getText().isEmpty()) && (!txt_mail.getText().isEmpty())
                && (!txt_pwd.getText().isEmpty()) && (!txt_mobile.getText().isEmpty()) && (!txt_fix.getText().isEmpty()) && id_g != 0) {

            if (isInteger(txt_mobile.getText()) && isInteger(txt_fix.getText())) {
                Gerant g = new Gerant();
                g.setId(id_g);
                g.setNom(txt_nom.getText());
                g.setPrenom(txt_prenom.getText());
                g.setMail(txt_mail.getText());
                g.setPassword(txt_pwd.getText());
                g.setNumTel(txt_mobile.getText());
                g.setNumFix(txt_fix.getText());
                GerantDAO gdo = new GerantDAO();
                gdo.updateGerant(g);
                table_gerants.setModel(new GerantAdapter());
                JOptionPane.showMessageDialog(bt_modifier, "Gerant modifié avec succés ");
            } else {
                JOptionPane.showMessageDialog(bt_modifier, "Les numero Fix/Mobile sont erronés !", "Error", 1,
                        new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            }
        } else {
            NotificationManager.showNotification ( "Veuillez sélectionner un gérant à modifier !" ).setDisplayTime(2000);
        }    }//GEN-LAST:event_bt_modifierActionPerformed

    private void contacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacterButtonActionPerformed
        int id_dest = 0;
                if (table_gerants.getSelectedRow() != -1) {
                    id_dest = (int) table_gerants.getValueAt(table_gerants.getSelectedRow(), 0);
                    new EnvoyerMessage(0, id_dest).setLocationRelativeTo(null);
                }
                else{
                    NotificationManager.showNotification ( "Veuillez sélectionner un utilisateur" ).setDisplayTime(2000);
                }
    }//GEN-LAST:event_contacterButtonActionPerformed

    private void listOffresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOffresButtonActionPerformed
        new ListeOffresAdmin(id_g).setVisible(true);
    }//GEN-LAST:event_listOffresButtonActionPerformed

    //Pour vérifier si les Numerique ou pas
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_chercher;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JButton bt_trie;
    private javax.swing.JComboBox combo_trie;
    private javax.swing.JButton contacterButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JButton listOffresButton;
    private javax.swing.JTable table_gerants;
    private javax.swing.JTextField txt_chercher;
    private javax.swing.JTextField txt_fix;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_pwd;
    // End of variables declaration//GEN-END:variables
    private int id_g = 0;
}
