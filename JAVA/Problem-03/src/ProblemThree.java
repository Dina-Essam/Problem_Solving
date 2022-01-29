
public class ProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(runLengthEncode("aaaaaaaaaa111111bbbaxxxxyyyzyx22222"));
		System.out.println(runLengthDecode("10a6/1/3b1a4x3y1z1y1x5/2/"));
		
		System.out.println(runLengthEncode2("33333aaaaaaaaaa111111bbbaxxxxyyyzyx22222"));
		System.out.println(runLengthDecode2("/3/5a10/1/6b3a1x4y3z1y1x1/2/5"));

	}
	
	static String runLengthEncode(String decodedString)
	{
		  StringBuilder encodedString =new StringBuilder();
		  int count = 1;
		  for (int i = 0; i < decodedString.length(); i++) {
	
		   // resetting to 1 for every new character (counting current character).
		   count = 1;
		   while (i < decodedString.length() - 1 && decodedString.charAt(i) == decodedString.charAt(i + 1))
		   {
		    count++;
		    i++;
		   }
		   encodedString = encodedString.append(count);
		   if(Character.isDigit(decodedString.charAt(i)))
			   encodedString = encodedString.append("/").append(decodedString.charAt(i)).append("/");
		   else
			   encodedString = encodedString.append(decodedString.charAt(i));
		   
		  }
		  return encodedString.toString();
	}

	static String runLengthEncode2(String decodedString)
	{
		  StringBuilder encodedString =new StringBuilder();
		  int count = 1;
		  for (int i = 0; i < decodedString.length(); i++) {
	
		   // resetting to 1 for every new character (counting current character).
		   count = 1;
		   while (i < decodedString.length() - 1 && decodedString.charAt(i) == decodedString.charAt(i + 1))
		   {
		    count++;
		    i++;
		   }
		   if(Character.isDigit(decodedString.charAt(i)))
			   encodedString = encodedString.append("/").append(decodedString.charAt(i)).append("/");
		   else
			   encodedString = encodedString.append(decodedString.charAt(i));
		   
		   encodedString = encodedString.append(count);
		  }
		  return encodedString.toString();
	}
	
	static String runLengthDecode(String encodedString) {
		
        StringBuilder decodedString= new StringBuilder();
        StringBuilder counter= new StringBuilder();
        char chracter;
        
        for (int i = 0; i < encodedString.length(); i++) {
        	if(encodedString.charAt(i) == '/')
        		continue;
        	else if(Character.isDigit(encodedString.charAt(i)) && !( i-1>0 && i+1<encodedString.length() && 
        			encodedString.charAt(i-1) == encodedString.charAt(i+1) && encodedString.charAt(i+1) == '/'))
        		counter.append(encodedString.charAt(i)); 
        	else
        	{
        		chracter = encodedString.charAt(i);
            	decodedString.append(repeat(Integer.parseInt(counter.toString()),chracter));
            	counter= new StringBuilder();
        	}
        }
        return decodedString.toString();
                
    }
	
	static String runLengthDecode2(String encodedString) {
		
        StringBuilder decodedString= new StringBuilder();
        StringBuilder counter= new StringBuilder();
        char chracter= encodedString.charAt(0);
        int i=1;
        if(encodedString.charAt(0) == '/')
        {
        	chracter= encodedString.charAt(1);
        	i=3;
        }
        	
        
        for (; i < encodedString.length(); i++) {
        	if(encodedString.charAt(i) == '/')
        		continue;
        	else if(Character.isDigit(encodedString.charAt(i)) && !( i-1>0 && i+1<encodedString.length() && 
        			encodedString.charAt(i-1) == encodedString.charAt(i+1) && encodedString.charAt(i+1) == '/'))
        		counter.append(encodedString.charAt(i));         	
        	else
        	{
            	decodedString.append(repeat(Integer.parseInt(counter.toString()),chracter));
            	chracter = encodedString.charAt(i);
            	counter= new StringBuilder();
        	}
        }
        decodedString.append(repeat(Integer.parseInt(counter.toString()),chracter));
        return decodedString.toString();
                
    }

    private static String repeat(int length, char charAt) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < length; j++) {
            sb.append(charAt);
        }
        return sb.toString();
    }

}
