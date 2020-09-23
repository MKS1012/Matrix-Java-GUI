/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author MKS
 */
public class Apps extends javax.swing.JFrame {

    /**
     * Creates new form Apps
     */
    public Apps() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReurnBTN = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application of matrix");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 52)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html> <body>   <center> Matrices</center> </body> </html>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 270, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Applications of Matrix -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\n<body>\nThere are numerous applications of matrices, both in mathematics and other sciences. Some of them merely take advantage of the compact representation of a set of numbers in a matrix. \n<p>\n<ol type= \"disc\">\n<li><u>Graph theory</u> -The adjacency matrix of a finite graph is a basic notion of graph theory.\n<li><u>Electronics</u>-Traditional mesh analysis in electronics leads to a system of linear equations that can be described with a matrix.\n<li>\n<u>Symmetries and transformations in physics</u>-Linear transformations and the associated symmetries play a key role in modern physics. For example, elementary particles in quantum field theory are classified as representations of the Lorentz group of special relativity and, more specifically, by their behavior under the spin group.\n <li><u>Probability theory and statistics</u>-Stochastic matrices are square matrices whose rows are probability vectors, i.e., whose entries are non-negative and sum up to one. Stochastic matrices are used to define Markov chains with finitely many states.\n\n</p>\n</body>\n</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 870, -1));

        ReurnBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ReurnBTN.setForeground(new java.awt.Color(153, 0, 0));
        ReurnBTN.setText("<<  Back");
        ReurnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReurnBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ReurnBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matrix/green-blank-blackboard.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReurnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReurnBTNActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_ReurnBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apps().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReurnBTN;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
