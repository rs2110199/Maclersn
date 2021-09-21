
abstract class shape{
	
	abstract void draw();
	
}

class ractangle extends shape {
	public void draw() {
	System.out.println("the givern is ractangle");}
	
	
}
class circle extends shape {
	
	public void draw() {
		
		System.out.println("the given circle ");
		
		
		
	}
	
	public static void main(String[] args) {
		shape s= new circle();
		s.draw();
		shape r = new ractangle();
		r.draw();
		
		
	}
}
	
	
	
