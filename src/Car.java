
public class Car extends Vehicle {

    private String carName;


	public Car(){

		System.out.println("The car is starting");


	}

	public Car(String carName){

		System.out.println("The " +carName + " is starting");
		this.setName(carName);
		


	}
	
	public void setName(String name){
		carName=name;
		
	}

	
	public String accelerate(){
		
		return ("The " +carName +" is accelerating");
	
	}
	
	public String speed(int speed){
		
		return ("The " +carName+" is running at "+ speed +" mph ");
	}

	
	public String passes (String car){
		return carName+" passes "+ car+"";
	}
	
	public String ticket(){
	    return ""+carName+" is pulled over by a Police Car";	
	}
	
	public String stopped(){
		return ""+carName+" is stopped.";
	}
	
	

}
