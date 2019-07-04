# Java-exercise
Diamond pattern 

//

public void static main(String[] argus){
	
	int a=1;
	
	//Pyramid 1
	for(int i=0;i<10;i++){
		
		for(int j=0;j<10-i;j++)
			System.out.println(" ");
		
		for(int k=0;k<i;k++)
			System.out.println("*");
		
		System.out.println();
	}
	
	//Pyramid 2
	for(int i=0;i<10;i++){
		
		for(int j=0;j<a;j++)
			System.out.println(" ");
		
		for(int k=0;k<=(2*(10-i)-1);k++)
			System.out.println("*");
		
		System.out.println();
	}
	
	
}
//
