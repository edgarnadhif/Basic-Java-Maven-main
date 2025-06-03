import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Countq :" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Countw :" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count3 :" + counter.getCount());
		
	}

}
