package main;

public class mainClass {

	public static void main(String[] args) {
       hashmap x = new hashmap();
       x.put(1,10);
       x.put(2,20);
       x.put(3,30);
       x.put(4,40);
       
       x.remove(1);
       
       System.out.println("get(2) = " + x.get(2));
       System.out.println("List contains... ");
       x.print_all();
       
	}

}