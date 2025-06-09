/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chatmate;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;       
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Karan
 */
public class ServerSide{
    JFrame f = new JFrame();
    Box vertical = Box.createVerticalBox();
    String StoreFeedback;
    DataOutputStream output;
    /**
     * Creates new form Trial
     */
    public ServerSide() {
        initComponents();
        setIconImage();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 150, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(620, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Client");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel4.setText("online");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 10));
        jLabel4.setVisible(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 41, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatmate/uuuu.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 1, 91, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatmate/threeedotss.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(35, 40));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 13, 60, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(620, 45));

        jButton2.setBackground(new java.awt.Color(135, 206, 235));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(610, 540));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(610, 4000));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(f.getContentPane());
        f.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
                
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here;
        try {
            String msg = jTextField2.getText();

            JPanel panel2 = formatLabel(msg);

            jPanel3.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
            right.add(panel2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(10));

            output.writeUTF(encrypt(msg));
            jPanel3.add(vertical, BorderLayout.PAGE_START);

            jTextField2.setText("");

                JdbcCon jdbc = new JdbcCon();
            try {
                jdbc.addChat(SignUp.uname, msg);
            } catch (Exception ex) {
               System.out.println(ex);
            }

            
            
            
            jScrollPane1.repaint();
            jScrollPane1.invalidate();
            jScrollPane1.validate();
            f.repaint();
            f.invalidate();
            f.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }             
    
    

    JDialog dialog(){
        
        JDialog dial = new JDialog();
        dial.setSize(400, 190);
        dial.setLocationRelativeTo(null);
        dial.setLayout(null);
        dial.setResizable(false);
        dial.setResizable(false);
        dial.setUndecorated(false);
        dial.getContentPane().setBackground(new Color(135,206,235));
        
        JLabel feed = new JLabel("Feedback");
        feed.setFont(new Font("Georgia", Font.BOLD, 24));
        feed.setSize(120, 40);
        feed.setLocation(140, 10);
        
        JTextField textfield = new JTextField();
        textfield.setSize(300, 30);
        textfield.setFont(new Font("Arial", Font.PLAIN, 20));
        textfield.setLocation(50, 55);
        
        JButton bt1 = new JButton("Submit");
        bt1.setFont(new Font("Arial", Font.PLAIN, 18));
        bt1.setSize(90, 35);
        bt1.setLocation(155, 100);
        bt1.addActionListener(e -> StoreFeedback = textfield.getText());
        bt1.addActionListener(e -> dial.dispose());
        
        dial.add(bt1);
        dial.add(textfield);
        dial.add(feed);
        dial.setVisible(true);
        dial.setLayout(new AbsoluteLayout());
        return dial; 
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        
        JPopupMenu pm = new JPopupMenu();
        pm.setBorder(null);
        //pm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JMenuItem m1 = new JMenuItem("Feedback");
        m1.setFont(new Font("Arial", Font.PLAIN, 18));
        m1.addActionListener(e -> dialog());
       
        JMenuItem m2 = new JMenuItem("Logout");
        m2.setFont(new Font("Arial", Font.PLAIN, 18));
        
        m2.addActionListener(e -> new Portal().setVisible(true));
        m2.addActionListener(e -> f.dispose());
        
        pm.add(m1);
        pm.add(m2);
        f.add(pm);
        pm.show(f, 495, 75);
        
        
        
        
    }                                    

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             try {
            String msg = jTextField2.getText();

            JPanel panel2 = formatLabel(msg);

            jPanel3.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
             right.add(panel2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(10));

            output.writeUTF(encrypt(msg));
            jPanel3.add(vertical, BorderLayout.PAGE_START);

            jTextField2.setText("");
            
                JdbcCon jdbc = new JdbcCon();
            try {
                jdbc.addChat(SignUp.uname, msg);
            } catch (Exception ex) {
               System.out.println(ex);
            }

            
            
            jScrollPane1.repaint();
            jScrollPane1.invalidate();
            jScrollPane1.validate();
            f.repaint();
            f.invalidate();
            f.validate();
        } catch (Exception a) {
            a.printStackTrace();
        }
        
    }                                      
     
    }
    
    public String encrypt(String str) {
    StringBuilder encrypted = new StringBuilder();
    for (char c : str.toCharArray()) {
        encrypted.append((char) (c + 5));
    }
    return encrypted.toString();
}

    public String decrypt(String str) {
    StringBuilder decrypted = new StringBuilder();
    for (char c : str.toCharArray()) {
        decrypted.append((char) (c - 5));
    }
    return decrypted.toString();
}

    public static JPanel formatLabel(String msg) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel message = new JLabel("<html><p style=\"width: 200 px\">" + msg + "</p></html>");
        message.setFont(new Font("Arial", Font.PLAIN, 18));
        message.setBackground(new Color(135, 206, 235));
        message.setOpaque(true);
        message.setBorder(new EmptyBorder(15, 15, 15, 50));

        panel.add(message);

        Calendar calc = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        JLabel time = new JLabel();
        time.setText(sdf.format(calc.getTime()));
        panel.add(time);
        return panel;
    }
    private void Connection(){
         try{
            ServerSocket server = new ServerSocket(4444);
            while(true){
                Socket client = server.accept();
                jLabel4.setVisible(true);
                DataInputStream input = new DataInputStream(client.getInputStream());
                output = new DataOutputStream(client.getOutputStream());
                while(true){
                    String msg = decrypt(input.readUTF());
                    JPanel panel = formatLabel(msg);
                    
                    JdbcCon jdbc = new JdbcCon();
            try {
            jdbc.addRecieve(SignUp.uname, msg);
            } catch (Exception ex) {
               System.out.println(ex);
            }

                    
                    
                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel, BorderLayout.LINE_START);
                    vertical.add(left);
                    f.validate();
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Trial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ServerSide server = new ServerSide();
        server.Connection();
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   

    private void setIconImage() {
         f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo5.png")));
    }
}
