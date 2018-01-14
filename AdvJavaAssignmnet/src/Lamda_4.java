@FunctionalInterface  
interface nums_to_words{  
    String convert(int number);  
}  
  
public class Lamda_4{  
    public static void main(String[] args) {  
    	String[] tensNames = {
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
    	
    	String[] numNames = {
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
    	
    
          
    	nums_to_words convert = (number)-> {  
        	

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
		    if (number == 0) 
				return soFar;
		    return numNames[number] + " hundred" + soFar;
       

        		  

        };  
            System.out.println(convert.convert(76));  
    }

	
}