import javax.swing.*;
import java.awt.event.*;

public class Event extends WindowAdapter implements ActionListener
{
    String message;
    JTextField tf=new JTextField();
    Event()
    {
        message = "";
    }
    public void Setup()
    {
        JFrame frame = new JFrame("Swing Event Handling");
        
        tf.setBounds(155,400, 150,20);

        JButton yes=new JButton("YES");
		yes.setBounds(80,100,100, 40);

		JButton no=new JButton("NO");
		no.setBounds(180,100,100, 40); 

		JButton maybe=new JButton("MAY BE");
		maybe.setBounds(280,100,100, 40);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);

        frame.add(yes);
		frame.add(no);
		frame.add(maybe);
        frame.add(tf);

        frame.setSize(500,500);
		frame.addWindowListener(this);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		frame.setLayout(null);
		frame.setVisible(true);
    }

    public void windowClosing(WindowEvent e)
	{  
		int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
		if(a==JOptionPane.YES_OPTION)
		{  
			System.exit(0);
		}
	} 

    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();

        if(str.equals("YES"))
        {
            message = "You clicked YES";
            tf.setText(message);
        }
        else if(str.equals("NO"))
        {
            message = "You clicked NO";
            tf.setText(message);
        }
        else
        {
            message = "You clicked UNDECIDED";
            tf.setText(message);
        }
    }

    public static void main(String[] args)
    {
        Event obj = new Event();
        obj.Setup();
    }
}