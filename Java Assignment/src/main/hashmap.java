package main;
import java.util.*;

public class hashmap {
	LinkedList<node> map;
	hashmap()
	{
		map=new LinkedList<>();
	}

	public void put(int key,int value)
	{    
		boolean flag = false;
		node n;
		Iterator<node> x = map.iterator();
		while (x.hasNext()){

			n = x.next();

			if(n.getkey()==key)
			{   flag = true;
				n.value=value;    		   
				break;
			}
		}
		if(!flag)
		{
			n = new node(key,value);
			map.add(n);
		}
	}

	public void remove(int key)
	{
		for(Iterator<node> iter = map.iterator(); iter.hasNext();) {
			node data = iter.next();
			if (data.getkey() == key) {
				iter.remove();
			}
		}
	}

	public int get(int key)
	{
		Iterator<node> iter = map.iterator();
		node data = iter.next();
		if (data.getkey() == key) {
			return data.getvalue();
		}
		return -1;
	}
	public void print_all()
	{
		for(Iterator<node> iter = map.iterator(); ;) {

			{node data = iter.next();
			System.out.println("key is "+data.getkey());
			System.out.println("value is "+(data.getvalue()));
			if(!iter.hasNext())
				break;
			}
		}
	}

}




