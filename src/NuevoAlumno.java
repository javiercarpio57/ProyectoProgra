
<<<<<<< HEAD
import AlumnoMaestro.Asistencia;
import AlumnoMaestro.BaseDatos;
import AlumnoMaestro.Curso;
import AlumnoMaestro.Persona;
=======
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
import java.sql.Connection;
import java.sql.Statement;
=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
import java.util.ArrayList;
import javax.swing.JOptionPane;
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721

/**
 *
 * @author javie
 */
public class NuevoAlumno extends javax.swing.JFrame {
<<<<<<< HEAD
   
    
    private ArrayList<Persona> personas;
    private ArrayList<Curso> curso;
    private ArrayList<Asistencia> asistencia;
    
    public NuevoAlumno() {
        initComponents();
        
        personas = new ArrayList<>();
        curso = new ArrayList<>();
        asistencia = new ArrayList<>();
=======

    /**
     * Creates new form NuevoAlumno
     */
<<<<<<< HEAD
<<<<<<< HEAD

    private ArrayList<Alumnos> Alumno;
    
    public NuevoAlumno() {
        initComponents();
        Alumno = new ArrayList<Alumnos>();
=======
    private String nombre;
    private String apellido;
    private String carnet;
    private String contra;
    private String correo;
    private int control;
    private ArrayList<String> correos;
    private ArrayList<String> contrasena;
    private ArrayList<String> nombres;
    private ArrayList<String> apellidos;
    private ArrayList<String> carnets;
    
    public NuevoAlumno() {
        initComponents();
        control = 0;
        nombres = new ArrayList<String>();
        apellidos = new ArrayList<String>();
        carnets = new ArrayList<String>();
        contrasena = new ArrayList<String>();
        correos = new ArrayList<String>();
        
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======

    private ArrayList<Alumnos> Alumno;
    public static ArrayList<Cursos> CURSO = new ArrayList<>();
    public static ArrayList<Asistencia> ASISTENCIA = new ArrayList<>();
    public static int controlNA=0;
    public NuevoAlumno() {
        initComponents();
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        spnCarnet = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

<<<<<<< HEAD
<<<<<<< HEAD
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
=======
        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        lblContacto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblContacto.setText("Correo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Nuevo Usuario");

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        txtContra.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Carnet");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Contrasena");

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setText("Nuevo alumno");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("Correo");

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        spnCarnet.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spnCarnet.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99999, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(spnCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(178, Short.MAX_VALUE))
=======
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
=======
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(lblPuesto)
                    .addComponent(lblNombres)
                    .addComponent(lblApellidos)
                    .addComponent(lblContacto))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo))
                .addGap(0, 0, Short.MAX_VALUE))
=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(spnCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(95, 95, 95))
=======
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
=======
                .addGap(124, 124, 124)
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(lblApellidos)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(95, 95, 95))
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
<<<<<<< HEAD
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Alumnos alum = new Alumnos(jTextField1.getText(), jTextField4.getText(), jTextField2.getText(), jTextField3.getText());
        InicioSesion inicio = new InicioSesion();
        
        Alumno.add(alum);
        InicioSesion.alumno = (Alumno);
        inicio.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setLista(ArrayList list){
        Alumno = list;
=======
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        InicioSesion inicio = new InicioSesion();
        
=======
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        
        int car = (int)spnCarnet.getValue();
        
        if((txtCorreo.getText().equals("")) || (txtNombre.getText().equals("")) || (txtContra.getText().equals("")) || (txtApellido.getText().equals(""))){
            JOptionPane.showMessageDialog(this, "Llene todos los campos.");
        }else{
            
            BaseDatos db = new BaseDatos();
            
            personas.add(db.agregarAlumno(txtNombre.getText(), txtApellido.getText(), car, txtContra.getText(), txtCorreo.getText()));
            
            JOptionPane.showMessageDialog(this, "Se ha guardado con exito.");
            InicioSesion inicio = new InicioSesion();
            
            inicio.setListas(personas, asistencia, curso);
            
            inicio.setVisible(true);
            this.setVisible(false);
            
<<<<<<< HEAD
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setListas(ArrayList<Persona> p, ArrayList<Asistencia> a, ArrayList<Curso> c){
        personas = p;
        curso = c;
        asistencia = a;
=======
        }
        
        
        
        
        
<<<<<<< HEAD
        if(control == 5){
            nombres.add(nombre);
            apellidos.add(apellido);
            carnets.add(carnet);
            contrasena.add(contra);
            correos.add(correo);
            inicio.getInfo(nombres, apellidos, carnets, contrasena, correos);
            inicio.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    public void getArrayLists(ArrayList nom, ArrayList ape, ArrayList car, ArrayList contra, ArrayList cor){
        nombres = nom;
        apellidos = ape;
        carnets = car;
        contrasena = contra;
        correos = cor;
    }
    
    public void limpiarcajas(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCarnet.setText("");
        txtPassword.setText("");
        txtCorreo.setText("");
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setLista(ArrayList list){
        Alumno = list;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
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
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner spnCarnet;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
