
package GUI;

import NapakalakiGame.Napakalaki;
/**
 *
 * @author Raul
 */
public class NapakalakiView extends javax.swing.JFrame {

    /**
     * Creates new form NapakalakiView
     */
    
    private Napakalaki napakalakiModel;
    public NapakalakiView() {
        initComponents();
        this.setLocationRelativeTo(null); //ponemos ventana Centrada
    }

    public void setNapakalaki(Napakalaki n){
        napakalakiModel = n;
        this.currentPlayer.setPlayer(n.getCurrentPlayer());
        this.currentMonster.setMonster(n.getCurrentMonster());
        
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

        currentMonster = new GUI.MonsterView();
        currentPlayer = new GUI.PlayerView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NAPAKALAKI");

        currentMonster.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        currentPlayer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(currentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentMonster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentMonster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addComponent(currentPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.MonsterView currentMonster;
    private GUI.PlayerView currentPlayer;
    // End of variables declaration//GEN-END:variables
}
