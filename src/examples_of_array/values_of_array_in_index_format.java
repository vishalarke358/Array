//To show the values of array in index format. 

package examples_of_array;

public class values_of_array_in_index_format {

	private static final String n = null;
	private static String o;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//**************************************************************************
		
		
				{	                 // 1-D Array
				
				int[] a= {10,11,12,13,14,15};
						int b=a.length;
																
						System.out.println("Values of array in index format = ");
		
						{
							for(int i=0; i<=b-1; i++)
							{
								System.out.print("Index "+i+"= ");
								System.out.println(a[i]);
							}
						}
				}
				
			System.out.println();			
//****************************************************************************				
		    System.out.println(" ");				
						
						
				              // 2-D Array
		    
		    {
		      		    
		    	int [][] t= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		    	                int u =t.length;
	
		    	    	                
	            System.out.println("Values of array in index format= ");
		    	
		    {
		    	for(int j=0; j<=u-1; j++) 
		    	{
		    		for (int k=0; k<u; k++)
		    		{
		    			System.out.print("Index " +j+ "," +k+ " = ");
		    			System.out.println(t[j][k]);
		    		}
		    	}
		    }
		    	
		    }	
	}
}	    
	//		System.out.println();			
//****************************************************************************				
		   // System.out.println(" ");				
						
						
				              // 3-D Array
		    
		    //{
		    	
		    	
//		                       0                      1                       2                                              		    
//		 3 2 3   	     0         1           0           1           0           1
//	int [][][] e= {{{21,22,23},{25,26,27}},{{29,30,31},{33,34,35}},{{37,38,39},{40,41,42}}};
//                    0  1  2   0  1  2       0  1  2    0  1  2     0  1  2    0   1  2     
		    	                         
	        //                                 int f =e.length;
	       //                  System.out.println(f);
		    	    	                
	       //     System.out.println("Values of array in index format= ");
		    	
		   // {
	//	    	for(int l=0; l<=f-1; l++)       
		    //	{
		  //  		for (int m=0; m<l; m++)    
		  //  		{
		//    			for (int r=0; r<f; r++); 
		//    			{
		    			
			//			System.out.print("Index " +l+ "," +m+ "," +r+ " = ");
						
		  //  	//		System.out.println(e[l][m][r]);}
		    			
		//    		}
		    		
		    		
	//	    	}
	//	    }
		    	
//		    }		    
		    
		    
//	}

//}
