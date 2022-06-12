import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class InsertView extends JPanel {
   JTable table;
   String []head ={"编号","姓名","性别","年龄","职位","工资","家庭住址","入职日期","离职日期","联系电话"};
   String [][] a ={{" "," "," "," "," "," "," "," "," "," "}};
   JButton button;
   InsertHandleData handle;    //声明变量
   InsertView() {
      setLayout(null);   //设置布局
      handle = new InsertHandleData();                     
      table = new JTable(a,head);
      button = new JButton("插入记录");
      JScrollPane js =new JScrollPane(table);   //创监对象
      add(js); 
      add(button);         //添加组件
      js.setBounds(10,80,800,80);
      js.setForeground(Color.yellow);
      button.setBounds(832,100,120,50);
      table.setFont(new Font("宋体",Font.BOLD,15));
      table.setRowHeight(40);  //设置各个组件的布局
     handle.setArray(a);
      button.addActionListener(handle);   //注册监视器
   }
}
