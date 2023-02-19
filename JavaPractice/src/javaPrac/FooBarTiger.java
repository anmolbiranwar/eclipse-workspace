package javaPrac;

public class FooBarTiger {

	public static void main(String[] args) {
		int counter=1;
	
		while (counter <= 100)
		{
				  if( (counter % 3 == 0) && (counter % 5 == 0))
				  {
					System.out.println("Tiger");
				  }
				  else if (counter % 3 == 0)
				  {
				  System.out.println("Foo");
				  }
				  	
				  else if (counter % 5 == 0)
				  {
				  System.out.println("Bar");
				  }
				  else
				  {
					  System.out.println(counter);
				  }
				 
				  counter++;
		}		
		
	}
}
