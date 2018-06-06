/*
 * 
 * 
 * 
 */

package Dota2Guide;

/**
 *
 * @author Paul Lee
 */
public class Dota2Guide extends javax.swing.JFrame {

    
    public Dota2Guide() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subTitleLabel = new javax.swing.JLabel();
        moveButton = new javax.swing.JRadioButton();
        attackButton = new javax.swing.JRadioButton();
        spellsButton = new javax.swing.JRadioButton();
        blockCreepsButton = new javax.swing.JRadioButton();
        itemsWorkButton = new javax.swing.JRadioButton();
        runeSpawnButton = new javax.swing.JRadioButton();
        bestHeroesButton = new javax.swing.JRadioButton();
        guideButton = new javax.swing.JButton();
        typeOfHeroesButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        finalResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setText("Dota 2 Guide");

        subTitleLabel.setText("Beginner Guide To Dota 2:");

        moveButton.setText("How To Move:");

        attackButton.setText("How To Attack:");

        spellsButton.setText("How To Cast Spells:");

        blockCreepsButton.setText("How To Block Creeps:");

        itemsWorkButton.setText("How Items Work:");

        runeSpawnButton.setText("When Runes Spawn:");

        bestHeroesButton.setText("What Heroes Best Suits the Player:");

        guideButton.setText("Guide");
        guideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideButtonActionPerformed(evt);
            }
        });

        typeOfHeroesButton.setText("What type of Heroes counters what Heroes:");
        typeOfHeroesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfHeroesButtonActionPerformed(evt);
            }
        });

        finalResult.setEditable(false);
        finalResult.setColumns(20);
        finalResult.setRows(5);
        jScrollPane2.setViewportView(finalResult);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guideButton)
                    .addComponent(itemsWorkButton)
                    .addComponent(runeSpawnButton)
                    .addComponent(bestHeroesButton)
                    .addComponent(typeOfHeroesButton)
                    .addComponent(spellsButton)
                    .addComponent(blockCreepsButton)
                    .addComponent(attackButton)
                    .addComponent(moveButton)
                    .addComponent(subTitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(65, 65, 65)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(subTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(moveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spellsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blockCreepsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemsWorkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(runeSpawnButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bestHeroesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeOfHeroesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeOfHeroesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfHeroesButtonActionPerformed
        
    }//GEN-LAST:event_typeOfHeroesButtonActionPerformed

    private void guideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideButtonActionPerformed
      
       if(attackButton.isSelected())
       {
           finalResult.setText(" ");
       }
           
       
    }//GEN-LAST:event_guideButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dota2Guide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton attackButton;
    private javax.swing.JRadioButton bestHeroesButton;
    private javax.swing.JRadioButton blockCreepsButton;
    private javax.swing.JTextArea finalResult;
    private javax.swing.JButton guideButton;
    private javax.swing.JRadioButton itemsWorkButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton moveButton;
    private javax.swing.JRadioButton runeSpawnButton;
    private javax.swing.JRadioButton spellsButton;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton typeOfHeroesButton;
    // End of variables declaration//GEN-END:variables
}
