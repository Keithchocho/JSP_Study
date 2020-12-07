package application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class DbUpdater {
	public static void main(String[]args) {
	JFrame frame = new JFrame("DataBase Dialog");
	JPanel Panel = new JPanel();
	JPanel Panel2 = new JPanel();
	JTextArea text = new JTextArea(20,20);
	JScrollPane scroller = new JScrollPane(text);
	text.setLineWrap(true);
	

	Panel.setBackground(Color.gray);
	

	JTextField textfield = new JTextField(8);
	JTextField textfield2 = new JTextField(8);
	JTextField textfield3= new JTextField(8);
	
	

	
	JLabel label = new JLabel("Name  ");
	JLabel label2 = new JLabel("Age  ");
	JLabel label3 = new JLabel("Salary  ");
	

	
	Panel2.add(label);
	Panel2.add(textfield);
	Panel2.add(label2);
	Panel2.add(textfield2);
	Panel2.add(label3);
	Panel2.add(textfield3);
	
	textfield.setText("");
	textfield.setEnabled(true);
	textfield2.setText("");
	textfield2.setEnabled(true);
	textfield3.setText("");
	textfield3.setEnabled(true);
	

	
	JButton button0 = new JButton("접속");
	JButton button1 = new JButton("추가");
	JButton button2 = new JButton("갱신");
	JButton button3 = new JButton("Select");
	
	Panel.add(button0);
	Panel.add(button1);
	Panel.add(button2);
	Panel.add(button3);
	

	//스크롤 컨트롤러
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	
	
	frame.getContentPane().add(BorderLayout.SOUTH,Panel);
	frame.getContentPane().add(BorderLayout.NORTH,Panel2);
	frame.add(scroller);

	
	
	button0.setPreferredSize(new Dimension(80, 40));
	button1.setPreferredSize(new Dimension(80, 40));
	button2.setPreferredSize(new Dimension(80, 40));
	button3.setPreferredSize(new Dimension(80, 40));


	
	frame.setSize(450,350);
	frame.setVisible(true);
	
	


	}
}