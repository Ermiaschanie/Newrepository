package OpTest1;

public class OddEvenLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For loop");
	for(int x=1; x<=20; x++) {
		if (x%2==0) {
			System.out.println(x + " Called Even");
	
	}
	else {
		System.out.println(x + "Called Odd");
	}
		
	System.out.println("while loop");
	int i=1; 
	while(i<=20){ 
		if(i%2==0) 
		{
			System.out.println(i + " Called Even");
	}  
		else {
			System.out.println(i + " Called odd");
			
		}
		i++;
		
		System.out.println();
		 System.out.println("Do while loop");
				int y = 1;
				do{
					if(i%2==0) {
			System.out.println(y + " Called even");
					}
					else {
			System.out.println(y + " Called odd");
					}
					y++;
				}	while(y<=10);
				
	}
	}
}}

        
		
	
	 