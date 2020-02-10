import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class dennie {

	private JFrame frame;
	private JTextField num1txt;
	private JTextField num2txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dennie window = new dennie();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dennie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setBounds(198, 6, 38, 16);
		panel.add(lblMath);
		
		JLabel lblInputTwoNumber = new JLabel("Input two number");
		lblInputTwoNumber.setBounds(6, 46, 119, 16);
		panel.add(lblInputTwoNumber);
		
		JLabel lblNewLabel = new JLabel("Number 1:");
		lblNewLabel.setBounds(6, 74, 73, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 2:");
		lblNewLabel_1.setBounds(6, 102, 73, 16);
		panel.add(lblNewLabel_1);
		
		num1txt = new JTextField();
		num1txt.setBounds(85, 69, 107, 26);
		panel.add(num1txt);
		num1txt.setColumns(10);
		
		num2txt = new JTextField();
		num2txt.setBounds(85, 102, 107, 26);
		panel.add(num2txt);
		num2txt.setColumns(10);
		
		JCheckBox sumchk = new JCheckBox("Sum");
		sumchk.setBounds(208, 34, 128, 23);
		panel.add(sumchk);
		
		JCheckBox minuschk = new JCheckBox("Minus");
		minuschk.setBounds(291, 34, 128, 23);
		panel.add(minuschk);
		
		JCheckBox quochk = new JCheckBox("Quotient");
		quochk.setBounds(198, 70, 107, 23);
		panel.add(quochk);
		
		JCheckBox remchk = new JCheckBox("Remainder");
		remchk.setBounds(301, 70, 128, 23);
		panel.add(remchk);
		
		JCheckBox prochk = new JCheckBox("Product");
		prochk.setBounds(230, 120, 128, 23);
		panel.add(prochk);
		
		JButton calbtn = new JButton("Do it");
		calbtn.setBounds(6, 148, 117, 29);
		panel.add(calbtn);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(6, 192, 423, 68);
		panel.add(ta);
		
		calbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String num1;
				String num2;
				int number1;
				int number2;
				num1 = num1txt.getText();
				num2 = num2txt.getText();
				
				number1 = Integer.parseInt(num1);
				number2 = Integer.parseInt(num2);
				
				
				if(sumchk.isSelected()) {
					ta.append("sum for "+num1+" "+num2+ " is " + sum(number1,number2));
					ta.append(newLine);
				}else if(minuschk.isSelected()) {
					ta.append("Difference for "+num1+" "+ num2 + " is "+ dif(number1,number2));
					ta.append(newLine);
				}else if(quochk.isSelected()) {
					ta.append("Quotient for " + num1+ " "+num2+ " is "+quo(number1,number2));
					ta.append(newLine);
				}else if(remchk.isSelected()) {
					ta.append("Remainder for " + num1 + " "+num2+" is "+rem(number1,number2));
					ta.append(newLine);
				}else if(prochk.isSelected()) {
					ta.append("Product for "+num1+" "+num2+ " is "+pro(number1,number2));
					ta.append(newLine);
				}
				
				
				
				
				
			}
			
		});
		
		
		
		
		
	}
	
	private final static String newLine = "\n";
	
	public static int sum(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public static int dif(int num1, int num2) {
		int dif;
		dif = num1 - num2;
		return dif;
		
	}
	public static int quo(int num1, int num2) {
		int quo;
		quo = num1 / num2;
		return quo;
	}
	public static int rem(int num1, int num2) {
		int rem;
		rem = num1%num2;
		return rem;
	}
	public static int pro(int num1, int num2) {
		int pro;
		pro = num1*num2;
		return pro;
	}
	
	

	
	
	
	
	
}
