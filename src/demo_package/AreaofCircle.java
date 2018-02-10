package demo_package;

public class AreaofCircle {

	float pi = 3.14f;
	
	public void area(int r){
		float area = pi *(r*r);
		System.out.println("The area of the circle is:"+area);
	}
	
	public  static void  main(String[] args){
		 AreaofCircle area_circle = new AreaofCircle();
		 area_circle.area(6);
		
	}
}
