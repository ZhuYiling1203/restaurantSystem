import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class UpdateView extends JPanel {
   JTextField input���;
   JTable table;
   String []head ={"����","�Ա�","����","ְλ","����","��ͥסַ","��ְ����","��ְ����","��ϵ�绰"};
   String [][]a = {{" "," "," "," "," "," "," "," "," "}};
   JButton buttonLook,buttonUpdate;
   JScrollPane js;
   UpdateHandleData handle;    
   JLabel tishiOne,tishiTwo; //������������
   UpdateView() {
      setLayout(null);    //���ò���
      handle = new UpdateHandleData(); 
      input��� = new JTextField(10);
      table = new JTable(a,head);
      buttonLook = new JButton("����������¼");
      buttonUpdate = new JButton("���¼�¼");
      tishiOne=new JLabel("����Ҫ���µļ�¼�ı��:"); 
      tishiTwo=new JLabel("�����µ�ֵ:");   
      js=new JScrollPane(table);          //������������ͼ�����
      add(input���) ;
      add(buttonLook); 
      add(buttonUpdate);
      add(tishiOne);
      add(tishiTwo);
      add(js);                  //������
      table.setRowHeight(40);
      table.setFont(new Font("����",Font.BOLD,16));
      input���.setBounds(172,10,100,30);
      buttonLook.setBounds(275,10,150,30);
      buttonUpdate.setBounds(10,200,100,40);
      tishiOne.setBounds(10,10,160,30);
      tishiTwo.setBounds(10,60,200,50);
      js.setBounds(10,110,800,90);     //���ò���
      handle.setArray(a);
      handle.setView(this);
      handle.setJTextField(input���);
      handle.setJButton(buttonLook,buttonUpdate);
      buttonLook.addActionListener(handle);
      buttonUpdate.addActionListener(handle);    //��Ӽ�����
   }
}
  