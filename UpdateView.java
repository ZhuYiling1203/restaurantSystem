import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class UpdateView extends JPanel {
   JTextField input编号;
   JTable table;
   String []head ={"姓名","性别","年龄","职位","工资","家庭住址","入职日期","离职日期","联系电话"};
   String [][]a = {{" "," "," "," "," "," "," "," "," "}};
   JButton buttonLook,buttonUpdate;
   JScrollPane js;
   UpdateHandleData handle;    
   JLabel tishiOne,tishiTwo; //声明各个变量
   UpdateView() {
      setLayout(null);    //设置布局
      handle = new UpdateHandleData(); 
      input编号 = new JTextField(10);
      table = new JTable(a,head);
      buttonLook = new JButton("看看这条记录");
      buttonUpdate = new JButton("更新记录");
      tishiOne=new JLabel("输入要更新的记录的编号:"); 
      tishiTwo=new JLabel("输入新的值:");   
      js=new JScrollPane(table);          //创建对象即组件和监视器
      add(input编号) ;
      add(buttonLook); 
      add(buttonUpdate);
      add(tishiOne);
      add(tishiTwo);
      add(js);                  //添加组件
      table.setRowHeight(40);
      table.setFont(new Font("宋体",Font.BOLD,16));
      input编号.setBounds(172,10,100,30);
      buttonLook.setBounds(275,10,150,30);
      buttonUpdate.setBounds(10,200,100,40);
      tishiOne.setBounds(10,10,160,30);
      tishiTwo.setBounds(10,60,200,50);
      js.setBounds(10,110,800,90);     //设置布局
      handle.setArray(a);
      handle.setView(this);
      handle.setJTextField(input编号);
      handle.setJButton(buttonLook,buttonUpdate);
      buttonLook.addActionListener(handle);
      buttonUpdate.addActionListener(handle);    //添加监视器
   }
}
  