

public interface Country {

	void capital();
	
	
}

class india implements Country{
	
	public void capital() {
		System.out.println("NewDelhi");
	}
}
	
	class America implements Country{
	 public void  capital() {
		
		System.out.println("WashingtonDC");
	}
	}
	

	
class Coun{
	public static void main(String[]args)
	{
		Country ref= new  india();
		ref.capital();
		Country rf= new  America();
		rf.capital();

		
	}

}
	

