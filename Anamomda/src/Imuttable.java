import java.util.Scanner;

public class Imuttable {

	public static void main(String[] args) {
		 int i,j,count =0;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		 System.out.println("the reverser"+" "+ sb);   
      
		  for(i=0, j=0; i<=str.length()-1&&j<=sb.length(); i++,j++) {
			  
			  if (str.charAt(i)==sb.charAt(j)) {
				 count++;
				  continue;}
			  else {
				  break;
		  }
		  }
    if(count==str.length())
    System.out.println("yes");
    else
    	System.out.println("NO");
}
}

