
<<<<<<< HEAD
import AlumnoMaestro.Asistencia;
import AlumnoMaestro.BaseDatos;
import AlumnoMaestro.Curso;
import AlumnoMaestro.Persona;
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

<<<<<<< HEAD
=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
/**
 *
 * @author javie
 */
public class NuevaAsistencia extends javax.swing.JFrame {

<<<<<<< HEAD
    private ArrayList<Persona> personas;
    private ArrayList<Curso> curso;
    private ArrayList<Asistencia> asistencia;
    
    
=======
    /**
     * Creates new form NuevaAsistencia
     */
<<<<<<< HEAD
    private String cursos[];
    private Integer CantAsistencia[];
    private ArrayList<Cursos> Curso;
    Cursos aa;
    int ran, c = 0, f = 0, poo = 0, al = 0, e = 0;
    public NuevaAsistencia() {
        initComponents();
        Curso = new ArrayList<Cursos>();
        CantAsistencia = new Integer[5];
        cursos = new String[5];
        
        cursos[0] = "Calculo 1";
        cursos[1] = "Fisica 1";
        cursos[2] = "Programacion orientada a Objetos";
        cursos[3] = "Algebra Lineal 1";
        cursos[4] = "Estadistica 1";
        
        CantAsistencia[0] = 0;
        CantAsistencia[1] = 0;
        CantAsistencia[2] = 0;
        CantAsistencia[3] = 0;
        CantAsistencia[4] = 0;
        
=======
    private ArrayList<Cursos> Curso;
    public static ArrayList<Asistencia> asistencia;
    public static ArrayList<Alumnos> ALUMNOS;
    public static int controlN=0;
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
    private Date myDate = new Date();
    
    String nombre;
    
    public NuevaAsistencia() {
        initComponents();
        personas = new ArrayList<>();
        curso = new ArrayList<>();
        asistencia = new ArrayList<>();
<<<<<<< HEAD
=======
        ALUMNOS = new ArrayList<>();
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
=======
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmbClases = new javax.swing.JComboBox();
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Ha tomado la asistencia de: ");

<<<<<<< HEAD
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel2.setText("...");

=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jButton1.setText("Tomar asistencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        cmbClases.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        cmbClases.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programacion Orientada a Objetos", "Calculo 1", "Fisica 1" }));

>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton2)))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
=======
                        .addGap(140, 140, 140)
                        .addComponent(jButton2)))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
<<<<<<< HEAD
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
=======
                .addGap(94, 94, 94)
                .addComponent(cmbClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(6, 6, 6)
                .addComponent(jButton2)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
<<<<<<< HEAD
        ran = (int)(Math.random()*4 + 0);
        int c = 0;
        int f = 0;
        int poo = 0;
        int al = 0;
        int e = 0;
        
        switch(ran){
            case 0:
                c += 1;
                jLabel2.setText(cursos[0]);
                aa = new Cursos(cursos[0], "Ronald Curtiss", "A - 109");
                Curso.add(aa);
                CantAsistencia[0] = c;
                break;
            case 1:
                f += 1;
                jLabel2.setText(cursos[1]);
                aa = new Cursos(cursos[1], "Magda Moscoso", "A - 302");
                Curso.add(aa);
                CantAsistencia[1] = f;
                break;
            case 2:
                poo += 1;
                jLabel2.setText(cursos[2]);
                aa = new Cursos(cursos[2], "Douglas Barrios", "A - 303");
                Curso.add(aa);
                CantAsistencia[2] = poo;
                break;
            case 3:
                al += 1;
                jLabel2.setText(cursos[3]);
                aa = new Cursos(cursos[3], "Nancy Zurita", "H - 301");
                Curso.add(aa);
                CantAsistencia[3] = al;
                break;
            case 4:
                e += 1;
                jLabel2.setText(cursos[4]);
                aa = new Cursos(cursos[4], "Denise Pemueller", "A - 201");
                Curso.add(aa);
                CantAsistencia[4] = e;
                break;
                
        }
=======
        
        String clase = (String) cmbClases.getSelectedItem();
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        
        BaseDatos db = new BaseDatos();
        
        switch (clase) {
            case "Programacion Orientada a Objetos":
                curso.add(db.agregarCurso("Programacion Orientada a Objetos", "Douglas Barrios", "A - 303", nombre));
                asistencia.add(db.agregarAsistencia(nombre, "Programacion Orientada a Objetos", "Douglas Barrios", fecha));
                break;
                
            case "Calculo 1":
                curso.add(db.agregarCurso("Calculo 1", "Ronald Curtiss", "A - 109", nombre));
                asistencia.add(db.agregarAsistencia(nombre, "Calculo 1", "Ronald Curtiss", fecha));
                break;
                
            case "Fisica 1":
                curso.add(db.agregarCurso("Fisica 1", "Magda Moscoso", "A - 302", nombre));
                asistencia.add(db.agregarAsistencia(nombre, "Fisica 1", "Magda Moscoso", fecha));
                break;
        }
        
        Menu menu = new Menu();
        menu.setListas(personas, asistencia, curso);
        menu.setVisible(true);
        this.setVisible(false);
<<<<<<< HEAD
=======
        
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*String cadena = "";
        
        for(Cursos j: Curso){
            cadena += j.toString() + "\n";
        }
        
        System.out.println(cadena);
<<<<<<< HEAD
        */
=======
        
<<<<<<< HEAD
        for(int i = 0; i <CantAsistencia.length; i++){
            System.out.println(CantAsistencia[i]);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void SetLista(ArrayList c){
        Curso = c;
    }
    
=======
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void setListas(ArrayList<Persona> p, ArrayList<Asistencia> a, ArrayList<Curso> c){
        personas = p;
        curso = c;
        asistencia = a;
    }
    
    public void setNombre(String Nombre){
        nombre = Nombre;
    }
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu menu = new Menu();
<<<<<<< HEAD
        Menu.nombre = nombre;
        menu.setListas(personas, asistencia, curso);        
=======
        
        Menu.CURSO = (Curso);
<<<<<<< HEAD
=======
        Menu.ASISTENCIA = (asistencia);
        menu.controlM=controlN;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jButton2.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
    private javax.swing.JComboBox cmbClases;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel2;
=======
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    // End of variables declaration//GEN-END:variables
}
