
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;
 
public class GUI
{
     public static void main(String[] args)
    {

	class TestActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		    //System.out.println(e);	
		    System.out.println("Schaltfläche wurde gedrückt");
		}           
	}

        JTextField MyInput = new JTextField("Input here");
 	System.out.println(MyInput);

	JButton MyButton = new JButton("Abschicken");

        MyButton.addActionListener(new TestActionListener()); 
          

        JFrame meinFrame = new JFrame("Mein JFrame Beispiel"); 

        meinFrame.setLayout( new java.awt.FlowLayout() ); 
           
        meinFrame.add(new JLabel("Beispiel JLabel"));
	meinFrame.add(MyInput);
        meinFrame.add(MyButton);

        meinFrame.pack();

        meinFrame.setSize(600,600);
        meinFrame.setVisible(true);

    }
}