package Exception;

 class CustomException extends Exception {
	 public CustomException(String s) 
	 { 
	 super(s); 
	 } 
	} 
	public class CustomExceptionDemo 
	{ 
	 public static void main(String args[]) 
	 { 
	 try
	 { 
	 throw new CustomException("temp"); 
	 } 
	 catch (CustomException ex) 
	 { 
	 System.out.println("Caught"); 
	 System.out.println(ex.getMessage()); 
	 } 
	 } 
}
