/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingDO;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmo
 */
public class Session extends javax.swing.JFrame {

    /**
     * Creates new form Session
     */
    
    private boolean[] Busy, waiting;
    private final int MaxSleep = 5;
    private final int MaxBusy = 5;
    private final int Waiting = 6;
    private static int num_DOs, num_Patients, num_Chairs;
    public Session(int num_DOs, int num_Patients, int num_Chairs) {
        initComponents();
        this.num_DOs = num_DOs;
        this.num_Patients = num_Patients;
        this.num_Chairs = num_Chairs;
        Busy = new boolean[this.num_DOs];
        waiting = new boolean[this.num_Chairs];
        
        for (int i = this.num_DOs; i < (MaxSleep + MaxBusy); i++) {
            DOPanel.getComponent(i).setVisible(false);
        }
        
        for (int i = 0; i < Waiting; i++) {
            WaitPanel.getComponent(i).setVisible(false);
        }
        
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DOText = new javax.swing.JLabel();
        WaitingText = new javax.swing.JLabel();
        DOPanel = new javax.swing.JPanel();
        sleepDO1 = new javax.swing.JLabel();
        sleepDO2 = new javax.swing.JLabel();
        sleepDO3 = new javax.swing.JLabel();
        sleepDO4 = new javax.swing.JLabel();
        sleepDO5 = new javax.swing.JLabel();
        Busy1 = new javax.swing.JLabel();
        Busy2 = new javax.swing.JLabel();
        Busy3 = new javax.swing.JLabel();
        Busy4 = new javax.swing.JLabel();
        Busy5 = new javax.swing.JLabel();
        WaitPanel = new javax.swing.JPanel();
        waiting1 = new javax.swing.JLabel();
        waiting2 = new javax.swing.JLabel();
        waiting3 = new javax.swing.JLabel();
        waiting4 = new javax.swing.JLabel();
        waiting5 = new javax.swing.JLabel();
        waiting6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        DOText.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        DOText.setForeground(new java.awt.Color(255, 255, 255));
        DOText.setText("All TAs are sleeping");
        getContentPane().add(DOText);
        DOText.setBounds(70, 20, 720, 80);

        WaitingText.setFont(new java.awt.Font("Showcard Gothic", 3, 26)); // NOI18N
        WaitingText.setForeground(new java.awt.Color(255, 255, 255));
        WaitingText.setText("waiting chairs are available");
        getContentPane().add(WaitingText);
        WaitingText.setBounds(60, 320, 800, 50);

        DOPanel.setLayout(null);

        sleepDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (2)_300x250.jpg"))); // NOI18N
        sleepDO1.setText("jLabel5");
        DOPanel.add(sleepDO1);
        sleepDO1.setBounds(0, 0, 180, 160);

        sleepDO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (2)_300x250.jpg"))); // NOI18N
        sleepDO2.setText("jLabel5");
        DOPanel.add(sleepDO2);
        sleepDO2.setBounds(160, 0, 190, 160);

        sleepDO3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (2)_300x250.jpg"))); // NOI18N
        sleepDO3.setText("jLabel5");
        DOPanel.add(sleepDO3);
        sleepDO3.setBounds(340, 0, 200, 160);

        sleepDO4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (2)_300x250.jpg"))); // NOI18N
        sleepDO4.setText("jLabel5");
        DOPanel.add(sleepDO4);
        sleepDO4.setBounds(500, 0, 200, 160);

        sleepDO5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (2)_300x250.jpg"))); // NOI18N
        sleepDO5.setText("jLabel5");
        DOPanel.add(sleepDO5);
        sleepDO5.setBounds(690, 0, 170, 150);

        Busy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (1)_250x200.jpg"))); // NOI18N
        Busy1.setText("jLabel2");
        DOPanel.add(Busy1);
        Busy1.setBounds(0, 0, 170, 150);

        Busy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (1)_250x200.jpg"))); // NOI18N
        Busy2.setText("jLabel2");
        DOPanel.add(Busy2);
        Busy2.setBounds(170, 0, 170, 150);

        Busy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (3)_250x200.jpg"))); // NOI18N
        Busy3.setText("jLabel2");
        DOPanel.add(Busy3);
        Busy3.setBounds(340, 0, 170, 150);

        Busy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (1)_250x200.jpg"))); // NOI18N
        Busy4.setText("jLabel2");
        DOPanel.add(Busy4);
        Busy4.setBounds(510, 0, 170, 150);

        Busy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/images (3)_250x200.jpg"))); // NOI18N
        Busy5.setText("jLabel2");
        DOPanel.add(Busy5);
        Busy5.setBounds(680, 0, 170, 150);

        getContentPane().add(DOPanel);
        DOPanel.setBounds(20, 130, 850, 150);

        WaitPanel.setLayout(null);

        waiting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/Download3_300x250.jpg"))); // NOI18N
        WaitPanel.add(waiting1);
        waiting1.setBounds(-20, 0, 170, 120);

        waiting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/download_250x200.jpg"))); // NOI18N
        WaitPanel.add(waiting2);
        waiting2.setBounds(250, 0, 150, 120);

        waiting3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/Download3_300x250.jpg"))); // NOI18N
        WaitPanel.add(waiting3);
        waiting3.setBounds(120, 0, 180, 120);

        waiting4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/download_250x200.jpg"))); // NOI18N
        waiting4.setText("jLabel2");
        WaitPanel.add(waiting4);
        waiting4.setBounds(400, 0, 140, 120);

        waiting5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/Download3_300x250.jpg"))); // NOI18N
        waiting5.setText("jLabel2");
        WaitPanel.add(waiting5);
        waiting5.setBounds(520, 0, 160, 140);

        waiting6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/Download3_300x250.jpg"))); // NOI18N
        waiting6.setText("jLabel2");
        WaitPanel.add(waiting6);
        waiting6.setBounds(680, 0, 140, 120);

        getContentPane().add(WaitPanel);
        WaitPanel.setBounds(40, 390, 820, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingDO/Wait2_1024x682.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//       Session form = new Session(noOfTAs, noOfStudents, noOfChairs);
//       SleepingTA s = new SleepingTA(noOfStudents, noOfChairs, noOfTAs);
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
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Session(noOfTAs, noOfStudents, noOfChairs).setVisible(true);
//                
//        }    
//        });
        
        
        
        
    }
    
    public void Busy_DO(int DO_ID){
        try {
           
            Thread.sleep(500);
            Busy[DO_ID - 1] = true;
            DOPanel.getComponent( DO_ID - 1 ).setVisible(false);
            DOPanel.getComponent( DO_ID + MaxSleep - 1 ).setVisible(true);
            int c = getBusy_DO();
            if (c == num_DOs) {
                DOText.setText("All Doctors are Busy");
            }
            else if (c == 0){
                DOText.setText("All Doctors are available");
            }
            else{
                DOText.setText(c + " Doctors are Busy, " +(num_DOs - c)
                        +" Doctors are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Sleep_DO(int DO_ID){
        
        try {
            Thread.sleep(500);
            Busy[DO_ID - 1] = false;
            DOPanel.getComponent( DO_ID - 1 ).setVisible(true);
            DOPanel.getComponent( DO_ID + MaxSleep - 1 ).setVisible(false);
            int c = getBusy_DO();
            if (c == num_DOs) {
                DOText.setText("All Doctors are Busy");
            }
            else if (c == 0){
                DOText.setText("All Doctors are available");
            }
            else{
                DOText.setText(c + " Doctors are Busy, " +(num_DOs - c)
                        +" Doctors are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Take_Chair() throws InterruptedException{
        
        for (int i = 0; i < num_Chairs; i++) {
            if (!waiting[i]) {
                waiting[i] = true;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(true);
                int c = getWaiting_Chairs();
                if (c == num_Chairs) {
                WaitingText.setText("There is no Chair available");
            }
            else if(c == 0){
                WaitingText.setText("All Chairs are available");
            }
            else{
                WaitingText.setText(c + " Chairs are Taken, " +(num_Chairs - c)
                        +" Chairs are available");
            }
            }
        }
    }
    
    public void Return_Chair(int DO_ID) throws InterruptedException{
        
        for (int i = 0; i < num_Chairs; i++) {
            if (waiting[i]) {
                waiting[i] = false;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(false);
                int c = getWaiting_Chairs();
                if (c == num_Chairs) {
                WaitingText.setText("There is no Chair available");
            }
            else if(c == 0){
                WaitingText.setText("All Chairs are available");
            }
            else{
                WaitingText.setText(c + " Chairs are Taken, " +(num_Chairs - c)
                        +" Chairs are available");
            }
            }
        }
    }
    
    
    public int getBusy_DO(){
        int c = 0;
        for (int i = 0; i < num_DOs; i++) {
            if (Busy[i]) {
                c++;
            }
            
        }
        return c;
    }
    
    public int getWaiting_Chairs(){
        int c = 0;
        for (int i = 0; i < num_Chairs; i++) {
            if (waiting[i]) {
                c++;
            }
           
        }
        return c;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Busy1;
    private javax.swing.JLabel Busy2;
    private javax.swing.JLabel Busy3;
    private javax.swing.JLabel Busy4;
    private javax.swing.JLabel Busy5;
    private javax.swing.JPanel DOPanel;
    private javax.swing.JLabel DOText;
    private javax.swing.JPanel WaitPanel;
    private javax.swing.JLabel WaitingText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sleepDO1;
    private javax.swing.JLabel sleepDO2;
    private javax.swing.JLabel sleepDO3;
    private javax.swing.JLabel sleepDO4;
    private javax.swing.JLabel sleepDO5;
    private javax.swing.JLabel waiting1;
    private javax.swing.JLabel waiting2;
    private javax.swing.JLabel waiting3;
    private javax.swing.JLabel waiting4;
    private javax.swing.JLabel waiting5;
    private javax.swing.JLabel waiting6;
    // End of variables declaration//GEN-END:variables
}
