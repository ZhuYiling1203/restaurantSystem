import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;

public class Denglu extends JFrame implements ActionListener{
                Connection conn;
                Statement stmt;
                ResultSet rest;
                JLabel titleLabel=new JLabel("С̫����������ϵͳ");
	JLabel nameLabel=new JLabel("�û�����");
	JLabel pwdLabel=new JLabel("���룺");
	JTextField name=new JTextField(10), password=new JPasswordField(10);
	JButton butnSure=new JButton("ȷ��");
	JButton butnCancel=new JButton("ȡ��");
                JPanel p1=(JPanel)getContentPane();
                JPanel p2 =new JPanel();
                JPanel p3 =new JPanel();
                JPanel p4 =new JPanel();
                JPanel p5 =new JPanel();
	public Denglu() {
	super("��¼");
	setBounds(900, 700, 600, 400);
                setVisible(true);
                setResizable(false);
	setLayout(null);
                
                titleLabel.setFont(new Font("����",Font.BOLD,40));
                add(titleLabel);
	
                nameLabel.setFont(new Font("����",Font.BOLD,20));
                add(nameLabel);
	add(name);
	
	add(pwdLabel);
	
                pwdLabel.setFont(new Font("����",Font.BOLD,20));
	add(password);
	
	add(butnSure);
               
	add(butnCancel);
                
                ImageIcon background = new ImageIcon("images\\sun.jpeg");
                JLabel L = new JLabel(background);
                L.setBounds(0,0,600,400);
                p2.add(titleLabel);
                p3.add(nameLabel);
                p3.add(name);
                p5.add(pwdLabel);
                p5.add(password);
                p4.add(butnSure);
                p4.add(butnCancel);
                p1.setOpaque(false);
                p2.setOpaque(false);
                p3.setOpaque(false);
                p4.setOpaque(false);
                p5.setOpaque(false);
                
                p1.setLayout(null);
                p1.add(L);
                p2.setBounds(85,80,500,100);
                p3.setBounds(150,220,300,200);
                p4.setBounds(200,300,220,40);
                p5.setBounds(160,250,300,200);
                p1.add(p2);
                p1.add(p3);
                p1.add(p4);
                p1.add(p5);
                getLayeredPane().setLayout(null);
                getLayeredPane().add(L,new Integer(Integer.MIN_VALUE));
                setSize(600,400);
                setLocation(450,220);
	butnSure.addActionListener(this);
	butnCancel.addActionListener(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	validate();//ˢ��
                
	}
   
               public void actionPerformed(ActionEvent e) {
               if (e.getSource() ==butnSure){
               System.out.println("�û�����"+name.getText());
               System.out.println("���룺"+name.getText());
               if("������".equals(name.getText().trim())&&"1618120523".equals(password.getText().trim())){
               this.dispose();
               new ZWindow();
               }else {
               JOptionPane.showMessageDialog(this, "�û��������벻��!");
               }
               }else if(e.getSource()==butnCancel){
                System.exit(1);
               }
               }
               }
            