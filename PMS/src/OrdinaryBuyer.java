
public class OrdinaryBuyer extends Buyer {

	public OrdinaryBuyer(Subject sub,String name){
		super(sub,name);
	}
	
	public void register(){
		subject.register(this);
	}
}
