package br.com.flarom.passport;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import javax.swing.UIManager;
import org.flywaydb.core.Flyway;

public class frmMain extends javax.swing.JFrame {

    public frmMain() {
        initComponents();
        pnlPassword pnl = new pnlPassword("Github", "Flarom", "47483", "#042c69");
        pnlPassword pnl2 = new pnlPassword("Google", "Flarom", "123", "#FFFFFF");
        pnlPassword pnl3 = new pnlPassword("Steam", "Flarom", "123", "#0772ba");
        pnlPassword pnl4 = new pnlPassword("ChatGPT", "Flarom", "48329", "#6da397");
        pnlPassword pnl5 = new pnlPassword("ChatGPT", "Flarom", "48329", "#6da397");
        pnlPasswordsContainer.add(pnl);
        pnlPasswordsContainer.add(pnl2);
        pnlPasswordsContainer.add(pnl3);
        pnlPasswordsContainer.add(pnl4);
        updateScrollBar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 200));
        btnFilter = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 200));
        btnSearch = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btnSettings = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPasswordsContainer = new javax.swing.JPanel();
        pnlPlaceholder = new javax.swing.JPanel();
        lblPlaceholderTitle = new javax.swing.JLabel();
        lblPlaceholderDescription = new javax.swing.JLabel();
        btnPlaceholderNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passport");
        setMinimumSize(new java.awt.Dimension(364, 0));

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        btnAdd.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 18)); // NOI18N
        btnAdd.setMnemonic('n');
        btnAdd.setText("");
        btnAdd.setToolTipText("New password");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdd);
        jToolBar1.add(filler2);

        btnFilter.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 18)); // NOI18N
        btnFilter.setMnemonic('f');
        btnFilter.setText("");
        btnFilter.setToolTipText("Filter");
        btnFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFilter.setFocusable(false);
        btnFilter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFilter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnFilter);
        jToolBar1.add(filler3);

        btnSearch.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 18)); // NOI18N
        btnSearch.setMnemonic('s');
        btnSearch.setText("");
        btnSearch.setToolTipText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSearch);
        jToolBar1.add(filler1);

        btnSettings.setFont(new java.awt.Font("Segoe Fluent Icons", 0, 18)); // NOI18N
        btnSettings.setMnemonic('p');
        btnSettings.setText("");
        btnSettings.setToolTipText("Settings");
        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSettings.setFocusable(false);
        btnSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSettings);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlPasswordsContainer.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlPasswordsContainer.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlPasswordsContainerComponentAdded(evt);
            }
        });
        pnlPasswordsContainer.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                pnlPasswordsContainerAncestorResized(evt);
            }
        });
        pnlPasswordsContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        pnlPlaceholder.setBackground(java.awt.Color.white);
        pnlPlaceholder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 194, 194)));
        pnlPlaceholder.setPreferredSize(new java.awt.Dimension(286, 123));

        lblPlaceholderTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlaceholderTitle.setText("No secrets here");

        lblPlaceholderDescription.setText("how about adding the first one?");

        btnPlaceholderNew.setBackground(new java.awt.Color(34, 133, 225));
        btnPlaceholderNew.setForeground(java.awt.Color.white);
        btnPlaceholderNew.setText("New password");
        btnPlaceholderNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaceholderNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlaceholderLayout = new javax.swing.GroupLayout(pnlPlaceholder);
        pnlPlaceholder.setLayout(pnlPlaceholderLayout);
        pnlPlaceholderLayout.setHorizontalGroup(
            pnlPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlaceholderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlaceholderTitle)
                    .addComponent(lblPlaceholderDescription)
                    .addComponent(btnPlaceholderNew))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pnlPlaceholderLayout.setVerticalGroup(
            pnlPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlaceholderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlaceholderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlaceholderDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnPlaceholderNew)
                .addContainerGap())
        );

        pnlPasswordsContainer.add(pnlPlaceholder);

        jScrollPane1.setViewportView(pnlPasswordsContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgPasswordEditor dlg = new dlgPasswordEditor(this);
        dlg.Create();
    }//GEN-LAST:event_btnAddActionPerformed

    private void pnlPasswordsContainerComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlPasswordsContainerComponentAdded
        if (pnlPasswordsContainer.getComponentCount() >= 2) {
            pnlPasswordsContainer.remove(pnlPlaceholder);
            updateScrollBar();
        }
    }//GEN-LAST:event_pnlPasswordsContainerComponentAdded

    private void pnlPasswordsContainerAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_pnlPasswordsContainerAncestorResized
       updateScrollBar();
    }//GEN-LAST:event_pnlPasswordsContainerAncestorResized

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        dlgInput dlg = new dlgInput(this);
        String searchTerm = dlg.Show("Search", "Enter what are you looking for bellow:", "\ue11a", "Search");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void updateScrollBar() {
        int buttonHeight = 123;
        int buttonWidth = 286;
        int spacing = 5;
        int lineHeight = buttonHeight + spacing;

        int availableWidth = pnlPasswordsContainer.getWidth();

        int buttonsPerLine = availableWidth / (buttonWidth + spacing);

        int totalButtons = pnlPasswordsContainer.getComponentCount();

        int rows = (int) Math.ceil((double) totalButtons / buttonsPerLine);

        int preferredHeight = rows * lineHeight;

        pnlPasswordsContainer.setPreferredSize(new Dimension(pnlPasswordsContainer.getPreferredSize().width, preferredHeight));

        pnlPasswordsContainer.revalidate();
        pnlPasswordsContainer.repaint();
    }
    
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });

        Flyway.configure()
                .dataSource("jdbc:sqlite:passportdata.db", "", "")
                .load()
                .migrate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnPlaceholderNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSettings;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblPlaceholderDescription;
    private javax.swing.JLabel lblPlaceholderTitle;
    private javax.swing.JPanel pnlPasswordsContainer;
    private javax.swing.JPanel pnlPlaceholder;
    // End of variables declaration//GEN-END:variables
}
