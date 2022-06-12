import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class DeleteView extends JPanel {
   JTextField input姓名;
   JTable table;
   JButton buttonlook,buttondelete;
   JLabel tishi;
   DeleteHandleData handle;   //声明对象
   DeleteView() {
      setLayout(null);    //设置布局
     handle = new DeleteHandleData();
      tishi = new JLabel("输入辞职人员的姓名");
      input姓名 = new JTextField(10);
      buttonlook = new JButton("查看记录");
      buttondelete = new JButton("删除记录");   //创建组件
      add(tishi);
      add(input姓名);
      add(buttonlook);  
      add(buttondelete);  //添加组件
      tishi.setBounds(340,100,120,30);
      input姓名.setBounds(475,100,100,30);
      buttonlook.setBounds(340,150,100,30);
      buttondelete.setBounds(475,150,100,30); 
      handle.setJTextField(input姓名);
       handle.setJButton(buttonlook,buttondelete);
      buttonlook.addActionListener(handle); 
      buttondelete.addActionListener(handle);    //给组件创建监视器
   }
}
  