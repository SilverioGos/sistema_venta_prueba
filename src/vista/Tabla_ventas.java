/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexxx.DetallesVenta;
import conexxx.cliente;
import conexxx.clienteDAO;
import conexxx.libros;
import conexxx.ventas;
import conexxx.ventasDAO;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sistema
 */
public class Tabla_ventas extends javax.swing.JInternalFrame {

    clienteDAO cdao=new clienteDAO();
    ventasDAO vdao=new ventasDAO();
    libros c=new libros();
    ventas v=new ventas();
    DetallesVenta dv = new DetallesVenta();
    cliente cliente=new cliente();
    DefaultTableModel modelo=new DefaultTableModel();
    int idl;
    int cant;
    double precio;
    double tpagar;
    public Tabla_ventas() {
        initComponents();
        Calendar calendar=new GregorianCalendar();
        txtFecha.setText(""+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JSpinner();
        btnBuscaCli = new javax.swing.JButton();
        btnBuscarLib = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCodCliente = new javax.swing.JTextField();
        txtCodProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        client = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtlibro = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tel: 949185455 - 934812373");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Boleta de Venta ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bolvent.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 210, 180));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("\"La cuadra del libro\"");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nro Serie");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Venta de libros");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 40));

        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 730, 220));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codigo Cliente:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Codigo Libro:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Precio");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 190, 30));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, 30));

        btnBuscaCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscaCli.setText("Buscar");
        btnBuscaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCliActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 30));

        btnBuscarLib.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarLib.setText("Buscar");
        jPanel2.add(btnBuscarLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 100, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 30));

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 30));

        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cliente:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, 20));

        client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientActionPerformed(evt);
            }
        });
        jPanel2.add(client, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 180, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Libro:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        txtlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlibroActionPerformed(evt);
            }
        });
        jPanel2.add(txtlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 180, 30));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 730, 190));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Cod", "Producto", "Cantidad", "Precio Uni", "Total"
            }
        ));
        jScrollPane2.setViewportView(TablaDetalle);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 680, 170));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 730, 210));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Cancelar");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 40));

        jButton5.setText("Generar venta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 150, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Total a Pagar:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));
        jPanel4.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 730, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientActionPerformed

    private void txtlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlibroActionPerformed

    private void btnBuscaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCliActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscaCliActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        agregarProducto();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        guardarVenta();
        guardarDetalle();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    void guardarVenta(){
        int idv=01;
        int idc=cliente.getCod_cliente();
        String Numeroventa=txtSerie.getText();
        String fecha=txtFecha.getText();
        double monto=tpagar;
        String estado="1";
        
        v.setCod_clientes(idc);
        v.setCod_emp(idv);
        v.setNumeroVentas(Numeroventa);
        v.setFechaVentas(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
        
    }
    
    void guardarDetalle(){
        String idv=vdao.IdVentas();
        int idve=Integer.parseInt(idv);
        for(int i=0; i<TablaDetalle.getRowCount(); i++){
            int idp=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            int cant=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            double pre=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdLibros(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(pre);
        }
        
    }
    void agregarProducto(){
        double total =  Math.random();
        int item=0;
        modelo=(DefaultTableModel)TablaDetalle.getModel();
        item=item+1;
        idl=c.getCod_lib();
        String noml=txtlibro.getText();
        precio=Double.parseDouble(txtPrecio.getText());
        cant=Integer.parseInt(txtCantidad.getValue().toString());
        total=cant*precio;
        ArrayList lista=new ArrayList();
        lista.add(item);
        lista.add(idl);
        lista.add(noml);
        lista.add(cant);
        lista.add(precio);
        lista.add(total);
        Object[]ob= new Object[6];
        ob[0]=lista.get(0);
        ob[1]=lista.get(1);
        ob[2]=lista.get(2);
        ob[3]=lista.get(3);
        ob[4]=lista.get(4);
        ob[5]=lista.get(5);
        modelo.addRow(ob);
        TablaDetalle.setModel(modelo);
        calcularTotal();        
    }
    void calcularTotal(){
        tpagar=0;
        for(int i=0; i<TablaDetalle.getRowCount(); i++){
            cant=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            precio=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            tpagar=tpagar+(cant*precio);
        }
        txtTotalPagar.setText(""+tpagar);
    }
    
    void buscarCliente(){
        int r;
        String cod=txtCodCliente.getText();
        if(txtCodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el codigo de cliente");
        } else {
            cliente=cdao.listarID(cod);
            if(cliente.getNombre()!=null){
                client.setText(cliente.getNombre());
                txtCodProducto.requestFocus();
            } else {
                r=JOptionPane.showConfirmDialog(this,"Cliente no registrado, Desea registrar?");
                if(r == 0){
                    cliente cf=new cliente();
                    //Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnBuscaCli;
    private javax.swing.JButton btnBuscarLib;
    private javax.swing.JTextField client;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtlibro;
    // End of variables declaration//GEN-END:variables
}