import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class comparerTO {


public static void main(String[] args) {

 ArrayList ref = new ArrayList();
  ref.add("rajat");
  ref.add("shubha");
  ref.add("mangoman");
  ref.add("automation testing");
  
  Iterator it = ref.iterator();
  ListIterator<String> itlist = ref.listIterator();
  
 /* while(it.hasNext())
  {
	  System.out.println("the next"+ " "+ it.next());
  } */
  
  while(itlist.hasPrevious())
  {
  System.out.println("the previous "+ " "+ itlist.previous());
	  
  }
  
}
}