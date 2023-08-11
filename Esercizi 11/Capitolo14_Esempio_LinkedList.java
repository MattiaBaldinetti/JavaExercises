import java.util.*;
	
public class Capitolo14_Esempio_LinkedList {

	    public static void main(String args[])
	    {

	        LinkedList<String> list = new LinkedList<String>();
	  
	        list.add("This");
	        list.add("is");
	        list.add("Only");
	        list.add("a");
	        list.add("Test");
	  
	        System.out.println("LinkedList:" + list);
	          
	        //ListIterator list_Iter = list.listIterator(6); Lancia una Exception
	        ListIterator list_Iter = list.listIterator(0); 
	        while(list_Iter.hasNext()){
	           System.out.println(list_Iter.next());
	        }
	        
	        ArrayList<String> pippo = new ArrayList<String>();
	        
	        pippo.add("Pluto");
	        pippo.add("Paperino");
	        
	        for(String elemento : pippo)
	        {
	        	System.out.println(elemento);
	        	// if(iteratorePippo.hasNext())
	        	// {
	        	// 		elemento = iteratorePippo.next();
	        	// }
	        }
	        
	    	LinkedList<String> staff = new LinkedList<>();
	    	ListIterator<String> iterator = staff.listIterator();
	    	iterator.add("Tom");
	    	iterator.add("Diana");
	    	iterator.add("Harry");
	    	iterator = staff.listIterator();
	    	if(iterator.next().equals("Tom")) { 
	    		iterator.remove(); 
	    		}
	    	while (iterator.hasNext()) { System.out.println(iterator.next()); }
	        
	    }
	}

