
public class RegisteredBuyer extends Buyer {
	Management man;
	public RegisteredBuyer(Subject sub,String name,Management man){
		
		super(sub,name);
		this.man = man;
		
	}
	
	public void unsubscribe(){
		
		man.remove(this);
	}
}
