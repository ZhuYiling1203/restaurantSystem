import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.lang.*;
public class InsertHandleData implements ActionListener {    
   String [][] a;
   PreQuery query;
   int m;        
   InsertHandleData() {
      query=new PreQuery();
   }
   public void setArray(String [][] a) {
      this.a =a;
   }
   public void actionPerformed(ActionEvent e) {
       Connection con;
       PreparedStatement sql;   
       try { String uri="jdbc:derby:restaurant;create=true"; 
             con=DriverManager.getConnection(uri);
             String SQL=
            "INSERT INTO 小太阳餐厅 VALUES(?,?,?,?,?,?,?,?,?,?)";
             sql=con.prepareStatement(SQL);
             sql.setString(1,a[0][0].trim()); 
             sql.setString(2,a[0][1].trim());
             sql.setString(3,a[0][2].trim()); 
             sql.setInt(4,Integer.parseInt(a[0][3].trim()));
             sql.setString(5,a[0][4].trim()); 
             sql.setInt(6,Integer.parseInt(a[0][5].trim()));
             sql.setString(7,a[0][6].trim()); 
             sql.setString(8,a[0][7].trim());
             sql.setString(9,a[0][8].trim());
             sql.setString(10,a[0][9].trim());
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException exp) { 
         JOptionPane.showMessageDialog
         (null,""+exp,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
      if(m!=0){
        query.setDatabaseName("restaurant");
        query.setSQL("SELECT * FROM 小太阳餐厅 where 编号='"+a[0][0].trim()+"'");
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setVisible(true);
      }
      else {
        JOptionPane.showMessageDialog
        (null,"插入记录失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
}
