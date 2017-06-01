
public class CarApp {

	public static void main(String[] args) {
	
		
		String car1="red porche";
		String car2="blue ferrari";
		
		
		Car a= new Car(car1);
		Car b =new Car(car2);
		
		System.out.println(a.accelerate());
		System.out.println(b.accelerate());
		
		
	    System.out.println(a.speed(50));
	    System.out.println(b.speed(40));
	    
		
	    System.out.println(a.passes(car2));
	    
		
	    System.out.println(a.ticket());
	    
	    System.out.println(b.passes(car1));
	    
	    System.out.println(b.stopped());
	    
	    System.out.println(a.passes(car2));
	    
	    
	    
	    
	    
	    
		
		

	}

}
