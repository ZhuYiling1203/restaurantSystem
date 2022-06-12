import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
public class ByJobHandleData implements ActionListener {    
   JTextField input职位;
   PreQuery query;         //第2天任务2  Query
   ByJobHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      input职位 = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String zhi = input职位.getText(); //得到职位
      query.setDatabaseName("restaurant");
      query.setSQL("SELECT * FROM 小太阳餐厅 where 职位='"+zhi+"'");
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