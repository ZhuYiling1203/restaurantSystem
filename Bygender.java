import java.awt.*;
import javax.swing.*;   //�����Ҫ�İ�
public class Bygender extends JPanel {    
   JTextField input�Ա�;
   JButton button;
   JLabel tishi;
   ByGenderHandleData handle; 
  
   JTable table;      //��������
   Bygender() {
      handle = new ByGenderHandleData(); 
      setLayout(null);  //���ò���
      tishi = new JLabel("�����Ա�:");
      input�Ա� = new JTextField(12);
      button = new JButton("ȷ��");   //�������
      add(tishi);
      add(input�Ա�);
      add(button);    //������ 
      tishi.setBounds(300,120,120,30);
      input�Ա�.setBounds(420,120,100,30);
      button.setBounds(565,120,100,30);    //��������Ĳ���
      
      handle.setJTextField(input�Ա�);
      button.addActionListener(handle);  //�����ע�������
   }
}