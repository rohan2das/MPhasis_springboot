package p1;

public class Exp1 {
	private int pin =123456;
	int phone= 1234567890;
	protected String wifip="qwertyuiop";
	public int citypin= 6000125;
	
	public void disp() {
		System.out.println(pin);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
		
	}
	
	public static void main(String[] args) {
		Exp1 obj = new Exp1();
		obj.disp();
	}
}

class Exp2 extends Exp1{
	public void disp() {
//		System.out.println(pin);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}
}