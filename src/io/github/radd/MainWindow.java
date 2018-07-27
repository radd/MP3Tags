package io.github.radd;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Piotr
 */
public class MainWindow extends javax.swing.JFrame {


    private FilePanel filePanel;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
        //center the window
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(screen.width/2-this.getSize().width/2, screen.height/2-this.getSize().height/2);
        
        filePanel = new FilePanel();
        fileScrollPane.getVerticalScrollBar().setUnitIncrement(15);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseFilesBtn = new javax.swing.JButton();
        chooseFilesLabel = new javax.swing.JLabel();
        fileListScrollPane = new javax.swing.JScrollPane();
        fileList = new javax.swing.JList<>();
        fileListLabel = new javax.swing.JLabel();
        fileScrollPane = new javax.swing.JScrollPane();
        filePanelContainer = new javax.swing.JPanel();
        filePaneLabel = new javax.swing.JLabel();
        editTagsBtn = new javax.swing.JButton();
        cancelEditBtn = new javax.swing.JButton();
        saveFileBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseFilesBtn.setText("Choose files");
        chooseFilesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseFilesBtnMouseClicked(evt);
            }
        });

        chooseFilesLabel.setText("Load files from disc:");

        fileListHeaderLabel = new JLabel(" No file");
        fileListScrollPane.setColumnHeaderView(fileListHeaderLabel);

        model = new DefaultListModel();
        fileList.setModel(model);
        fileList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fileList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fileListValueChanged(evt);
            }
        });
        fileListScrollPane.setViewportView(fileList);

        fileListLabel.setText("MP3 files:");

        fileHeaderLabel = new JLabel(FILE_HEADER_TEXT);
        fileScrollPane.setColumnHeaderView(fileHeaderLabel);

        filePanelContainer.setBackground(new java.awt.Color(255, 255, 255));
        filePanelContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        fileScrollPane.setViewportView(filePanelContainer);

        filePaneLabel.setText("File info:");

        editTagsBtn.setText("Edit file tags");
        editTagsBtn.setEnabled(false);
        editTagsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTagsBtnActionPerformed(evt);
            }
        });

        cancelEditBtn.setText("Cancel");
        cancelEditBtn.setEnabled(false);
        cancelEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEditBtnActionPerformed(evt);
            }
        });

        saveFileBtn.setText("Save file");
        saveFileBtn.setEnabled(false);
        saveFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chooseFilesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chooseFilesBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileListLabel))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filePaneLabel)
                                .addGap(0, 512, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editTagsBtn)
                                .addGap(15, 15, 15)
                                .addComponent(saveFileBtn)
                                .addGap(15, 15, 15)
                                .addComponent(cancelEditBtn)
                                .addGap(46, 46, 46)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFilesBtn)
                    .addComponent(chooseFilesLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileListLabel)
                    .addComponent(filePaneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileScrollPane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editTagsBtn)
                            .addComponent(cancelEditBtn)
                            .addComponent(saveFileBtn))
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFilesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseFilesBtnMouseClicked
        JFileChooser chooser = new JFileChooser("D:\\Woles109\\MP3");
	FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3");
	chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(true);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            files= chooser.getSelectedFiles();
            fileListHeaderLabel.setText(" " + files.length + " files");
            setFilePaneHeader(FILE_HEADER_TEXT);
            filePanelContainer.removeAll();
            filePanelContainer.revalidate();
            filePanelContainer.repaint();
            
            editTagsBtn.setEnabled(false);
            saveFileBtn.setEnabled(false);
            cancelEditBtn.setEnabled(false);
            
            model.removeAllElements();
            for(File file : files) {
                model.addElement(file.getName());

            }
        }    
    }//GEN-LAST:event_chooseFilesBtnMouseClicked
        
    private void fileListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fileListValueChanged
        if (!evt.getValueIsAdjusting()) { // prevents double events
            JList fileList = (JList)evt.getSource();
            System.out.println(" " + fileList.getSelectedIndex());
            if(fileList.getSelectedIndex() >= 0)
            {
                setFilePaneHeader(" " + files[fileList.getSelectedIndex()].getName());
                //fileScrollPane.setViewportView(filePanel);
                filePanel.setFile(files[fileList.getSelectedIndex()], fileList.getSelectedIndex());
                
                filePanelContainer.removeAll();
                filePanelContainer.revalidate();
                filePanelContainer.repaint();
                filePanelContainer.add(filePanel);
                editTagsBtn.setEnabled(true);
                
                //TODO scroll to top
            }
        }
    }//GEN-LAST:event_fileListValueChanged

    private void editTagsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTagsBtnActionPerformed
        filePanel.enableEdit(true);
        editTagsBtn.setEnabled(false);
        saveFileBtn.setEnabled(true);
        cancelEditBtn.setEnabled(true);
    }//GEN-LAST:event_editTagsBtnActionPerformed

    private void cancelEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEditBtnActionPerformed
        filePanel.enableEdit(false);
        editTagsBtn.setEnabled(true);
        saveFileBtn.setEnabled(false);
        cancelEditBtn.setEnabled(false);
    }//GEN-LAST:event_cancelEditBtnActionPerformed

    private void saveFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileBtnActionPerformed
        filePanel.saveFile();
        editTagsBtn.setEnabled(true);
        saveFileBtn.setEnabled(false);
        cancelEditBtn.setEnabled(false);
        
        //TODO refresh jList -> file not found
        files[filePanel.getId()] = new File(filePanel.getFilePath());
        model.setElementAt(filePanel.getFullFilename(), filePanel.getId());
    }//GEN-LAST:event_saveFileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelEditBtn;
    private javax.swing.JButton chooseFilesBtn;
    private javax.swing.JLabel chooseFilesLabel;
    private javax.swing.JButton editTagsBtn;
    private javax.swing.JList<String> fileList;
    private javax.swing.JLabel fileListLabel;
    private javax.swing.JScrollPane fileListScrollPane;
    private JLabel fileListHeaderLabel;
    private javax.swing.JLabel filePaneLabel;
    private javax.swing.JPanel filePanelContainer;
    private javax.swing.JScrollPane fileScrollPane;
    private JLabel fileHeaderLabel;
    private final String FILE_HEADER_TEXT = " Select a file...";
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton saveFileBtn;
    // End of variables declaration//GEN-END:variables

    private File[] files = null;
    private DefaultListModel model;

  
    private void setFilePaneHeader(String text) {
        fileHeaderLabel.setText(text);
    }
}
