
public class Prcthis {
	
       int rollno;
       String name ;
       float fee;
       
       Prcthis(int rollno,String name,float fee){
        rollno = rollno;
    	name = name;
        fee= fee;
	
}
      
   public void dispaly() {
	
	System.out.println(rollno+ " "+name +" "+fee );
	   
   }
	
	
	
	public static void main(String[] args) {
		
      Prcthis ref = new Prcthis(1234,"rajatsharma",4000f);
      Prcthis ref2 = new Prcthis(1000,"shubhamsharma",6000f);
      ref.dispaly();
      ref2.dispaly();
	}

}