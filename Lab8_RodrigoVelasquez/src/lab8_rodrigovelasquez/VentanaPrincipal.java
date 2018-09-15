package lab8_rodrigovelasquez;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Arbol = new javax.swing.JDialog();
        cb_Proyecto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Arbol = new javax.swing.JTree();
        jLabel6 = new javax.swing.JLabel();
        jd_Proyecto = new javax.swing.JDialog();
        tf_NombreProyecto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_DuracionProyecto = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jd_Actividad = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_NombreActividad = new javax.swing.JTextField();
        tf_DuracionActividad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_ProyectosRegistro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rb_Predecesor = new javax.swing.JRadioButton();
        rb_Sucesor = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tf_RetrasoActividad = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pp_CRUD = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jd_Sucesor = new javax.swing.JDialog();
        cb_ActividadSucesor = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Actividades = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        box_Proyectos = new javax.swing.JComboBox<>();

        cb_Proyecto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ProyectoItemStateChanged(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Rodri Corps");
        jt_Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ArbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Arbol);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("NOTA: Se necesitan dos proyectos minimo para mostrar");

        javax.swing.GroupLayout jd_ArbolLayout = new javax.swing.GroupLayout(jd_Arbol.getContentPane());
        jd_Arbol.getContentPane().setLayout(jd_ArbolLayout);
        jd_ArbolLayout.setHorizontalGroup(
            jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArbolLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jd_ArbolLayout.setVerticalGroup(
            jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArbolLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Duracion");

        jButton5.setText("Crear Proyecto");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ProyectoLayout = new javax.swing.GroupLayout(jd_Proyecto.getContentPane());
        jd_Proyecto.getContentPane().setLayout(jd_ProyectoLayout);
        jd_ProyectoLayout.setHorizontalGroup(
            jd_ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(87, 87, 87)
                .addGroup(jd_ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_DuracionProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jd_ProyectoLayout.setVerticalGroup(
            jd_ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ProyectoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_DuracionProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton5)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton6.setText("Registrar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Duracion");

        jLabel7.setText("Sucesor o Predecesor");

        jLabel8.setText("Proyecto");

        buttonGroup1.add(rb_Predecesor);
        rb_Predecesor.setText("Predecesor");

        buttonGroup1.add(rb_Sucesor);
        rb_Sucesor.setText("Sucesor");

        jLabel5.setText("Posibilidad de Retraso");

        javax.swing.GroupLayout jd_ActividadLayout = new javax.swing.GroupLayout(jd_Actividad.getContentPane());
        jd_Actividad.getContentPane().setLayout(jd_ActividadLayout);
        jd_ActividadLayout.setHorizontalGroup(
            jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ActividadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ActividadLayout.createSequentialGroup()
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_DuracionActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_NombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ActividadLayout.createSequentialGroup()
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_ActividadLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGroup(jd_ActividadLayout.createSequentialGroup()
                                .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(rb_Predecesor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGap(33, 33, 33)
                        .addComponent(cb_ProyectosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jd_ActividadLayout.createSequentialGroup()
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_Sucesor)
                            .addGroup(jd_ActividadLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_RetrasoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jd_ActividadLayout.setVerticalGroup(
            jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ActividadLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_ActividadLayout.createSequentialGroup()
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_NombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_RetrasoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addComponent(tf_DuracionActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ActividadLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_ProyectosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jd_ActividadLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Predecesor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_Sucesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(22, 22, 22))
        );

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        pp_CRUD.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        pp_CRUD.add(Eliminar);

        jButton8.setText("Confirmar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_SucesorLayout = new javax.swing.GroupLayout(jd_Sucesor.getContentPane());
        jd_Sucesor.getContentPane().setLayout(jd_SucesorLayout);
        jd_SucesorLayout.setHorizontalGroup(
            jd_SucesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SucesorLayout.createSequentialGroup()
                .addGroup(jd_SucesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SucesorLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cb_ActividadSucesor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_SucesorLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton8)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jd_SucesorLayout.setVerticalGroup(
            jd_SucesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SucesorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cb_ActividadSucesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(44, 44, 44))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setText("Crear Proyecto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Crear Actividad");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setText("Mostrar Arbol");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton3);

        tb_Actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Inicio Temprano", "Duracion", "Final Temprano", "Retraso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane2.setViewportView(tb_Actividades);

        jButton4.setText("Ejecutar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(box_Proyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(box_Proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //mostrar 
        jd_Arbol.setModal(true);
        jd_Arbol.pack();
        jd_Arbol.setLocationRelativeTo(this);
        jd_Arbol.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        //crear proyecto
        try {
//            DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
//            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
//            DefaultMutableTreeNode p = null;
            String nombre = tf_NombreProyecto.getText();
            int duracion = Integer.parseInt(tf_DuracionProyecto.getText());
            cb_Proyecto.addItem(new Proyecto(nombre, duracion).toString());
            cb_ProyectosRegistro.addItem(new Proyecto(nombre, duracion).toString());
            lista_proyectos.add(new Proyecto(nombre, duracion));
            box_Proyectos.addItem(new Proyecto(nombre, duracion).toString());
            JOptionPane.showMessageDialog(jd_Proyecto, "Registrado!");
            jd_Proyecto.dispose();
            tf_NombreProyecto.setText("");
            tf_DuracionProyecto.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_Proyecto, "Error");
        }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //registro proy
        jd_Proyecto.setModal(true);
        jd_Proyecto.pack();
        jd_Proyecto.setLocationRelativeTo(this);
        jd_Proyecto.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try {
            DefaultTableModel modeloTabla = (DefaultTableModel) tb_Actividades.getModel();
            String[] datos = new String[6];
            DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode n = null, p = null;
            String proyect = cb_ProyectosRegistro.getItemAt(cb_ProyectosRegistro.getSelectedIndex());
            Actividades ac = new Actividades();

            //proyecto seleccionado
            proyecto_seleccionado = cb_ProyectosRegistro.getSelectedIndex();
            System.out.println(proyecto_seleccionado + "");
            String nombre = tf_NombreActividad.getText();
            actual = nombre;
            int inicio = 0;
            int duracion = Integer.parseInt(tf_DuracionActividad.getText());
            a_duracion = duracion;
            int final_temp = 0;
            int retraso = Integer.parseInt(tf_RetrasoActividad.getText());
            String estado = "En cola";
            a_estado = estado;

            //aqui se asignan los nodos a los proyectos                        
            if (rb_Predecesor.isSelected()) {
                inicio = 1;
                final_temp = inicio + duracion;
                a_inicio = inicio;
                a_final = final_temp + duracion;
                lista_proyectos.get(proyecto_seleccionado).getLista_actividades().add(new Actividades(nombre, inicio, duracion, final_temp, retraso, estado));
                cb_ActividadSucesor.addItem(new Actividades(nombre, inicio, duracion, final_temp, retraso, estado).toString());
                //agregar Sucesores
                lista_proyectos.get(proyecto_seleccionado).getLista_actividades().get(inicio).getPredecesores().add(new Actividades(nombre, final_temp, duracion, final_temp, retraso, estado));

                datos[0] = nombre;
                datos[1] = Integer.toString(inicio);
                datos[2] = Integer.toString(duracion);
                datos[3] = Integer.toString(final_temp);
                datos[4] = Integer.toString(retraso);
                datos[5] = estado;

                modeloTabla.addRow(datos);

                JOptionPane.showMessageDialog(jd_Actividad, "Registrado!");
                tf_NombreActividad.setText("");
                tf_RetrasoActividad.setText("");
                tf_DuracionActividad.setText("");
                jd_Actividad.dispose();
            } else if (rb_Sucesor.isSelected()) {
                //int m = mayor(lista_proyectos, ,inicio);
                a_final = a_inicio + a_duracion;
                cb_ActividadSucesor.addItem(new Actividades(nombre, inicio, duracion, final_temp, retraso, estado).toString());
                jd_Actividad.dispose();
                jd_Sucesor.pack();
                jd_Sucesor.setLocationRelativeTo(this);
                jd_Sucesor.setVisible(true);
            } else {
                inicio = 1;
                final_temp = inicio + duracion;
                a_inicio = inicio;
                a_final = final_temp + duracion;
                lista_proyectos.get(proyecto_seleccionado).getLista_actividades().add(new Actividades(nombre, inicio, duracion, final_temp, retraso, estado));
                cb_ActividadSucesor.addItem(new Actividades(nombre, inicio, duracion, final_temp, retraso, estado).toString());

                //agregar sucesores
                lista_proyectos.get(proyecto_seleccionado).getLista_actividades().get(inicio).getPredecesores().add(new Actividades(nombre, final_temp, duracion, final_temp, retraso, estado));
                datos[0] = nombre;
                datos[1] = Integer.toString(inicio);
                datos[2] = Integer.toString(duracion);
                datos[3] = Integer.toString(final_temp);
                datos[4] = Integer.toString(retraso);
                datos[5] = estado;

                modeloTabla.addRow(datos);

                JOptionPane.showMessageDialog(jd_Actividad, "Registrado!");
                tf_NombreActividad.setText("");
                tf_RetrasoActividad.setText("");
                tf_DuracionActividad.setText("");
                jd_Actividad.dispose();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jd_Actividad.setModal(true);
        jd_Actividad.pack();
        jd_Actividad.setLocationRelativeTo(this);
        jd_Actividad.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void cb_ProyectoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ProyectoItemStateChanged
        //agregar proyectos
        try {
            seleccion = cb_Proyecto.getSelectedIndex();
            DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode p = null;
            DefaultMutableTreeNode omejia1;
            raiz.removeAllChildren();
            p = new DefaultMutableTreeNode(lista_proyectos.get(seleccion));
            for (int i = 0; i < lista_proyectos.size(); i++) {
                for (int j = 0; j < lista_proyectos.get(i).getLista_actividades().size(); j++) {
                    //omejia1 = null;
                    omejia1 = new DefaultMutableTreeNode(lista_proyectos.get(i).getLista_actividades().get(j));
                    p.add(omejia1);
                }

            }
            raiz.add(p);
            modelo.reload();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_cb_ProyectoItemStateChanged

    private void jt_ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ArbolMouseClicked
        if (evt.isMetaDown()) {
            int nodo = jt_Arbol.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_Arbol.setSelectionRow(nodo);
            Object v1 = jt_Arbol.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;

            System.out.println("Nodo " + nodo_seleccionado);
            if (nodo_seleccionado.getUserObject() instanceof Proyecto) {
                proyecto_sel = (Proyecto) nodo_seleccionado.getUserObject();
                pp_CRUD.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Actividades) {
                actividad_seleccionada = (Actividades) nodo_seleccionado.getUserObject();
                pp_CRUD.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }
    }//GEN-LAST:event_jt_ArbolMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        //si es sucesor
        try {
            DefaultTableModel modeloTabla = (DefaultTableModel) tb_Actividades.getModel();
            String[] datos = new String[6];
            int s = cb_ActividadSucesor.getSelectedIndex();
            int pos = cb_ProyectosRegistro.getSelectedIndex();

            if (cb_ActividadSucesor.getSelectedItem() == actual) {
                JOptionPane.showMessageDialog(jd_Sucesor, "No puede ser el mismo");
            } else {
                //sino se repite
                //String nombre, int inicio_temp, int duracion, int final_temp, int p_retraso, String estado
                lista_proyectos.get(pos).getLista_actividades().add(new Actividades(actual, a_inicio, a_duracion, a_final, a_tardio, a_estado));

                lista_proyectos.get(proyecto_seleccionado).getLista_actividades().get(s).getSucesores().add(new Actividades(actual, a_inicio, a_duracion, final_Mayor, a_tardio, a_estado));
                String act = lista_proyectos.get(proyecto_seleccionado).getLista_actividades().get(s).getSucesores().toString();
                System.out.println("Actividad Seleccionada: " + act);
                //JOptionPane.showMessageDialog(jd_Sucesor, "Agregado!");
                datos[0] = actual;
                datos[1] = Integer.toString(a_inicio);
                datos[2] = Integer.toString(a_duracion);
                datos[3] = Integer.toString(a_final);
                datos[4] = Integer.toString(a_tardio);
                datos[5] = a_estado;

                modeloTabla.addRow(datos);

                JOptionPane.showMessageDialog(jd_Actividad, "Registrado!");
                tf_NombreActividad.setText("");
                tf_RetrasoActividad.setText("");
                tf_DuracionActividad.setText("");

                jd_Sucesor.dispose();
                jd_Actividad.dispose();
                this.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //Boton ejecutar de la tabla        
        AdministrarActividades hilo = null;
        int duracion = 1;
        int posicionFila = 0;
        String estado = "En cola";
        DefaultTableModel modeloTabla = (DefaultTableModel) tb_Actividades.getModel();

        //el for normal para los hilos        
        int po = box_Proyectos.getSelectedIndex();
        if (box_Proyectos.getSelectedIndex() >= 0) {
            for (int i = 0; i < lista_proyectos.get(po).getLista_actividades().size(); i++) {
                duracion = lista_proyectos.get(po).getLista_actividades().get(i).getDuracion();
                lista_proyectos.get(po).getLista_actividades().get(i).getEstado();
                duracion *= 1000;
                hilo = new AdministrarActividades(estado, duracion, modeloTabla, i);
                hilo.start();

            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun proyecto!");
        }


    }//GEN-LAST:event_jButton4MouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        //eliminar
        DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
        DefaultTableModel modeloTabla = (DefaultTableModel) tb_Actividades.getModel();
        modelo.removeNodeFromParent(nodo_seleccionado);
        lista_proyectos.remove(nodo_seleccionado); //el nodo seleccionado ahorita es Torneo Futbol
        cb_ActividadSucesor.removeItem(nodo_seleccionado.toString());
        modeloTabla.removeRow(nodo_seleccionado.getChildCount());
        cb_Proyecto.removeItem(nodo_seleccionado.toString());
        cb_ProyectosRegistro.removeItem(nodo_seleccionado.toString());
        box_Proyectos.removeItem(nodo_seleccionado.toString());
        JOptionPane.showMessageDialog(jd_Arbol, "Eliminado!");
        modelo.reload();
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
            DefaultMutableTreeNode nodo = null;
            DefaultTableModel modeloTabla = (DefaultTableModel) tb_Actividades.getModel();
            String[] datos = new String[6];
            String nombreNuevo = "";
            int tardio = 0;
            int duracion = 0;
            int nivel = nodo_seleccionado.getLevel();
            int pos = nodo_seleccionado.getChildCount();
            System.out.println("Nodo: " + pos);
            System.out.println("Nivel: " + nivel);
            if (nodo_seleccionado.getLevel() == 1) {
                int resp = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre"
                        + "\n2. Duracion Proyecto"
                        + "\nQue desea modificar?"));
                switch (resp) {
                    case 1:
                        nombreNuevo = JOptionPane.showInputDialog("Nuevo nombre");
                        proyecto_sel.setNombre(nombreNuevo);
                        modelo.reload();
                        break;
                    case 2:
                        duracion = Integer.parseInt(JOptionPane.showInputDialog("Nueva duracion"));
                        proyecto_sel.setDuracion(duracion);
                        modelo.reload();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No valido!");
                }
            } else if (nodo_seleccionado.getLevel() > 1) {
                int resp = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre"
                        + "\n2. Tiempo tardio"
                        + "\n3. Duracion"
                        + "\nQue desea modificar?"));
                switch (resp) {
                    case 1:
                        nombreNuevo = JOptionPane.showInputDialog("Nuevo nombre");
                        actividad_seleccionada.setNombre(nombreNuevo);
                        lista_proyectos.get(cb_Proyecto.getSelectedIndex()).getLista_actividades().get(nivel).setDuracion(duracion);

                        modeloTabla.setValueAt(nombreNuevo, nivel, 0);
                        modelo.reload();
                        break;
                    case 2:
                        tardio = Integer.parseInt(JOptionPane.showInputDialog("Nueva probabilidad de demora"));
                        actividad_seleccionada.setP_retraso(tardio);
                        lista_proyectos.get(cb_Proyecto.getSelectedIndex()).getLista_actividades().get(nivel).setDuracion(duracion);

                        modeloTabla.setValueAt(tardio, nivel, 4);
                        modelo.reload();
                        break;
                    case 3:
                        duracion = Integer.parseInt(JOptionPane.showInputDialog("Nueva Duracion"));
                        actividad_seleccionada.setDuracion(duracion);
                        lista_proyectos.get(cb_Proyecto.getSelectedIndex()).getLista_actividades().get(nivel).setDuracion(duracion);

                        modeloTabla.setValueAt(duracion, nivel, 2);
                        modelo.reload();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No valido!");
                }
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

//    public static int mayor(ArrayList lista_proyectos, ArrayList Lista_actividades, int inicio) {
//        int m = 0;
//        for (int i = 0; i < lista_proyectos.size(); i++) {
//            for (int j = 0; j < lista_proyectos.get(i).getLista_actividades().size(); j++) {
//                if (lista_proyectos.get(i).getLista_actividades().get(j).getP_retraso() <= lista_proyectos.get(i).getLista_actividades().get(j + 1).getP_retraso()) {
//                    inicio = lista_proyectos.get(i).getLista_actividades().get(j + 1).getP_retraso();
//                }
//            }
//        }
//        return m;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JComboBox<String> box_Proyectos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_ActividadSucesor;
    private javax.swing.JComboBox<String> cb_Proyecto;
    private javax.swing.JComboBox<String> cb_ProyectosRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_Actividad;
    private javax.swing.JDialog jd_Arbol;
    private javax.swing.JDialog jd_Proyecto;
    private javax.swing.JDialog jd_Sucesor;
    private javax.swing.JTree jt_Arbol;
    private javax.swing.JPopupMenu pp_CRUD;
    private javax.swing.JRadioButton rb_Predecesor;
    private javax.swing.JRadioButton rb_Sucesor;
    private javax.swing.JTable tb_Actividades;
    private javax.swing.JTextField tf_DuracionActividad;
    private javax.swing.JTextField tf_DuracionProyecto;
    private javax.swing.JTextField tf_NombreActividad;
    private javax.swing.JTextField tf_NombreProyecto;
    private javax.swing.JTextField tf_RetrasoActividad;
    // End of variables declaration//GEN-END:variables
    ArrayList<Proyecto> lista_proyectos = new ArrayList<>();
    int seleccion = 0;
    int proyecto_seleccionado = 0;
    DefaultMutableTreeNode nodo_seleccionado;
    int final_Mayor = 0;
    String actual = "", a_estado = "";
    int a_inicio = 0, a_duracion = 0, a_tardio = 0, a_final = 0;
    Actividades actividad_seleccionada;
    Proyecto proyecto_sel;
}
