import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class DeleteView extends JPanel {
   JTextField input����;
   JTable table;
   JButton buttonlook,buttondelete;
   JLabel tishi;
   DeleteHandleData handle;   //��������
   DeleteView() {
      setLayout(null);    //���ò���
     handle = new DeleteHandleData();
      tishi = new JLabel("�����ְ��Ա������");
      input���� = new JTextField(10);
      buttonlook = new JButton("�鿴��¼");
      buttondelete = new JButton("ɾ����¼");   //�������
      add(tishi);
      add(input����);
      add(buttonlook);  
      add(buttondelete);  //������
      tishi.setBounds(340,100,120,30);
      input����.setBounds(475,100,100,30);
      buttonlook.setBounds(340,150,100,30);
      buttondelete.setBounds(475,150,100,30); 
      handle.setJTextField(input����);
       handle.setJButton(buttonlook,buttondelete);
      buttonlook.addActionListener(handle); 
      buttondelete.addActionListener(handle);    //���������������
   }
}
  