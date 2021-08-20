//JOSE UREÑA AGUILAR

package Graficos;


import Principal.Componentes;
import Principal.Reportes;
import java.awt.Desktop;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal_Tareas extends javax.swing.JFrame {

    DefaultTableModel T = new DefaultTableModel();
    
    public Principal_Tareas() {
        initComponents();
        
        JTableTareas.setModel(T);
        T.addColumn("Fecha Tarea");
        T.addColumn("Nombre Tarea");
        T.addColumn("Encargado Tarea");
        
        cargar();
    }
    
        public void cargar(){
        T.setRowCount(0);
        for (int i = 0; i < Componentes.tareas.size(); i++) {
            T.addRow(new Object[]{
                Componentes.tareas.get(i).getFecha_tarea(),
                Componentes.tareas.get(i).getNombre_tarea(),
                Componentes.tareas.get(i).getEncargado_tarea(),
            });     
        }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelBienvenidos = new javax.swing.JLabel();
        ButtonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableTareas = new javax.swing.JTable();
        Tareas = new javax.swing.JButton();
        ButtonReporte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Buttontareacompletada = new javax.swing.JButton();
        Buttonabrirreporte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Txtnombrereporte = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LabelBienvenidos.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        LabelBienvenidos.setForeground(new java.awt.Color(0, 0, 51));
        LabelBienvenidos.setText("Tareas Pendientes");

        ButtonAgregar.setBackground(new java.awt.Color(0, 0, 51));
        ButtonAgregar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgregar.setText("Agregar Tareas");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        JTableTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTableTareas);

        Tareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tarea.JPG"))); // NOI18N

        ButtonReporte.setBackground(new java.awt.Color(0, 0, 51));
        ButtonReporte.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ButtonReporte.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReporte.setText("Generar Reporte de Tareas");
        ButtonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReporteActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Nombre de Reporte ");

        Buttontareacompletada.setBackground(new java.awt.Color(0, 0, 51));
        Buttontareacompletada.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Buttontareacompletada.setForeground(new java.awt.Color(255, 255, 255));
        Buttontareacompletada.setText("Tarea Completada");
        Buttontareacompletada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtontareacompletadaActionPerformed(evt);
            }
        });

        Buttonabrirreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pdf.JPG"))); // NOI18N
        Buttonabrirreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonabrirreporteActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Seleccione una tarea de la tabla para marcarla como completada : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelBienvenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(ButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txtnombrereporte, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buttonabrirreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buttontareacompletada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelBienvenidos)
                        .addGap(33, 33, 33))
                    .addComponent(Tareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Buttontareacompletada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Txtnombrereporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Buttonabrirreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(441, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(79, 79, 79)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        Agregar_Tareas A = new Agregar_Tareas();
        A.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void ButtontareacompletadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtontareacompletadaActionPerformed
        DefaultTableModel T = (DefaultTableModel) JTableTareas.getModel();
        T.removeRow(JTableTareas.getSelectedRow());
        
        JOptionPane.showMessageDialog(rootPane,"Tarea Completada Satisfactoriamente!!");
    }//GEN-LAST:event_ButtontareacompletadaActionPerformed

    private void ButtonabrirreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonabrirreporteActionPerformed
        try {

            File ruta = new File(Txtnombrereporte.getText()+ ".pdf");
            Desktop.getDesktop().open(ruta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No existe el comprobrante solicitado, por favor verifique los datos seleccionados");
        }
    }//GEN-LAST:event_ButtonabrirreporteActionPerformed

    private void ButtonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReporteActionPerformed
        Reportes reporte = new Reportes(Txtnombrereporte.getText(),new Date().toString(),Reportes.lista_tareas,"src\\Imagenes\\LogoReporte.JPG");
        
        reporte.CrearReporte();
        
        JOptionPane.showMessageDialog(rootPane,"Reporte Creado Satisfactoriamente!!");
        
        
        
         
    }//GEN-LAST:event_ButtonReporteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Tareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonReporte;
    private javax.swing.JButton Buttonabrirreporte;
    private javax.swing.JButton Buttontareacompletada;
    private javax.swing.JTable JTableTareas;
    private javax.swing.JLabel LabelBienvenidos;
    private javax.swing.JButton Tareas;
    private javax.swing.JTextField Txtnombrereporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
