//To show two dimensional array. 


package types_of_array;

public class two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// declaration:-
		
		int [][]b;
	  //int[][] a;     // Mostly used.
		int[] []c;
		int d[][];
		
		
		
		//creation:-
		
//		a=new int[2][3];
	
		
		
//		declaration+creation
	
              	int[][] a=new int[2][3];  
              	
              	
              	
//        Initialization :- 	
              	
//              row	column                            column
//                |  |            	
              	a[0][0]=10;             // row    10     20      30
              	a[0][1]=20;             //        40     50      60
		        a[0][2]=30;                 
		        a[1][0]=40;              
		        a[1][1]=50;               
		        a[1][2]=60;                 
		        
		System.out.println(a[1][0]);        //40
		
		System.out.println(a[1][1]);        //50
		
		System.out.println(a[0][2]);        //30
		        
		        
//*************************************  OR  **************************************************
		
		
		
		int[][] z= {{10,20,30},{40,50,60}};
		
		System.out.println(z[0][2]);        //20
		
		System.out.println(z[1][2]);        //60
		
		System.out.println(z[0][0]);        //10
		
		
		
		
//	# value	
		
		 System.out.println(z);         //   [[I@2626b418     
		 
		
		
		
		
		
		
	}

}
