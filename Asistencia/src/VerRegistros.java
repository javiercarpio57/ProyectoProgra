
import Persistencia.Asistencia;
import Persistencia.Curso;
import Persistencia.Maestro;
import Persistencia.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author javie
 */
public class VerRegistros extends javax.swing.JFrame {

    private ArrayList<Persona> persona;
    private ArrayList<Asistencia> asistencia;
    private ArrayList<Curso> curso;
    public static String nombre;
    public VerRegistros() {
        initComponents();
        
        persona = new ArrayList<>();
        asistencia = new ArrayList<>();
        curso = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        cmbBuscar = new javax.swing.JComboBox();
        btnRegresar1 = new javax.swing.JButton();
        btnRegresar2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblNombre.setText("Estudiante");

        tabla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cmbBuscar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cmbBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programacion", "Calculo 1", "Fisica 1" }));

        btnRegresar1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnRegresar1.setText("Buscar");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        btnRegresar2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnRegresar2.setText("Todo");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblNombre)
                        .addGap(86, 86, 86)
                        .addComponent(btnRegresar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblNombre)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar1)
                            .addComponent(btnRegresar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(2, 2, 2)
                .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnRegresar)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmbBuscar.removeAllItems();
        for(Persona p: persona){
            if(p instanceof Maestro){
                cmbBuscar.addItem(p.getCurso());
            }
        }
        
        lblNombre.setText(nombre);
        DefaultTableModel model = (DefaultTableModel)tabla.getModel();
        model.setColumnCount(5);
        
        JTableHeader head = tabla.getTableHeader();
        TableColumnModel tcm = head.getColumnModel();
        
        TableColumn t1 = tcm.getColumn(0);
        t1.setHeaderValue("NOMBRE");
        
        TableColumn t2 = tcm.getColumn(1);
        t2.setHeaderValue("CURSO");
        
        TableColumn t3 = tcm.getColumn(2);
        t3.setHeaderValue("MAESTRO");
        
        TableColumn t4 = tcm.getColumn(3);
        t4.setHeaderValue("SALON");
        
        TableColumn t5 = tcm.getColumn(4);
        t5.setHeaderValue("FECHA");
        
        tabla.repaint();
        tabla.setRowHeight(30);
        
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    public void llenarTabla(){
        DefaultTableModel model = (DefaultTableModel)tabla.getModel();
        model.setNumRows(0);
        for(Curso c: curso){
            if(c.getAlumno().equals(nombre)){
                model.addRow(new Object[]{c.getAlumno(), c.getNombre(), c.getMaestro(), c.getSalon(), c.getFecha()});
            }
        }
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        menu.setLista(persona, asistencia, curso);
        Menu.nombre = nombre;
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        String tipo = (String)cmbBuscar.getSelectedItem();
        
        DefaultTableModel model = (DefaultTableModel)tabla.getModel();
        model.setNumRows(0);
        
        for(Curso c: curso){
            if(c.getAlumno().equals(nombre)){
                if(c.getNombre().equals(tipo)){
                    model.addRow(new Object[]{c.getAlumno(), c.getNombre(), c.getMaestro(),  c.getSalon(), c.getFecha()});
                }
            }
        }
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        llenarTabla();
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    public void setLista(ArrayList<Persona> p, ArrayList<Asistencia> a, ArrayList<Curso> c){
        persona = p;
        asistencia = a;
        curso = c;
    }
    
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
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JComboBox cmbBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}