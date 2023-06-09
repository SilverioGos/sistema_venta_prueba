/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexxx.cliente;
import conexxx.clienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class Tabla_clientes extends javax.swing.JInternalFrame {

    clienteDAO dao = new clienteDAO();
    cliente cl=new cliente();
    
    DefaultTableModel modelo=new DefaultTableModel();
    int cod_cliente;
    public Tabla_clientes() {
        initComponents();
        listar();
    }
    void listar(){
        List<cliente> lista=dao.listar();
        modelo=(DefaultTableModel)Tabla.getModel();
        Object[]ob=new Object[6];
        for (int i=0; i<lista.size(); i++){
            ob[0]=lista.get(i).getCod_cliente();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getApellido();
            ob[3]=lista.get(i).getEdad();
            ob[4]=lista.get(i).getEmail();
            ob[5]=lista.get(i).getDireccion();
            modelo.addRow(ob);
        }
        Tabla.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 209, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 209, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 209, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 209, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 130, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 130, 30));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 209, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 680, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod_Cliente", "Nombre", "Apellido", "Edad", "Email", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 240));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 680, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila=Tabla.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            cod_cliente = Integer.parseInt(Tabla.getValueAt(fila,0).toString());
            String nombre = Tabla.getValueAt(fila,1).toString();
            String apellido = Tabla.getValueAt(fila,2).toString();
            String edad = Tabla.getValueAt(fila,3).toString();
            String email = Tabla.getValueAt(fila,4).toString();
            String direccion = Tabla.getValueAt(fila,5).toString();
            txtNombre.setText(nombre);
            txtApellido.setText(apellido);
            txtEdad.setText(edad);
            txtEmail.setText(email);
            txtDireccion.setText(direccion);
        }
    }//GEN-LAST:event_TablaMouseClicked
    
    void agregar(){
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String edad=txtEdad.getText();
        String email=txtEmail.getText();
        String direccion=txtDireccion.getText();
        Object[]ob= new Object [5];
        ob[0]=nombre;
        ob[1]=apellido;
        ob[2]=edad;
        ob[3]=email;
        ob[4]=direccion;
        dao.add(ob);
    }
    
    void actualizar(){
        int fila=Tabla.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        } else {
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String edad=txtEdad.getText();
        String email=txtEmail.getText();
        String direccion=txtDireccion.getText();
        Object[]obj= new Object [6];
        obj[0]=nombre;
        obj[1]=apellido;
        obj[2]=edad;
        obj[3]=email;
        obj[4]=direccion;
        obj[5]=cod_cliente;
        dao.actualizar(obj);
        }
    }
    
    void eliminar(){
        int fila=Tabla.getSelectedRow();
        int ids = Integer.parseInt(Tabla.getValueAt(fila,0).toString());
        if (fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        } else {
            dao.eliminar(ids);
        }
    }
    
    void nuevo(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        txtDireccion.setText("");
    }
    void limpiarTabla(){
        for (int i=0; i< modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
