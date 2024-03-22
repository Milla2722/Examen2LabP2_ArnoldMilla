package examen2labp2_arnoldmilla;
//F2 silla 3

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Examen extends javax.swing.JFrame {

    
    public Examen() {
        initComponents();
        cargarArchivo();
        play("src\\Audios\\Minecraft_Villager__Y2meta_app_Romeo_Santos___Propuesta_Indecente_Letra_144p__1__vocals.wav",1000);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearCarro = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bt_crearCarro_creaCarro = new javax.swing.JButton();
        velocidad = new javax.swing.JSpinner();
        tf_modelo_crearCarro = new javax.swing.JTextField();
        tf_marca_crearCarro = new javax.swing.JTextField();
        jd_carrera = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pb_carro1 = new javax.swing.JProgressBar();
        pb_carro2 = new javax.swing.JProgressBar();
        bt_iniciar_carrera = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_crearCarro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_carro2 = new javax.swing.JComboBox<>();
        cb_carro1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bt_carrera_main = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Creacion de carros");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel7.setText("Marca");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel8.setText("Modelo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel9.setText("Velocidad");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        bt_crearCarro_creaCarro.setText("Crear");
        bt_crearCarro_creaCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearCarro_creaCarroMouseClicked(evt);
            }
        });
        jPanel2.add(bt_crearCarro_creaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        velocidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));
        jPanel2.add(tf_modelo_crearCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 260, -1));
        jPanel2.add(tf_marca_crearCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 260, -1));

        javax.swing.GroupLayout jd_crearCarroLayout = new javax.swing.GroupLayout(jd_crearCarro.getContentPane());
        jd_crearCarro.getContentPane().setLayout(jd_crearCarroLayout);
        jd_crearCarroLayout.setHorizontalGroup(
            jd_crearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jd_crearCarroLayout.setVerticalGroup(
            jd_crearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_carrera.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Progreso");

        pb_carro1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pb_carro1StateChanged(evt);
            }
        });

        bt_iniciar_carrera.setText("Iniciar");
        bt_iniciar_carrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciar_carreraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pb_carro1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(pb_carro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(bt_iniciar_carrera)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel16)
                .addGap(50, 50, 50)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pb_carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pb_carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(bt_iniciar_carrera)
                .addGap(48, 48, 48))
        );

        jd_carrera.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 112, 88, -1));

        bt_crearCarro.setText("Crear Carro");
        bt_crearCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearCarroMouseClicked(evt);
            }
        });
        jPanel1.add(bt_crearCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel2.setText("Partida");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 39, 101, 30));

        cb_carro2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_carro2ItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_carro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 117, 90, -1));

        cb_carro1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_carro1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_carro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 117, 89, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 200, 48, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Modelo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 292, 52, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Velocidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 375, 72, -1));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 90, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 20));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 90, 20));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 90, 20));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 90, 20));

        bt_carrera_main.setText("Iniciar");
        bt_carrera_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_carrera_mainMouseClicked(evt);
            }
        });
        jPanel1.add(bt_carrera_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_crearCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearCarroMouseClicked
        this.setVisible(false);
        jd_crearCarro.pack();
        jd_crearCarro.setLocationRelativeTo(this);
        jd_crearCarro.setVisible(true);
    }//GEN-LAST:event_bt_crearCarroMouseClicked

    private void bt_crearCarro_creaCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearCarro_creaCarroMouseClicked
        if((Integer)velocidad.getValue() < 1000 && !(tf_marca_crearCarro.getText().equals("")) && !(tf_modelo_crearCarro.getText().equals(""))){
        carros.add(new Carro((Integer)velocidad.getValue(),tf_modelo_crearCarro.getText(),tf_marca_crearCarro.getText()));
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_carro1.getModel();
        cb_carro1.removeAllItems();
        modelo.addAll(carros);
        cb_carro1.setModel(modelo);
        
        DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) cb_carro2.getModel();
        cb_carro2.removeAllItems();
        modelo1.addAll(carros);
        cb_carro2.setModel(modelo1);
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
            try {
               archivo = new File("./carritos.dat");
               fos = new FileOutputStream(archivo);
               oos = new ObjectOutputStream(fos);
               oos.writeObject(carros);
               oos.flush();
               oos.close();
               fos.close();
               jd_crearCarro.setVisible(false);
               this.pack();
               this.setLocationRelativeTo(this);
               this.setVisible(true);
            } catch (Exception e) {
            }  
        }
        else{
            JOptionPane.showMessageDialog(jd_crearCarro, "La velocidad es demasiada");
            velocidad.setValue(0);
            tf_modelo_crearCarro.setText("");
            tf_marca_crearCarro.setText("");
        }     
    }//GEN-LAST:event_bt_crearCarro_creaCarroMouseClicked

    public void play(String root, int loop) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(root));
            clip.open(audio);
            clip.start();
            clip.loop(loop);
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores
        }
    }
    
    private void cb_carro1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_carro1ItemStateChanged
        if(cb_carro1.getSelectedItem() != null){
            Carro car = (Carro)cb_carro1.getSelectedItem();
            car1 = car;
            jLabel10.setText(car.getMarca());
            jLabel12.setText(car.getModelo());
            jLabel14.setText(Integer.toString(car.getVelocidad()));
            jLabel17.setText(car.getMarca() + "" + car.getModelo());
        }      
    }//GEN-LAST:event_cb_carro1ItemStateChanged

    private void cb_carro2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_carro2ItemStateChanged
        if(cb_carro1.getSelectedItem() != null){
            Carro car = (Carro)cb_carro2.getSelectedItem();
            car2 = car;
            jLabel11.setText(car.getMarca());
            jLabel13.setText(car.getModelo());
            jLabel15.setText(Integer.toString(car.getVelocidad()));
            jLabel18.setText(car.getMarca() + "" + car.getModelo());
        }
    }//GEN-LAST:event_cb_carro2ItemStateChanged

    private void bt_carrera_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrera_mainMouseClicked
        if(car1 != null && car2 != null){
            this.setVisible(false);
            jd_carrera.pack();
            jd_carrera.setLocationRelativeTo(this);
            jd_carrera.setVisible(true);
            ProgressesBar p1 = new ProgressesBar(car1.getVelocidad(), pb_carro1);
            ProgressesBar p2 = new ProgressesBar(car2.getVelocidad(), pb_carro2);
            threads.add(p1);
            threads.add(p2);
            p1.start();
            p2.start();           
        }  
        else{
            JOptionPane.showMessageDialog(null, "Necesita seleccionar un vehiculo");
        }
    }//GEN-LAST:event_bt_carrera_mainMouseClicked

    private void pb_carro1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pb_carro1StateChanged
        if(pb_carro1.getValue() > pb_carro2.getValue() && pb_carro1.getValue() >= 1000){
            JOptionPane.showMessageDialog(null, "El carro" + car1.getModelo());          
        }
        else if(pb_carro2.getValue() > pb_carro1.getValue() && pb_carro2.getValue() >= 1000){
            JOptionPane.showMessageDialog(null, "El carro" + car2.getModelo());
        }
    }//GEN-LAST:event_pb_carro1StateChanged

    private void bt_iniciar_carreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciar_carreraMouseClicked
        for (int cont = 0; cont < threads.size(); cont++) {
                threads.get(cont).stop();
        }    
        pb_carro1.setValue(0);
        pb_carro2.setValue(0);
        jd_carrera.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_bt_iniciar_carreraMouseClicked

    public void cargarArchivo() {   
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = null;
                ois = new ObjectInputStream(fis);
                carros = (ArrayList)ois.readObject();
            ois.close();
            fis.close();
            
            
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_carro1.getModel();
            modelo.addAll(carros);
            cb_carro1.setModel(modelo);
            
            
            DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) cb_carro2.getModel();
            modelo1.addAll(carros);
            cb_carro2.setModel(modelo1);
        } catch (Exception e) {

        }
    }
    
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
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen().setVisible(true);
            }
        });
    }

    ArrayList<Thread> threads = new ArrayList();
    Carro car1 = new Carro();
    Carro car2 = new Carro();
    File archivo = new File("./carritos.dat");
    ArrayList<Carro> carros = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_carrera_main;
    private javax.swing.JButton bt_crearCarro;
    private javax.swing.JButton bt_crearCarro_creaCarro;
    private javax.swing.JButton bt_iniciar_carrera;
    private javax.swing.JComboBox<String> cb_carro1;
    private javax.swing.JComboBox<String> cb_carro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDialog jd_carrera;
    private javax.swing.JDialog jd_crearCarro;
    private javax.swing.JProgressBar pb_carro1;
    private javax.swing.JProgressBar pb_carro2;
    private javax.swing.JTextField tf_marca_crearCarro;
    private javax.swing.JTextField tf_modelo_crearCarro;
    private javax.swing.JSpinner velocidad;
    // End of variables declaration//GEN-END:variables
}
