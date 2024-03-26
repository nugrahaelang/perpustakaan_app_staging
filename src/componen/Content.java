package componen;

import java.io.File;
import java.net.URL;

public class Content extends javax.swing.JPanel {


    public Content(String name) {
        initComponents();
        isicontent.setText(name);
    }

    public Content(URL url) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Content(File file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isicontent = new javax.swing.JLabel();

        isicontent.setBackground(new java.awt.Color(255, 255, 255));
        isicontent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isicontent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isicontent.setText("CONTENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isicontent, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isicontent, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel isicontent;
    // End of variables declaration//GEN-END:variables
}
