import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frmWelcomeToPms;
	private Vector<Document> docs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Start window = new Start();
					window.frmWelcomeToPms.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public Start() {
		docs = new Vector<Document>();
		populateDocs();
		initialize();
	}
	private void populateDocs(){
		
		for(int i = 0; i < 5; i++){
			Document doc;
			if(i == 0){
			 doc = new Book("aaa","k1","20 September, 2018",120,1221,"BookCompany");
			}
			else if(i == 1){
				doc = new Journal("bbb","k2","20 September, 2018",210,12,"Newspaper","12 January, 1998");
			}
			else if(i == 2){
				doc = new Journal("journal","k3","20 September, 2018",230,12,"Herald","12 January, 1998");
			}
			else if(i == 3){
				 doc = new Book("book","k3","20 September, 2018",100,121,"BookCompany");
			}
			else {
				doc = new Magazine("ccc","k4","20 September, 2018",220,12,"Newspaper");
			}
			
			docs.add(doc);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToPms = new JFrame();
		frmWelcomeToPms.getContentPane().setBackground(Color.DARK_GRAY);
		frmWelcomeToPms.setTitle("WELCOME TO PMS");
		frmWelcomeToPms.setBounds(100, 100, 450, 300);
		frmWelcomeToPms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToPms.getContentPane().setLayout(null);
		frmWelcomeToPms.setVisible(true);
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWelcomeToPms.dispose();
				Management man = new Management(docs);
			}
		});
		start.setBounds(174, 111, 89, 23);
		frmWelcomeToPms.getContentPane().add(start);
	}

}
