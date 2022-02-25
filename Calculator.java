import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	JFrame frame;
	JTextField val;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton beq, badd, bsub, bmult, bdiv, bcl ,bdeci;
	double num1, num2, flag, ret;

	public Calculator() 
	{
		num1 = 0;
		num2 = 0;
		initGUI();
	}

	public void initGUI ( ) 
	{
		frame = new JFrame("Calculator");
		
		JPanel bodr = new JPanel();
		bodr.setLayout(new BorderLayout());
		
		
		JPanel bgrid = new JPanel();
		bgrid.setLayout(new GridLayout(4,4));
		
		val = new JTextField(25);
		val.setPreferredSize(new Dimension(0,46));
		val.setFont(new Font(null,0,24));
		val.setHorizontalAlignment(JTextField.RIGHT);
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmult = new JButton("*");
		bdiv = new JButton("/");
		bcl = new JButton("C");
		bdeci = new JButton(".");
		
		beq = new JButton("=");
		beq.setPreferredSize(new Dimension(0,38));
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdeci.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmult.addActionListener(this);
		bdiv.addActionListener(this);
		bcl.addActionListener(this);
		beq.addActionListener(this);
		
		
		bgrid.add(b1);bgrid.add(b2);bgrid.add(b3);bgrid.add(badd);
		bgrid.add(b4);bgrid.add(b5);bgrid.add(b6);bgrid.add(bsub);
		bgrid.add(b7);bgrid.add(b8);bgrid.add(b9);bgrid.add(bmult);
		bgrid.add(bcl);bgrid.add(b0);bgrid.add(bdeci);bgrid.add(bdiv);
		
		bodr.add(val, BorderLayout.NORTH);
		bodr.add(bgrid, BorderLayout.CENTER);
		bodr.add(beq, BorderLayout.SOUTH);
		
		frame.setContentPane(bodr);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(260, 300);
		frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		String t;
		
		t = val.getText();
		if (e.getSource()==b0) {
			t = t + "0";
		} else if (e.getSource()==b1) {
			t = t + "1";
		} else if (e.getSource()==b2) {
			t = t + "2";
		} else if (e.getSource()==b3) {
			t = t + "3";
		} else if (e.getSource()==b4) {
			t = t + "4";
		} else if (e.getSource()==b5) {
			t = t + "5";
		} else if (e.getSource()==b6) {
			t = t + "6";
		} else if (e.getSource()==b7) {
			t = t + "7";
		} else if (e.getSource()==b8) {
			t = t + "8";
		} else if (e.getSource()==b9) {
			t = t + "9";
		} else if (e.getSource()==bdeci) {
			t = t + ".";
		} else if (e.getSource()==bcl) {
			num1 = 0;
			num2 = 0;
			t = "";
		} else if (e.getSource()==badd) {
			num1 = Double.parseDouble(t);
			t = "";
			flag = 0;
		} else if (e.getSource()==bsub) {
			num1 = Double.parseDouble(t);
			t = "";
			flag = 1;
		} else if (e.getSource()==bmult) {
			num1 = Double.parseDouble(t);
			t = "";
			flag = 2;
		} else if (e.getSource()==bdiv) {
			num1 = Double.parseDouble(t);
			t = "";
			flag = 3;
		} else if (e.getSource()==beq) {
			num2 = Double.parseDouble(t);
			if (flag == 0) {
				ret = num1 + num2;
			} else if (flag == 1) {
				ret = num1 - num2;
			} else if (flag == 2) {
				ret = num1 * num2;
			} else if (flag == 3) {
				ret = num1 / num2;
			}
			t = String.valueOf(ret);
		}
		
		val.setText(t);
	}

	public static void main(String args[]) 
	{
		Calculator ae = new Calculator();
	}
	
}