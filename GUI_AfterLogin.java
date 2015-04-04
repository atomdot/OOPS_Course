import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTree;


public class GUI_AfterLogin 
{
	JFrame jf2 = new JFrame("Examination System");
	ImageIcon Entrn_pic = new ImageIcon("Entertainment.png");
	    JButton Entrn = new JButton(Entrn_pic);
	ImageIcon Tech_pic = new ImageIcon("Tech.jpg");
	    JButton Tech = new JButton(Tech_pic);
	ImageIcon Sprt_pic = new ImageIcon("Sports.jpg");
	    JButton Sprt = new JButton(Sprt_pic);
	ImageIcon gk_pic = new ImageIcon("gk.png");
	    JButton gk = new JButton(gk_pic);
	
	//JPanel options = new JPanel();
	
	GUI_AfterLogin()
	{
		 jf2.setSize(738,700);
    	 jf2.setVisible(true);
    	 jf2.setDefaultCloseOperation(jf2.EXIT_ON_CLOSE);
    	 //BoxLayout boxLayout = new BoxLayout(options, BoxLayout.Y_AXIS);
    	 jf2.setLayout(new GridLayout(2,2));
    	 jf2.setLocation(300,10);
    	// options.setLayout(boxLayout);
    	 jf2.add(Entrn);
    	 jf2.add(Tech);
    	 jf2.add(Sprt);
    	 jf2.add(gk);
    	 jf2.validate();
    	 gk.addActionListener(new Handler());
    	 Entrn.addActionListener(new Handler());
    	 Tech.addActionListener(new Handler());
    	 Sprt.addActionListener(new Handler());
	    
	}
	
	class Handler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
		    	if(e.getSource()==Entrn)
		    	{
		    		GUI_Questions page5 = new GUI_Questions();
		    	}
		    	else if(e.getSource()==Sprt)
		    	{
		    		GUI_Questions page5 = new GUI_Questions();
		    	}
		    	else if(e.getSource()==Tech)
		    	{
		    		GUI_Questions page5 = new GUI_Questions();
		    	}
		    	else if(e.getSource()==gk)
		    	{
		    		GUI_Questions page5 = new GUI_Questions();
		    	}
			
		}
	}
}