package oops;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CollectionDemo1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hari");
		list.add("Heena")
		list.add("Ravi");
		list.add("Kavi");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
