package selfLearning;

public class Monday_years_to_words {
	public static void main(String[] args) {
		public String dateToWords() {
			String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
			String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
			String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
			String[] yearWords = {"Hundred", "Thousand"};
			
		String date = "";
			date+= monthWords[month-1] + " ";  //first find the month (April) subtract 1 b/c of indexes
			if(day <= 10) {                     
				date+= numbersLessThanTen[day-1] + " ";	     
			}else if(day >= 11 && day <= 19) {
				date+= numbersBetweenTenAndTwenty[day%10-1] + " "; //if day is 15, need to match the index, there is not an index 15. 15 % 10 gets us 5 but we need index 4
			}else if(day >= 20 && day <= 31) {
				date+= multiplesOfTen[day / 10 - 1] + " " + numbersLessThanTen[day % 10 -1] + " "; 
				// if day = 25, we need to get 20 first. We do this by doing 25 / 10. Then we need to get to the right index so subtract 1
				// next we need 5. We get this by doing 25 % 5 = 5. To get the right index, subtract 1.
			}
		  
		  date += numbersLessThanTen[(year / 1000) - 1] + " " + yearWords[1] + " "; // A year is no less than 1900, and no greater than 2100
		  																			// If we have 2191, first we need to get 2. Do 2191 / 1000. To get the right index subtract 1
		  																			// Next we need to get the word thousand so just do yearWords[1]
		    
		    int tempYear = year % 1000;   //next, we need to create a variable so we don't have to keep repeating the last step. To get rid of the first number we use remainder. 
		    if(tempYear == 0){   //If year = 000, return 2000. Remember we are only looking at the last 3 numbers here
		      return date;
		    }else if(tempYear >= 100){  // if last 3 numbers are greater than 100, Ex: 2191. 191 is greater than 100. Here we need to write one hundred nineteen
		      date+= numbersLessThanTen[tempYear / 100 -1] + " " + yearWords[0] + " ";  // to write 100, divide 191 / 100 = 1 then subtract 1 for the index
		      
		      tempYear = year % 100;      //we have tempYear = 191. we need to write 91. To get 91 do tempYear % 100
		        if(tempYear == 0){		  //What if year is 2100. temp year here is 00. So we are making a condition for that and saying return the date 
		          return date;
		        }else if(tempYear >= 11 && tempYear <= 19){ 
		          date+= numbersBetweenTenAndTwenty[tempYear % 10 -1];  // last 2 digits are between 11 and 19. We don't have a 19th index so do % 10 and -1 to get to the right index
		        }else if(tempYear % 10 == 0){
		          date+= multiplesOfTen[tempYear / 10 - 1]; //if last 2 digits are 10, 20, 30, 40... divide by 10 and subtract 1 to get the right index
		        }else {
		          date+= multiplesOfTen[tempYear / 10 -1] + " " + numbersLessThanTen[tempYear % 10 -1]; // if the last digit is not a 0, use this method
		          													//do what we did above then to get the last digit do remainder, then minus 1 to get the right index
		        }
		    }else{
		       tempYear = year % 100;  //The above conditions covered if the last 3 digits were 000 or greater than 100. But what if the last 3 digits are less than 100. This will be covered by our else condition
		        if(tempYear == 0){     //luckily we can copy and paste most of it.
		          return date;
		        }else if(tempYear >= 11 && tempYear <= 19){
		          date+= numbersBetweenTenAndTwenty[tempYear % 10 -1];
		        }else if(tempYear % 10 == 0){
		          date+= multiplesOfTen[tempYear / 10 - 1];
		        }else {
		          date+= multiplesOfTen[tempYear / 10 -1] + " " + numbersLessThanTen[tempYear % 10 -1];
		        }
		    }
		     
			return date;
		}
	}
}
