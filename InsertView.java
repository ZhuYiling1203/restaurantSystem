import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class InsertView extends JPanel {
   JTable table;
   String []head ={"���","����","�Ա�","����","ְλ","����","��ͥסַ","��ְ����","��ְ����","��ϵ�绰"};
   String [][] a ={{" "," "," "," "," "," "," "," "," "," "}};
   JButton button;
   InsertHandleData handle;    //��������
   InsertView() {
      setLayout(null);   //���ò���
      handle = new InsertHandleData();                     
      table = new JTable(a,head);
      button = new JButton("�����¼");
      JScrollPane js =new JScrollPane(table);   //�������
      add(js); 
      add(button);         //������
      js.setBounds(10,80,800,80);
      js.setForeground(Color.yellow);
      button.setBounds(832,100,120,50);
      table.setFont(new Font("����",Font.BOLD,15));
      table.setRowHeight(40);  //���ø�������Ĳ���
     handle.setArray(a);
      button.addActionListener(handle);   //ע�������
   }
}
