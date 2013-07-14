package drawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class DrawProg extends javax.swing.JFrame {

    public DrawProg() {
        initComponents();
        flag=false;
        image=new BufferedImage(jPanel1.getWidth(),jPanel1.getHeight(),BufferedImage.TYPE_INT_RGB);
        newDraw();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        shape = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        radius = new javax.swing.JSpinner();
        colorSelect = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();
        fileBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        aboutbar = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drawer ver 1.0");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        shape.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Circle", "Circle filled", "Square", "Square filled" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Size");

        radius.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(10), Integer.valueOf(1), null, Integer.valueOf(1)));

        colorSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Colors");

        stat.setBackground(new java.awt.Color(255, 0, 0));
        stat.setForeground(new java.awt.Color(255, 0, 0));
        stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat.setText("Not Drawing");
        stat.setToolTipText("");

        jMenu1.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New Drawing");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jMenu1.add(New);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save Drawing");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        fileBar.add(jMenu1);

        aboutbar.setText("About");

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        aboutbar.add(About);

        fileBar.add(aboutbar);

        setJMenuBar(fileBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shape, 0, 147, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(colorSelect, javax.swing.GroupLayout.Alignment.TRAILING, 0, 96, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radius, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(radius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        if(evt.getButton()==1){
            flag=!flag;
            if("Not Drawing".equals(stat.getText())){
                stat.setText("Drawing");
                stat.setForeground(Color.GREEN);
            }else{
                stat.setText("Not Drawing");
                stat.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if(flag){
           int x=evt.getX();
           int y=evt.getY();
           Graphics g=jPanel1.getGraphics(); 
           Graphics g2=image.getGraphics();
           Color color;
            try {
                Field field = Class.forName("java.awt.Color").getField((String)colorSelect.getSelectedItem());
                color = (Color)field.get(null);
            } catch (ClassNotFoundException | NoSuchFieldException 
                    | SecurityException | IllegalArgumentException | IllegalAccessException e) {
                color = null; 
            }
           g.setColor(color);
           g2.setColor(color);
           int ind=shape.getSelectedIndex();
           if(ind==0){
               g.drawOval(x, y, (int)radius.getValue(), (int)radius.getValue());
               g2.drawOval(x, y, (int)radius.getValue(), (int)radius.getValue());
           }
           else if(ind==1){
               g.fillOval(x, y, (int)radius.getValue(), (int)radius.getValue());
               g2.fillOval(x, y, (int)radius.getValue(), (int)radius.getValue());
           }
           else if(ind==2){
               g.drawRect(x, y, (int)radius.getValue(), (int)radius.getValue());
               g2.drawRect(x, y, (int)radius.getValue(), (int)radius.getValue());
           }
           else if(ind==3){
               g.fillRect(x, y, (int)radius.getValue(), (int)radius.getValue());
               g2.fillRect(x, y, (int)radius.getValue(), (int)radius.getValue());
           }
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        newDraw();
    }//GEN-LAST:event_NewActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        JOptionPane.showMessageDialog(null,"This progam is developed \nby Patick Ragi.","About", 1);
    }//GEN-LAST:event_AboutActionPerformed

private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       JFileChooser file=new JFileChooser();
       file.showSaveDialog(null);
       String path=file.getSelectedFile().getPath();
       if(path!=null){
           File f = new File(path+".jpg");
           BufferedImage img=null;
            try {
                img=image;
            } catch (Exception e) {
                
            }
            try {
                ImageIO.write(img,"jpeg",f);
            } catch (IOException ex) {
                
            }
       }
}//GEN-LAST:event_SaveActionPerformed

public void paint(Graphics g){
    super.paint(g);
    drawScreen();
}
private void newDraw(){
        Graphics g=jPanel1.getGraphics();
        Graphics g2=image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(5, 5, jPanel1.getWidth()-6, jPanel1.getHeight()-6);
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
}

private void drawScreen(){
        Graphics g=jPanel1.getGraphics();
        g.drawImage(image, 5, 5, jPanel1.getWidth()-6, jPanel1.getHeight()-6, null);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenu aboutbar;
    private javax.swing.JComboBox colorSelect;
    private javax.swing.JMenuBar fileBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner radius;
    private javax.swing.JComboBox shape;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables
    boolean flag;
    BufferedImage image;
}
