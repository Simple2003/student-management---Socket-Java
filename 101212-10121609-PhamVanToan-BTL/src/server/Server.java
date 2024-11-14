/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package server;

import client.Client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xuant
 */
public class Server extends javax.swing.JFrame implements Runnable{
    ServerSocket svSocket;
    Socket socket;
    DataOutputStream output;
    DataInputStream input;
    DefaultListModel model;
    private List<String[]> danhSachSinhVien = new ArrayList<>();
    
    public Server() {
        initComponents();
        model = new DefaultListModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        txtPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsHistory = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        txtQue = new javax.swing.JTextField();
        txtMessage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMaP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        timkiem = new javax.swing.JButton();
        xoaTimKiem = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        txtPort.setForeground(new java.awt.Color(51, 102, 255));
        txtPort.setText("333");
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cổng");

        btnStart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStart.setText("Khởi Động");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        lsHistory.setForeground(new java.awt.Color(51, 102, 255));
        jScrollPane1.setViewportView(lsHistory);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Trạng Thái");

        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setText("Thêm");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jTable.setForeground(new java.awt.Color(51, 102, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Và Tên", "Ngày Sinh", "Quê Quán", "Số Điện Thoại", "Mã Phòng"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày Sinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Quê Quán");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Họ Và Tên");

        txtNgaySinh.setForeground(new java.awt.Color(51, 102, 255));
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        txtQue.setForeground(new java.awt.Color(51, 102, 255));
        txtQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueActionPerformed(evt);
            }
        });

        txtMessage.setForeground(new java.awt.Color(51, 102, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Số Điện Thoại");

        txtSDT.setForeground(new java.awt.Color(51, 102, 255));
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mã Phòng");

        txtMaP.setForeground(new java.awt.Color(51, 102, 255));
        txtMaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Quản Lý Sinh Viên Ký Túc Xá");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server/logoFooter.png"))); // NOI18N

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Trường Đại Học Sư Phạm Kỹ Thuật Hưng Yên");

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        timkiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timkiem.setText("Tìm Kiếm");
        timkiem.setActionCommand("tìm kiếm");
        timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemActionPerformed(evt);
            }
        });

        xoaTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoaTimKiem.setText("Xóa");
        xoaTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTimKiemActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tìm Kiếm");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("T");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("O");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("A");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("N");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(timkiem)
                                        .addGap(18, 18, 18)
                                        .addComponent(xoaTimKiem))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtMaP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtQue, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnStart)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnStart)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtQue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3))))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        try {
            output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(txtMessage.getText());
            output.writeUTF(txtNgaySinh.getText());
            output.writeUTF(txtQue.getText());
            output.writeUTF(txtSDT.getText());
            output.writeUTF(txtMaP.getText());
            output.flush();
        } catch (Exception e) {
        } 
        if (txtMessage.getText().equals("") || txtNgaySinh.getText().equals("") || txtQue.getText().equals("")|| txtSDT.getText().equals("")|| txtMaP.getText().equals("")) {
                 // nếu bất kỳ trường nào trong ba trường để trống thì hiển thị thông báo
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !");
        } else {
            // nếu tất cả các trường dữ liệu thì...
            // lưu trữ nhập dữ liệu vào mảng String --data---
            String data[] = {txtMessage.getText(), txtNgaySinh.getText(), txtQue.getText(), txtSDT.getText(), txtMaP.getText()};
             // Lưu dữ liệu vào danh sách gốc
            danhSachSinhVien.add(data);
            DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();
            // thêm dữ liệu mảng chuỗi
            tblModel.addRow(data); // thêm vào bảng
            // thông báo khi thêm 
            JOptionPane.showMessageDialog(this, "Thêm thông tin thành công! !");
            // xóa dữ liệu tại ô nhập
            txtMessage.setText("");
            txtNgaySinh.setText("");
            txtQue.setText("");
            txtSDT.setText("");
            txtMaP.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        try {
            model.addElement("Đang khởi động Server ...");
            model.addElement("Đang kết nối ...");
            lsHistory.setModel(model);
            svSocket = new ServerSocket(Integer.parseInt(txtPort.getText()));
            socket = svSocket.accept();
            model.addElement("Kết nối thành công ...");
            model.addElement("Danh Sách Sinh viên Ở Ký Túc Xá");
            lsHistory.setModel(model);
            Thread t = new Thread(Server.this);
            t.start();
        } catch (Exception e) {
        }
            
    }//GEN-LAST:event_btnStartActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtMaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();

        //delete row
        if (jTable.getSelectedRowCount() == 1) {
            //nếu một hàng được chọn thì xóa
            tblModel.removeRow(jTable.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Xóa thành công");

        } else {
            if (jTable.getRowCount() == 0) {
                // nếu bảng trống (không có dữ liệu) thì hiển thị thông báo
                JOptionPane.showMessageDialog(this, "Không có sinh viên nào trong bảng");
            } else {
                // nếu bảng không trống nhưng hàng không được chọn hoặc nhiều hàng được chọn
                JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên muốn xóa");
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        //lấy mô hình bảng
        DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();
        if (jTable.getSelectedRowCount() == 1) {
            //nếu một hàng được chọn thì cập nhật     
            String name = txtMessage.getText();
            String ngaysinh = txtNgaySinh.getText();
            String que = txtQue.getText();
            String sdt = txtSDT.getText();
            String ma = txtMaP.getText();

            //đặt giá trị cập nhật trên hàng bảng
            tblModel.setValueAt(name, jTable.getSelectedRow(), 0);
            tblModel.setValueAt(ngaysinh, jTable.getSelectedRow(), 1);
            tblModel.setValueAt(que, jTable.getSelectedRow(), 2);
            tblModel.setValueAt(sdt, jTable.getSelectedRow(), 3);
            tblModel.setValueAt(ma, jTable.getSelectedRow(), 4);
            
            //ucập nhật hiển thị
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            txtMessage.setText("");
            txtNgaySinh.setText("");
            txtQue.setText("");
            txtSDT.setText("");
            txtMaP.setText("");
        } else{
            if(jTable.getRowCount()==0){
                //if table is empty
                JOptionPane.showMessageDialog(this, "Không có sinh viên nào trong bảng");
            }else{
                //if row is not selected or multiple row is selected than
                JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên muốn sửa");
            }
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        //Lấy thông tin từ bảng ra ô nhập dữ liệu
        DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();
        String tblTen = tblModel.getValueAt(jTable.getSelectedRow(), 0).toString();
        String tblNgaySinh = tblModel.getValueAt(jTable.getSelectedRow(), 1).toString();
        String tblQue = tblModel.getValueAt(jTable.getSelectedRow(), 2).toString();
        String tblSDT = tblModel.getValueAt(jTable.getSelectedRow(), 3).toString();
        String tblMaP = tblModel.getValueAt(jTable.getSelectedRow(), 4).toString();

        //Thay thông tin 
        txtMessage.setText(tblTen);
        txtNgaySinh.setText(tblNgaySinh);
        txtQue.setText(tblQue);
        txtSDT.setText(tblSDT);
        txtMaP.setText(tblMaP);
    }//GEN-LAST:event_jTableMouseClicked

    private void timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemActionPerformed
        // TODO add your handling code here:
        String timKiem = txtTimKiem.getText().toLowerCase();
    
    // Nếu ô tìm kiếm không trống, tiến hành tìm kiếm
    if (!timKiem.isEmpty()) {
        DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();
        TableModel model = jTable.getModel();
        DefaultTableModel newModel = new DefaultTableModel(new Object[][]{}, 
            new String[] {"Họ Và Tên", "Ngày Sinh", "Quê Quán", "Số Điện Thoại", "Mã Phòng"});
        
        for (int i = 0; i < model.getRowCount(); i++) {
            String hoTen = model.getValueAt(i, 0).toString().toLowerCase();
            String ngaySinh = model.getValueAt(i, 1).toString().toLowerCase();
            String queQuan = model.getValueAt(i, 2).toString().toLowerCase();
            String sdt = model.getValueAt(i, 3).toString().toLowerCase();
            String maPhong = model.getValueAt(i, 4).toString().toLowerCase();
            
            // Kiểm tra từ khóa tìm kiếm trong từng cột của bảng
            if (hoTen.contains(timKiem) || ngaySinh.contains(timKiem) || queQuan.contains(timKiem) 
                    || sdt.contains(timKiem) || maPhong.contains(timKiem)) {
                // Nếu tìm thấy, thêm hàng này vào bảng mới
                newModel.addRow(new Object[]{hoTen, ngaySinh, queQuan, sdt, maPhong});
            }
        }
        
        // Hiển thị dữ liệu đã lọc trên bảng
        jTable.setModel(newModel);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa để tìm kiếm.");
    }
    }//GEN-LAST:event_timkiemActionPerformed

    private void xoaTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaTimKiemActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();
        tblModel.setRowCount(0);  // Xóa toàn bộ dữ liệu hiện tại trên bảng

    // Thêm lại dữ liệu từ danh sách gốc
    for (String[] sinhVien : danhSachSinhVien) {
        tblModel.addRow(sinhVien);
    }

    JOptionPane.showMessageDialog(this, "Đã xóa tìm kiếm!");
    txtTimKiem.setText(""); //Xóa từ tìm kiếm trên thanh tìm 
    }//GEN-LAST:event_xoaTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList<String> lsHistory;
    private javax.swing.JButton timkiem;
    private javax.swing.JTextField txtMaP;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtQue;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JButton xoaTimKiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            input = new DataInputStream(socket.getInputStream());
            while (true) {                
                if (socket != null && !socket.isClosed()) {
                    String hoTen = input.readUTF();     // Nhận họ tên từ client
                    String ngaySinh = input.readUTF();  // Nhận ngày sinh từ client
                    String queQuan = input.readUTF();   // Nhận quê quán từ client
                    String sdt = input.readUTF();
                    String map = input.readUTF();
                    // Tạo mảng chứa các dữ liệu vừa nhận để thêm vào bảng
                    String[] data = {hoTen, ngaySinh, queQuan, sdt, map};
                    danhSachSinhVien.add(data);  // Lưu vào danh sách gốc
                    DefaultTableModel tblModel = (DefaultTableModel) jTable.getModel();
                    tblModel.addRow(data);  // Thêm dữ liệu vào bảng
                    model.addElement("Dữ liệu nhận được từ Sinh Viên: " + hoTen);
                    lsHistory.setModel(model);
                }
                 Thread.sleep(1000);
            }     
        } catch (Exception e) { e.printStackTrace();
        }
    }
}
