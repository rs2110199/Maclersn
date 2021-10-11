import java.util.Scanner;

public class exception {

	static String S;
	static String ref= "";
	public static void main(String[] args) {
    
		System.out.println("enter the string");
    Scanner sc = new  Scanner(System.in);
    S=sc.nextLine();
    int i,j;
    int x=S.length();
    System.out.println("the length of string"+ " "+x);
    for(i=x-1; i>=0; i--) {
    	System.out.print(S.charAt(i)); 
   }
    System.out.print(S.reverse());
    System.out.println("the reverser"+S.ref);
	
	}
}