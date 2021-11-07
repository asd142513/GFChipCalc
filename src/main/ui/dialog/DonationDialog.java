package main.ui.dialog;

import javax.swing.JDialog;
import main.App;
import main.ui.resource.AppImage;
import main.ui.resource.AppText;
import main.util.Fn;
import main.util.IO;

public class DonationDialog extends JDialog {

    private final App app;

    public static DonationDialog getInstance(App app) {
        return new DonationDialog(app);
    }

    private DonationDialog(App app) {
        initComponents();
        this.app = app;
        init();
    }

    private void init() {
        setTitle("Donation");

        paypalQRLabel.setIcon(AppImage.PAYPALQR);
        paypalQRLabel.setText("");
        paypalQRDescLabel.setIcon(AppImage.PAYPAL);
        closeButton.setText(app.getText(AppText.ACTION_CLOSE));

        addListeners();

//        Dimension d = getPreferredSize();
//        d.height = app.mf.getPreferredDialogSize().height;
//        setPreferredSize(d);
        pack();
    }

    private void addListeners() {
        Fn.addEscDisposeListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paypalButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        paypalQRLabel = new javax.swing.JLabel();
        paypalQRDescLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("모두 적용");
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        paypalButton.setText("Go to PayPal website");
        paypalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paypalButtonActionPerformed(evt);
            }
        });

        paypalQRLabel.setText("QR");

        paypalQRDescLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paypalQRDescLabel.setText("<html><center>PayPal<br>QR Code</center></html?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paypalQRLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paypalQRDescLabel)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(paypalQRDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paypalQRLabel))
        );

        closeButton.setText("cancel");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paypalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paypalButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paypalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paypalButtonActionPerformed
        IO.openWeb(app, this, "https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=bunnyspa242%40gmail.com&currency_code=USD&source=url");
    }//GEN-LAST:event_paypalButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton paypalButton;
    private javax.swing.JLabel paypalQRDescLabel;
    private javax.swing.JLabel paypalQRLabel;
    // End of variables declaration//GEN-END:variables
}
