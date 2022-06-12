import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class ByGenderHandleData implements ActionListener {        
   JTextField input性别;
   PreQuery query;        
   ByGenderHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      input性别 = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String xing = input性别.getText();      //得到性别
      query.setDatabaseName("restaurant");
      query.setSQL("SELECT * FROM 小太阳餐厅 where 性别='"+xing+"'");
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