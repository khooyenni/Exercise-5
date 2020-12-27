import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 962, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(124, 65, 276, 45);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(486, 65, 276, 45);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
	
			}
		});
		btnNewButton.setBounds(189, 180, 197, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MULTIPLY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1*num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		btnNewButton_1.setBounds(189, 260, 197, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MINUS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e2){
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		btnNewButton_2.setBounds(474, 180, 197, 47);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1/num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e3){
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		btnNewButton_3.setBounds(474, 260, 197, 47);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(85, 362, 208, 42);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(312, 359, 276, 45);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
