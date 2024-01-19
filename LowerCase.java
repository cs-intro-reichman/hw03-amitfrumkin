
/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {

        String answer = "" ;

        for(int i = 0 ; i < s.length() ; i++){
            char letter = s.charAt(i) ;

            // #feedback x = x + n equivalent to x += n
            if ((letter >= 'A') && (letter <= 'Z') ){
                answer += (char) (letter + 32) ;
            }else{
                answer += letter ; 
            }
        }
        
        return answer ; 
    }
}
