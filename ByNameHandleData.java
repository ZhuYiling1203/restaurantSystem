import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class ByNameHandleData implements ActionListener {    
   JTextField input����;
   PreQuery query;         //��2������2  Query
   ByNameHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      input���� = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String na = input����.getText(); //�õ�����
      query.setDatabaseName("restaurant");
      query.setSQL("SELECT * FROM С̫������ where ����='"+na+"'");
      query.startQuery();
      String ziduan[] =query.getColumnName();
      String [][]record =query.getRecord();
      DialogOne dialog = new DialogOne(); 
      dialog.setZiduan(ziduan);
      dialog.setRecord(record);
      dialog.init(); 
      dialog.setVisible(true);
   }
}