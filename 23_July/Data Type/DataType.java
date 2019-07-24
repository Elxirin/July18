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
public class DataType{
	public static void main(String[] args){
		//Declaration data types
		int empId;
		String name;
		char gender;
		boolean isWorking ;
		float salary;
		
		//initaliazation
		empId=101;
		name="Piyush Nandurkar";
		gender='M';
		isWorking=true;
		salary= 555.55f;
		
		System.out.println("Employee ID :"+ empId);
		System.out.println("Name : "+ name);
		System.out.println("Gender :"+ gender);
		System.out.println("Working :"+isWorking);
		System.out.println("Salary : "+salary);
	}
}