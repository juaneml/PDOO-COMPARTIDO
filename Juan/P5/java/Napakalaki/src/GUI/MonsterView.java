/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.BadConsequence;
import NapakalakiGame.Monster;
import NapakalakiGame.Prize;
import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author juane
 */
public class MonsterView extends javax.swing.JPanel {

    
    Monster monsterModel;
    public MonsterView() {
        initComponents();
    }

    public void setMonster(Monster monsterModel){
        
        if(monsterModel !=null){
            this.monsterModel = monsterModel;      

            this.name.setText(monsterModel.getName());
            this.nivel.setText(Integer.toString(monsterModel.getCombatLevel()));
            URL url = getClass().getResource(monsterModel.getIcon());
            if(url!=null)
            this.carta.setIcon(new ImageIcon(url));
            /*Actualizar badConsequence*/
            this.badConsequencePanel.setBadConsequence(monsterModel.getBadConsequence());
            this.prizePanel.setPrize(monsterModel.getPrice());
            
        }
        if(monsterModel==null){
            this.name.setText("Name");
            this.nivel.setText("Nivel");
            String path = "/Monsters/espalda_baraja.jpg";
            URL url = getClass().getResource(path);
            this.carta.setIcon(new ImageIcon(url));            
            this.badConsequencePanel.setBadConsequence(null);            
            this.prizePanel.setPrize(null);
        }
        repaint();
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
        carta = new javax.swing.JLabel();
        etiqueta_monster = new javax.swing.JLabel();
        badConsequencePanel = new GUI.BadConsequenceView();
        prizePanel = new GUI.PrizeView();
        name = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();
        etiqueta_level = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(345, 587));

        carta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Monsters/espalda_baraja.jpg"))); // NOI18N
        carta.setMaximumSize(new java.awt.Dimension(100, 331));
        carta.setPreferredSize(new java.awt.Dimension(100, 100));

        etiqueta_monster.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiqueta_monster.setText("Monster");

        badConsequencePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        prizePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        name.setText("Name");

        nivel.setText("level");

        etiqueta_level.setText("Nivel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(badConsequencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nivel)
                            .addComponent(etiqueta_level, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(carta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(etiqueta_monster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addComponent(prizePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_monster)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiqueta_level)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nivel))
                    .addComponent(carta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(badConsequencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(prizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.BadConsequenceView badConsequencePanel;
    private javax.swing.JLabel carta;
    private javax.swing.JLabel etiqueta_level;
    private javax.swing.JLabel etiqueta_monster;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nivel;
    private GUI.PrizeView prizePanel;
    // End of variables declaration//GEN-END:variables
}
