/**
* <h1>Hello!</h1>
* The Hello program implements an application that
* simply adds two given integer numbers and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Piyush Nandurkar
* @version 1.0
* @since   2019-07-24 
*/


public class Hello{ 
		
		/**
		*This is the Constructor of Hello Class 
		*and Shows the Constructor gets Called initially
		*/	
		Hello(){
			System.out.println("We are inside the Hello Constructor.");
		}
		
		 /**
   		* This method is used to add two integers. This is
  	 	* a the simplest form of a class method, just to
   		* show the usage of various javadoc Tags.
   		* @param numA This is the first paramter to addNum method
   		* @param numB  This is the second parameter to addNum method
   		* @return int This returns sum of numA and numB.
   		*/
   		public int addNum(int numA, int numB) {
      							return numA + numB;
   							}
			
		/* Prints Hello, World! on standard output.*/
		public static void main(String[] args){ 
			System.out.println("Hello World!"); 
			Hello obj = new Hello();
			int sum = obj.addNum(10,20);
			System.out.println("Sum of 10 and 20 is :" + sum);
		} 
		


	   }
