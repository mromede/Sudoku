import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 
 * @author Israel Omede
 * Click on the textfield and enter a value, then click on a box to assign it to it.
 *
 */

public class SudokuGUI extends JFrame implements ActionListener, MouseListener{
	//JFrame myframe = new JFrame("Sudoku");
	JTextField myField = new JTextField("Enjoy d Game");
	JTextField myField2 = new JTextField("Enter stuff");
	JPanel myPanel = new JPanel();
	JButton button1 = new JButton("Check If Valid");
	JButton button2 = new JButton("Enter");
	JButton button3 = new JButton("Clear");
	JButton button4 = new JButton("Reset");
	JButton button5 = new JButton("3");
	JButton button6 = new JButton(" ");
	JButton button7 = new JButton(" ");
	JButton button8 = new JButton("3");
	JButton button9 = new JButton(" ");
	JButton button10 = new JButton("2");
	JButton button11= new JButton(" ");
	JButton button12 = new JButton(" ");
	JButton button13 = new JButton("4");
	JButton button14 = new JButton(" ");
	JButton button15 = new JButton("2");
	JButton button16 = new JButton(" ");
	JButton button17 = new JButton(" ");
	JButton button18 = new JButton("1");
	JButton button19 = new JButton(" ");
	JButton button20 = new JButton(" "); 
	
	public SudokuGUI(String v){
		setTitle(v); 
		myField.setEditable(false);
		button5.setEnabled(false);
		button8.setEnabled(false);
		button10.setEnabled(false);
		button13.setEnabled(false);
		button15.setEnabled(false);
		button18.setEnabled(false);
		setLayout(new GridLayout(6,4,3,3));
		setLocation(450,300);
		//MyHandler fh = new MyHandler();
		button1.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button4.addMouseListener(this);
		//button5.addMouseListener(this);
		button6.addMouseListener(this);
		button7.addMouseListener(this);
		button8.addMouseListener(this);
		button9.addMouseListener(this);
		button10.addMouseListener(this);
		button11.addMouseListener(this);
		button12.addMouseListener(this);
		button13.addMouseListener(this);
		button14.addMouseListener(this);
		button15.addMouseListener(this);
		button16.addMouseListener(this);
		button17.addMouseListener(this);
		button18.addMouseListener(this);
		button19.addMouseListener(this);
		button20.addMouseListener(this);
		myField2.addMouseListener(this);
		add(myField);
		add(button1);
		add(button2);
		add(button3); 
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button10);
		add(button11);
		add(button12);
		add(button13);
		add(button14);
		add(button15);
		add(button16);
		add(button17);
		add(button18);
		add(button19);
		add(button20);
		//add(myPanel);
		add(myField2);
		add(button4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	 
	public void reset(){
		//this.JFrame.close();
		int result = JOptionPane.showConfirmDialog (null, "Would You Like to RESET this game?");
		if(result==0){
			button6.setText(" ");
			button7.setText(" ");
			button9.setText(" ");
			button11.setText(" ");
			button19.setText(" ");
			button20.setText(" ");
			button12.setText(" ");
			button7.setText(" ");
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String field = myField2.getText();
		// TODO Auto-generated method stub
		if(e.getSource()==button4){
			reset();
		}
		if(e.getSource()==button5){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button5.setText(myField2.getText());
			}
		}
		if(e.getSource()==button6){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button6.setText(myField2.getText());
			}
		}
		if(e.getSource()==button7){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button7.setText(myField2.getText());
			}
		}
		if(e.getSource()==button8){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button8.setText(myField2.getText());
			}
		}
		if(e.getSource()==button9){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button9.setText(myField2.getText());
			}
		}
		if(e.getSource()==button10){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button10.setText(myField2.getText());
			}
		}
		if(e.getSource()==button11){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button11.setText(myField2.getText());
			}
		}
		if(e.getSource()==button12){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button12.setText(myField2.getText());
			}
		}
		if(e.getSource()==button13){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button13.setText(myField2.getText());
			}
		}
		if(e.getSource()==button14){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button14.setText(myField2.getText());
			}
		}
		if(e.getSource()==button15){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button15.setText(myField2.getText());
			}
		}
		if(e.getSource()==button16){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button16.setText(myField2.getText());
			}
		}
		if(e.getSource()==button17){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button17.setText(myField2.getText());
			}
		}
		if(e.getSource()==button18){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button18.setText(myField2.getText());
			}
		}
		if(e.getSource()==button19){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button19.setText(myField2.getText());
			}
		}
		if(e.getSource()==button20){
			int a = Integer.parseInt(field);
			if((a < 1) || (a > 4)) {
				myField.setText("Invalid! Use: 1-4");
			}
			else {
				button20.setText(myField2.getText());
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent d) {
		// TODO Auto-generated method stub
		if(d.getSource()==myField2){
			myField2.setBackground(Color.yellow);
		}
		if(d.getSource()==button1){
			button1.setBackground(Color.yellow);
		}
		if(d.getSource()==button2){
			button2.setBackground(Color.yellow);
		}
		if(d.getSource()==button3){
			button3.setBackground(Color.yellow);
		}
		if(d.getSource()==button4){
			button4.setBackground(Color.yellow);
		}
		if(d.getSource()==button5){
			button5.setBackground(Color.yellow);
		}
		if(d.getSource()==button6){
			button6.setBackground(Color.yellow);
		}
		if(d.getSource()==button7){
			button7.setBackground(Color.yellow);
		}
		if(d.getSource()==button8){
			button8.setBackground(Color.yellow);
		}
		if(d.getSource()==button9){
			button9.setBackground(Color.yellow);
		}
		if(d.getSource()==button10){
			button10.setBackground(Color.yellow);
		}
		if(d.getSource()==button11){
			button11.setBackground(Color.yellow);
		}
		if(d.getSource()==button12){
			button12.setBackground(Color.yellow);
		}
		if(d.getSource()==button13){
			button13.setBackground(Color.yellow);
		}
		if(d.getSource()==button14){
			button14.setBackground(Color.yellow);
		}
		if(d.getSource()==button15){
			button15.setBackground(Color.yellow);
		}
		if(d.getSource()==button16){
			button16.setBackground(Color.yellow);
		}
		if(d.getSource()==button17){
			button17.setBackground(Color.yellow);
		}
		if(d.getSource()==button18){
			button18.setBackground(Color.yellow);
		}
		if(d.getSource()==button19){
			button19.setBackground(Color.yellow);
		}
		if(d.getSource()==button20){
			button20.setBackground(Color.yellow);
		}
	}

	@Override
	public void mouseExited(MouseEvent c) {
		// TODO Auto-generated method stub
		if(c.getSource()==myField2){
			myField2.setBackground(Color.WHITE);
		}
		if(c.getSource()==button1){
			button1.setBackground(Color.WHITE);
		}
		if(c.getSource()==button2){
			button2.setBackground(Color.WHITE);
		}
		if(c.getSource()==button3){
			button3.setBackground(Color.WHITE);
		}
		if(c.getSource()==button4){
			button4.setBackground(Color.WHITE);
		}
		if(c.getSource()==button5){
			button5.setBackground(Color.WHITE);
		}
		if(c.getSource()==button6){
			button6.setBackground(Color.WHITE);
		}
		if(c.getSource()==button7){
			button7.setBackground(Color.WHITE);
		}
		if(c.getSource()==button8){
			button8.setBackground(Color.WHITE);
		}
		if(c.getSource()==button9){
			button9.setBackground(Color.WHITE);
		}
		if(c.getSource()==button10){
			button10.setBackground(Color.WHITE);
		}
		if(c.getSource()==button11){
			button11.setBackground(Color.WHITE);
		}
		if(c.getSource()==button12){
			button12.setBackground(Color.WHITE);
		}
		if(c.getSource()==button13){
			button13.setBackground(Color.WHITE);
		}
		if(c.getSource()==button14){
			button14.setBackground(Color.WHITE);
		}
		if(c.getSource()==button15){
			button15.setBackground(Color.WHITE);
		}
		if(c.getSource()==button16){
			button16.setBackground(Color.WHITE);
		}
		if(c.getSource()==button17){
			button17.setBackground(Color.WHITE);
		}
		if(c.getSource()==button18){
			button18.setBackground(Color.WHITE);
		}
		if(c.getSource()==button19){
			button19.setBackground(Color.WHITE);
		}
		if(c.getSource()==button20){
			button20.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mousePressed(MouseEvent b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}
	
}

