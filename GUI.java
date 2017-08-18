
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.*;

import java.util.Random;

 
public class GUI
{
     private final static String newline = "\n";
     private static String text = "Some Random Text here";

     public static void main(String[] args)
     {

	text = "another Text";
       
 
        JTextField MyInput = new JTextField(15);
	JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea); 
        
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);

	System.out.println(randomInt);
        
	

        class TestActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		    //System.out.println(e);	
                    System.out.println(MyInput.getText());
		    System.out.println("Schaltfläche wurde gedrückt");
		}           
	}

       
 	
	textArea.append(text + newline);
	
        JButton MyButton = new JButton("Abschicken");
            

        MyButton.addActionListener(new TestActionListener()); 
          

        JFrame meinFrame = new JFrame("Mein JFrame Beispiel"); 

        meinFrame.setLayout( new java.awt.FlowLayout() ); 
           
        meinFrame.add(new JLabel("Beispiel JLabel"));
	meinFrame.add(MyInput);
        meinFrame.add(MyButton);
	meinFrame.add(textArea);

        meinFrame.pack();

        meinFrame.setSize(600,600);
        meinFrame.setVisible(true);

    }
}