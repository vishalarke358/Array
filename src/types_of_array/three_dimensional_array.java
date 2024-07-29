////To show three dimensional array. 

package types_of_array;

public class three_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// declaration:-
		
		int[] [][]b;
	  //int[][][] a;     // Mostly used.
		int[] []c[];
		int []d[][];
		
		
		
		//creation:-
		
//		a=new int[2][3][2];
	
		
		
//		declaration+creation
	
              	int[][][] a=new int[2][3][2];  
              	
              	
              	
//        Initialization :- 	
              	
              
            	
              	a[0][0][0]=10;           
              	a[0][0][1]=20;             
              	a[0][1][0]=30;           
              	a[0][1][1]=40;              
              	a[0][2][0]=50;           
              	a[0][2][1]=60;
              	a[1][0][0]=70;           
              	a[1][0][1]=80;
              	a[1][1][0]=90;           
              	a[1][1][1]=100;
              	a[1][2][0]=110;           
              	a[1][2][1]=120;
              	
		        
		System.out.println(a[1][1][1]);        //100
		
		System.out.println(a[0][1][0]);        //30
		
		System.out.println(a[1][2][1]);        //120
		        
		        
//*************************************  OR  **************************************************
		
//                                 0                       1		                  1-D
//		    2 2 3            0         1             0            1                   2-D
		int[][][] z= {{{10,20,30},{40,50,60}},{{70,80,90},{100,110,120}}};
//  	                0   1  2    0  1  2      0  1  2    0   1    2                3-D
		
		System.out.println(z[0][0][2]);        //30
		
		System.out.println(z[1][1][0]);        //100
		
		System.out.println(z[1][1][2]);        //120
		
		
		
		
//	# value	
		
		 System.out.println(z);         //   [[[I@2626b418     
		 
		
		
		
		
		
		
	}

}
