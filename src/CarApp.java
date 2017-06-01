
public class CarApp {

	public static void main(String[] args) {
	
		
		String car1="red porche";
		String car2="blue ferrari";
		
		
		Car a= new Car(car1);
		Car b =new Car(car2);
		
		System.out.println(a.accelerate());
		System.out.println(b.accelerate());
		
		
	    System.out.println(a.getSpeed());
	    System.out.println(b.getSpeed());
	    

		System.out.println(a.accelerate());
		
		 System.out.println(a.getSpeed());
		 System.out.println(b.getSpeed());
	    
	    
		
	    System.out.println(a.passes(b.getName()));
	    
		
	    System.out.println(a.ticket());
	    
	    System.out.println(a.getSpeed());
		 System.out.println(b.getSpeed());
	    
	    System.out.println(b.passes(car1));
	    System.out.println(a.accelerate());
	    

		 System.out.println(a.getSpeed());
		 System.out.println(b.getSpeed());
	    
	    
	    System.out.println(b.stopped());
	    System.out.println(b.getSpeed());
	    
	    System.out.println(a.passes(b.getName()));
	    
	    
	    
	    
	    
	    
		
		

	}

}
