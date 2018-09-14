package lab8_rodrigovelasquez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        jTree1 = new javax.swing.JTree();
        jd_Proyecto = new javax.swing.JDialog();
        tf_NombreProyecto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_DuracionProyecto = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jd_Actividad = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Actividades = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Rodri Corps");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jd_ArbolLayout = new javax.swing.GroupLayout(jd_Arbol.getContentPane());
        jd_Arbol.getContentPane().setLayout(jd_ArbolLayout);
        jd_ArbolLayout.setHorizontalGroup(
            jd_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArbolLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jd_ActividadLayout = new javax.swing.GroupLayout(jd_Actividad.getContentPane());
        jd_Actividad.getContentPane().setLayout(jd_ActividadLayout);
        jd_ActividadLayout.setHorizontalGroup(
            jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ActividadLayout.setVerticalGroup(
            jd_ActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setText("Crear Proyecto");
        jToolBar1.add(jButton1);

        jButton2.setText("Crear Actividad");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        String nombre = tf_NombreProyecto.getText();
        int duracion = Integer.parseInt(tf_DuracionProyecto.getText());
        lista_proyectos.add(new Proyecto(nombre, duracion));
        JOptionPane.showMessageDialog(jd_Proyecto, "Registrado!");
    }//GEN-LAST:event_jButton5MouseClicked

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
    private javax.swing.JComboBox<String> cb_Proyecto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree1;
    private javax.swing.JDialog jd_Actividad;
    private javax.swing.JDialog jd_Arbol;
    private javax.swing.JDialog jd_Proyecto;
    private javax.swing.JTable tb_Actividades;
    private javax.swing.JTextField tf_DuracionProyecto;
    private javax.swing.JTextField tf_NombreProyecto;
    // End of variables declaration//GEN-END:variables
    ArrayList<Proyecto> lista_proyectos = new ArrayList<>();
}
