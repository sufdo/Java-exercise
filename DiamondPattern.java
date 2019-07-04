
public void static main(String[] argus){
		
	//Pyramid 1
	for(int i=0;i<10;i++){
		
		for(int j=0;j<10-i;j++)
			System.out.print(" ");
		
		for(int k=0;k<i;k++)
			System.out.print("*");
		
		System.out.println();
	}
	
	//Pyramid 2
	for(int i=0;i<10;i++){
		
		for(int j=0;j<i+1;j++)
			System.out.print(" ");
		
		for(int k=0;k<10-i;k++)
			System.out.print("* ");
		
		System.out.println();
	}
	
	
}
