import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
public class ByJobHandleData implements ActionListener {    
   JTextField inputְλ;
   PreQuery query;         //��2������2  Query
   ByJobHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      inputְλ = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String zhi = inputְλ.getText(); //�õ�ְλ
      query.setDatabaseName("restaurant");
      query.setSQL("SELECT * FROM С̫������ where ְλ='"+zhi+"'");
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