import java.awt.Dimension;

import javax.swing.*;
public class GUIComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		
		JLabel jlblName = new JLabel("Enter your name: ");
		
		JTextField jtfName = new JTextField("Type name here");
//		jtfName.setMaximumSize(jtfName.getPreferredSize());
		jtfName.setMaximumSize( new Dimension(Integer.MAX_VALUE, jtfName.getPreferredSize().height) );
		JCheckBox jchkBold= new JCheckBox("Bold");

		JCheckBox jchkItalic= new JCheckBox("Italic");
		
		JRadioButton jrbRed = new JRadioButton("Red");
		
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		
		JComboBox jcbColor= new JComboBox(new String[] {"Freshman", "Sophomore", "Junior", "Senior"});
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		panel.add(jbtOK);
		panel.add(jbtCancel);
		panel.add(jlblName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcbColor);
		
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("Show GUI components");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
