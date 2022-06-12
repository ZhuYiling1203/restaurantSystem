import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.lang.*;
import java.util.Calendar;

public class UpdateHandleData implements ActionListener { 
   UpdateView view;
   JTextField input编号;
   JButton buttonLook,buttonUpdate;    
   String [][] a;
   PreQuery query;
   String id;
   int m;        
   UpdateHandleData() {
      query=new PreQuery();
   }
   public void setView(UpdateView view){
      this.view  = view;
   }
   public void setArray(String [][] a) {
      this.a =a;
   }
   public void setJTextField(JTextField ... text) {
      input编号 = text[0];
   }
   public void setJButton(JButton ... b) {
      buttonLook= b[0];
      buttonUpdate =b[1];
   }
   public void actionPerformed(ActionEvent e) {
       if(e.getSource()==buttonUpdate) {
          id=input编号.getText().trim();
          doGengxin();
       }
       else if(e.getSource()==buttonLook) {
          id=input编号.getText().trim();
          doLookRecord();
       }
   }
   public void doGengxin(){
       Connection con;
       PreparedStatement sql;   
       try { String uri="jdbc:derby:restaurant;create=true"; 
             con=DriverManager.getConnection(uri);
             String SQL="update 小太阳餐厅 set 姓名=?,性别=?,年龄=?,职位=?,工资=?,家庭住址=?,入职日期=?,离职日期=?,联系电话=? where 编号 ='"+id+"'";
               String [] riqi_ruzhi= a[0][6].trim().split("[-]+");
               String [] riqi_lizhi= a[0][7].trim().split("[-]+");
               int y_r =0,m_r=0,d_r=0;
               int y_left,m_left,d_left;
               y_r = Integer.parseInt(riqi_ruzhi[0]); 
               m_r = Integer.parseInt(riqi_ruzhi[1])-1;
               d_r = Integer.parseInt(riqi_ruzhi[2]);
               y_left = Integer.parseInt(riqi_lizhi[0]);
               m_left = Integer.parseInt(riqi_lizhi[1])-1;
               d_left = Integer.parseInt(riqi_lizhi[2]);
               Calendar calendar=Calendar.getInstance();   
               calendar.set(y_r,m_r,d_r);  
               long time1 = calendar.getTimeInMillis();
               Date date_ruzhi = new Date(time1);
               calendar.set(y_left,m_left,d_left);  
               long time2 = calendar.getTimeInMillis();
               Date date_lizhi = new Date(time2);
             sql=con.prepareStatement(SQL);
             sql.setString(1,a[0][0].trim()); 
             sql.setString(2,a[0][1].trim()); 
             sql.setInt(3,Integer.parseInt(a[0][2].trim()));
             sql.setString(4,a[0][3].trim()); 
             sql.setInt(5,Integer.parseInt(a[0][4].trim()));
             sql.setString(6,a[0][5].trim()); 
             sql.setDate(7,date_ruzhi);  //
             sql.setDate(8,date_lizhi);  //
             sql.setString(9,a[0][8].trim()); 
             //*****************
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException e) { 
         JOptionPane.showMessageDialog
         (null,""+e,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
       if(m!=0){
        query.setDatabaseName("restaurant");
        query.setSQL("SELECT * FROM 小太阳餐厅 where 编号='"+id+"'");
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
        (null,"更新记录失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
   public void doLookRecord() {
        query.setDatabaseName("restaurant");
        query.setSQL("SELECT * FROM 小太阳餐厅 where 编号='"+id+"'");
            
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setVisible(true); 
      
        a[0][0] = record[0][1];
        a[0][1] = record[0][2];
       
        a[0][2] = record[0][3];
        a[0][3] = record[0][4];
        a[0][4] = record[0][5];
        a[0][5] = record[0][6];
        a[0][6] = record[0][7];
        a[0][7] = record[0][8];  
        a[0][8] = record[0][9]; 
        view.table.repaint();

   }
}
