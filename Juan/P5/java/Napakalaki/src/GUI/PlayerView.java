/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import NapakalakiGame.Player;
import NapakalakiGame.Treasure;
import java.awt.BorderLayout;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class PlayerView extends javax.swing.JPanel {

    private Player playerModel;
    
    
    /**
     * Creates new form PlayerView
     */
    TreasureView nuevo = new TreasureView();
    
    public PlayerView() {
        initComponents();
        
       
    }

    public void setPlayer(Player playerModel) {
        this.playerModel = playerModel;
        this.nombre.setText(playerModel.getName());
        this.level.setText(Integer.toString(playerModel.getLevels()));
        this.combatLevel.setText(Integer.toString(playerModel.getCombatLevel()));
        if(playerModel.getEnemy()!=null)
        this.enemigo.setText(playerModel.getEnemy().getName());
        // Incluir instrucciones para actualizar su nombre, nivel, etc.
        // A continuación se actualizan sus tesoros
        
        System.out.println(playerModel.getHiddenTreasures());
        
        this.fillTreasurePanel(visibleTreasures,playerModel.getVisibleTreasures());
        this.fillTreasurePanel(hiddenTreasures,playerModel.getHiddenTreasures());
        
//        this.hiddenTreasures = nuevo;
//        this.add(hiddenTreasures);
//        this.hiddenTreasures.add(hiddenTreasures);
        repaint();
        
        revalidate();

    }
    
    private void fillTreasurePanel (JPanel aPanel, ArrayList<Treasure> aList) {
        // Se elimina la información antigua, si la hubiera
        aPanel.removeAll();
        // Se recorre la lista de tesoros construyendo y añadiendo sus vistas
        // al panel
        for (Treasure t : aList) {
           
            TreasureView aTreasureView = new TreasureView();
            aTreasureView.setTreasure (t);
            
            aTreasureView.setVisible (true);
            aPanel.add(aTreasureView);
//            JLabel a = new JLabel();
//            a.setText("mis cojones");
//            aPanel.add(a);
//            nuevo.add(aTreasureView);
              hiddenTreasures.add(BorderLayout.CENTER,aTreasureView);
        }
        // Se fuerza la actualización visual del panel
        aPanel.repaint();
        aPanel.revalidate();
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
        principal = new javax.swing.JPanel();
        hiddenTreasures = new javax.swing.JPanel();
        steal = new javax.swing.JButton();
        discard = new javax.swing.JButton();
        discardAll = new javax.swing.JButton();
        makeVisible = new javax.swing.JButton();
        visibleTreasures = new javax.swing.JPanel();
        label_nombre = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        label_nivel = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        combatLevel = new javax.swing.JLabel();
        enemigo = new javax.swing.JLabel();
        label_enemigo = new javax.swing.JLabel();
        label_n_combate = new javax.swing.JLabel();
        sectario = new javax.swing.JLabel();
        label_sectario = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        principal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        hiddenTreasures.setBorder(javax.swing.BorderFactory.createTitledBorder("Ocultos"));

        steal.setText("Steal Treasure");
        steal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stealActionPerformed(evt);
            }
        });

        discard.setText("Discard Treasures");
        discard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardActionPerformed(evt);
            }
        });

        discardAll.setText("Discard All Treasures");
        discardAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardAllActionPerformed(evt);
            }
        });

        makeVisible.setText("Make Visible");
        makeVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeVisibleActionPerformed(evt);
            }
        });

        visibleTreasures.setBorder(javax.swing.BorderFactory.createTitledBorder("Visibles"));
        visibleTreasures.setLayout(new java.awt.BorderLayout());

        label_nombre.setText("Nombre");

        nombre.setText("NOMBRE");

        label_nivel.setText("Nivel");

        level.setText("LEVEL");

        combatLevel.setText("NIVEL COMBATE");

        enemigo.setText("ENEMIGO");

        label_enemigo.setText("Enemigo");

        label_n_combate.setText("Nivel de combate");

        sectario.setText("SECTARIO");

        label_sectario.setText("Sectario");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visibleTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hiddenTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_enemigo)
                            .addComponent(label_sectario))
                        .addGap(60, 60, 60)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemigo)
                            .addComponent(sectario)))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_n_combate)
                            .addComponent(label_nivel)
                            .addComponent(label_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(level)
                                    .addComponent(combatLevel))
                                .addGap(325, 325, 325)
                                .addComponent(discard, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(makeVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(steal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(discardAll)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hiddenTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(nombre))
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(level)
                            .addComponent(label_nivel))
                        .addGap(9, 9, 9)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_n_combate)
                            .addComponent(combatLevel)))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discard)
                            .addComponent(makeVisible)
                            .addComponent(steal)
                            .addComponent(discardAll))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_enemigo)
                    .addComponent(enemigo))
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(label_sectario))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        add(principal, java.awt.BorderLayout.LINE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void stealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stealActionPerformed

    private void makeVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeVisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeVisibleActionPerformed

    private void discardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discardActionPerformed

    private void discardAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discardAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel combatLevel;
    private javax.swing.JButton discard;
    private javax.swing.JButton discardAll;
    private javax.swing.JLabel enemigo;
    private javax.swing.JPanel hiddenTreasures;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_enemigo;
    private javax.swing.JLabel label_n_combate;
    private javax.swing.JLabel label_nivel;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_sectario;
    private javax.swing.JLabel level;
    private javax.swing.JButton makeVisible;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel sectario;
    private javax.swing.JButton steal;
    private javax.swing.JPanel visibleTreasures;
    // End of variables declaration//GEN-END:variables
}