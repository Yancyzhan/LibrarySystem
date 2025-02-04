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

public class UpdateMagazine {

	private JFrame frmUpdate;
	private Vector<Document> docs;
	private Magazine doc;
	private String title;
	private JTextField mName;
	private JTextField aName;
	private JTextField magId;
	private JTextField company;
	private JTextField date;
	private JTextField priceDoc;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UpdateMagazine window = new UpdateMagazine();
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
	public UpdateMagazine(Vector<Document>docs, String name) {
		this.docs = (Vector)docs.clone();
		title = name;
		doc = (Magazine)getDoc(title);
		initialize();
	}
	public Document getDoc(String n){
		for(int i = 0; i < docs.size();i++){
			if(docs.get(i).getName().equals(title)){
				return docs.get(i);
			}
		}
		return null;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdate = new JFrame();
		frmUpdate.getContentPane().setBackground(Color.DARK_GRAY);
		frmUpdate.setTitle("Update");
		frmUpdate.setBounds(100, 100, 543, 344);
		frmUpdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdate.getContentPane().setLayout(null);
		
		JLabel bName = new JLabel("Magazine Name");
		bName.setFont(new Font("Tahoma", Font.BOLD, 14));
		bName.setForeground(Color.WHITE);
		bName.setBounds(45, 42, 133, 14);
		frmUpdate.getContentPane().add(bName);
		
		JLabel autName = new JLabel("Author Name");
		autName.setForeground(Color.WHITE);
		autName.setFont(new Font("Tahoma", Font.BOLD, 14));
		autName.setBounds(45, 79, 115, 14);
		frmUpdate.getContentPane().add(autName);
		
		JLabel isbn = new JLabel("ID");
		isbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		isbn.setForeground(Color.WHITE);
		isbn.setBounds(47, 112, 46, 14);
		frmUpdate.getContentPane().add(isbn);
		
		JLabel pubName = new JLabel("Company Name");
		pubName.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubName.setForeground(Color.WHITE);
		pubName.setBounds(45, 143, 115, 14);
		frmUpdate.getContentPane().add(pubName);
		
		JLabel pubDate = new JLabel("Publish Date");
		pubDate.setForeground(Color.WHITE);
		pubDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubDate.setBounds(45, 176, 104, 14);
		frmUpdate.getContentPane().add(pubDate);
		
		mName = new JTextField();
		mName.setBounds(205, 41, 200, 20);
		frmUpdate.getContentPane().add(mName);
		mName.setColumns(10);
		mName.setText(doc.getName());
		
		aName = new JTextField();
		aName.setBounds(205, 78, 200, 20);
		frmUpdate.getContentPane().add(aName);
		aName.setColumns(10);
		aName.setText(doc.getAutName());
		
		magId = new JTextField();
		magId.setBounds(205, 111, 200, 20);
		frmUpdate.getContentPane().add(magId);
		magId.setColumns(10);
		magId.setText(Integer.toString(doc.getMagId()));
		
		company = new JTextField();
		company.setBounds(205, 142, 200, 20);
		frmUpdate.getContentPane().add(company);
		company.setColumns(10);
		company.setText(doc.getCompany());
		date = new JTextField();
		date.setBounds(205, 175, 200, 20);
		frmUpdate.getContentPane().add(date);
		date.setColumns(10);
		date.setText(doc.getDate());
		priceDoc = new JTextField();
		priceDoc.setBounds(205, 206, 200, 20);
		frmUpdate.getContentPane().add(priceDoc);
		priceDoc.setColumns(10);
		priceDoc.setText(Integer.toString(doc.getPrice()));
		JButton add = new JButton("Update");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = mName.getText();
				String author = aName.getText();
				String pDate = date.getText();
				int num = Integer.parseInt((magId.getText()));
				String pubN= company.getText();
				int price = Integer.parseInt((priceDoc.getText()));
				Magazine m = new Magazine(name, author,pDate,price,num,pubN);
				docs.remove(doc);
				docs.add(m);
				JOptionPane.showMessageDialog(null, "Successfully Updated");
				
			}
		});
		add.setBounds(316, 255, 89, 23);
		frmUpdate.getContentPane().add(add);
		
		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdate.dispose();
				Operator op = new Operator(docs);
			}
		});
		back.setBounds(217, 255, 89, 23);
		frmUpdate.getContentPane().add(back);
		
		JLabel pr = DefaultComponentFactory.getInstance().createLabel("Price");
		pr.setFont(new Font("Tahoma", Font.BOLD, 14));
		pr.setForeground(Color.WHITE);
		pr.setBounds(45, 211, 92, 14);
		frmUpdate.getContentPane().add(pr);
		
		
		frmUpdate.setVisible(true);
	}

}
