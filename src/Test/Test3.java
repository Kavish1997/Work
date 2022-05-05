package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test3 {
   @DataProvider (name ="kavish")
   public Object [] [] data(){
	   return new Object[][] { {10,20},{15,25}};
   }
	
   @Test (dataProvider ="kavish")
   public void add(int a, int b)
   {
	   System.out.println(a+b);
   }
   
	
	
	@Test      
	@Parameters({"first","second"})
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
   
   
   
   
	
	
	
}
