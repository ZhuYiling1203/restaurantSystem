import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class Byjob extends JPanel {
   JTextField input职位;
   JButton button;
   ByJobHandleData handle; 
   JLabel tishi;
   JTable table;
   Byjob() {
      setLayout(null);
      tishi= new JLabel("输入职位:");
      input职位 = new JTextField(12);
      button = new JButton("确定");    //创建对象
      add(tishi);       
      add(input职位);
      add(button);            //添加组件
      tishi.setBounds(300,120,120,30);
      input职位.setBounds(420,120,100,30);
      button.setBounds(565,120,100,30);     
      handle = new ByJobHandleData();  
      handle.setJTextField(input职位);
      button.addActionListener(handle);//添加监视器
   }
}