import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class ByNameHandleData implements ActionListener {    
   JTextField input姓名;
   PreQuery query;         //第2天任务2  Query
   ByNameHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      input姓名 = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String na = input姓名.getText(); //得到姓名
      query.setDatabaseName("restaurant");
      query.setSQL("SELECT * FROM 小太阳餐厅 where 姓名='"+na+"'");
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