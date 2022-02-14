package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Class1 {
	SoftAssert softassert= new SoftAssert();
   @Test
  public void Login() {
	   System.out.println("Login user");
  }
 
   @Test
   public void EditUser() {
	   System.out.println(" ");
   }
   @Test
   public void DeleteUser() {
	   System.out.println("Click on send");
   }
}
