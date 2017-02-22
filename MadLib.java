import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.util.*;

public class MadLib {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String s1 = null; //verb
		String s2 = null; //adjective
		String s3 = null; //noun plural
		String s4 = null; //adjective
		String s5 = null; //verb ending in ing
		String s6 = null; //verb
		String s7 = null; //number
		String s8 = null; //adjective
		String s9 = null; //noun plural
		String s10 = null; //noun plural
		String s11 = null; //noun plural
		String s12 = null; //relative plural
		String s13 = null; //adjective 
		String s14 = null; //adjective
		String s15 = null; //noun plural
		
		//JLabel
		JLabel prompt = new JLabel("Walmart advert! Enter your words below: ");
		//JTextfield*15
		JTextField tf1 = new JTextField("verb");
//		JTextField tf2 = new JTextField("adjective");
//		JTextField tf3 = new JTextField("noun plural");
//		JTextField tf4 = new JTextField("adjective");
//		JTextField tf5 = new JTextField("verb ending with ing");
//		JTextField tf6 = new JTextField("verb");
//		JTextField tf7 = new JTextField("number");
//		JTextField tf8 = new JTextField("adjective");
//		JTextField tf9 = new JTextField("noun plural");
//		JTextField tf10 = new JTextField("noun plural");
//		JTextField tf11 = new JTextField("noun plural");
//		JTextField tf12 = new JTextField("relative plural");
//		JTextField tf13 = new JTextField("adjective");
//		JTextField tf14 = new JTextField("adjective");
//		JTextField tf15 = new JTextField("noun plural");
        

		Container con = getContentPane();
		
		//.setMaximumSize( new Dimension(Integer.MAX_VALUE, jtfName.getPreferredSize().height) );
		jb.addActionListener(this);
		JPanel yo = new JPanel();
		yo.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		yo.add(prompt);
		yo.add(tf1);
		
		//JFrame
		//.add(panel)
		//.setTitle
		//.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		//.setVisible(true)

		System.out.println("Come to " + s1 + " with us, where you’ll receive " + s2 + " discounts on all of your favorite brand name " + s3 + ". Our " + s4 + " and " + s5 + " associates are there to " + s6 + " you " + s7 + "hours a day. Here you will find " + s8 +" prices on the " + s9 +" you need. " + s10 + " for the moms, " + s11 + " for the kids and all the latest electronics for the " + s12 + " So come on down to your " + s13 + " " + s14 + " WALMART where the " + s15 +" come first.");

	}	
	
	

}
