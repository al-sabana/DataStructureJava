package day01;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String value = "alsabana";
      String value2 = value.toLowerCase();
      String var ="";
      String alpha ="abcdefghijklmnopqrstuvwxyz";
      for(int i=0;i<alpha.length();i++) {
    	  for(int j=0;j<value2.length();j++) {
    		  if(value2.charAt(j)==alpha.charAt(i)) {
    			  var+=value2.charAt(j);
    		  }
    	  }
      }
      System.out.println(var);
	}

}
