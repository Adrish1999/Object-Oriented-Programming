//Java Program to implement an event handling program using swing for three buttons.
//When a user clicks on any button a message will be displayed.

import javax.swing.*;
import java.awt.event.*;

public class Button_Event extends WindowAdapter implements ActionListener
{  
	public static void main(String[] args)
	{
		JFrame f=new JFrame("Swing Event Handling");//creating instance of JFrame  
        JTextField tf=new JTextField();//creating instance of JTextField

		tf.setBounds(145,400, 180,30);//x axis, y axis, width, height

		JButton yes=new JButton("YES");//creating instance of JButton  
		yes.setBounds(80,100,100, 40);//x axis, y axis, width, height  

		JButton no=new JButton("NO");//creating instance of JButton  
		no.setBounds(180,100,100, 40);//x axis, y axis, width, height  

		JButton maybe=new JButton("MAY BE");//creating instance of JButton  
		maybe.setBounds(280,100,100, 40);//x axis, y axis, width, height  
        
		yes.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("You clicked YES");
			}
		});

		no.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("You clicked NO");
			}
		});

		maybe.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("You clicked UNDECIDED");
			}
		});

		f.add(yes);//adding button in JFrame
		f.add(no);//adding button in JFrame
		f.add(maybe);//adding button in JFrame  
        f.add(tf);//adding textfield in JFrame

		f.setSize(500,500);//500 width and 500 height
		f.addWindowListener(new WindowAdapter()
		{	
			@Override
			public void windowClosing(WindowEvent e)
			{  
				int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
				if(a==JOptionPane.YES_OPTION)
				{  
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				}
			}  

		});    
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		f.setLayout(null);//using no layout managers
		f.setVisible(true);//making the frame visible
	}

	public void actionPerformed(ActionEvent e)
	{
        return;
    }
}  