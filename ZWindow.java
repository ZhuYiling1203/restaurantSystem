import java.awt.*;
import javax.swing.*;
import java.lang.*;
public class ZWindow extends JFrame{   //��дJFrame������
    JTabbedPane p;
    UpdateView  updateView;
    InsertView  insertView;
    DeleteView  deleteView;
    ByName byName;
    Bygender bygender;
    Byjob byjob;            //��������
    public ZWindow(){
        setTitle("С̫����������ϵͳ");
        setBounds(700,300,1000,360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);                      //�Դ��ڽ�������
        p=new JTabbedPane();
        updateView = new UpdateView();
        insertView = new InsertView();
        deleteView = new DeleteView();
        byName = new ByName();
        bygender = new Bygender();
        byjob = new Byjob();            //�������
        p.add("��С̫��������Ӽ�¼",insertView); 
        p.add("����id���¼�¼",updateView);
        p.add("��������ɾ����¼",deleteView); 
        p.add("��������ѯ",byName); 
        p.add("���Ա��ѯ",bygender); 
        p.add("��ְλ��ѯ",byjob);
        p.validate();               
        add(p,BorderLayout.CENTER); 
        validate();
        
    }
}