
 abstract class Newze {

	void Bike(){
		
		System.out.println("HELLOW PAK");}
	
	abstract void run() ;
		
	void changgear() {
		System.out.println("lhello india ");
		

}
	
	static class Honda extends Newze{
		void run() {
		System.out.println("My name is kahna");
	}

	public static void main(String[] args) {
		
		Newze obj = new Honda();
		obj.run();
        obj.changgear();
        obj.Bike();				
	}
		

	}

}
