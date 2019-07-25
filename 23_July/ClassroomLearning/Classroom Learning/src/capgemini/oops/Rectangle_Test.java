package Capgemini.oops;

class Rectangle{
	double length,breadth;
	
	Rectangle(){
		System.out.println("this is rectangle");
		
	}
	Rectangle(double len, double bre){
		
			length=len;
			breadth=bre;
		
	}
	
	public double calcArea(){
		double area=length*breadth;
		return area;
		
	}
	
	@Override // java Annotation:Instructions For Compiler
	public String toString() {
		return "Length:" + length +" Breadth:"+breadth;
	}
	
	@Override
	public boolean equals(Object o){
		if (o == this) return true;
		if (o == null) return false;
		if (! (o instanceof Rectangle)) return false;
		
		Rectangle newr = (Rectangle)o;
		if(!(newr.length==this.length && newr.breadth==this.breadth)){
			return false;
		}
		else
			return true;
		}
		
}


public class Rectangle_Test {
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(10,20);
		double area = r1.calcArea();
		System.out.println("Area of Rectangle r1 :"+ area);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(null));
		System.out.println(r1.equals("Capgemini"));
	}
	
	

}
