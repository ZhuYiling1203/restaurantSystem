import java.awt.*;
import javax.swing.*;
public class ByName extends JPanel {
   JTable table;
   JTextField input����;
   JButton button;
   JLabel tishi;
   ByNameHandleData handle;   //��������
   ByName() {
      setLayout(null);
      handle = new ByNameHandleData();
      tishi= new JLabel("��������:");
      input���� = new JTextField(12);
      button = new JButton("ȷ��");    //��������
      add(tishi);
      add(input����);
      add(button);   //������
      tishi.setBounds(300,120,120,30);   
      input����.setBounds(420,120,100,30);
      button.setBounds(565,120,100,30);    //���ø�������Ĳ���
      handle.setJTextField(input����);
      button.addActionListener(handle);    //����������
   }
}