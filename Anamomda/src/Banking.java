import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Banking{

	public static void main(String[]args) {
		CarParents ref = new CarParents();
		ref.carNo =1234;
		ref.Model = "Maruti800";
		ref.color= "Black";
		
		ref.StopCar();
		ref.StartCar();
		
		CarChild ref2 = new CarChild();
		
		ref2.carNo= 7890;
		ref2.Model= "MH123";
		ref2.color= "grey";
		ref2.topclass ="Bcod";
		
		ref2.StartCar();
		ref2.StopCar();
		ref2.Blackco();
		
		
		
	}
}
class CarParents{
	
	int carNo;
	String Model;
	String color;
	
	public void StartCar() {
		
		System.out.println("thre car is start "); }
		
	public void StopCar( ) {
	   
	    System.out.println("the car is stop"); }
	
}
	
class CarChild extends CarParents{
	
	 String topclass;
	 
	public void Blackco() {
		
		System.out.println("the new car is lombarghini");
	}
	
	
	
	
}
	

	
		
	   
	   
	

		
	    
	    
	   


	