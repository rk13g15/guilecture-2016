package me.rorykelly.lecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutManagerDemo extends JFrame {

	protected JDialog flowDialog;
	protected JDialog boxDialog;
	protected JDialog borderDialog;
	protected JDialog gridDialog;
	protected JDialog nullDialog;
	protected JDialog actualDialog;
	private JButton btnFlow = new JButton("Flow");
	private JButton btnBox = new JButton("Box");
	private JButton btnBorder = new JButton("Border");
	private JButton btnGrid = new JButton("Grid");
	private JButton btnNull = new JButton("Null");
	private JPanel pnlContent = new JPanel();

	public LayoutManagerDemo() {
		setTitle("Select Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btnFlow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FlowDialog();

			}

		});

		btnBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new BoxDialog();
			}

		});

		btnGrid.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new GridDialog();

			}

		});

		btnBorder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new BorderDialog();

			}

		});

		btnNull.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new NullDialog();

			}

		});

		pnlContent.add(btnFlow);
		pnlContent.add(btnBox);
		pnlContent.add(btnBorder);
		pnlContent.add(btnGrid);
		pnlContent.add(btnNull);

		setContentPane(pnlContent);
		setVisible(true);
		pack();

	}

	public static void main(String[] args) {
		new LayoutManagerDemo();

	}

}

class FlowDialog extends JDialog {

	private JPanel pnlFlow;
	private JLabel lblName;
	private JLabel lblAddress;
	private JTextField txtName;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtAddress3;
	private JButton btnSubmit;
	private JButton btnCancel;

	public FlowDialog() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				init();

			}

		});
	}

	private void init() {
		setTitle("Flow Example");
		setSize(200, 300);

		pnlFlow = new JPanel();
		lblName = new JLabel("Name");
		lblAddress = new JLabel("Home Address");
		txtName = new JTextField(20);
		txtAddress1 = new JTextField(20);
		txtAddress2 = new JTextField(20);
		txtAddress3 = new JTextField(20);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");

		pnlFlow.add(lblName);
		pnlFlow.add(txtName);
		pnlFlow.add(lblAddress);
		pnlFlow.add(txtAddress1);
		pnlFlow.add(txtAddress2);
		pnlFlow.add(txtAddress3);
		pnlFlow.add(btnSubmit);
		pnlFlow.add(btnCancel);

		setContentPane(pnlFlow);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setVisible(true);
	}
}

class BoxDialog extends JDialog {

	private JPanel pnlBox;
	private JLabel lblName;
	private JLabel lblAddress;
	private JTextField txtName;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtAddress3;
	private JButton btnSubmit;
	private JButton btnCancel;

	public BoxDialog() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				init();

			}

		});
	}

	private void init() {
		setTitle("Box Example");
		setSize(200, 250);
		// setResizable(false);

		pnlBox = new JPanel();
		lblName = new JLabel("Name");
		lblAddress = new JLabel("Home Address");
		txtName = new JTextField(20);
		txtAddress1 = new JTextField(20);
		txtAddress2 = new JTextField(20);
		txtAddress3 = new JTextField(20);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");

		pnlBox.setPreferredSize(new Dimension(200, 150));
		pnlBox.setLayout(new BoxLayout(pnlBox, BoxLayout.Y_AXIS));

		pnlBox.add(lblName);
		pnlBox.add(txtName);
		pnlBox.add(Box.createVerticalStrut(20));
		pnlBox.add(lblAddress);
		pnlBox.add(txtAddress1);
		pnlBox.add(txtAddress2);
		pnlBox.add(txtAddress3);
		pnlBox.add(Box.createVerticalStrut(10));
		pnlBox.add(btnSubmit);
		pnlBox.add(Box.createVerticalStrut(5));
		pnlBox.add(btnCancel);
		pnlBox.add(Box.createVerticalStrut(5));

		setContentPane(pnlBox);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setVisible(true);
	}
}

class GridDialog extends JDialog {

	private JPanel pnlGrid;
	private JLabel lblName;
	private JLabel lblAddress;
	private JTextField txtName;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtAddress3;
	private JButton btnSubmit;
	private JButton btnCancel;

	public GridDialog() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				init();

			}

		});
	}

	private void init() {
		setTitle("Grid Example");
		setSize(200, 250);
		// setResizable(false);

		pnlGrid = new JPanel();
		lblName = new JLabel("Name");
		lblAddress = new JLabel("Home Address");
		txtName = new JTextField(20);
		txtAddress1 = new JTextField(20);
		txtAddress2 = new JTextField(20);
		txtAddress3 = new JTextField(20);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");

		pnlGrid.add(lblName);
		pnlGrid.add(txtName);
		pnlGrid.add(lblAddress);
		pnlGrid.add(txtAddress1);
		pnlGrid.add(new JPanel());
		pnlGrid.add(txtAddress2);
		pnlGrid.add(new JPanel());
		pnlGrid.add(txtAddress3);
		pnlGrid.add(btnSubmit);
		pnlGrid.add(btnCancel);

		pnlGrid.setPreferredSize(new Dimension(200, 150));
		pnlGrid.setLayout(new GridLayout(5, 2, 5, 5));

		setContentPane(pnlGrid);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setVisible(true);
	}
}

class BorderDialog extends JDialog {

	private JPanel pnlBorder;
	private JPanel pnlWest;
	private JPanel pnlEast;
	private JPanel pnlSouth;
	private JLabel lblName;
	private JLabel lblAddress;
	private JTextField txtName;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtAddress3;
	private JButton btnSubmit;
	private JButton btnCancel;

	public BorderDialog() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				init();

			}

		});
	}

	private void init() {
		setTitle("Border Example");
		setSize(350, 200);

		pnlBorder = new JPanel();
		pnlWest = new JPanel();
		pnlEast = new JPanel();
		pnlSouth = new JPanel();
		lblName = new JLabel("Name");
		lblAddress = new JLabel("Home Address");
		txtName = new JTextField(20);
		txtAddress1 = new JTextField(20);
		txtAddress2 = new JTextField(20);
		txtAddress3 = new JTextField(20);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");

		pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
		pnlEast.setLayout(new BoxLayout(pnlEast, BoxLayout.Y_AXIS));
		pnlSouth.setLayout(new BoxLayout(pnlSouth, BoxLayout.X_AXIS));
		pnlBorder.setLayout(new BorderLayout());

		pnlWest.add(lblName);
		pnlWest.add(Box.createVerticalGlue());
		pnlWest.add(lblAddress);
		pnlWest.add(Box.createVerticalGlue());
		pnlWest.add(Box.createVerticalGlue());
		pnlWest.add(Box.createVerticalGlue());
		pnlEast.add(txtName);
		pnlEast.add(txtAddress1);
		pnlEast.add(txtAddress2);
		pnlEast.add(txtAddress3);
		pnlSouth.add(btnSubmit);
		pnlSouth.add(btnCancel);

		pnlBorder.add(pnlWest, BorderLayout.LINE_START);
		pnlBorder.add(pnlEast, BorderLayout.LINE_END);
		pnlBorder.add(pnlSouth, BorderLayout.PAGE_END);

		setContentPane(pnlBorder);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setVisible(true);
	}
}

class NullDialog extends JDialog {

	private JPanel pnlNull;
	private JLabel lblName;
	private JLabel lblAddress;
	private JTextField txtName;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtAddress3;
	private JButton btnSubmit;
	private JButton btnCancel;

	public NullDialog() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				init();

			}

		});
	}

	private void init() {
		setTitle("Null Example");
		setSize(300, 250);

		pnlNull = new JPanel();
		lblName = new JLabel("Name");
		lblAddress = new JLabel("Home Address");
		txtName = new JTextField(20);
		txtAddress1 = new JTextField(20);
		txtAddress2 = new JTextField(20);
		txtAddress3 = new JTextField(20);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");

		pnlNull.setLayout(null);

		pnlNull.setBounds(0, 0, 200, 200);
		lblName.setBounds(new Rectangle(10, 10, 120, 23));
		lblAddress.setBounds(new Rectangle(10, 40, 120, 23));
		txtName.setBounds(new Rectangle(140, 10, 130, 23));
		txtAddress1.setBounds(new Rectangle(140, 40, 130, 23));
		txtAddress2.setBounds(new Rectangle(140, 70, 130, 23));
		txtAddress3.setBounds(new Rectangle(140, 100, 130, 23));
		btnSubmit.setBounds(new Rectangle(10, 140, 150, 23));
		btnCancel.setBounds(new Rectangle(120, 170, 150, 23));

		pnlNull.add(lblName);
		pnlNull.add(txtName);
		pnlNull.add(lblAddress);
		pnlNull.add(txtAddress1);
		pnlNull.add(txtAddress2);
		pnlNull.add(txtAddress3);
		pnlNull.add(btnSubmit);
		pnlNull.add(btnCancel);

		setContentPane(pnlNull);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setVisible(true);

	}
}
