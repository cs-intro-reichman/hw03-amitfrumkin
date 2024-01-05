
public class LowerCase {
	public static void main (String[] args) {

        String user = (args[0]) ; 
        String answer = "" ;
        int a = user.length() ;

        for(int i = 0 ; i < a ; i++){
            char letter = user.charAt(i) ;

            if ((letter >= 'A') && (letter <= 'Z') ){
                answer = answer + (char) (letter + 32) ;
            }else{
                answer = answer + letter ; 
            }
        }
        System.out.println(answer) ;
    }
}

    
    
        
