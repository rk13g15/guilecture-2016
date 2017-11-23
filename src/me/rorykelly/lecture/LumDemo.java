package me.rorykelly.lecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LumDemo extends JFrame {

	private JPanel contentPanel;
	private JLabel redLabel;
	private JLabel greenLabel;
	private JLabel blueLabel;
	private JLabel lumLabel;
	private JTextField redField;
	private JTextField blueField;
	private JTextField greenField;
	private JTextField lumField;
	private JButton calculateButton;

	public static void main(String[] args) {
		new LumDemo();

	}

	public LumDemo() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				setTitle("Luminance Calculator");
				setSize(200, 120);
				setResizable(false);
				setDefaultCloseOperation(EXIT_ON_CLOSE);

				contentPanel = new JPanel(new GridLayout(5, 2));
				redLabel = new JLabel("Red");
				greenLabel = new JLabel("Green");
				blueLabel = new JLabel("Blue");
				lumLabel = new JLabel("Luminance");
				redField = new JTextField(3);
				blueField = new JTextField(3);
				greenField = new JTextField(3);
				lumField = new JTextField();
				calculateButton = new JButton("Calculate Lum");

				lumField.setEnabled(false);

				calculateButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						int r = redField.getText().matches("^[0-9ABCDEF][0-9ABCDEF]$")
								? Integer.parseInt(redField.getText(), 16) : Integer.parseInt(redField.getText(), 10);
						int g = greenField.getText().matches("^[0-9ABCDEF][0-9ABCDEF]$")
								? Integer.parseInt(greenField.getText(), 16)
								: Integer.parseInt(greenField.getText(), 10);
						int b = blueField.getText().matches("^[0-9ABCDEF][0-9ABCDEF]$")
								? Integer.parseInt(blueField.getText(), 16) : Integer.parseInt(blueField.getText(), 10);
						float lum = (0.2126f * r) + (0.7152f * g) + (0.0722f * b);
						lumField.setText(String.valueOf(lum));
					}

				});

				contentPanel.add(redLabel);
				contentPanel.add(redField);
				contentPanel.add(greenLabel);
				contentPanel.add(greenField);
				contentPanel.add(blueLabel);
				contentPanel.add(blueField);
				contentPanel.add(lumLabel);
				contentPanel.add(lumField);
				contentPanel.add(new JPanel());
				contentPanel.add(calculateButton);

				setContentPane(contentPanel);
				setVisible(true);

			}

		});
	}
}
