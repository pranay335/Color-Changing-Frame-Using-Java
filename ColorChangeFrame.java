import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class ColorChangeFrame implements ActionListener
   {
    JButton B;
    JFrame f;
  JRadioButton red, green, blue;
  int c;
    public ColorChangeFrame()
     {
        red=new JRadioButton("RED");
        blue=new JRadioButton("BLUE");
        green=new JRadioButton("GREEN");
         f=new JFrame("colorchanging");
         B= new JButton("Color");  
        
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        ButtonGroup cG = new ButtonGroup();
        cG.add(red);
        cG.add(green);
        cG.add(blue);
          f.add(B);
          f.add(red);
          f.add(green);
          f.add(blue);
          red.setEnabled(false);
          green.setEnabled(false);
          blue.setEnabled(false);

          B.setSize(100,100);
          f.setLayout(new FlowLayout());
        B.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        }
        public void actionPerformed(ActionEvent a)
        {   
            if(a.getSource()==B)
           { 
            boolean isEnabled = !red.isEnabled();
            red.setEnabled(isEnabled);
            green.setEnabled(isEnabled);
            blue.setEnabled(isEnabled);
           }
            if(a.getSource()==red)
            {
            f.getContentPane().setBackground(Color.RED);
        }
          if(a.getSource()==blue)
        {
        f.getContentPane().setBackground(Color.BLUE);

    }
    if(a.getSource()==green)
    {
    f.getContentPane().setBackground(Color.GREEN);
    }
       }
      
    public static void main(String[] args) 
    {
        ColorChangeFrame c= new ColorChangeFrame();
    } 
}