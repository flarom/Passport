package br.com.flarom.passport.Objects;

import br.com.flarom.passport.Dialogs.dlgPasswordEditor;
import static br.com.flarom.passport.Helpers.MiscHelper.colorToString;
import static br.com.flarom.passport.Helpers.MiscHelper.stringToColor;
import br.com.flarom.passport.MiscDialogs.dlgColorInput;
import br.com.flarom.passport.MiscDialogs.dlgTextInput;
import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class pnlPassword extends javax.swing.JPanel {

    private Color color;
    private Password password;

    public pnlPassword(Password p) {
        this.password = p;

        initComponents();

        lblServiceName.setText(p.getService_name());
        lblUsername.setText(p.getUser_name());
        lblPassword.setText(p.getPassword());
        color = stringToColor(p.getColor());

        updateColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmnOptions = new javax.swing.JPopupMenu();
        mnuCopy = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuColor = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenuItem();
        mnuProperties = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuDelete = new javax.swing.JMenuItem();
        pnlSidebar = new javax.swing.JPanel();
        btnOptions = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblServiceName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JPasswordField();

        mnuCopy.setText("Copy");
        mnuCopy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        cmnOptions.add(mnuCopy);
        cmnOptions.add(jSeparator2);

        mnuColor.setText("Change color");
        mnuColor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuColorActionPerformed(evt);
            }
        });
        cmnOptions.add(mnuColor);

        mnuEdit.setText("Edit");
        mnuEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditActionPerformed(evt);
            }
        });
        cmnOptions.add(mnuEdit);

        mnuProperties.setText("Properties");
        mnuProperties.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmnOptions.add(mnuProperties);
        cmnOptions.add(jSeparator1);

        mnuDelete.setForeground(new java.awt.Color(220, 53, 69));
        mnuDelete.setText("Delete");
        mnuDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteActionPerformed(evt);
            }
        });
        cmnOptions.add(mnuDelete);

        setBackground(new java.awt.Color(251, 251, 251));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 194, 194)));
        setMaximumSize(new java.awt.Dimension(286, 123));
        setMinimumSize(new java.awt.Dimension(286, 123));

        pnlSidebar.setBackground(new java.awt.Color(0, 0, 0));

        btnOptions.setBackground(new java.awt.Color(0, 0, 0));
        btnOptions.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 16)); // NOI18N
        btnOptions.setForeground(new java.awt.Color(255, 255, 255));
        btnOptions.setText("");
        btnOptions.setToolTipText("Options");
        btnOptions.setBorder(null);
        btnOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOptionsMousePressed(evt);
            }
        });

        btnCopy.setBackground(new java.awt.Color(0, 0, 0));
        btnCopy.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 16)); // NOI18N
        btnCopy.setForeground(new java.awt.Color(255, 255, 255));
        btnCopy.setText("");
        btnCopy.setToolTipText("Copy");
        btnCopy.setBorder(null);
        btnCopy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 16)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("");
        btnView.setToolTipText("Show password");
        btnView.setBorder(null);
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnOptions, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(btnCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addComponent(btnOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblServiceName.setEditable(false);
        lblServiceName.setBackground(new java.awt.Color(251, 251, 251));
        lblServiceName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblServiceName.setText("Service name");
        lblServiceName.setBorder(null);

        lblUsername.setEditable(false);
        lblUsername.setBackground(new java.awt.Color(251, 251, 251));
        lblUsername.setText("Username");
        lblUsername.setBorder(null);

        lblPassword.setEditable(false);
        lblPassword.setBackground(new java.awt.Color(251, 251, 251));
        lblPassword.setText("Password");
        lblPassword.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServiceName, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public Password getPassword() {
        return this.password;
    }

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        StringSelection stringSelection = new StringSelection(password.getPassword());

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopyActionPerformed

    private boolean showing = false;
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        if (showing) {
            lblPassword.setEchoChar('\u2022');
            btnView.setToolTipText("Show password");
            btnView.setText("\ue052");
        } else {
            lblPassword.setEchoChar((char) 0);
            btnView.setToolTipText("Hide password");
            btnView.setText("\ued1a");
        }
        showing = !showing;
    }//GEN-LAST:event_btnViewActionPerformed

    private void mnuColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuColorActionPerformed
        dlgColorInput dlg = new dlgColorInput((JFrame) SwingUtilities.getWindowAncestor(pnlSidebar));
        Color newColor = dlg.getColor();

        if (newColor == null) {
            return;
        }

        this.color = newColor;
        updateColor();

        try {
            password.setColor(colorToString(newColor));
            password.Update();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuColorActionPerformed

    private void btnOptionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOptionsMousePressed
        if (!cmnOptions.isVisible())
            cmnOptions.show(btnOptions, btnOptions.getWidth(), -1);
    }//GEN-LAST:event_btnOptionsMousePressed

    private void mnuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteActionPerformed
        dlgTextInput ti = new dlgTextInput((JFrame) SwingUtilities.getWindowAncestor(pnlSidebar));
        String confirmPassword = ti.Show("Delete " + password.getService_name(), "Insert your password to confirm deletion", "", "Delete");

        if (confirmPassword == null) {
            return;
        }

        if (confirmPassword.equals(password.getPassword())) {
            password.Delete();
            Container c = this.getParent();
            c.remove(this);
            c.revalidate();
            c.repaint();
        }
    }//GEN-LAST:event_mnuDeleteActionPerformed

    private void mnuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditActionPerformed
        dlgPasswordEditor pe = new dlgPasswordEditor((JFrame) SwingUtilities.getWindowAncestor(pnlSidebar));
        pe.Edit(password);
    }//GEN-LAST:event_mnuEditActionPerformed

    public void updateColor() {
        pnlSidebar.setBackground(this.color);
        btnOptions.setBackground(this.color);
        btnCopy.setBackground(this.color);
        btnView.setBackground(this.color);

        double luminance = (0.299 * this.color.getRed() + 0.587 * this.color.getGreen() + 0.114 * this.color.getBlue()) / 255;
        Color textColor = luminance > 0.5 ? Color.BLACK : Color.WHITE;

        btnOptions.setForeground(textColor);
        btnCopy.setForeground(textColor);
        btnView.setForeground(textColor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnOptions;
    private javax.swing.JButton btnView;
    private javax.swing.JPopupMenu cmnOptions;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPasswordField lblPassword;
    private javax.swing.JTextField lblServiceName;
    private javax.swing.JTextField lblUsername;
    private javax.swing.JMenuItem mnuColor;
    private javax.swing.JMenuItem mnuCopy;
    private javax.swing.JMenuItem mnuDelete;
    private javax.swing.JMenuItem mnuEdit;
    private javax.swing.JMenuItem mnuProperties;
    private javax.swing.JPanel pnlSidebar;
    // End of variables declaration//GEN-END:variables
}