/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totemhospitalar;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author rfl
 */
public class QuestionarioJFrame extends javax.swing.JFrame {

    /**
     * Creates new form QuestionarioJFrame
     */
    
    String aglomeracao = "off";
    String contato = "off";
    String diarreia = "off";
    String dificuldadeRespirar = "off";
    String dorCabeca = "off";
    String dorCorpo = "off";
    String dorGarganta = "off";
    String tosse = "off";
    String espirro = "off";
    String febre = "off";
   
    
    
    
    public QuestionarioJFrame() {
        initComponents();
        UIManager.put("ToggleButton.select", Color.decode("#66FF66"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        febreButton = new javax.swing.JToggleButton();
        dorCabecaButton = new javax.swing.JToggleButton();
        espirroButton = new javax.swing.JToggleButton();
        dorGargantaButton = new javax.swing.JToggleButton();
        tosseButton = new javax.swing.JToggleButton();
        dificuldadeRespirarButton = new javax.swing.JToggleButton();
        dorCorpoButton = new javax.swing.JToggleButton();
        diarreiaButton = new javax.swing.JToggleButton();
        contatoButton = new javax.swing.JToggleButton();
        aglomeracaoButton = new javax.swing.JToggleButton();
        enviarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(460, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Triagem de Pacientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("<html>Agora responda as perguntas para descobrir a qual Ala se dirigir e<br />depois clique em enviar para saber a resposta:</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 58, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("Agora responda as perguntas para descobrir a qual Ala se dirigir e depois clique em enviar para saber a resposta:");

        jLabel3.setText("Você possui febre?........................................................");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setText("Teve dor de cabeça?.....................................................");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Você possui secreção nasal ou espirros?..............................");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setText("Tem dor/irritação na garganta?.........................................");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setText("Tem tosse seca?..........................................................");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel8.setText("Tem dificuldade respiratória?............................................");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel9.setText("Tem dores no corpo?.....................................................");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel10.setText("Tem diarreia?..............................................................");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel11.setText("<html>Esteve em contato, nos últimos 14 dias, com um caso <br /> diagnosticado com Covid-19?...........................................</html>");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 358, -1));

        jLabel12.setText("Esteve em locais com grande aglomeração?..........................");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        febreButton.setBackground(new java.awt.Color(255, 102, 102));
        febreButton.setText("Não");
        febreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                febreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(febreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        dorCabecaButton.setBackground(new java.awt.Color(255, 102, 102));
        dorCabecaButton.setText("Não");
        dorCabecaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dorCabecaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dorCabecaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        espirroButton.setBackground(new java.awt.Color(255, 102, 102));
        espirroButton.setText("Não");
        espirroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espirroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(espirroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        dorGargantaButton.setBackground(new java.awt.Color(255, 102, 102));
        dorGargantaButton.setText("Não");
        dorGargantaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dorGargantaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dorGargantaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        tosseButton.setBackground(new java.awt.Color(255, 102, 102));
        tosseButton.setText("Não");
        tosseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tosseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tosseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        dificuldadeRespirarButton.setBackground(new java.awt.Color(255, 102, 102));
        dificuldadeRespirarButton.setText("Não");
        dificuldadeRespirarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldadeRespirarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dificuldadeRespirarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        dorCorpoButton.setBackground(new java.awt.Color(255, 102, 102));
        dorCorpoButton.setText("Não");
        dorCorpoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dorCorpoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dorCorpoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        diarreiaButton.setBackground(new java.awt.Color(255, 102, 102));
        diarreiaButton.setText("Não");
        diarreiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diarreiaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(diarreiaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        contatoButton.setBackground(new java.awt.Color(255, 102, 102));
        contatoButton.setText("Não");
        contatoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(contatoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        aglomeracaoButton.setBackground(new java.awt.Color(255, 102, 102));
        aglomeracaoButton.setText("Não");
        aglomeracaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aglomeracaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aglomeracaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enviarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contatoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contatoButtonActionPerformed
        if (contatoButton.isSelected()) {
            contato = "on";
            contatoButton.setBackground(Color.decode("#66FF66"));
            contatoButton.setText("Sim");
        }else{
            contato = "off";
            contatoButton.setBackground(Color.decode("#FF6666"));
            contatoButton.setText("Não");
        }

        SwingUtilities.updateComponentTreeUI(contatoButton);
    }//GEN-LAST:event_contatoButtonActionPerformed

    private void febreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_febreButtonActionPerformed
       
        if (febreButton.isSelected()) {
            febre = "on";
            febreButton.setBackground(Color.decode("#66FF66"));
            febreButton.setText("Sim");
        }else{
            febre = "off";
            febreButton.setBackground(Color.decode("#FF6666"));
            febreButton.setText("Não");
        }

        SwingUtilities.updateComponentTreeUI(febreButton);
        System.out.println("Febre: "+ febre);
        
        
    }//GEN-LAST:event_febreButtonActionPerformed

    private void dorCabecaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dorCabecaButtonActionPerformed
        if (dorCabecaButton.isSelected()) {
               dorCabeca = "on";
               dorCabecaButton.setBackground(Color.decode("#66FF66"));
               dorCabecaButton.setText("Sim");
           }else{
               dorCabeca = "off";
               dorCabecaButton.setBackground(Color.decode("#FF6666"));
               dorCabecaButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(dorCabecaButton);
    }//GEN-LAST:event_dorCabecaButtonActionPerformed

    private void espirroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espirroButtonActionPerformed
        if (espirroButton.isSelected()) {
               espirro = "on";
               espirroButton.setBackground(Color.decode("#66FF66"));
               espirroButton.setText("Sim");
           }else{
               espirro = "off";
               espirroButton.setBackground(Color.decode("#FF6666"));
               espirroButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(espirroButton);
    }//GEN-LAST:event_espirroButtonActionPerformed

    private void dorGargantaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dorGargantaButtonActionPerformed
        if (dorGargantaButton.isSelected()) {
               dorGarganta = "on";
               dorGargantaButton.setBackground(Color.decode("#66FF66"));
               dorGargantaButton.setText("Sim");
           }else{
               dorGarganta = "off";
               dorGargantaButton.setBackground(Color.decode("#FF6666"));
               dorGargantaButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(dorGargantaButton);
    }//GEN-LAST:event_dorGargantaButtonActionPerformed

    private void tosseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tosseButtonActionPerformed
        if (tosseButton.isSelected()) {
               tosse = "on";
               tosseButton.setBackground(Color.decode("#66FF66"));
               tosseButton.setText("Sim");
           }else{
               tosse = "off";
               tosseButton.setBackground(Color.decode("#FF6666"));
               tosseButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(tosseButton);
    }//GEN-LAST:event_tosseButtonActionPerformed

    private void aglomeracaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aglomeracaoButtonActionPerformed
        if (aglomeracaoButton.isSelected()) {
               aglomeracao = "on";
               aglomeracaoButton.setBackground(Color.decode("#66FF66"));
               aglomeracaoButton.setText("Sim");
           }else{
               aglomeracao = "off";
               aglomeracaoButton.setBackground(Color.decode("#FF6666"));
               aglomeracaoButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(aglomeracaoButton);
    }//GEN-LAST:event_aglomeracaoButtonActionPerformed

    private void dificuldadeRespirarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldadeRespirarButtonActionPerformed
        if (dificuldadeRespirarButton.isSelected()) {
               dificuldadeRespirar = "on";
               dificuldadeRespirarButton.setBackground(Color.decode("#66FF66"));
               dificuldadeRespirarButton.setText("Sim");
           }else{
               dificuldadeRespirar = "off";
               dificuldadeRespirarButton.setBackground(Color.decode("#FF6666"));
               dificuldadeRespirarButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(dificuldadeRespirarButton);
    }//GEN-LAST:event_dificuldadeRespirarButtonActionPerformed

    private void dorCorpoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dorCorpoButtonActionPerformed
        if (dorCorpoButton.isSelected()) {
               dorCorpo = "on";
               dorCorpoButton.setBackground(Color.decode("#66FF66"));
               dorCorpoButton.setText("Sim");
           }else{
               dorCorpo = "off";
               dorCorpoButton.setBackground(Color.decode("#FF6666"));
               dorCorpoButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(dorCorpoButton);
    }//GEN-LAST:event_dorCorpoButtonActionPerformed

    private void diarreiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diarreiaButtonActionPerformed
        if (diarreiaButton.isSelected()) {
               diarreia = "on";
               diarreiaButton.setBackground(Color.decode("#66FF66"));
               diarreiaButton.setText("Sim");
           }else{
               diarreia = "off";
               diarreiaButton.setBackground(Color.decode("#FF6666"));
               diarreiaButton.setText("Não");
           }
           
        SwingUtilities.updateComponentTreeUI(diarreiaButton);
    }//GEN-LAST:event_diarreiaButtonActionPerformed

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        
        Sintomas s = new Sintomas();
              
        if (febre.equals("on")){
            s.setPontuacao(5);
        }
        if (aglomeracao.equals("on")){
            s.setPontuacao(3);
        }
        if (contato.equals("on")){
            s.setPontuacao(10);
        }
        if (diarreia.equals("on")){
            s.setPontuacao(1);
        }
        if (dificuldadeRespirar.equals("on")){
            s.setPontuacao(10);
        }
        if (dorCabeca.equals("on")){
            s.setPontuacao(1);
        }
        if (dorCorpo.equals("on")){
            s.setPontuacao(1);
        }
        if (dorGarganta.equals("on")){
            s.setPontuacao(1);
        }
        if (tosse.equals("on")){
            s.setPontuacao(3);
        }
        if (espirro.equals("on")){
            s.setPontuacao(1);
        }
        
        if (s.getPontuacao() <= 9) {
            s.setAla("Baixo");
        } else if (s.getPontuacao() >= 10 && s.getPontuacao() <= 19){
            s.setAla("Médio");
        }else if (s.getPontuacao() >= 20){
            s.setAla("Alto");
        }
        System.out.println("Pontuação: " + s.getPontuacao());
        JOptionPane.showMessageDialog(null, "Favor dirigir-se para a ala de risco: "+ s.getAla());
        
        this.setVisible(false);
    }//GEN-LAST:event_enviarButtonActionPerformed
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aglomeracaoButton;
    private javax.swing.JToggleButton contatoButton;
    private javax.swing.JToggleButton diarreiaButton;
    private javax.swing.JToggleButton dificuldadeRespirarButton;
    private javax.swing.JToggleButton dorCabecaButton;
    private javax.swing.JToggleButton dorCorpoButton;
    private javax.swing.JToggleButton dorGargantaButton;
    private javax.swing.JButton enviarButton;
    private javax.swing.JToggleButton espirroButton;
    private javax.swing.JToggleButton febreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton tosseButton;
    // End of variables declaration//GEN-END:variables
}
