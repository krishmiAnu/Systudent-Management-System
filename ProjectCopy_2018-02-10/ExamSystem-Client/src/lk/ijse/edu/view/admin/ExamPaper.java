/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.view.admin;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.edu.controller.PaperController;
import lk.ijse.edu.controller.SubjectController;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.observer.Observer;
//import lk.ijse.edu.view.user.ExamPaper;

/**
 *
 * @author Krishanthi
 */
public class ExamPaper extends javax.swing.JPanel implements Observer {

    private SubjectController subjectController;

    /**
     * Creates new form DesignPaper
     */
    public ExamPaper() {
        initComponents();
        initComponents();
        loadSubjects();
            loadToTable();

//        try {
//            UnicastRemoteObject.exportObject(this, 0);
//            PaperController.getSubject().registerObserver(this);
//            SubjectController.getSubject().registerObserver(this);
//        } catch (RemoteException ex) {
//            Logger.getLogger(ExamPaper.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(ExamPaper.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblExamID = new javax.swing.JLabel();
        lblExamTitle = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblNoOfQuestion = new javax.swing.JLabel();
        txtExamID = new javax.swing.JTextField();
        txtExamTitle = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtNoOfQuestion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblAddQuestionButton = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JLabel();
        cmbSubject = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllPaper = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lblModifyButton = new javax.swing.JLabel();
        lblDeleteButton = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Admin >> DesignExamPage");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 170, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("  DesignExam.");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExamID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExamID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblExamID.setText("Exam ID :");
        jPanel2.add(lblExamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 72, 25));

        lblExamTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExamTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblExamTitle.setText("Exam Title :");
        jPanel2.add(lblExamTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 25));

        lblDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDuration.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDuration.setText("Duration :");
        jPanel2.add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 102, 25));

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("Date :");
        jPanel2.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 102, 25));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTime.setText("Time :");
        jPanel2.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 102, 25));

        lblNoOfQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNoOfQuestion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoOfQuestion.setText("No Of Question :");
        jPanel2.add(lblNoOfQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 25));
        jPanel2.add(txtExamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 202, 25));
        jPanel2.add(txtExamTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 202, 25));
        jPanel2.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 183, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("minutes");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 56, -1));
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 257, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("YYYY / MM / DD");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 257, -1));
        jPanel2.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 257, 25));
        jPanel2.add(txtNoOfQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 85, 25));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lblAddQuestionButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddQuestionButton.setForeground(new java.awt.Color(255, 255, 255));
        lblAddQuestionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/octicons_f076(8)_48.png"))); // NOI18N
        lblAddQuestionButton.setText("Add Questions");
        lblAddQuestionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddQuestionButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 281, Short.MAX_VALUE)
                .addComponent(lblAddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddQuestionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 483, 418, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 398, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Desing Exam");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 115, 31));

        txtSubjectName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSubjectName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubjectName.setText("Subject :");
        jPanel2.add(txtSubjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 102, 25));

        jPanel2.add(cmbSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 520));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAllPaper.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ExamId", "Exam Title", "Subject", "Duration", "Date", "Time", "NoOfQuestion"
            }
        ));
        tblAllPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAllPaperMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAllPaper);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 630, 360));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        lblModifyButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModifyButton.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/Material Icons_e22b(0)_46.png"))); // NOI18N
        lblModifyButton.setText("Modify");

        lblDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        lblDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/Entypo_e729(4)_48.png"))); // NOI18N
        lblDeleteButton.setText("Delete");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(451, Short.MAX_VALUE)
                .addComponent(lblDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 690, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText(" See All Paper.");
        jLabel15.setOpaque(true);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 670, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 91, 690, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1120, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddQuestionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddQuestionButtonMouseClicked
        setValuesToPaperDTO();
        ManagePaper managePaper = new ManagePaper();
        AdminDashBoard.pnlLoad.removeAll();
        AdminDashBoard.pnlLoad.updateUI();
        managePaper.setPaper(paperDTO);
        managePaper.setSize(AdminDashBoard.pnlLoad.getSize());
        AdminDashBoard.pnlLoad.add(managePaper);
        managePaper.setVisible(true);
    }//GEN-LAST:event_lblAddQuestionButtonMouseClicked

    private void tblAllPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAllPaperMouseClicked
        txtExamID.setText(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 0).toString());
        txtExamTitle.setText(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 1).toString());
        cmbSubject.setSelectedItem(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 2).toString());
        txtDuration.setText(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 3).toString());
        txtDate.setText(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 4).toString());
        txtTime.setText(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 5).toString());
        txtNoOfQuestion.setText(tblAllPaper.getValueAt(tblAllPaper.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tblAllPaperMouseClicked

    private void setValuesToPaperDTO(){
        try {
            int paperId = Integer.parseInt(txtExamID.getText());
            String examTitle = txtExamTitle.getText();
            int duration = Integer.parseInt(txtDuration.getText());
            String date = txtDate.getText();
            String time = txtTime.getText();
            int questionCount = Integer.parseInt(txtNoOfQuestion.getText());

            SubjectDTO subjectDTO = new SubjectDTO();
            subjectDTO.setSubjectId(Integer.parseInt(cmbSubject.getSelectedItem() + ""));
            subjectDTO = SubjectController.serchSubject(subjectDTO);

            paperDTO = new PaperDTO(paperId, examTitle, subjectDTO, duration, date, time, questionCount);
//            if (PaperController.addPaper(paperDTO)) {
//                JOptionPane.showMessageDialog(this, "Paper Is Added SuccessFully");
//            } else {
//                JOptionPane.showMessageDialog(this, "Paper Added Fail");
//            }
        } catch (Exception ex) {
            Logger.getLogger(ExamPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    PaperDTO paperDTO;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAddQuestionButton;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeleteButton;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblExamID;
    private javax.swing.JLabel lblExamTitle;
    private javax.swing.JLabel lblModifyButton;
    private javax.swing.JLabel lblNoOfQuestion;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblAllPaper;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtExamID;
    private javax.swing.JTextField txtExamTitle;
    private javax.swing.JTextField txtNoOfQuestion;
    private javax.swing.JLabel txtSubjectName;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateObservers() throws Exception {
        loadToTable();
    }

    private void loadSubjects() {
        try {
            List<SubjectDTO> all = subjectController.getAllSubjects();
            cmbSubject.removeAllItems();

            for (SubjectDTO all1 : all) {
                cmbSubject.addItem(all1.getSubjectId());
            }
        } catch (Exception e) {
            Logger.getLogger(ExamPaper.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void loadToTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAllPaper.getModel();
        dtm.setRowCount(0);

        try {
            List<PaperDTO> papers = PaperController.getAllPapers();
            if (papers == null) {
                return;
            }
            for (PaperDTO paper : papers) {
                Object[] rowData = {
                    paper.getPaperId(),
                    paper.getExamTitle(),
                    paper.getSubjectDTO().getSubjectName(),
                    paper.getDuration(),
                    paper.getDate(),
                    paper.getTime(),
                    paper.getQuestionCount()
                };
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
        }
    }
}
