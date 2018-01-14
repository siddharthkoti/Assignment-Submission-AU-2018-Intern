import java.util.*;
import java.util.stream.Collectors;

public class Streams_3 {
	private static final String[] tensNames = {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

		  private static final String[] numNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };

		  //private EnglishNumberToWords() {}

		  private static String convertDigitToWord(int number) {
		    String soFar;

		    if (number % 100 < 20){
		      soFar = numNames[number % 100];
		      number /= 100;
		    }
		    else {
		      soFar = numNames[number % 10];
		      number /= 10;

		      soFar = tensNames[number % 10] + soFar;
		      number /= 10;
		    }
		    if (number == 0) return soFar;
		    return numNames[number] + " hundred" + soFar;
		  }

	
	
	
	public static void main(String[] args) {
	    System.out.println();
	    
	    ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,23,5,12,45,60,90,185,988));
	    
	    
	    System.out.println(nums);
	    List<String> nums_multiple5_words = nums.stream().filter(x->x%5==0).map(x->convertDigitToWord(x)).collect(Collectors.toList());
	    	 
	    System.out.println(nums_multiple5_words);
	    	   
	}
}