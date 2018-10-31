/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.view.admin;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.edu.controller.ManageQuestionController;
import lk.ijse.edu.controller.PaperController;
import lk.ijse.edu.controller.SubjectController;
import lk.ijse.edu.dto.AnswerDTO;
import lk.ijse.edu.dto.QuestionDTO;
import lk.ijse.edu.dto.PaperDTO;
import lk.ijse.edu.dto.SubjectDTO;
import lk.ijse.edu.observer.Observer;
import lk.ijse.edu.proxy.ProxyHandler;
import lk.ijse.edu.service.ServiceFactory;

/**
 *
 * @author Krishanthi
 */
public class ManagePaper extends javax.swing.JPanel implements Observer {

    private PaperController paperController;
    private SubjectController subjectController;
    
    /**
     * Creates new form ManagePaper
     */
    public ManagePaper() {
        initComponents();
        loadToTable();
        try {
            loadSubjects();
            setDate();
            UnicastRemoteObject.exportObject(this, 0);
            PaperController.getSubject().registerObserver(this);
            SubjectController.getSubject().registerObserver(this);
        } catch (RemoteException ex) {
            Logger.getLogger(ManagePaper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ManagePaper.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllQuestion = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblRefashButton = new javax.swing.JLabel();
        lblModifyButton = new javax.swing.JLabel();
        lblDeleteButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        lblSearhIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        LoadQuestion = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblInsertButton = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtCorrectAnswer = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lblCorrectAnswer = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cmbSubject = new javax.swing.JComboBox();
        lblSubject = new javax.swing.JLabel();
        lblExam = new javax.swing.JLabel();
        txtQID = new javax.swing.JTextField();
        lblQuestionID = new javax.swing.JLabel();
        papreIdLbl = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAllQuestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam", "Subject", "QuestionID", "Question", "Answer"
            }
        ));
        jScrollPane2.setViewportView(tblAllQuestion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 81, 560, 360));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        lblRefashButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRefashButton.setForeground(new java.awt.Color(255, 255, 255));
        lblRefashButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/octicons_f087(6)_48.png"))); // NOI18N
        lblRefashButton.setText("Refash");

        lblModifyButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModifyButton.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/Material Icons_e22b(0)_46.png"))); // NOI18N
        lblModifyButton.setText("Modify");

        lblDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        lblDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/Entypo_e729(4)_48.png"))); // NOI18N
        lblDeleteButton.setText("Delete");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(lblDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRefashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRefashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(lblDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 610, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("See All Question.");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, 510));
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 290, 30));

        lblSearhIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/linecons_e009(0)_48_1.png"))); // NOI18N
        jPanel1.add(lblSearhIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 60, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Admin >> ManagePaperPage");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/search12.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 700, 50));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadQuestion.setColumns(20);
        LoadQuestion.setRows(5);
        jScrollPane4.setViewportView(LoadQuestion);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 329, 90));

        lblDate.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblDate.setText("Manage Paper Question.");
        jPanel11.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 20));

        txtDate.setBorder(null);
        jPanel11.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblInsertButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInsertButton.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/octicons_f076(8)_48.png"))); // NOI18N
        lblInsertButton.setText("Insert All");
        lblInsertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInsertButtonMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("New Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lblInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel11.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 486, 487, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Answer\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("1)");

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("2)");

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("3)");

        lblCorrectAnswer.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCorrectAnswer.setText("Correct Answer :");

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("4)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txt2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addComponent(txt3))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 460, 200));
        jPanel11.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 460, 10));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblQuestion.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblQuestion.setText("Question :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 460, 110));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSubject.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblSubject.setText("Subject :");

        lblExam.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblExam.setText("Exam :");

        lblQuestionID.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblQuestionID.setText("Question ID:");

        papreIdLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblExam, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(papreIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblQuestionID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(papreIdLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblExam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestionID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtQID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, 100));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 520));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel42.setText("  ManagePaperQuestion");
        jLabel42.setOpaque(true);
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1120, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblInsertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsertButtonMouseClicked
        addValuesToList();
        savePaper();
    }//GEN-LAST:event_lblInsertButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addValuesToList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void savePaper() {
        if (questionDTOs != null) {
            paperDTO.setQuestionList(questionDTOs);
            try {
                if (PaperController.addPaper(paperDTO)) {
                    JOptionPane.showMessageDialog(this, "Added");
                } else {
                    JOptionPane.showMessageDialog(this, "faild");
                }
            } catch (Exception ex) {
                Logger.getLogger(ManagePaper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void addValuesToList() {
        try {
            String subject = cmbSubject.getSelectedItem().toString();
            String questionID = txtQID.getText();
            String question = LoadQuestion.getText();
            String answer1 = txt1.getText();
            String answer2 = txt2.getText();
            String answer3 = txt3.getText();
            String answer4 = txt4.getText();
            String correctAnswer = txtCorrectAnswer.getText();
            String date = txtDate.getText();

            QuestionDTO questionDTO = new QuestionDTO(questionID, subject, question, answer1, answer2, answer3, answer4, date, correctAnswer, paperDTO);

            questionDTOs.add(questionDTO);

            txtQID.setText("");
            LoadQuestion.setText("");
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txtDate.setText("");

        } catch (Exception ex) {
            Logger.getLogger(ManagePaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPaper(PaperDTO paperDTO) {
        this.paperDTO = paperDTO;
        papreIdLbl.setText(paperDTO.getPaperId() + "");
    }

    private PaperDTO paperDTO;

    LinkedList<QuestionDTO> questionDTOs = new LinkedList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea LoadQuestion;
    private javax.swing.JComboBox cmbSubject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblCorrectAnswer;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeleteButton;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblInsertButton;
    private javax.swing.JLabel lblModifyButton;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestionID;
    private javax.swing.JLabel lblRefashButton;
    private javax.swing.JLabel lblSearhIcon;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel papreIdLbl;
    private javax.swing.JTable tblAllQuestion;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txtCorrectAnswer;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtQID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateObservers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadSubjects() {
        try {
            ArrayList<SubjectDTO> all = (ArrayList<SubjectDTO>) subjectController.getAllSubjects();
            cmbSubject.removeAll();

            for (SubjectDTO all1 : all) {
                cmbSubject.addItem(all1.getSubjectName());
            }
        } catch (Exception e) {
            Logger.getLogger(ManagePaper.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void setDate() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String formateDate = df.format(d);
        txtDate.setText(formateDate);
    }

    private void loadToTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAllQuestion.getModel();
        dtm.setRowCount(0);

        try {
            List<QuestionDTO> questions = ManageQuestionController.getAllManageQuestions();
            if (questions == null) {
                return;
            }
            for (QuestionDTO question : questions) {
                Object[] rowData = {
                    question.getPaperDTO().getExamTitle(),
                    question.getSubject(),
                    question.getQuestionID(),
                    question.getQuestion(),
                    question.getDate()
                };
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
        }
    }
}
