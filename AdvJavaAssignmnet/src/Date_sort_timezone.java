import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Date_sort_timezone {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
        
		List<Date> date = new ArrayList<>();
		date.add(new Date(2015-1900, 03, 03));
		date.add(new Date(2013-1900, 03, 02));
		date.add(new Date(2013-1900, 04, 02));
		date.add(new Date(2012-1900, 10, 01));
		date.add(new Date(2012-1900, 11, 01));
		date.add(new Date(2015-1900, 03, 23));
         
		
		System.out.println("Dates before sorting:");
		for(int i = 0; i < date.size(); i++){
            System.out.println(date.get(i).toString());
        }
		
        Collections.sort(date, new Comparator<Date>(){
 
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        
        System.out.println("Dates after sorting:");
        for(int i = 0; i < date.size(); i++){
            System.out.println(date.get(i).toString());
        }
 
        
        System.out.println("Different time zones:");
        Date date1 = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
		
		df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST = df.format(date1);
		System.out.println("Date in Indian Timezone : "+IST);
		
		df.setTimeZone(TimeZone.getTimeZone("Antarctica/Casey"));
		String PST = df.format(date1);
		System.out.println("Date in Antarctica/Casey Timezone : "+PST);
		
		
		df.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		String AST = df.format(date1);
		System.out.println("Date in Sydney Timezone : "+AST);
		
		
		df.setTimeZone(TimeZone.getTimeZone("Asia/Kuching"));
		String MST = df.format(date1);
		System.out.println("Date in Asia/Kuching Timezone : "+MST);
		
		df.setTimeZone(TimeZone.getTimeZone("Asia/Taipei	"));
		String LST = df.format(date1);
		System.out.println("Date in Asia/Taipei	 Timezone : "+LST);
		
		
		
		
		
	}
        
    
}
