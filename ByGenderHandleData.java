import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class ByGenderHandleData implements ActionListener {        
   JTextField input�Ա�;
   PreQuery query;        
   ByGenderHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      input�Ա� = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String xing = input�Ա�.getText();      //�õ��Ա�
      query.setDatabaseName("restaurant");
      query.setSQL("SELECT * FROM С̫������ where �Ա�='"+xing+"'");
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