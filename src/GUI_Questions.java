import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import clock.*;




public class GUI_Questions 
{
	JPanel left = new JPanel();
	JPanel right = new JPanel();
	JFrame jf5 = new JFrame(); 
	JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,left,right);
	JLabel welcome = new JLabel(new ImageIcon("welcomeimage.jpg"));
	JPanel welcome_panel = new JPanel();
	//------------------------------------------------------------------------------------------------
	JLabel Question_tag = new JLabel("Question");//Swing constant to set alignment of text in label;
	JPanel pane = new JPanel();
	JPanel Question = new JPanel();
	JLabel Question_stmt = new JLabel();
	//-----------------------------------------------buttons of lower right panel----------------------
	JButton prev = new JButton("Prev");
    JButton next = new JButton("Next");
    JButton submit = new JButton("Submit");
    //----------------------------------------------Radio Button----------------------------------------
    JRadioButton option1 = new JRadioButton();
    JRadioButton option2 = new JRadioButton();
    JRadioButton option3 = new JRadioButton();
    JRadioButton option4 = new JRadioButton();
    ButtonGroup options = new ButtonGroup();
    //------------------------------------------------Array_List------------------------
     String[][] QuestionList = new String[10][6];
     
    
     
	
	 public GUI_Questions(String name)
    {
	  jf5.setTitle(name);
	   left.setLayout( new BoxLayout(left,BoxLayout.Y_AXIS));
	   right.setLayout( new BorderLayout());
	   jf5.setVisible(true);
       jf5.setSize(1350,700);
       jf5.setDefaultCloseOperation(jf5.EXIT_ON_CLOSE);
       jf5.add(split);
       split.setDividerLocation(250);
       
       welcome_panel.add(welcome);
       right.add(welcome_panel,BorderLayout.NORTH);
       //---------------------------------------TAG ADDITION-----------------------------------------------------------
       Question_tag.setFont(new Font("Broadway",5,24)); // it takes frame a little delay due to this 
       pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
       pane.add(Question_tag);
       pane.add(Box.createVerticalStrut(20));
       right.add(pane,BorderLayout.CENTER);
//       ----------------------------------------------Setting Question -----------------------------------------------------
       Question_stmt.setFont(new Font("Times",20,16));
       pane.add(Question_stmt);
       Random index = new Random();
       ArrayList<Integer> index_list  = new ArrayList<Integer>();
       int j=0;
       while(j!=10)
       {
    	   
    	   
       }
       
       
       
       QuestionList[0][0] =   " What is the captail of England," ;
       QuestionList[0][1] =   " Berlin" ;
       QuestionList[0][2] =    " London" ;
       QuestionList[0][3] =    " Rome" ;
       QuestionList[0][4] =    " Mumbai" ;
      QuestionList[0][5] =    " London" ;

      QuestionList[1][0] =   " What is the captail of belgium" ;
       QuestionList[1][1] =   " Berlin" ;
       QuestionList[1][2] =   " London" ;
       QuestionList[1][3] =    " Brussels" ;
       QuestionList[1][4] =    " Delhi" ;
      QuestionList[1][5] =     " Brussels" ;

      QuestionList[2][0] =   " What is the captail of Argentina," ;
       QuestionList[2][1] =   " Surat" ;
       QuestionList[2][2] =   " London" ;
       QuestionList[2][3] =    " Bunos Aires" ;
       QuestionList[2][4] =    " Mumbai" ;
      QuestionList[2][5] =     " Bunos Aires" ;
      
      QuestionList[3][0] =   " What is the captail of india," ;
      QuestionList[4][0] =   " What is the captail of 4," ;
      QuestionList[5][0] =   " What is the captail of 5ngland," ;
      QuestionList[6][0] =   " What is the captail of 6ngland," ;
      QuestionList[7][0] =   " What is the captail of 7ngland," ;
      QuestionList[8][0] =   " What is the captail of 8ngland," ;
      QuestionList[9][0] =   " What is the captail of 9ngland," ;
      setQuestion(QuestionList[0][0],QuestionList[0][1],QuestionList[0][2],QuestionList[0][3],QuestionList[0][4]);
       //----------------------------------------------Radiobutton Group------------------------------------------------
 
       options.add(option1);
       options.add(option2);
       options.add(option3);
       options.add(option4);
       pane.add(Box.createVerticalStrut(20));
       pane.add(option1);
       pane.add(option2);
       pane.add(option3);
       pane.add(option4);
            
      
       //----------------------------------------------------leftpane-----------------------------------------------
       JLabel Q1 = new JLabel("Ques1 :");
       JLabel Q2 = new JLabel("Ques2 :");
       JLabel Q3 = new JLabel("Ques3 :");
       JLabel Q4 = new JLabel("Ques4 :");
       JLabel Q5 = new JLabel("Ques5 :");
       JLabel Q6 = new JLabel("Ques6 :");
       JLabel Q7 = new JLabel("Ques7 :");
       JLabel Q8 = new JLabel("Ques8 :");
       JLabel Q9 = new JLabel("Ques9 :");
       JLabel Q10 = new JLabel("Ques10 :");
       Q1.setForeground(Color.red);
       Q2.setForeground(Color.red);
       Q3.setForeground(Color.red);
       Q4.setForeground(Color.red);
       Q5.setForeground(Color.red);
       Q6.setForeground(Color.red);
       Q7.setForeground(Color.red);
       Q8.setForeground(Color.red);
       Q9.setForeground(Color.red);
       Q10.setForeground(Color.red);
       //--------------------------------------------------Ques numbers in left pane-----------------------------
       left.add(Box.createHorizontalStrut(20));
       left.add(Q1);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q2);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q3);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q4);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q5);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q6);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q7);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q8);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q9);
       left.add(Box.createHorizontalStrut(20));
       left.add(Box.createVerticalStrut(20));
       left.add(Q10);
       
       left.add(Box.createVerticalStrut(10));
//-------------------------------------------------buttons------------------------------------------\
      JSplitPane split1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
      pane.add(split1);       
      split.setOneTouchExpandable(true);
       
       JPanel button = new JPanel(new FlowLayout());
       
       button.add(prev);
       prev.addActionListener(new Handler());
       button.add(next);
       next.addActionListener(new Handler());
       button.add(submit);
       submit.addActionListener(new Handler());
       split1.setRightComponent(button);
       split1.setDividerLocation(500);
       Clocktype clk = new Clocktype(jf5);
      
       button.add(clk.jb);
       //clk.jb.setBorder(new EmptyBorder(10,15,20,25));
       clk.jb.setBackground(Color.black);
       jf5.validate();
    }

//------------------------------------------------setting text for Question------------------------------
	 public void setQuestion(String ques,String o1,String o2,String o3,String o4)
     {
		   Question_stmt.setText(ques);
		   option1.setText(o1);
	       option2.setText(o2);
	       option3.setText(o3);
	       option4.setText(o4);
     }
int i = 1;
class Handler implements ActionListener
    {
	   @Override
	   public void actionPerformed(ActionEvent e) 
	   { 
		  if(e.getSource()== prev)
		  {
			prev.setVisible(true);
			next.setVisible(true);
			  if(i>=0 && i<=9)  
		        {
				  setQuestion(QuestionList[i][0],QuestionList[i][1],QuestionList[i][2],QuestionList[i][3],QuestionList[i][4]); 
		          
				    i--;
		          if(i<0)
		          {
		        	  i =0;
		        	  prev.setVisible(false);
		          }
		        }
				 
			 
			 
	          	  
		  }
		  if(e.getSource() == next)
		  {
			  prev.setVisible(true);
		      next.setVisible(true);
		      if(i>=0 && i<=9)  
		        {
				  setQuestion(QuestionList[i][0],QuestionList[i][1],QuestionList[i][2],QuestionList[i][3],QuestionList[i][4]); 
		          i++;
		          if(i>9)
		          {
		        	  i = 9;
		        	  next.setVisible(false);
		          }
		        }
		      
				   
		  }
			  
			  	  
		  
		  if(e.getSource() == submit)
		  {
			  jf5.setEnabled(false);
			  jf5.setVisible(false);
		  }
		  
	   }
	}


}















