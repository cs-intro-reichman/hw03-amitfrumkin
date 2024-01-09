/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int specialSundaysCounter = 0 ;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int currentYear = Integer.parseInt(args[0]); 
	 	while (year < currentYear) {

			while(month <13){

				nDaysInMonth = nDaysInMonth(month,year) ;
				for(int j = 1; j<= nDaysInMonth; j++){
					if(dayOfWeek ==7){
						dayOfWeek =1 ; 
					}else{
						dayOfWeek++ ;
					}
				}
				month++ ; 
			}
			year++ ;
			month =1;
		}
		month = 1;
		for(int i=1 ; i<=12 ; i++){
			
			advance(dayOfMonth,month,year);
			month++ ; 
		}
			if (month == 13){
				month =1 ; 
			}
			year++ ; 
	}
	
	 		
			
        
		
	 	//// Write the necessary ending code here
	 
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance(int dayOfMonth, int month, int year) {
		
		for(dayOfMonth= 1 ; dayOfMonth <= nDaysInMonth(month,year) ; dayOfMonth++){

			System.out.print(dayOfMonth + "/" + month + "/" + year) ;

			if(dayOfWeek == 1){
				System.out.print(" Sunday") ;
				
			}
			if(dayOfWeek == 7){
				dayOfWeek = 1 ; 
			}else{
				dayOfWeek++ ; 

			}
			
			System.out.println() ;

		}
		
		
		
		
			
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {

		return (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)) ) ;
 
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		
		int daysInMonth = 0;
		
		
		if(month == 4 || month == 6 || month == 9 || month == 11){
			daysInMonth = 30;
		}else if (month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10 || month == 12){
			daysInMonth = 31;
		}else if (month == 2 && isLeapYear(year)){
			daysInMonth = 29;
		}else{
			daysInMonth = 28;
		}
		
		return daysInMonth;
	}
}

/*for(dayOfWeek =2 ; dayOfWeek <= 7 ; dayOfWeek)
		for(dayOfMonth= 1 ; dayOfMonth <= nDaysInMonth(month,year) ; dayOfMonth++){
			if(dayOfWeek=1){
				System.out.println(dayOfMonth + "/" + month + "/" + year + "sunday")
			}else{
				System.out.println(dayOfMonth + "/" + month + "/" + year) 
			}

						
		}
		for(month = 1 ; month <= 12 ; month++)
		for(year = 1900; year <2000 ; year++)
		if(dayOfWeek=1 && dayOfMonth= 1 ){
			firstSundaysCounter++ ; 
		}*/