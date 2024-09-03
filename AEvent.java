import java.awt.event.*;
import javax.swing.*;
  
public class AEvent extends JFrame implements ActionListener
{  
    JTextField len;  
    JTextField pass;
    JButton b;
    AEvent()
    {  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create components  
        len=new JTextField();  
        len.setBounds(60,50,170,20);  
        b=new JButton("Generate");  
        b.setBounds(150,120,80,30); 
        pass = new JTextField();
        pass.setBounds(60, 80, 170, 20); 
        
        
        //register listener  
        b.addActionListener(this);//passing current instance  
        
        //add components and set size, layout and visibility  
        add(b);add(len);add(pass);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    
        
    }  
   
    public void actionPerformed(ActionEvent e)
    {  
        pass.setText(new PasswordCreator().generate(Integer.parseInt(len.getText())));  
    } 
     
    public static void main(String args[]) 
    {  
        new AEvent();  
    }  
}  