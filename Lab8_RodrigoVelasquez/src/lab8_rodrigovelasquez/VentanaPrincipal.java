package lab8_rodrigovelasquez;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Arbol = new javax.swing.JDialog();
        cb_Proyecto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Arbol = new javax.swing.JTree();
        jButton7 = new javax.swing.JButton();
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
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Actividades = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

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

        jButton7.setText("Mostrar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ArbolLayout = new javax.swing.GroupLayout(jd_Arbol.getContentPane());
        jd_Arbol.getContentPane().setLayout(jd_ArbolLayout);
        jd_ArbolLayout.setHorizontalGroup(
            jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArbolLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jd_ArbolLayout.setVerticalGroup(
            jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArbolLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_ArbolLayout.createSequentialGroup()
                        .addComponent(cb_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
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
        pp_CRUD.add(Modificar);

        Eliminar.setText("Eliminar");
        pp_CRUD.add(Eliminar);

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
                "Nombre", "Duracion", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_Actividades);

        jButton4.setText("Ejecutar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton4)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
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
            //p = new DefaultMutableTreeNode(new Proyecto(nombre, duracion));
            cb_Proyecto.addItem(new Proyecto(nombre, duracion).toString());
            lista_proyectos.add(new Proyecto(nombre, duracion));
            JOptionPane.showMessageDialog(jd_Proyecto, "Registrado!");
            jd_Proyecto.dispose();
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
            DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode n = null;
            String proyect = cb_ProyectosRegistro.getItemAt(cb_ProyectosRegistro.getSelectedIndex());

            System.out.println(proyect + "");
            String nombre = tf_NombreActividad.getText();
            int inicio = 0;
            int duracion = Integer.parseInt(tf_DuracionActividad.getText());
            int final_temp = 0;
            int retraso = Integer.parseInt(tf_RetrasoActividad.getText());
            String estado = "En cola";
            if (rb_Predecesor.isSelected()) {

                n = new DefaultMutableTreeNode(new Actividades(nombre, final_temp, duracion, final_temp, retraso, estado));
                raiz.add(n);
                modelo.reload();
            } else if (rb_Sucesor.isSelected()) {
                raiz.add(n);
                modelo.reload();
            }
            //modelo.reload();
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
        seleccion = cb_Proyecto.getSelectedIndex();
    }//GEN-LAST:event_cb_ProyectoItemStateChanged

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        //Mostrar al arbol
        try {
            DefaultTreeModel modelo = (DefaultTreeModel) jt_Arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode p = null;
            p = new DefaultMutableTreeNode(lista_proyectos.get(seleccion));
            raiz.add(p);
            modelo.reload();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jt_ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ArbolMouseClicked
        if (evt.isMetaDown()) {
            pp_CRUD.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_ArbolMouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_Proyecto;
    private javax.swing.JComboBox<String> cb_ProyectosRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_Actividad;
    private javax.swing.JDialog jd_Arbol;
    private javax.swing.JDialog jd_Proyecto;
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
}
