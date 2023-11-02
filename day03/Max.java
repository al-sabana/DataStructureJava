package day03;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 28;
       int b=30;
       int c=50;
       if(a>b && a>c) {
    	   System.out.println("a is great");
       }else if(b>c) {
    	   System.out.println("b is greater");
       }else {
    	   System.out.println("c is greater");
       }
    String str=(a>b && a>c)?"a greater":(b>c)?"b greater":"c greater"; 
    System.out.println(str);
       
       
	}

}
