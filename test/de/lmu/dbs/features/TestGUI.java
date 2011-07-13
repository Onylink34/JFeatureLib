package de.lmu.dbs.features;

import ij.ImagePlus;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import javax.swing.JFileChooser;
import ij.io.FileOpener;
import ij.io.FileInfo;
import ij.io.Opener;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.filechooser.FileFilter;
import com.drew.metadata.Metadata;
import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TestGUI.java
 *
 * Created on 12.07.2011, 15:56:06
 */
/**
 *
 * @author Benedikt
 */
public class TestGUI extends javax.swing.JFrame {

    /** Creates new form TestGUI */
    public TestGUI() {
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

        OpenFileChoser = new javax.swing.JFileChooser();
        AboutDialog = new javax.swing.JDialog();
        AboutBoxLabel = new javax.swing.JLabel();
        AboutBoxOkButton = new javax.swing.JButton();
        PreviewPanel = new javax.swing.JPanel();
        PreviewLabel = new javax.swing.JLabel();
        ImageInfoPanel = new javax.swing.JPanel();
        FileNameLabel = new javax.swing.JLabel();
        DimensionsLabel = new javax.swing.JLabel();
        FileNameDisplayLabel = new javax.swing.JLabel();
        XDimLabel = new javax.swing.JLabel();
        YDimLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ConsolePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsoleTextArea = new javax.swing.JTextArea();
        ToolsPanel = new javax.swing.JPanel();
        HistogramFeatureRadioButton = new javax.swing.JRadioButton();
        DetectFeatureButton = new javax.swing.JButton();
        CompareSingleButton = new javax.swing.JButton();
        CompareMultiButton = new javax.swing.JButton();
        HaralickFeatureRadioButton = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        FileMenuOpen = new javax.swing.JMenuItem();
        FileMenuExit = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        EditMenuCopy = new javax.swing.JMenuItem();
        EditMenuPaste = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        HelpMenuAboutItem = new javax.swing.JMenuItem();

        OpenFileChoser.setFileFilter(new SupportedImageFileFilter());
        OpenFileChoser.setEnabled(false);
        OpenFileChoser.setPreferredSize(new java.awt.Dimension(600, 400));
        OpenFileChoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileChoserActionPerformed(evt);
            }
        });

        AboutDialog.setTitle("About");
        AboutDialog.setMinimumSize(new java.awt.Dimension(200, 150));
        AboutDialog.setResizable(false);

        AboutBoxLabel.setText("Some useful Information");

        AboutBoxOkButton.setText("Ok");
        AboutBoxOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutBoxOkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AboutDialogLayout = new javax.swing.GroupLayout(AboutDialog.getContentPane());
        AboutDialog.getContentPane().setLayout(AboutDialogLayout);
        AboutDialogLayout.setHorizontalGroup(
            AboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutDialogLayout.createSequentialGroup()
                .addGroup(AboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AboutBoxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(AboutDialogLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(AboutBoxOkButton)))
                .addContainerGap())
        );
        AboutDialogLayout.setVerticalGroup(
            AboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutBoxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(AboutBoxOkButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PreviewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));

        javax.swing.GroupLayout PreviewPanelLayout = new javax.swing.GroupLayout(PreviewPanel);
        PreviewPanel.setLayout(PreviewPanelLayout);
        PreviewPanelLayout.setHorizontalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PreviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        PreviewPanelLayout.setVerticalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewPanelLayout.createSequentialGroup()
                .addComponent(PreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        ImageInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Image Info"));

        FileNameLabel.setText("Filename:");

        DimensionsLabel.setText("Dimensions:");

        FileNameDisplayLabel.setText("...");

        XDimLabel.setText("X:");

        YDimLabel.setText("Y: ");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout ImageInfoPanelLayout = new javax.swing.GroupLayout(ImageInfoPanel);
        ImageInfoPanel.setLayout(ImageInfoPanelLayout);
        ImageInfoPanelLayout.setHorizontalGroup(
            ImageInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImageInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileNameLabel)
                    .addComponent(FileNameDisplayLabel)
                    .addComponent(DimensionsLabel)
                    .addComponent(XDimLabel)
                    .addComponent(YDimLabel)
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ImageInfoPanelLayout.setVerticalGroup(
            ImageInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageInfoPanelLayout.createSequentialGroup()
                .addComponent(FileNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FileNameDisplayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DimensionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XDimLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YDimLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        ConsolePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Console Output"));

        ConsoleTextArea.setColumns(20);
        ConsoleTextArea.setRows(5);
        jScrollPane1.setViewportView(ConsoleTextArea);

        javax.swing.GroupLayout ConsolePanelLayout = new javax.swing.GroupLayout(ConsolePanel);
        ConsolePanel.setLayout(ConsolePanelLayout);
        ConsolePanelLayout.setHorizontalGroup(
            ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );
        ConsolePanelLayout.setVerticalGroup(
            ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ToolsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tools"));

        HistogramFeatureRadioButton.setText("Histogram");

        DetectFeatureButton.setText("Detect Features");
        DetectFeatureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetectFeatureButtonActionPerformed(evt);
            }
        });

        CompareSingleButton.setText("Compare with single file");
        CompareSingleButton.setEnabled(false);
        CompareSingleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareSingleButtonActionPerformed(evt);
            }
        });

        CompareMultiButton.setText("Compare with multiple files");
        CompareMultiButton.setEnabled(false);
        CompareMultiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareMultiButtonActionPerformed(evt);
            }
        });

        HaralickFeatureRadioButton.setText("Haralick");
        HaralickFeatureRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HaralickFeatureRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ToolsPanelLayout = new javax.swing.GroupLayout(ToolsPanel);
        ToolsPanel.setLayout(ToolsPanelLayout);
        ToolsPanelLayout.setHorizontalGroup(
            ToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HaralickFeatureRadioButton)
                    .addGroup(ToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(HistogramFeatureRadioButton)
                        .addComponent(CompareMultiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DetectFeatureButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CompareSingleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ToolsPanelLayout.setVerticalGroup(
            ToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolsPanelLayout.createSequentialGroup()
                .addComponent(HistogramFeatureRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HaralickFeatureRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(DetectFeatureButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompareSingleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompareMultiButton)
                .addContainerGap())
        );

        FileMenu.setText("File");

        FileMenuOpen.setText("Open");
        FileMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileMenuOpenActionPerformed(evt);
            }
        });
        FileMenu.add(FileMenuOpen);

        FileMenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        FileMenuExit.setText("Exit");
        FileMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileMenuExitActionPerformed(evt);
            }
        });
        FileMenu.add(FileMenuExit);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        EditMenuCopy.setText("Copy");
        EditMenu.add(EditMenuCopy);

        EditMenuPaste.setText("Paste");
        EditMenu.add(EditMenuPaste);

        jMenuBar1.add(EditMenu);

        HelpMenu.setText("Help");

        HelpMenuAboutItem.setText("About");
        HelpMenuAboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuAboutItemActionPerformed(evt);
            }
        });
        HelpMenu.add(HelpMenuAboutItem);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConsolePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImageInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToolsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ToolsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PreviewPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImageInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileMenuExitActionPerformed
         System.exit(0);
    }//GEN-LAST:event_FileMenuExitActionPerformed

    private void FileMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileMenuOpenActionPerformed
        int returnVal = OpenFileChoser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = OpenFileChoser.getSelectedFile();
                 
          FileNameDisplayLabel.setText(file.getName());
                    
          Opener opener = new Opener();  
          imp = opener.openImage(file.getAbsolutePath());
          XDimLabel.setText("X: " + imp.getWidth());
          YDimLabel.setText("Y: " + imp.getHeight());
          
          ImagePlus im2 = new ImagePlus("Thumb", imp.getProcessor().resize(400, 400));         
          PreviewLabel.setIcon(new javax.swing.ImageIcon(im2.getImage()));
          
          try{
          Metadata metadata = ImageMetadataReader.readMetadata(file);
          Directory directory = metadata.getDirectory(ExifSubIFDDirectory.class);
          Date date = directory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
          ConsoleTextArea.setText(date.toString());
          jLabel1.setText(directory.getString(ExifSubIFDDirectory.TAG_EXPOSURE_TIME));
          }
          catch(Exception e){
                                
          }
          


          int[] hist = imp.getStatistics().histogram;
          
        }
    }//GEN-LAST:event_FileMenuOpenActionPerformed

    private void OpenFileChoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileChoserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenFileChoserActionPerformed

    private void AboutBoxOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutBoxOkButtonActionPerformed
        AboutDialog.dispose();
    }//GEN-LAST:event_AboutBoxOkButtonActionPerformed

    private void CompareSingleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareSingleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompareSingleButtonActionPerformed

    private void CompareMultiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareMultiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompareMultiButtonActionPerformed

    private void HelpMenuAboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuAboutItemActionPerformed
        AboutDialog.setVisible(true);
}//GEN-LAST:event_HelpMenuAboutItemActionPerformed

    private void HaralickFeatureRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HaralickFeatureRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HaralickFeatureRadioButtonActionPerformed

    private void DetectFeatureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetectFeatureButtonActionPerformed
        if(HistogramFeatureRadioButton.isSelected()){
            
        }
        
        else if(HaralickFeatureRadioButton.isSelected()){
            HaralickTest ht = new HaralickTest();
            double[] result = ht.haralick(imp.getImage());
            ConsoleTextArea.append("\nHaralick Features:\n");
            for(int i = 0; i<result.length; i++){
                ConsoleTextArea.append(result[i]+"\n");
            }
        }
            
        else{}
    }//GEN-LAST:event_DetectFeatureButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TestGUI().setVisible(true);
            }
        });
    }
    
    class SupportedImageFileFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".jpg") || file.getAbsolutePath().endsWith(".jpeg") || file.getAbsolutePath().endsWith(".png");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Image Files (jpg, png)";
        }
    } 
    private ImagePlus imp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutBoxLabel;
    private javax.swing.JButton AboutBoxOkButton;
    private javax.swing.JDialog AboutDialog;
    private javax.swing.JButton CompareMultiButton;
    private javax.swing.JButton CompareSingleButton;
    private javax.swing.JPanel ConsolePanel;
    private javax.swing.JTextArea ConsoleTextArea;
    private javax.swing.JButton DetectFeatureButton;
    private javax.swing.JLabel DimensionsLabel;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem EditMenuCopy;
    private javax.swing.JMenuItem EditMenuPaste;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem FileMenuExit;
    private javax.swing.JMenuItem FileMenuOpen;
    private javax.swing.JLabel FileNameDisplayLabel;
    private javax.swing.JLabel FileNameLabel;
    private javax.swing.JRadioButton HaralickFeatureRadioButton;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem HelpMenuAboutItem;
    private javax.swing.JRadioButton HistogramFeatureRadioButton;
    private javax.swing.JPanel ImageInfoPanel;
    private javax.swing.JFileChooser OpenFileChoser;
    private javax.swing.JLabel PreviewLabel;
    private javax.swing.JPanel PreviewPanel;
    private javax.swing.JPanel ToolsPanel;
    private javax.swing.JLabel XDimLabel;
    private javax.swing.JLabel YDimLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
