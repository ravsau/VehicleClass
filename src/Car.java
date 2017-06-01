
public class Car extends Vehicle {

	private String carName;
	private int speed;


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
	
	public String getName(){
		
		return carName;
	}


	public String accelerate(){
		this.speed=this.speed+40;
		return ("The " +carName +" is accelerating");


	}

	public void setSpeed(int speed){

		this.speed=speed;
	}

	public String getSpeed(){

		return ("The " +carName+" is running at "+ speed +" mph ");
	}



	public String passes (String car){
		return carName+" passes "+ car+"";
	}

	public String ticket(){
		
		this.speed=0;
		return ""+carName+" is pulled over by a Police Car";	
	}

	public String stopped(){
		this.speed=0;
		return ""+carName+" is stopped.";
		
	}



}
