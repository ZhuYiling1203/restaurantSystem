import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.lang.*;
public class DeleteHandleData implements ActionListener { 
   JTextField input姓名;
   JButton button1,button2;     
   String [][] a;
   PreQuery query;
   String xingming;   
   int m; 
   DeleteHandleData() {
      query=new PreQuery();
   }
   public void setArray(String [][] a) {
      this.a =a;
   }
   public void setJTextField(JTextField ... text) {
      input姓名 = text[0];
   }
   public void setJButton(JButton ... b) {
       button1=b[0];
       button2 =b[1];
      
   }
   public void actionPerformed(ActionEvent e) {
         if(e.getSource()==button2){
           xingming=input姓名.getText().trim();
          doshanchu();
         }
        else if(e.getSource()==button1){
         xingming=input姓名.getText().trim();
         doLookRecord();
}
 }
   private void doshanchu(){
       Connection con;
       PreparedStatement sql;   
       try { String uri="jdbc:derby:restaurant;create=true"; 
             con=DriverManager.getConnection(uri);
             String SQL=
  "delete from 小太阳餐厅 where 姓名='"+xingming+"'";
             sql=con.prepareStatement(SQL);
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException e) { 
         JOptionPane.showMessageDialog
         (null,""+e,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
       
   }
public void doLookRecord(){
   query.setDatabaseName("restaurant");
        query.setSQL("SELECT * FROM 小太阳餐厅 where 姓名='"+xingming+"'");
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