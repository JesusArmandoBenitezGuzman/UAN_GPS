package vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(Principal.class.getClassLoader().getResource("img/escudo2.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondo.jpg"));
        Image image = icon.getImage();
        VentanaPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnCarga = new javax.swing.JMenu();
        Carreras = new javax.swing.JMenuItem();
        Maestros = new javax.swing.JMenuItem();
        Materias = new javax.swing.JMenuItem();
        Alumnos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Calificaciones = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        btnKardex = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad Autonoma De Nayarit");

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setText("Ayuda");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        btnCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configurar.png"))); // NOI18N
        btnCarga.setText("Mantenimiento");

        Carreras.setText("Carreras");
        Carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarrerasActionPerformed(evt);
            }
        });
        btnCarga.add(Carreras);

        Maestros.setText("Maestros");
        Maestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaestrosActionPerformed(evt);
            }
        });
        btnCarga.add(Maestros);

        Materias.setText("Materias");
        Materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasActionPerformed(evt);
            }
        });
        btnCarga.add(Materias);

        Alumnos.setText("Alumnos");
        Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosActionPerformed(evt);
            }
        });
        btnCarga.add(Alumnos);

        jMenuItem3.setText("Carga de materias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btnCarga.add(jMenuItem3);

        Calificaciones.setText("Calificaciones");
        Calificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalificacionesActionPerformed(evt);
            }
        });
        btnCarga.add(Calificaciones);

        jMenuBar1.add(btnCarga);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jMenu3.setText("Reportes");

        jMenuItem7.setText("Maestro");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Materias");
        jMenu3.add(jMenuItem8);

        btnKardex.setText("Kardex");
        btnKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKardexActionPerformed(evt);
            }
        });
        jMenu3.add(btnKardex);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaestrosActionPerformed
        MaestroForm mf=new MaestroForm();
        CentrarVentana(mf);
    }//GEN-LAST:event_MaestrosActionPerformed

    private void CalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalificacionesActionPerformed
        CalificacionForm cf=new CalificacionForm();
        CentrarVentana(cf);
    }//GEN-LAST:event_CalificacionesActionPerformed

    private void MateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasActionPerformed
        MateriaForm maf=new MateriaForm();
        CentrarVentana(maf);
    }//GEN-LAST:event_MateriasActionPerformed

    private void AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosActionPerformed
        AlumnoForm af=new AlumnoForm();
        CentrarVentana(af);
    }//GEN-LAST:event_AlumnosActionPerformed

    private void CarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarrerasActionPerformed
        CarreraForm cf=new CarreraForm();
        CentrarVentana(cf);
    }//GEN-LAST:event_CarrerasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        HorarioForm hf=new HorarioForm();
        CentrarVentana(hf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKardexActionPerformed
        KardexForm kf=new KardexForm();
        CentrarVentana(kf);
    }//GEN-LAST:event_btnKardexActionPerformed
    
    void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension=VentanaPrincipal.getSize();
        Dimension Dframe=frame.getSize();
        frame.setLocation((dimension.width - Dframe.width)/2,(dimension.height - Dframe.height)/2);
        frame.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Alumnos;
    private javax.swing.JMenuItem Calificaciones;
    private javax.swing.JMenuItem Carreras;
    private javax.swing.JMenuItem Maestros;
    private javax.swing.JMenuItem Materias;
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu btnCarga;
    private javax.swing.JMenuItem btnKardex;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
