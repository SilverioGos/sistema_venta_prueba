
package vista;

import conexxx.libros;
import conexxx.LibrosDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tabla_libros extends javax.swing.JInternalFrame {

    LibrosDAO dao = new LibrosDAO();
    libros cl=new libros();
    
    DefaultTableModel modelo=new DefaultTableModel();
    int cod_lib;
    public Tabla_libros() {
        initComponents();
        listar();
    }
    
    void listar(){
        List<libros> lista=dao.listar();
        modelo=(DefaultTableModel)Tabla.getModel();
        Object[]ob=new Object[7];
        for (int i=0; i<lista.size(); i++){
            ob[0]=lista.get(i).getCod_lib();
            ob[1]=lista.get(i).getEdicion();
            ob[2]=lista.get(i).getFecha_lib();
            ob[3]=lista.get(i).getEditorial();
            ob[4]=lista.get(i).getTitulo();
            ob[5]=lista.get(i).getPrecio();
            ob[6]=lista.get(i).getCod_au();
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
        txtEdicion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCod_autor = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edicion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editorial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel1.add(txtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 209, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 209, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 209, -1));
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 209, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Titulo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 209, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Libros");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cod_autor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));
        jPanel1.add(txtCod_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 209, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 130, 30));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 130, 30));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 130, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 340));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod_Libro", "Edicion", "Fecha", "Editorial", "Titulol", "Precio", "Cod_autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 640, 220));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 680, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila=Tabla.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            cod_lib = Integer.parseInt(Tabla.getValueAt(fila,0).toString());
            String edicion = Tabla.getValueAt(fila,1).toString();
            String fecha_lib = Tabla.getValueAt(fila,2).toString();
            String editorial = Tabla.getValueAt(fila,3).toString();
            String titulo = Tabla.getValueAt(fila,4).toString();
            String precio = Tabla.getValueAt(fila,5).toString();
            String cod_au = Tabla.getValueAt(fila,6).toString();
            txtEdicion.setText(edicion);
            txtFecha.setText(fecha_lib);
            txtEditorial.setText(editorial);
            txtTitulo.setText(titulo);
            txtPrecio.setText(precio);
            txtCod_autor.setText(cod_au);
        }
    }//GEN-LAST:event_TablaMouseClicked
    
    void agregar(){
        String edicion=txtEdicion.getText();
        String fecha_lib=txtFecha.getText();
        String editorial=txtEditorial.getText();
        String titulo=txtTitulo.getText();
        String precio=txtPrecio.getText();
        String cod_au=txtCod_autor.getText();
        Object[]ob= new Object [6];
        ob[0]=edicion;
        ob[1]=fecha_lib;
        ob[2]=editorial;
        ob[3]=titulo;
        ob[4]=precio;
        ob[5]=cod_au;
        dao.add(ob);
    }
    
    void actualizar(){
        int fila=Tabla.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        } else {
        String edicion=txtEdicion.getText();
        String fecha_lib=txtFecha.getText();
        String editorial=txtEditorial.getText();
        String titulo=txtTitulo.getText();
        String precio=txtPrecio.getText();
        String cod_au=txtCod_autor.getText();
        Object[]obj= new Object [7];
        obj[0]=edicion;
        obj[1]=fecha_lib;
        obj[2]=editorial;
        obj[3]=titulo;
        obj[4]=precio;
        obj[5]=cod_au;
        obj[6]=cod_lib;
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
        txtEdicion.setText("");
        txtFecha.setText("");
        txtEditorial.setText("");
        txtTitulo.setText("");
        txtPrecio.setText("");
        txtCod_autor.setText("");
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCod_autor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
