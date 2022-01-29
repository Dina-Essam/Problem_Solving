public class ProblemOne {
 
    static boolean palindrome(String str)
    {
    	//Remove whitespaces
    	String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int i = 0;
        int j = cleanStr.length() - 1;
        for(;i<j;i++,j--) 
            if (cleanStr.charAt(i) != cleanStr.charAt(j))
                return false;

        return true;
    }
 
    public static void main(String[] args)
    {

    }
}