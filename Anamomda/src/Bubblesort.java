import java.util.Scanner;

public class Bubblesort {

	private static int temp=0;

	public static void main(String[] args) {
    int i;
    System.out.println("enter the number of element you want to store");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    int array[] = new int[n];
    
    System.out.println("enter the element of array");
    for(i=0; i<n; i++)
    {
    	array[i]=sc.nextInt();
    }
    
   
    System.out.println("the array element");
     for(i=0; i<n; i++) {
    	System.out.println(" " +array[i]);
    	
    }
     
     for (i=0; i<n; i++)
     {
        for(int j=1; j<(n-i); j++)
        	
        {
        	if(array[j-1]<array[j])
        	{   
        		 temp= array[j-1];
        		 array[j-1]= array[j];
        		 array[j]=  temp;
        	}
        		
        		
        }
        	
     }
     System.out.println("----------------------------------------");
     for(int k=0; k<n; k++) {
    	
    	System.out.println(" "+array[k]); }
    
}
}