import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;


public class GUI_Questions 
{
   JFrame jf5 = new JFrame("Questions");
   JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
   JScrollPane pane1 = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
   JSplitPane split = new JSplitPane();
   JLabel q1 = new JLabel("Q1).");
   
   
   public GUI_Questions()
    {
       jf5.setVisible(true);
       jf5.setSize(1350,700);
       jf5.setDefaultCloseOperation(jf5.EXIT_ON_CLOSE);
       split.setSize(20, 20);
       
       jf5.add(split);
       
       split.setLeftComponent(pane);
       split.setDividerLocation(300);
       
       
    }
}
