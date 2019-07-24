/**
* <h1>Command Line Arguements!</h1>
* The Command Line Arguements program implements an application that
* simply output two values on the Screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Piyush Nandurkar
* @version 1.0
* @since   2019-07-24 
*/
public class CommandLine {
	public static void main(String[] args){
		String val1, val2;
		val1=val2=null;
		val1=args[0];
		val2=args[1];
		
		System.out.println("Value1: " + val1 +"\nValue2 : "+ val2);
	}
}