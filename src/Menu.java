<<<<<<< HEAD
<<<<<<< HEAD

import AlumnoMaestro.Asistencia;
import AlumnoMaestro.Curso;
import AlumnoMaestro.Persona;
import java.util.ArrayList;

<<<<<<< HEAD
=======
=======
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======

import java.util.ArrayList;

>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
/**
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author javie
 */
=======
 * @author jose
 */
import java.util.ArrayList;

>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
 * @author javie
 */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
public class Menu extends javax.swing.JFrame {

<<<<<<< HEAD
    private ArrayList<Persona> personas;
    private ArrayList<Curso> curso;
    private ArrayList<Asistencia> asistencia;
    
    public static String nombre;
    
    public Menu() {
        initComponents();
        personas = new ArrayList<>();
        curso = new ArrayList<>();
        asistencia = new ArrayList<>();
=======
    /**
     * Creates new form Menu
     */
<<<<<<< HEAD
<<<<<<< HEAD
    public static String NOMBRE;
    public static ArrayList<Cursos> CURSO;
    public Menu() {
        initComponents();
        CURSO = new ArrayList<Cursos>();
=======
    Fuente fuente = new Fuente();
    public String nombre;
    public String apellido;
    public String carnet;
    public String correo;
    public static ArrayList<String> x= new ArrayList<String>();
=======
    public static String NOMBRE;
    public static ArrayList<Cursos> CURSO;
    public static ArrayList<Asistencia> ASISTENCIA;
    public static ArrayList<Alumnos> ALUMNOS;
    public static int controlM=0;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    
    public Menu() {
        initComponents();
<<<<<<< HEAD
        
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
        CURSO = new ArrayList<>();
        ASISTENCIA = new ArrayList<>();
        ALUMNOS = new ArrayList<>();
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("...");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jButton1.setText("Agregar asistencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jButton2.setText("Ver registros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

=======
        btnTomarAsistencia = new javax.swing.JButton();
        btnVerRegistro = new javax.swing.JButton();
        btnMandarExcusa = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblCarnet = new javax.swing.JLabel();
=======
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("...");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jButton1.setText("Agregar asistencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jButton2.setText("Ver registros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jButton3.setText("Cerrar sesion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        lblUsuario.setText("Nombre de Usuario");

        lblCarnet.setText("Carnet");

>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(141, 141, 141))
=======
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarnet)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTomarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMandarExcusa, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(141, 141, 141))
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
<<<<<<< HEAD
                .addComponent(jLabel1)
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addGap(147, 147, 147)
                .addComponent(jButton2)
                .addContainerGap(200, Short.MAX_VALUE))
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblCarnet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnTomarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMandarExcusa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
                .addComponent(jLabel1)
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jButton3)
                .addContainerGap(162, Short.MAX_VALUE))
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
<<<<<<< HEAD
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel1.setText(NOMBRE);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NuevaAsistencia asis = new NuevaAsistencia();
        asis.SetLista(CURSO);
        asis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VerRegistro reg = new VerRegistro();
        reg.nombre=NOMBRE;
        reg.Curso=CURSO;
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
=======
    private void btnTomarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarAsistenciaActionPerformed
        // TODO add your handling code here:
        nombre = lblUsuario.getText();
        carnet = lblCarnet.getText();
        Toma_Asistencia asis= new Toma_Asistencia();
        asis.setVisible(true);
        this.setVisible(false);
        Toma_Asistencia.registro=x;
    }//GEN-LAST:event_btnTomarAsistenciaActionPerformed

    private void btnVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroActionPerformed
        nombre = lblUsuario.getText();
        carnet = lblCarnet.getText();
        Ver_Registro registro=new Ver_Registro();
        registro.setVisible(true);
        this.setVisible(false);
        registro.j=x;
=======
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
<<<<<<< HEAD
        jLabel1.setText(nombre);
        /*System.out.println(nombre);
=======
        jLabel1.setText(NOMBRE);
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
        String cadena = "";
        for(Curso j: curso){
            cadena += j.toString() + "\n";
        }
        System.out.println(cadena);
        
        String cadena1 = "";
        for(Asistencia a: asistencia){
            cadena1 += a.toString() + "\n";
        }
        System.out.println(cadena1);
        
        String cadena2 = "";
        for(Persona b: personas){
            cadena2 += b.toString() + "\n";
        }
        System.out.println(cadena2);*/
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NuevaAsistencia asis = new NuevaAsistencia();
        asis.setListas(personas, asistencia, curso);
        asis.setVisible(true);
        asis.setNombre(nombre);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VerRegistro reg = new VerRegistro();
        VerRegistro.nombre = nombre;
        reg.setListas(personas, asistencia, curso);
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(true);
        this.setVisible(false);
        
        
<<<<<<< HEAD
    }//GEN-LAST:event_btnMandarExcusaActionPerformed
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
    }//GEN-LAST:event_jButton3ActionPerformed
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80

    
    public void setListas(ArrayList<Persona> p, ArrayList<Asistencia> a, ArrayList<Curso> c){
        personas = p;
        curso = c;
        asistencia = a;
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
=======
    private javax.swing.JButton btnMandarExcusa;
    private javax.swing.JButton btnTomarAsistencia;
    private javax.swing.JButton btnVerRegistro;
    public static javax.swing.JLabel lblCarnet;
    public static javax.swing.JLabel lblUsuario;
>>>>>>> 8bbfc43181bc3e18c8646f0239aa56a61d3db721
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    // End of variables declaration//GEN-END:variables
}
