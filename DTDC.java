package in.abc.bean;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading...");
	}

	public DTDC() {
		System.out.println("DTDC object is created...");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "DTDC courier will deliver with the order id ::" + oid + " order products";
	}

}
