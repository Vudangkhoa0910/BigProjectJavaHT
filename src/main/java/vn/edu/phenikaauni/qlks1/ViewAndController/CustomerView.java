
package vn.edu.phenikaauni.qlks1.ViewAndController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import vn.edu.phenikaauni.qlks1.Dao.CustomerDao;
import vn.edu.phenikaauni.qlks1.Dao.RoomDao;
import vn.edu.phenikaauni.qlks1.Entity.Customer;
import vn.edu.phenikaauni.qlks1.Entity.Room;


public class CustomerView extends javax.swing.JFrame {

  
    private JPanel backgroundPanel;
    
    public CustomerView() {
        initComponents();
        setupBackground();
        showDataTable();
        getDataFromTable();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    
    private void setupBackground() {
        backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(173, 216, 230)); 
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(backgroundPanel, BorderLayout.CENTER);
        backgroundPanel.add(jLabel1);
        backgroundPanel.setLayout(new GroupLayout(backgroundPanel));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cccdTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        payLabel = new javax.swing.JLabel();
        payTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        roomNumberComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        sortByNameButton = new javax.swing.JButton();
        sortByCccdButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel1.setText("MANAGE HOTEL RESERVATIONS");

        jLabel2.setText("Name");

        jLabel3.setText("CCCD");

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "CCCD", "Phone Number", "Room Type", "Room Number", "Booking Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        jLabel7.setText("Booking Information");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Room Type");

        jLabel9.setText("Room Number");

        jLabel6.setText("Search");

        jLabel8.setText("Total Payment");

        payTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payTextFieldActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        roomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Single Room", "Double Room", "VIP Room" }));
        roomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboBoxActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        sortByNameButton.setText("Sort By Name");
        sortByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameButtonActionPerformed(evt);
            }
        });

        sortByCccdButton.setText("Sort By CCCD");
        sortByCccdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByCccdButtonActionPerformed(evt);
            }
        });

        payButton.setText("Pay");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nameTextField)
                                                    .addComponent(cccdTextField)
                                                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(roomNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(151, 151, 151)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(sortByNameButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sortByCccdButton)
                                        .addGap(16, 16, 16))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jButton1)
                                .addGap(49, 49, 49)
                                .addComponent(payLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cccdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(payButton))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sortByNameButton)
                    .addComponent(sortByCccdButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(payTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    public Customer getCustomerFromTextField(){
        return new Customer(nameTextField.getText(), cccdTextField.getText(), phoneNumberTextField.getText(), roomTypeComboBox.getSelectedItem().toString(), roomNumberComboBox.getSelectedItem().toString(), LocalDateTime.now().toString());
        }
    public boolean validateName(){
        if (nameTextField.getText().equals("") || nameTextField.getText() == null){
            showMessage("Name cannot be blank!");
            nameTextField.requestFocus();
            return false;
        }
        return true;
    }
    public boolean validateCCCD(){
        if (cccdTextField.getText().equals("") || cccdTextField.getText() == null){
            showMessage("CCCD cannot be blank!");
            cccdTextField.requestFocus();
            return false;
        }
        return true;
    }
    public boolean validatePhoneNumber(){
        if (phoneNumberTextField.getText().equals("") || phoneNumberTextField.getText() == null){
            showMessage("Phone number cannot be blank!");
            phoneNumberTextField.requestFocus();
            return false;
        }
        return true;
    }
    public boolean validateRoomType(){
        if (roomTypeComboBox.getSelectedItem().toString().length() < 2){
            showMessage("Room type cannot be blank!");
            return false;
        }
        return true;
    }
    public boolean validateRoomNumber(){
        if (roomNumberComboBox.getSelectedItem().toString().length() < 2 || roomNumberComboBox.getSelectedItem()== null){
            showMessage("Room number cannot be blank!");
            return false;
        }
        return true;
    }
    public boolean checkValidateInfo(){
        if (validateName() && validateCCCD() && validatePhoneNumber() && validateRoomType() && validateRoomNumber()){
            return true;
        }
        return false;
    }
    public void clearTextField(){
        nameTextField.setText(null);
        cccdTextField.setText(null);
        phoneNumberTextField.setText(null);
        roomTypeComboBox.setSelectedIndex(0);
        roomNumberComboBox.removeAllItems();
    }
    public void showDataTable(){
        String[] columnName = {"Name", "CCCD", "Phone Number", "Room Type", "Room Number", "Booking Date"};
        DefaultTableModel model = new DefaultTableModel(columnName, 0);
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
        for (Customer customer:listCustomer){
            model.addRow(new Object[]{customer.getName(), customer.getCccd(), customer.getPhoneNumber(), customer.getRoomType(), customer.getRoomNumber(), customer.getBookingDate()});
        }
        tableCustomer.setModel(model);
    }
    public void getDataFromTable(){
        tableCustomer.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
               addButton.setEnabled(false);
               if (!e.getValueIsAdjusting()) {
                   int selectedRow = tableCustomer.getSelectedRow();
                   if (selectedRow != -1) {
                       String cccd = (String)tableCustomer.getValueAt(selectedRow, 1);
                       List<Customer> listCustomer = CustomerDao.readCustomerXML();
                       for (Customer c:listCustomer){
                           if (c.getCccd().equals(cccd)){
                               nameTextField.setText(c.getName());
                               cccdTextField.setText(c.getCccd());
                               phoneNumberTextField.setText(c.getPhoneNumber());
                               roomTypeComboBox.setSelectedItem(c.getRoomType());
                               roomNumberComboBox.removeAllItems();
                               roomNumberComboBox.addItem(c.getRoomNumber());
                               payTextField.setText(""+getMoney(c));
                               break;
                           }
                       }
                   }
               }
           }
       });
    };
    public double getMoney(Customer customer){
        LocalDateTime bookingDate = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        bookingDate = LocalDateTime.parse(customer.getBookingDate(), dateTimeFormatter);
        double price = customer.getRoomType().equals("Single Room")?500:(customer.getRoomType().equals("Double Room")?1000:1500);
        return price * bookingDate.until(LocalDateTime.now(), ChronoUnit.HOURS);
    }
    private void roomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboBoxActionPerformed
        // TODO add your handling code here:
        roomNumberComboBox.removeAllItems();
        List<Room> listRoom = RoomDao.readRoomXML();
        String roomType = roomTypeComboBox.getSelectedItem().toString();
        for (Room r:listRoom){
            if (r.getRoomType().equals(roomType) && !r.getRoomStatus()){
                roomNumberComboBox.addItem(r.getRoomNumber());
            }
        }
    }//GEN-LAST:event_roomTypeComboBoxActionPerformed
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (checkValidateInfo()){
            Customer customer = getCustomerFromTextField();
            CustomerDao.addCustomer(customer);
            RoomDao.changeRoomStatus(roomNumberComboBox.getSelectedItem().toString());
            clearTextField();
            showDataTable();
            showMessage("Addition successful!");
        }
    }//GEN-LAST:event_addButtonActionPerformed
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearTextField();
        addButton.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        addButton.setEnabled(true);
        if (checkValidateInfo()){
            Customer customer = getCustomerFromTextField();
            List<Customer> listCustomer = CustomerDao.readCustomerXML();
            for (Customer c:listCustomer){
                if (c.getCccd().equals(cccdTextField.getText())){
                    if (!c.getRoomNumber().equals(customer.getRoomNumber())){
                        RoomDao.changeRoomStatus(c.getRoomNumber());
                        RoomDao.changeRoomStatus(customer.getRoomNumber());
                    }
                    listCustomer.remove(c);
                    break;
                }
            }
            listCustomer.add(customer);
            CustomerDao.writeCustomerXML(listCustomer);
            clearTextField();
            showDataTable();
            showMessage("Edited Successfully!");
        }
    }//GEN-LAST:event_editButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (checkValidateInfo()){
             Customer customer = new Customer(nameTextField.getText(), cccdTextField.getText(), phoneNumberTextField.getText(), roomTypeComboBox.getSelectedItem().toString(), roomNumberComboBox.getSelectedItem().toString(), LocalDateTime.now().toString(), LocalDateTime.now().toString());
             List<Customer> listCustomer = CustomerDao.readCustomerXML();
             for (Customer c:listCustomer){
                if (c.getCccd().equals(customer.getCccd())){
                    listCustomer.remove(c);
                    break;
                }
             }
             CustomerDao.writeCustomerXML(listCustomer);
         }
         showDataTable();
         clearTextField();
         addButton.setEnabled(true);
         showMessage("Deleted Successfully!");
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String str = searchTextField.getText().toLowerCase();
        List<Customer> listCustomers = CustomerDao.readCustomerXML();
        List<Customer> newListCustomer = new ArrayList<Customer>();
        for (Customer c:listCustomers){
            if (c.getName().toLowerCase().contains(str) || c.getCccd().toLowerCase().contains(str)){
                newListCustomer.add(c);
            }
        }
        String[] columnName = {"Name", "CCCD", "Phone Number", "Room Type", "Room Number", "Booking Date"};
        DefaultTableModel model = new DefaultTableModel(columnName, 0);
        for (Customer customer:newListCustomer){
            model.addRow(new Object[]{customer.getName(), customer.getCccd(), customer.getPhoneNumber(), customer.getRoomType(), customer.getRoomNumber(), customer.getBookingDate()});
        }
        tableCustomer.setModel(model);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void sortByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameButtonActionPerformed
        // TODO add your handling code here:
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
        CustomerDao.sortByCustomerName(listCustomer);
        CustomerDao.writeCustomerXML(listCustomer);
        showDataTable();
    }//GEN-LAST:event_sortByNameButtonActionPerformed

    private void sortByCccdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByCccdButtonActionPerformed
        // TODO add your handling code here:
        List<Customer> listCustomer = CustomerDao.readCustomerXML();
        CustomerDao.sortByCCCD(listCustomer);
        CustomerDao.writeCustomerXML(listCustomer);
        showDataTable();
    }//GEN-LAST:event_sortByCccdButtonActionPerformed

    private void payTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payTextFieldActionPerformed

    // Code cho nút Show - Khoabu
private void hienThiTatCaDuLieu() {
    JFrame frameMoi = new JFrame("Hiển Thị Tất Cả Dữ Liệu");
    frameMoi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setBackground(new Color(173, 216, 230));
    List<Customer> danhSachKhachHang = CustomerDao.readCustomerXML();
    List<Room> danhSachPhong = RoomDao.readRoomXML();

    String[] columnNames = {"Tên", "CCCD", "Số Điện Thoại", "Loại Phòng", "Số Phòng", "Ngày Đặt"};
    Object[][] data = new Object[danhSachKhachHang.size() + danhSachPhong.size()][6];

    int rowIndex = 0;
    for (Customer khachHang : danhSachKhachHang) {
        data[rowIndex][0] = khachHang.getName();
        data[rowIndex][1] = khachHang.getCccd();
        data[rowIndex][2] = khachHang.getPhoneNumber();
        data[rowIndex][3] = khachHang.getRoomType();
        data[rowIndex][4] = khachHang.getRoomNumber();
        data[rowIndex][5] = khachHang.getBookingDate();
        rowIndex++;
    }

    for (Room phong : danhSachPhong) {
        data[rowIndex][0] = ""; 
        data[rowIndex][1] = ""; 
        data[rowIndex][2] = "";
        data[rowIndex][3] = phong.getRoomType();
        data[rowIndex][4] = phong.getRoomNumber();
        data[rowIndex][5] = phong.getRoomStatus() ? "Đã đặt" : "Trống";
        rowIndex++;
    }


    JTable table = new JTable(data, columnNames);

 
    JScrollPane scrollPane = new JScrollPane(table);
    panel.add(scrollPane);
    frameMoi.add(panel);
    
     table.setPreferredScrollableViewportSize(table.getPreferredSize());

    frameMoi.setSize(800, 500);
    frameMoi.setLocationRelativeTo(this);
    frameMoi.setVisible(true);
}



    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        hienThiTatCaDuLieu();

    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField cccdTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel payLabel;
    private javax.swing.JTextField payTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JComboBox<String> roomNumberComboBox;
    private javax.swing.JComboBox<String> roomTypeComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton sortByCccdButton;
    private javax.swing.JButton sortByNameButton;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView();
            }
        });
    }
    
}
