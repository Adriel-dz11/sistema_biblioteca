/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;
/**
 *
 * @author adrie
 */
public class MtnLibros extends javax.swing.JPanel {
    ButtonGroup btgr;
    /**
     * Creates new form MtnLibros
     */
    public MtnLibros() {
        initComponents();
        btgr = new ButtonGroup ();
        btgr.add(rbActivo);
        btgr.add(rbInactivo);
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        LBTitulo = new javax.swing.JLabel();
        LBAutor = new javax.swing.JLabel();
        LBEditorial = new javax.swing.JLabel();
        LBCopias = new javax.swing.JLabel();
        LBFechaLlegada = new javax.swing.JLabel();
        LBGeneroLibro = new javax.swing.JLabel();
        LBIdioma = new javax.swing.JLabel();
        LBAnoEdicion = new javax.swing.JLabel();
        LBSeccion = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtTitulo1 = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtCopias = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        txtCodLibro = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        txtGeneroLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaLlegada = new javax.swing.JTextField();
        txtFechaEdicion = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 40, 45));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento de Libros");

        jButton1.setBackground(new java.awt.Color(0, 40, 45));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cantidad de libros por género");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 40, 45));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Libros Registrados");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(856, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Registro de Libros");

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Libros", "Título", "Autor", "Editorial", "Copias", "Fecha de llegada", "Idioma", "Año de Edición", "Ubicación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        LBTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBTitulo.setText("Título:");

        LBAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBAutor.setText("Autor:");

        LBEditorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBEditorial.setText("Editorial:");

        LBCopias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBCopias.setText("Copias:");

        LBFechaLlegada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBFechaLlegada.setText("Fecha de llegada:");

        LBGeneroLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBGeneroLibro.setText("Genero de Libro:");

        LBIdioma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBIdioma.setText("Idioma:");

        LBAnoEdicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBAnoEdicion.setText("Año de Edición:");

        LBSeccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBSeccion.setText("Ubicación:");

        txtAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAutor.setMinimumSize(null);
        txtAutor.setPreferredSize(new java.awt.Dimension(7, 25));

        txtTitulo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEditorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEditorial.setMinimumSize(null);
        txtEditorial.setPreferredSize(new java.awt.Dimension(7, 25));

        txtCopias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCopias.setMinimumSize(null);
        txtCopias.setPreferredSize(new java.awt.Dimension(7, 25));

        txtIdioma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdioma.setMinimumSize(null);
        txtIdioma.setPreferredSize(new java.awt.Dimension(7, 25));

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        txtCodLibro.setPreferredSize(new java.awt.Dimension(7, 25));

        txtUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUbicacion.setMinimumSize(null);
        txtUbicacion.setPreferredSize(new java.awt.Dimension(7, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Estado:");

        rbActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbActivo.setText("Activo");

        rbInactivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbInactivo.setText("Inactivo");

        txtGeneroLibro.setMinimumSize(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID:");

        txtFechaLlegada.setPreferredSize(new java.awt.Dimension(62, 25));

        txtFechaEdicion.setPreferredSize(new java.awt.Dimension(62, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LBTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LBAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LBCopias, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LBFechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBGeneroLibro)
                                .addGap(18, 18, 18)
                                .addComponent(txtGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBAnoEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LBEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBTitulo)
                    .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBAutor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBEditorial)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBCopias)
                    .addComponent(txtCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBFechaLlegada)
                    .addComponent(txtFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBGeneroLibro))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBAnoEdicion)
                        .addComponent(txtFechaEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBIdioma))
                            .addComponent(rbInactivo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBSeccion)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConsListaLibros listalibros= new ConsListaLibros();
        listalibros.setVisible(true);
        listalibros.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ConsCantLibrosGen lgenero= new ConsCantLibrosGen();
        lgenero.setVisible(true);
        lgenero.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_jButton1ActionPerformed
    private void limpiar (){
        txtCodLibro.setText("");
        txtTitulo1.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        txtCopias.setText("");
        txtIdioma.setText("");
        txtUbicacion.setText("");
        txtGeneroLibro.setText("");
        txtFechaLlegada.setText("");
        txtFechaEdicion.setText("");
        btgr.clearSelection();
        
 
    }
    private void cargarTabla(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblLibros.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try {
            
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT Id_Libro, Titulo, Autor, Editorial, Copias, Fecha_Llegada, Estado, Idioma, Año_de_Edicion, Ubicacion FROM Libro");
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila = new Object[columnas];
               for(int indice = 0; indice<columnas; indice++){
                   fila [indice] = rs.getObject(indice + 1);
               }
               
               modeloTabla.addRow(fila);
           }
            
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
    }
    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
       try{
            
            int fila = tblLibros.getSelectedRow();
            int Id = Integer.parseInt(tblLibros.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
        
            java.sql.Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT Titulo, Autor, Editorial, Copias, Fecha_llegada, Estado, Genero, Idioma, Año_de_Edicion, Ubicacion FROM Libro WHERE Id_Libro=?");
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                txtCodLibro.setText(String.valueOf(Id));
                txtTitulo1.setText(rs.getString("Titulo"));
                txtAutor.setText(rs.getString("Autor"));
                txtEditorial.setText(rs.getString("Editorial"));
                txtCopias.setText(rs.getString("Copias"));
                txtGeneroLibro.setText(rs.getString("Genero"));
                txtFechaLlegada.setText(rs.getString("Fecha_llegada"));
                txtIdioma.setText(rs.getString("Idioma"));
                txtFechaEdicion.setText(rs.getString("Año_de_Edicion"));
                txtUbicacion.setText(rs.getString("Ubicacion"));
                if (rs.getString("Estado").equals("Activo")){
                    rbActivo.setSelected(true);
                }else if (rs.getString("Estado").equals("Inactivo")){
                    rbInactivo.setSelected(true);
                }
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        int Id_Libro = Integer.parseInt(txtCodLibro.getText());
        String Titulo = txtTitulo1.getText();
        String Autor = txtAutor.getText();
        String Editorial = txtEditorial.getText();
        int Copias = Integer.parseInt(txtCopias.getText());
        String Fecha_Llegada = txtFechaLlegada.getText();
        String FechaEdicion = txtFechaEdicion.getText();
        String Idioma = txtIdioma.getText();
        String Estado;
        if (rbInactivo.isSelected() == true){
            Estado = "Activo";
        } else if(rbInactivo.isSelected() == true){
            Estado = "Inactivo";
        } else{
            Estado = "Activo";
        }
        String Ubicacion = txtUbicacion.getText();
        String Genero = txtGeneroLibro.getText();
        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Libro (Id_Libro, Titulo, Autor, Editorial, Copias, Fecha_Llegada, Estado, Genero, Idioma, Año_de_Edicion, Ubicacion) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, Id_Libro);
            ps.setString(2, Titulo);
            ps.setString(3, Autor);
            ps.setString(4, Editorial);
            ps.setInt(5, Copias);
            ps.setString(6, Fecha_Llegada);
            ps.setString(7, Estado);
            ps.setString(8, Genero);
            ps.setString(9, Idioma);
            ps.setString(10, FechaEdicion);
            ps.setString(11, Ubicacion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTabla();

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        int Id_Libro = Integer.parseInt(txtCodLibro.getText());
        String Titulo = txtTitulo1.getText();
        String Autor = txtAutor.getText();
        String Editorial = txtEditorial.getText();
        int Copias = Integer.parseInt(txtCopias.getText());
        String Estado;
        if (rbInactivo.isSelected() == true){
            Estado = "Activo";
        } else if(rbInactivo.isSelected() == true){
            Estado = "Inactivo";
        } else{
            Estado = "Activo";
        }
        String Ubicacion = txtUbicacion.getText();
        String Genero = txtGeneroLibro.getText();
        String Idioma = txtIdioma.getText();
        String Fecha_Llegada = txtFechaLlegada.getText();
        String FechaEdicion = txtFechaEdicion.getText();

        try {

            java.sql.Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE Libro SET Titulo=?, Autor=?, Editorial=?, Copias=?, Fecha_llegada=?, Estado=?, Genero=?, Idioma=?, Año_de_Edicion=?, Ubicacion=? WHERE Id_Libro=?");
            ps.setString(1, Titulo);
            ps.setString(2, Autor);
            ps.setString(3, Editorial);
            ps.setInt(4, Copias);
            ps.setString(5, Fecha_Llegada);
            ps.setString(6, Estado);
            ps.setString(7, Genero);
            ps.setString(8, Idioma);
            ps.setString(9, FechaEdicion);
            ps.setString(10, Ubicacion);
            ps.setInt(11, Id_Libro);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar();
            cargarTabla();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int Id_Libro = Integer.parseInt(txtCodLibro.getText());
             
        try {
            
           java.sql.Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("DELETE FROM Libro WHERE Id_Libro=?");
           ps.setInt(1 , Id_Libro);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro Eliminado");
           limpiar();
           cargarTabla();
            
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null, e.toString()); 
           
       }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel LBAnoEdicion;
    private javax.swing.JLabel LBAutor;
    private javax.swing.JLabel LBCopias;
    private javax.swing.JLabel LBEditorial;
    private javax.swing.JLabel LBFechaLlegada;
    private javax.swing.JLabel LBGeneroLibro;
    private javax.swing.JLabel LBIdioma;
    private javax.swing.JLabel LBSeccion;
    private javax.swing.JLabel LBTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodLibro;
    private javax.swing.JTextField txtCopias;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFechaEdicion;
    private javax.swing.JTextField txtFechaLlegada;
    private javax.swing.JTextField txtGeneroLibro;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtTitulo1;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
