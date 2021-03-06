/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.view;

import java.text.SimpleDateFormat;

/**
 *
 * @author Krishanthi
 */
public class Dash extends javax.swing.JFrame {

    /**
     * Creates new form Dash
     */
    public Dash() {
        initComponents();
        setDate();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblShedule = new javax.swing.JLabel();
        lblAttendence = new javax.swing.JLabel();
        lblTeacher = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        lblRegistration = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 390, 30));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("GURUGEDARA STUDENT MANAGEMENT SYSTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 600, 80));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/corporate-banner_6.jpg"))); // NOI18N
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 730, 80));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/diploma-graduation-hat-book-blue-background-29806330.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblStudent.setBackground(new java.awt.Color(0, 51, 153));
        lblStudent.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblStudent.setForeground(new java.awt.Color(255, 102, 0));
        lblStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudent.setText("STUDENT");
        lblStudent.setOpaque(true);
        lblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentMouseClicked(evt);
            }
        });

        lblGrade.setBackground(new java.awt.Color(0, 51, 153));
        lblGrade.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblGrade.setForeground(new java.awt.Color(255, 102, 0));
        lblGrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrade.setText("GRADE");
        lblGrade.setOpaque(true);
        lblGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGradeMouseClicked(evt);
            }
        });

        lblSubject.setBackground(new java.awt.Color(0, 51, 153));
        lblSubject.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(255, 102, 0));
        lblSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubject.setText("SUBJECT");
        lblSubject.setOpaque(true);
        lblSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSubjectMouseClicked(evt);
            }
        });

        lblShedule.setBackground(new java.awt.Color(0, 51, 153));
        lblShedule.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblShedule.setForeground(new java.awt.Color(255, 102, 0));
        lblShedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShedule.setText("SHEDULE");
        lblShedule.setOpaque(true);
        lblShedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSheduleMouseClicked(evt);
            }
        });

        lblAttendence.setBackground(new java.awt.Color(0, 51, 153));
        lblAttendence.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblAttendence.setForeground(new java.awt.Color(255, 102, 0));
        lblAttendence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttendence.setText("ATTENDENCE");
        lblAttendence.setOpaque(true);
        lblAttendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAttendenceMouseClicked(evt);
            }
        });

        lblTeacher.setBackground(new java.awt.Color(0, 51, 153));
        lblTeacher.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblTeacher.setForeground(new java.awt.Color(255, 102, 0));
        lblTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacher.setText("TEACHER");
        lblTeacher.setOpaque(true);
        lblTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherMouseClicked(evt);
            }
        });

        lblPayment.setBackground(new java.awt.Color(0, 51, 153));
        lblPayment.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblPayment.setForeground(new java.awt.Color(255, 102, 0));
        lblPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPayment.setText("PAYMENT");
        lblPayment.setOpaque(true);
        lblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaymentMouseClicked(evt);
            }
        });

        lblRegistration.setBackground(new java.awt.Color(0, 51, 153));
        lblRegistration.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lblRegistration.setForeground(new java.awt.Color(255, 102, 0));
        lblRegistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistration.setText("REGISTRATION");
        lblRegistration.setOpaque(true);
        lblRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrationMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 51, 153));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOG OUT");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 51, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/FontAwesome_f011(0)_32.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 51, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/Material Icons_e41d(0)_32.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(0, 51, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/Iconic_e062(0)_32.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 51, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/Iconic_e06f(0)_32.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 51, 153));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/octicons_f068(0)_32.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/octicons_f006(0)_32.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(0, 51, 153));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/Material Icons_e85e(0)_32.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(0, 51, 153));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/Material Icons_e87c(0)_32.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(0, 51, 153));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/studentmanagementsystem/view/Material Icons_e3ca(0)_32.png"))); // NOI18N
        jLabel14.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegistration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblShedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblAttendence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblShedule, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAttendence, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 770));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 1110, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentMouseClicked
       StudentDetail s=new StudentDetail();
       jPanel3.removeAll();
       jPanel3.repaint();
       jPanel3.revalidate();
       s.setSize(jPanel3.getSize());
       jPanel3.add(s);
       s.setVisible(true);
    }//GEN-LAST:event_lblStudentMouseClicked

    private void lblTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherMouseClicked
       //new Teacher().setVisible(true);
        //this.dispose();
        Teacher te=new Teacher();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        te.setSize(jPanel3.getSize());
        jPanel3.add(te);
        te.setVisible(true);
    }//GEN-LAST:event_lblTeacherMouseClicked

    private void lblGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGradeMouseClicked
        Grade g=new Grade();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        g.setSize(jPanel3.getSize());
        jPanel3.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_lblGradeMouseClicked

    private void lblSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubjectMouseClicked
        Subject s=new Subject();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        s.setSize(jPanel3.getSize());
        jPanel3.add(s);
        s.setVisible(true);
    }//GEN-LAST:event_lblSubjectMouseClicked

    private void lblPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseClicked
        Payment p=new Payment();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        p.setSize(jPanel3.getSize());
        jPanel3.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_lblPaymentMouseClicked

    private void lblAttendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttendenceMouseClicked
        Attendence a=new Attendence();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        a.setSize(jPanel3.getSize());
        jPanel3.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_lblAttendenceMouseClicked

    private void lblSheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSheduleMouseClicked
       Schedule sch=new Schedule();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        sch.setSize(jPanel3.getSize());
        jPanel3.add(sch);
        sch.setVisible(true);
    }//GEN-LAST:event_lblSheduleMouseClicked

    private void lblRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrationMouseClicked
        Registration re=new Registration();
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        re.setSize(jPanel3.getSize());
        jPanel3.add(re);
        re.setVisible(true);
    }//GEN-LAST:event_lblRegistrationMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAttendence;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JLabel lblShedule;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTeacher;
    // End of variables declaration//GEN-END:variables

    private void setDate() {
        java.util.Date d=new java.util.Date();
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
        String formateDate=df.format(d);
        jLabel3.setText(formateDate);
    }
}
