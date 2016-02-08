
package GUI;

import NapakalakiGame.CombatResult;
import NapakalakiGame.Napakalaki;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Raul
 */
public class NapakalakiView extends javax.swing.JFrame {

    /**
     * Creates new form NapakalakiView
     */
    
    private Napakalaki napakalakiModel;
    private boolean meet_m;
    private int pulsado_monster = 0;
    private int pulsado_combate = 0;
    private CombatResult combate;
    
    public NapakalakiView() {
        initComponents();
        this.next_turn.setEnabled(false);
        this.combat.setEnabled(false);
        this.setLocationRelativeTo(null); //ponemos ventana Centrada
    }

    public void setNapakalaki(Napakalaki n){
        
        meet_m = false;
        napakalakiModel = n;
        
        this.currentPlayer.setPlayer(n.getCurrentPlayer());
        
        this.currentPlayer.setNapakalakiModel(napakalakiModel);
        this.repaint();
    }
   
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        player_monster = new javax.swing.JPanel();
        currentMonster = new GUI.MonsterView();
        currentPlayer = new GUI.PlayerView();
        meet_monster = new javax.swing.JToggleButton();
        combat = new javax.swing.JToggleButton();
        next_turn = new javax.swing.JToggleButton();
        etiqueta_combate = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NAPAKALAKI");

        principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout player_monsterLayout = new javax.swing.GroupLayout(player_monster);
        player_monster.setLayout(player_monsterLayout);
        player_monsterLayout.setHorizontalGroup(
            player_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player_monsterLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(currentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(currentMonster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        player_monsterLayout.setVerticalGroup(
            player_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentMonster, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addComponent(currentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        meet_monster.setText("Meet the Monster");
        meet_monster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meet_monsterActionPerformed(evt);
            }
        });

        combat.setText("Combat");
        combat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatActionPerformed(evt);
            }
        });

        next_turn.setText("Next Turn");
        next_turn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_turnActionPerformed(evt);
            }
        });

        etiqueta_combate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiqueta_combate.setText("Estado combate");

        resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultado.setText("Esperando");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(player_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(etiqueta_combate)
                        .addGap(14, 14, 14)
                        .addComponent(resultado)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addComponent(meet_monster)
                        .addGap(18, 18, 18)
                        .addComponent(combat)
                        .addGap(18, 18, 18)))
                .addComponent(next_turn))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(player_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiqueta_combate)
                            .addComponent(resultado))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meet_monster)
                        .addComponent(combat)
                        .addComponent(next_turn))))
        );

        getContentPane().add(principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meet_monsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meet_monsterActionPerformed
        this.combat.setEnabled(true);
        this.pulsado_monster=evt.getModifiers();
        if (this.meet_m == false){
            this.currentMonster.setEnabled(true);
            this.currentMonster.setMonster(napakalakiModel.getCurrentMonster());
        }
        
            repaint();
    }//GEN-LAST:event_meet_monsterActionPerformed

    

    private void combatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatActionPerformed
        if (this.pulsado_monster > 1) {
            try {
                this.pulsado_combate=evt.getModifiers();
               this.next_turn.setEnabled(true);
               this.meet_monster.setEnabled(false);
               this.resultado.setText(this.napakalakiModel.developCombat().toString());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(NapakalakiView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_combatActionPerformed

    private void next_turnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_turnActionPerformed
        if(this.pulsado_combate > 1){
            this.next_turn.setEnabled(true);
            this.meet_monster.setEnabled(true);
            this.combat.setEnabled(false);
            this.napakalakiModel.nextTurn();
            this.setNapakalaki(napakalakiModel);
           // this.currentMonster.setMonster(napakalakiModel.getCurrentMonster());
            currentMonster.getInicialIcon();
            repaint();
        }
        else
            this.next_turn.setEnabled(false);
        repaint();
    }//GEN-LAST:event_next_turnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton combat;
    private GUI.MonsterView currentMonster;
    private GUI.PlayerView currentPlayer;
    private javax.swing.JLabel etiqueta_combate;
    private javax.swing.JToggleButton meet_monster;
    private javax.swing.JToggleButton next_turn;
    private javax.swing.JPanel player_monster;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
