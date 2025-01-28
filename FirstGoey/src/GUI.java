import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {
	
	int count = 0;
	JLabel label;
	JFrame frame;
	JPanel panel;
	
	public GUI() {
		frame = new JFrame();
		
		JButton button = new JButton("Click here");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		panel  = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("OurGUI");
		frame.pack(); 
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		count ++;
		label.setText("Number of clicks " + count);
	}

}
