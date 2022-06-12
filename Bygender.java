import java.awt.*;
import javax.swing.*;   //引入必要的包
public class Bygender extends JPanel {    
   JTextField input性别;
   JButton button;
   JLabel tishi;
   ByGenderHandleData handle; 
  
   JTable table;      //声明对象
   Bygender() {
      handle = new ByGenderHandleData(); 
      setLayout(null);  //设置布局
      tishi = new JLabel("输入性别:");
      input性别 = new JTextField(12);
      button = new JButton("确定");   //创建组件
      add(tishi);
      add(input性别);
      add(button);    //添加组件 
      tishi.setBounds(300,120,120,30);
      input性别.setBounds(420,120,100,30);
      button.setBounds(565,120,100,30);    //各个组件的布局
      
      handle.setJTextField(input性别);
      button.addActionListener(handle);  //给组件注册监视器
   }
}