
public class printnumber{
	
	public void form(int n ,char c) {
	System.out.println("thr number is"+ " "+ n);
	System.out.println("thr char is"+ " "+ c);
	
}
	public void form(char c,int n) {
		System.out.println("thr char is"+ " "+ c);

		System.out.println("thr number is"+ " "+ n);
			}
	
	public static void main(String [] args)
	{
		printnumber ref = new printnumber();
		ref.form('c', 123);
		ref.form(123, 'e');
	}
}