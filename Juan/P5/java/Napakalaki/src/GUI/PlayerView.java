/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import NapakalakiGame.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class PlayerView extends javax.swing.JPanel {

    private Player playerModel;
    private Napakalaki napakalakiModel ;

    private boolean robado = false;

    
    /**
     * Creates new form PlayerView
     */
    
    private CombatResult combate;
    public PlayerView() {
        initComponents();
        
       
    }

    
    
    public void setPlayer(Player playerModel)  {
        this.playerModel = playerModel;
        this.nombre.setText(playerModel.getName());
        this.level.setText(Integer.toString(playerModel.getLevels()));
        this.combatLevel.setText(Integer.toString(playerModel.getCombatLevel()));
        
//        if(napakalakiModel!=null)
//        this.napakalakiModel.getCurrentMonster().getBadConsequence().
//                adjustToFitTreasureList(napakalakiModel.getCurrentPlayer()
//                        .getVisibleTreasures(), napakalakiModel.getCurrentPlayer().getVisibleTreasures());
        
//       if(playerModel instaceof Cultist){
//        playerModel;
   // }
        /*Cambiar icono jugador*/
       
       if(playerModel.getName() !=null&& playerModel.getName().length()>0){
        String path = null;  
        
        String aux = playerModel.getName();
        int n = aux.length(); // obtenemos el tamaño de la cadena
        aux =aux.substring(n-1); // obtenemos el último carácter

        
        if(aux.contains("b")){//){
             path ="/Jugador/jugador_uno.jpg";
        }
        else if(aux.equals("a")){
            path = "/Jugador/jugadora.jpg";
        }
        else{
            path = "/Jugador/jugador_tres.jpg";
        }
        
       
        URL url = this.getClass().getResource(path);
        this.jugador.setIcon(new ImageIcon(url));
    }        
      
        
   //     this.resultado.setText(napakalakiModel
        if(playerModel.getEnemy()!=null)   
        this.enemigo.setText(playerModel.getEnemy().getName());
        // Incluir instrucciones para actualizar su nombre, nivel, etc.
        // A continuación se actualizan sus tesoros
        
        System.out.println(playerModel.getHiddenTreasures());
        
        this.fillTreasurePanel(visibleTreasures,playerModel.getVisibleTreasures());
        this.fillTreasurePanel(hiddenTreasures,playerModel.getHiddenTreasures());        
        
        
        repaint();
        
        revalidate();

    }

    public void setSectario(boolean a) {
        this.label_sectario.setVisible(a); 
        this.sectario.setVisible(false);
        repaint();
    }

    public JButton getMakeVisible() {
        return makeVisible;
    }
    
   
    private void fillTreasurePanel (JPanel aPanel, ArrayList<Treasure> aList) {
        // Se elimina la información antigua, si la hubiera
        aPanel.removeAll();
        // Se recorre la lista de tesoros construyendo y añadiendo sus vistas
        // al panel
        if(aList != null){
        for (Treasure t : aList) {
           
            TreasureView aTreasureView = new TreasureView();
            aTreasureView.setTreasure (t);
            
            aTreasureView.setVisible (true);
            aPanel.add(aTreasureView);
            
//           
              aPanel.add(BorderLayout.CENTER,aTreasureView);
        }
        // Se fuerza la actualización visual del panel
        aPanel.repaint();
        aPanel.revalidate();
    }
    }

    public void setNapakalakiModel(Napakalaki napakalakiModel) {
        this.napakalakiModel = napakalakiModel;
    }
    
    private ArrayList<Treasure> getSelectedTreasures(JPanel aPanel) {
    // Se recorren los tesoros que contiene el panel,
    // almacenando en un vector aquellos que están seleccionados.
    // Finalmente se devuelve dicho vector.
        TreasureView tv;
        ArrayList<Treasure> output = new ArrayList();
        for (Component c : aPanel.getComponents()) {
            tv = (TreasureView) c;
            if (tv.isSelected()) {
                output.add(tv.getTreasureModel());
            }
        }
        return output;
    }
     public String getCombate() {
        return combate.toString();
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
        jugador = new javax.swing.JLabel();

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

        label_nombre.setText("Nombre");

        nombre.setText("NOMBRE");

        label_nivel.setText("Nivel");

        level.setText("LEVEL");

        combatLevel.setText("NIVEL COMBATE");

        enemigo.setText("ENEMIGO");

        label_enemigo.setText("Enemigo");

        label_n_combate.setText("Nivel de combate");

        sectario.setText("NO");
        sectario.setEnabled(false);

        label_sectario.setText("Sectario");

        jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jugador/jugador_uno.jpg"))); // NOI18N

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_n_combate)
                            .addComponent(label_nivel)
                            .addComponent(label_nombre)
                            .addComponent(label_sectario)
                            .addComponent(label_enemigo))
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(combatLevel)
                            .addComponent(level)
                            .addComponent(enemigo)
                            .addComponent(sectario))
                        .addGap(51, 51, 51)
                        .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(discard, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(makeVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(steal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(discardAll))
                    .addComponent(hiddenTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                    .addComponent(visibleTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hiddenTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nombre)
                            .addComponent(nombre))
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nivel)
                                    .addComponent(level))
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(label_n_combate))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combatLevel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_enemigo)
                                    .addComponent(enemigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_sectario)
                                    .addComponent(sectario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(makeVisible)
                                .addComponent(steal)
                                .addComponent(discardAll)
                                .addComponent(discard))))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugador)))
                .addGap(0, 0, 0))
        );

        add(principal, java.awt.BorderLayout.LINE_START);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Función Para robar tesoros
     * @param evt 
     */
    private void stealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stealActionPerformed

        if (this.robado == false) {        // TODO add your handling code here:

            if (this.robado == false) {        // TODO add your handling code here:

                playerModel.stealTreasure();
                this.robado = true;
                repaint();
            }
        }
    }//GEN-LAST:event_stealActionPerformed

    private void makeVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeVisibleActionPerformed
        ArrayList<Treasure> selHidden = this.getSelectedTreasures(hiddenTreasures);
        this.napakalakiModel.makeTreasuresVisible(selHidden);
        
            this.setPlayer(napakalakiModel.getCurrentPlayer());
        
           
        
    }//GEN-LAST:event_makeVisibleActionPerformed

    private void discardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardActionPerformed

        ArrayList<Treasure> selVisible = getSelectedTreasures(visibleTreasures);
        this.napakalakiModel.discardVisibleTreasures(selVisible);

        ArrayList<Treasure> selHidden = getSelectedTreasures(hiddenTreasures);

        this.napakalakiModel.discardHiddenTreasures(selHidden);

        
            setPlayer(napakalakiModel.getCurrentPlayer());
        
           
        

        this.repaint();


    }//GEN-LAST:event_discardActionPerformed

    private void discardAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardAllActionPerformed
       
        this.hiddenTreasures.removeAll();
        this.visibleTreasures.removeAll();
        playerModel.discardAllTreasures();
        repaint();
    }//GEN-LAST:event_discardAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel combatLevel;
    private javax.swing.JButton discard;
    private javax.swing.JButton discardAll;
    private javax.swing.JLabel enemigo;
    private javax.swing.JPanel hiddenTreasures;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugador;
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
