package me.rorykelly.lecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleJFrame extends JFrame {

	private JTextField txtInput;
	private JButton btnShow;
	private JLabel lblTextDesc;
	private JPanel pnlContent;

	public static void main(String[] args) {
		SimpleJFrame frame = new SimpleJFrame();

	}

	public SimpleJFrame() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				init();

			}

		});
	}

	private void init() {

		setTitle("Java Example");

		txtInput = new JTextField(20);
		btnShow = new JButton("Hello!");
		lblTextDesc = new JLabel("Name");
		pnlContent = new JPanel();

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btnShow.setPreferredSize(new Dimension(80, 20));
		btnShow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(SimpleJFrame.this, "Hello there, " + txtInput.getText(), "Hello Message",
						JOptionPane.INFORMATION_MESSAGE);

			}

		});

		pnlContent.add(lblTextDesc);
		pnlContent.add(txtInput);
		pnlContent.add(btnShow);
		setContentPane(pnlContent);
		setVisible(true);
		pack();
	}

}
