package Assignment12;

public class InsufficientBalanceException  extends Exception {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
		
	String message ;                        //in this creating constructors 
	public InsufficientBalanceException(){
		System.out.println("Exception Constructor called"); //which shows a message 
		 //out is a static number
	     //println is used to print text and gives output
	    
	}
	 public InsufficientBalanceException(String message){
		 this.message=message;
		 System.out.println("Exception thrown with message" +getMessage());
		 //out is a static number
	     //println is used to print text and gives output
	     
		 printStackTrace();
	}
}
