import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AddJournal {

	private JFrame frmAddJournal;
	private Vector<Document> docs;
	private JTextField jName;
	private JTextField aName;
	private JTextField jId;
	private JTextField publisher;
	private JTextField date;
	
	private JTextField sdate;
	private JTextField priceDoc;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddJournal window = new AddJournal();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AddJournal(Vector<Document> docs) {
		this.docs = docs;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddJournal = new JFrame();
		frmAddJournal.getContentPane().setBackground(Color.DARK_GRAY);
		frmAddJournal.setTitle("Add Journal");
		frmAddJournal.setBounds(100, 100, 585, 376);
		frmAddJournal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddJournal.getContentPane().setLayout(null);
		frmAddJournal.setVisible(true);
		
		JLabel bName = new JLabel("Journal Name");
		bName.setFont(new Font("Tahoma", Font.BOLD, 14));
		bName.setForeground(Color.WHITE);
		bName.setBounds(45, 42, 115, 14);
		frmAddJournal.getContentPane().add(bName);
		
		JLabel autName = new JLabel("Author Name");
		autName.setForeground(Color.WHITE);
		autName.setFont(new Font("Tahoma", Font.BOLD, 14));
		autName.setBounds(45, 79, 115, 14);
		frmAddJournal.getContentPane().add(autName);
		
		JLabel isbn = new JLabel("ID");
		isbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		isbn.setForeground(Color.WHITE);
		isbn.setBounds(47, 112, 46, 14);
		frmAddJournal.getContentPane().add(isbn);
		
		JLabel pubName = new JLabel("Publisher Name");
		pubName.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubName.setForeground(Color.WHITE);
		pubName.setBounds(45, 143, 115, 14);
		frmAddJournal.getContentPane().add(pubName);
		
		JLabel pubDate = new JLabel("Publish Date");
		pubDate.setForeground(Color.WHITE);
		pubDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubDate.setBounds(45, 180, 104, 14);
		frmAddJournal.getContentPane().add(pubDate);
		
		JLabel startDate = new JLabel("Start Date");
		startDate.setForeground(Color.WHITE);
		startDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		startDate.setBounds(45, 210, 104, 14);
		frmAddJournal.getContentPane().add(startDate);
		
		jName = new JTextField();
		jName.setBounds(201, 41, 200, 20);
		frmAddJournal.getContentPane().add(jName);
		jName.setColumns(10);
		
		aName = new JTextField();
		aName.setBounds(201, 78, 200, 20);
		frmAddJournal.getContentPane().add(aName);
		aName.setColumns(10);
		
		jId = new JTextField();
		jId.setBounds(201, 111, 200, 20);
		frmAddJournal.getContentPane().add(jId);
		jId.setColumns(10);
		
		publisher = new JTextField();
		publisher.setBounds(201, 142, 200, 20);
		frmAddJournal.getContentPane().add(publisher);
		publisher.setColumns(10);
		
		date = new JTextField();
		date.setBounds(201, 179, 200, 20);
		frmAddJournal.getContentPane().add(date);
		date.setColumns(10);
		
		sdate = new JTextField();
		sdate.setBounds(201, 209, 200, 20);
		frmAddJournal.getContentPane().add(sdate);
		sdate.setColumns(10);
		
		priceDoc = new JTextField();
		priceDoc.setBounds(200, 240, 201, 20);
		frmAddJournal.getContentPane().add(priceDoc);
		priceDoc.setColumns(10);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jName.getText();
				String author = aName.getText();
				String pDate = date.getText();
				int num = Integer.parseInt((jId.getText()));
				String pubN= publisher.getText();
				String start = sdate.getText();
				int price = Integer.parseInt((priceDoc.getText()));
				Journal j = new Journal(name, author,pDate,price,num,pubN,start);
				docs.add(j);
				JOptionPane.showMessageDialog(null, "Successfully Added");
				
			}
		});
		add.setBounds(312, 284, 89, 23);
		frmAddJournal.getContentPane().add(add);
		
		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddJournal.dispose();
				Operator op = new Operator(docs);
			}
		});
		back.setBounds(213, 284, 89, 23);
		frmAddJournal.getContentPane().add(back);
		
		JLabel pr = DefaultComponentFactory.getInstance().createLabel("Price");
		pr.setFont(new Font("Tahoma", Font.BOLD, 14));
		pr.setForeground(Color.WHITE);
		pr.setBounds(45, 241, 92, 14);
		frmAddJournal.getContentPane().add(pr);
		
		
		
		
		frmAddJournal.setVisible(true);
	}
}


