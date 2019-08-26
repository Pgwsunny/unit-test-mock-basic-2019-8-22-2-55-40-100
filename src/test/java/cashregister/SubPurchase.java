package cashregister;

public class SubPurchase extends Purchase{

	public SubPurchase() {
		super(new Item[0]);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String asString() {
		return "test product\t1.0\n";
	}

}
