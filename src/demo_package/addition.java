package demo_package;

public class addition {
	
	int sum =0;

	 public void add(int num1,int num2){
		 this.sum = num1 + num2 ;
		 System.out.println("The sum is:"+this.sum);
		
		
	}
	
	public static void main(String[] args){
		addition ad = new addition();
		ad.add(45,65);
		
		
	}
}
