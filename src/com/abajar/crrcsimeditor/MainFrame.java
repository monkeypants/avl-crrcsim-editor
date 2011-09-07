/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 03-jul-2011, 22:45:18
 */

package com.abajar.crrcsimeditor;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hfreire
 */
public class MainFrame extends javax.swing.JFrame {

    private CRRCsimEditor controller;
    
    /** Creates new form MainFrame */
    public MainFrame(CRRCsimEditor controller) {
        this.controller = controller;

        initComponents();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        topViewButton = new javax.swing.JButton();
        frontViewButton = new javax.swing.JButton();
        rightViewButton = new javax.swing.JButton();
        addSurfaceButton = new javax.swing.JButton();
        view3DIFrame = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        fileOpenMenuItem = new javax.swing.JMenuItem();
        fileExportAsAVLMenuItem = new javax.swing.JMenuItem();
        fileExportAsCRRsimMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        editSetAvlExecutableMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jDesktopPane1.setName("jDesktopPane1"); // NOI18N

        jInternalFrame1.setName("jInternalFrame1"); // NOI18N
        jInternalFrame1.setVisible(true);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.abajar.crrcsimeditor.CRRCsimEditor.class).getContext().getResourceMap(MainFrame.class);
        topViewButton.setText(resourceMap.getString("topViewButton.text")); // NOI18N
        topViewButton.setName("topViewButton"); // NOI18N
        topViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topViewButtonMouseClicked(evt);
            }
        });

        frontViewButton.setText(resourceMap.getString("frontViewButton.text")); // NOI18N
        frontViewButton.setName("frontViewButton"); // NOI18N
        frontViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frontViewButtonMouseClicked(evt);
            }
        });

        rightViewButton.setText(resourceMap.getString("rightViewButton.text")); // NOI18N
        rightViewButton.setName("rightViewButton"); // NOI18N
        rightViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightViewButtonMouseClicked(evt);
            }
        });

        addSurfaceButton.setText(resourceMap.getString("addSurfaceButton.text")); // NOI18N
        addSurfaceButton.setName("addSurfaceButton"); // NOI18N
        addSurfaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSurfaceButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(frontViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightViewButton))
                    .addComponent(addSurfaceButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(topViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frontViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSurfaceButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInternalFrame1.setBounds(0, 0, 80, 150);
        jDesktopPane1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        view3DIFrame.setMaximizable(true);
        view3DIFrame.setResizable(true);
        view3DIFrame.setName("view3DIFrame"); // NOI18N
        view3DIFrame.setVisible(true);

        jPanel1.setName("jPanel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout view3DIFrameLayout = new javax.swing.GroupLayout(view3DIFrame.getContentPane());
        view3DIFrame.getContentPane().setLayout(view3DIFrameLayout);
        view3DIFrameLayout.setHorizontalGroup(
            view3DIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        view3DIFrameLayout.setVerticalGroup(
            view3DIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        view3DIFrame.setBounds(90, 10, 310, 180);
        jDesktopPane1.add(view3DIFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame2.setName("jInternalFrame2"); // NOI18N
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jInternalFrame2.setBounds(30, 220, 450, 210);
        jDesktopPane1.add(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenu1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jMenu1ComponentShown(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        fileOpenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fileOpenMenuItem.setText(resourceMap.getString("fileOpenMenuItem.text")); // NOI18N
        fileOpenMenuItem.setName("fileOpenMenuItem"); // NOI18N
        fileOpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fileOpenMenuItem);

        fileExportAsAVLMenuItem.setText(resourceMap.getString("fileExportAsAVLMenuItem.text")); // NOI18N
        fileExportAsAVLMenuItem.setName("fileExportAsAVLMenuItem"); // NOI18N
        fileExportAsAVLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExportAsAVLMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fileExportAsAVLMenuItem);

        fileExportAsCRRsimMenuItem.setText(resourceMap.getString("fileExportAsCRRsimMenuItem.text")); // NOI18N
        fileExportAsCRRsimMenuItem.setName("fileExportAsCRRsimMenuItem"); // NOI18N
        fileExportAsCRRsimMenuItem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                fileExportAsCRRsimMenuItemComponentShown(evt);
            }
        });
        fileExportAsCRRsimMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExportAsCRRsimMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fileExportAsCRRsimMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(resourceMap.getString("jMenu2.text")); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N

        editSetAvlExecutableMenuItem.setText(resourceMap.getString("editSetAvlExecutableMenuItem.text")); // NOI18N
        editSetAvlExecutableMenuItem.setName("editSetAvlExecutableMenuItem"); // NOI18N
        editSetAvlExecutableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSetAvlExecutableMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(editSetAvlExecutableMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileExportAsAVLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExportAsAVLMenuItemActionPerformed
        controller.exportAsAVL();
    }//GEN-LAST:event_fileExportAsAVLMenuItemActionPerformed

    public File showOpenDialog(String extensionDescription, String...extension){
        JFileChooser fc = new JFileChooser();
        
        if (extension.length>0){
            FileNameExtensionFilter filter = new FileNameExtensionFilter(extensionDescription, extension);
            fc.setFileFilter(filter);
        }

        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        return file;
    }

    public File showSaveDialog(String extensionDescription, String extension){
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extensionDescription, extension);
        fc.setFileFilter(filter);

        fc.showSaveDialog(this);

        File file = fc.getSelectedFile();
        String filePath = file.getAbsolutePath();
        if (!filePath.contains(".")) {
            filePath += "." + extension;
            file = new File(filePath) ;
        }
        
        return file;
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        controller.saveFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void fileOpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenMenuItemActionPerformed
        controller.openFile();
    }//GEN-LAST:event_fileOpenMenuItemActionPerformed

    private void fileExportAsCRRsimMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExportAsCRRsimMenuItemActionPerformed
        this.controller.exportAsCRRCsim();
    }//GEN-LAST:event_fileExportAsCRRsimMenuItemActionPerformed

    private void editSetAvlExecutableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSetAvlExecutableMenuItemActionPerformed
        this.controller.setAvlExecutable();
    }//GEN-LAST:event_editSetAvlExecutableMenuItemActionPerformed

    private void fileExportAsCRRsimMenuItemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fileExportAsCRRsimMenuItemComponentShown
    }//GEN-LAST:event_fileExportAsCRRsimMenuItemComponentShown

    private void jMenu1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMenu1ComponentShown
    }//GEN-LAST:event_jMenu1ComponentShown

    private void addSurfaceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSurfaceButtonMouseClicked
        controller.showAvlEditor();
}//GEN-LAST:event_addSurfaceButtonMouseClicked

    private void rightViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightViewButtonMouseClicked
        controller.showRightView();
}//GEN-LAST:event_rightViewButtonMouseClicked

    private void frontViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frontViewButtonMouseClicked
        controller.showFrontView();
}//GEN-LAST:event_frontViewButtonMouseClicked

    private void topViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topViewButtonMouseClicked
        controller.showTopView();
}//GEN-LAST:event_topViewButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSurfaceButton;
    private javax.swing.JMenuItem editSetAvlExecutableMenuItem;
    private javax.swing.JMenuItem fileExportAsAVLMenuItem;
    private javax.swing.JMenuItem fileExportAsCRRsimMenuItem;
    private javax.swing.JMenuItem fileOpenMenuItem;
    private javax.swing.JButton frontViewButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JButton rightViewButton;
    private javax.swing.JButton topViewButton;
    private javax.swing.JInternalFrame view3DIFrame;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fileExportAsCRRsimMenuItem
     */
    public javax.swing.JMenuItem getFileExportAsCRRsimMenuItem() {
        return fileExportAsCRRsimMenuItem;
    }

    /**
     * @return the view3DIFrame
     */
    public javax.swing.JInternalFrame getView3DIFrame() {
        return view3DIFrame;
    }

}
