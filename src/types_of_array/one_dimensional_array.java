//To show one dimensional array. 

package types_of_array;

public class one_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// declaration:-
		
		int []b;
	  //int[] a;     // Mostly used.
		int[]c;
		int d[];
		
		
		
		//creation:-
		
//		a=new int[4];
	
		
		
//		declaration+creation
	
              	int[] a=new int[4];  //-we fix the size of only 4 int array, 
              	                     // then he just only shown or get 4 value only,
              	                     // otherwise shown array bound error.
              	
              	
//        Initialization :- 	
              	
              	             //  index (store value)      length(value assign)	
              	a[0]=10;     //    0                                1
              	a[1]=20;     //    1                                2 
		        a[2]=30;     //    2                                3 
		        a[3]=40;     //    3                                4
		       // a[4]=50;   //    4                                5   bound error
		       // a[5]=60;   //    5                                6   bound error
		
		System.out.println(a[2]);        //30
		        
		        
//*************************************  OR  **************************************************
		
		
		//        0  1  2  3  4   5
		int[] z= {10,20,30,40,50,60};
		
		System.out.println(z[4]);        //50
		
		
		
//	# value	
		
		 System.out.println(z);         //       [I@2626b418  
		 
		
		
		
		
		
	
		
	}

}
