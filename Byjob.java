import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class Byjob extends JPanel {
   JTextField inputְλ;
   JButton button;
   ByJobHandleData handle; 
   JLabel tishi;
   JTable table;
   Byjob() {
      setLayout(null);
      tishi= new JLabel("����ְλ:");
      inputְλ = new JTextField(12);
      button = new JButton("ȷ��");    //��������
      add(tishi);       
      add(inputְλ);
      add(button);            //������
      tishi.setBounds(300,120,120,30);
      inputְλ.setBounds(420,120,100,30);
      button.setBounds(565,120,100,30);     
      handle = new ByJobHandleData();  
      handle.setJTextField(inputְλ);
      button.addActionListener(handle);//��Ӽ�����
   }
}