import java.util.Vector;
import java.util.Random;
public class Order {
	private int orderId;
	private Vector<Document> cart;
	//private Payment payment;

	public Order(){
		Random rand = new Random();
		int orderId = rand.nextInt(50) + 1;
		cart = new Vector<Document>();
	}


	public void add(Document doc){
		cart.add(doc);
	}

	public void remove(Document doc){
		cart.remove(doc);
	}
	public Vector<Document> getDocs(){
		return cart;
	}
}
