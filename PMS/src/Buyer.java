import java.util.Vector;

public class Buyer implements Observer {
	private Vector<Document> docs;
	Subject subject;
	private String name;
	
	public Buyer(Subject sub,String name){
		subject = sub;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void update(Vector<Document> docs) {
		// TODO Auto-generated method stub
		this.docs = docs;
		
	}
	
	

}
