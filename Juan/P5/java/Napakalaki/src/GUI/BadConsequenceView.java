/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.BadConsequence;
import javax.swing.JLabel;

/**
 *
 * @author juane
 */
public class BadConsequenceView extends javax.swing.JPanel {

    private BadConsequence badConsequenceModel;
    /**
     * Creates new form BadConsequenceView
     */
    public BadConsequenceView() {
        initComponents();
        this.auxiliar.setVisible(false);
    }
     public void setBadConsequence(BadConsequence badconsequence){
        
         
         
        
            
         if(badconsequence !=null){
             String aux = badconsequence.getText();
             String aux2 = badconsequence.getText();
             int n = aux.length(); // obtenemos el tamaño de la cadena
             int mitad = n/2;
             aux = aux.substring(mitad); // obtenemos la mitad primera de la cadena
             aux2 = aux2.substring(0,mitad); // obtenemos la mitad segunda de la cadena

          
             badConsequenceModel = badconsequence;
             this.niveles.setText(Integer.toString(badConsequenceModel.getLevels()));

             this.texto.setText(aux + "\n");
             this.auxiliar.setText(aux2);
             this.auxiliar.setVisible(true);
            
         }
         else{
             this.niveles.setText("niveles perdidos");
             this.texto.setText("Mal rollo");
             this.auxiliar.setVisible(false);
             
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
        titulo = new javax.swing.JLabel();
        etiqueta_texto = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        etiqueta_niveles = new javax.swing.JLabel();
        niveles = new javax.swing.JLabel();
        auxiliar = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("BadConsequence");

        etiqueta_texto.setText("Texto");

        texto.setText("Mal rollo");

        etiqueta_niveles.setText("Niveles");

        niveles.setText("Niveles perdidos");

        auxiliar.setText("jLabel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiqueta_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiqueta_niveles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(niveles)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(auxiliar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(auxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiqueta_niveles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(niveles)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auxiliar;
    private javax.swing.JLabel etiqueta_niveles;
    private javax.swing.JLabel etiqueta_texto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel niveles;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
