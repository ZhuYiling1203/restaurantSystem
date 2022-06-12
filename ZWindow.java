import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class ZWindow extends JFrame{   //编写JFrame的子类
    JTabbedPane p;
    UpdateView  updateView;
    InsertView  insertView;
    DeleteView  deleteView;
    ByName byName;
    Bygender bygender;
    Byjob byjob;            //声明变量
    public ZWindow(){
        setTitle("小太阳餐厅管理系统");
        setBounds(700,300,1000,360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);                      //对窗口进行设置
        p=new JTabbedPane();
        updateView = new UpdateView();
        insertView = new InsertView();
        deleteView = new DeleteView();
        byName = new ByName();
        bygender = new Bygender();
        byjob = new Byjob();            //创建组件
        p.add("向小太阳餐厅添加记录",insertView); 
        p.add("根据id更新记录",updateView);
        p.add("根据姓名删除记录",deleteView); 
        p.add("按姓名查询",byName); 
        p.add("按性别查询",bygender); 
        p.add("按职位查询",byjob);
        p.validate();               
        add(p,BorderLayout.CENTER); 
        validate();
        
    }
}