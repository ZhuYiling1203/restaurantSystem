import java.awt.*;
import javax.swing.*;
public class ByName extends JPanel {
   JTable table;
   JTextField input姓名;
   JButton button;
   JLabel tishi;
   ByNameHandleData handle;   //声明对象
   ByName() {
      setLayout(null);
      handle = new ByNameHandleData();
      tishi= new JLabel("输入姓名:");
      input姓名 = new JTextField(12);
      button = new JButton("确定");    //创建对象
      add(tishi);
      add(input姓名);
      add(button);   //添加组件
      tishi.setBounds(300,120,120,30);   
      input姓名.setBounds(420,120,100,30);
      button.setBounds(565,120,100,30);    //设置各个组件的布局
      handle.setJTextField(input姓名);
      button.addActionListener(handle);    //创建监视器
   }
}