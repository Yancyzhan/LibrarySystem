

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;

public class SystemAdmin {

	private JFrame frmSystemAdmin;
	/**
	 * @wbp.nonvisual location=6,9
	 */
	private final JList list = new JList();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SystemAdmin window = new SystemAdmin();
//					window.frmSystemAdmin.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public SystemAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSystemAdmin = new JFrame();
		frmSystemAdmin.setTitle("System Admin");
		frmSystemAdmin.getContentPane().setBackground(Color.DARK_GRAY);
		frmSystemAdmin.setBounds(100, 100, 450, 300);
		frmSystemAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSystemAdmin.getContentPane().setLayout(null);
		frmSystemAdmin.setVisible(true);
		
		JList list_1 = new JList();
		list_1.setBackground(Color.GRAY);
		list_1.setBounds(0, 0, 233, 262);
		frmSystemAdmin.getContentPane().add(list_1);
		
		JButton addStaff = new JButton("Add Staff");
		addStaff.setBounds(291, 45, 89, 23);
		frmSystemAdmin.getContentPane().add(addStaff);
		
		JButton removeStaff = new JButton("Remove Staff");
		removeStaff.setBounds(291, 89, 99, 23);
		frmSystemAdmin.getContentPane().add(removeStaff);
		
		JButton update = new JButton("Update");
		update.setBounds(291, 137, 89, 23);
		frmSystemAdmin.getContentPane().add(update);
	}
}
