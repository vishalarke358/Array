//                                      Array


//    Definition:-
//             It is collection of similar data type.

//         IMP:-
//             -Array is an object = for fixing size of array we use new keyword.
//             -store in heap memory.
//             -The size of array not be fixed because we use in different size
//              -ex.
//                   int[] a={10,20,30,40,50};
//                   int[] a={10,20,30};
//                   int[] a={10,20};



//      Advantages of array:-
//           1) We can store number of similar data type values in a one reference variable.
//               ex.
//                   int[] a={10,20,30,40,50};
//                   char[] b={'d','e','r','t'};

//           2) Optimization of code.

//           3) Randomly we can use values.

//           4) Increases the memory efficiency.



//      Disadvantages of array:-
//                 1) We can use only similar data type values in single array.

//                 2) fixed size=5
//                   ex.            
//                         int[] a={10,20,30,40,50};
//                         - here 05 values we return hence this size is fixed in memory.

//                3) Memory Waste
//                        -ex.
//                         int[] a=   { |10|20|30|40|50|  }

//                           - here if we not write any value here then, size of the memory 
//                             waste bcaz its value data type taken as default value.

//                                -int[] a=   { |10|20|30|40||  } then,

//-here system take automatically default value  -int[] a=   { |10|20|30|40|0|  }


//                4) Reduced performance.
//                         here memory occupation is done on the index format.
//                         -index format =0 1 2 3 4 5

//                 -If we initialize int array 

//                    0 1 2 3 4                      999
//               ex. |1|2|3|4|5|...................|1000|
//
//            - then if we delete any value of the given memory, then 
//                shifting of value takes place

//                    0 1 2 3 4                      998
//               ex. |1|2|3|4|6|...................|1000|

//                   Hence, the performance gets reduces.



// Types of array:-

//01- Dimensional./ (1-D array)
//     -ex.
//           int[] a={10,20,30,40,50}

//02- Dimensional. /(2-D array)

//-     ex.              0 1 2    0 1 2    0 1 2    0  1  2    0  1  2 -(COULMN)
//            int[] b={0{1,2,3},1{4,5,6},2{6,7,8},3{9,10,11},4{12,3,14}}
//                     |        |        |        |          |
//                    (ROW)    (ROW)    (ROW)    (ROW)      (ROW)

//- here VALUE store on matrices format.


//                                  COULMNS

//                           0            1        2         
//            
//               0          (0,0)      (0,1)     (0,2)     

//               1          (1,0)      (1,1)     (1,2)     
//   ROWS:   
//               2          (2,0)      (2,1)     (2,2)    

//               3          (3,0)      (3,1)     (3,2)    

//               4          (4,0)      (4,1)     (4,2)    





//03- Dimensional./(3-D array)

//                            0                      1                       2                                              		    
//		 3 2 3   	     0         1           0           1           0           1
//	int [][][] e= {{{21,22,23},{25,26,27}},{{29,30,31},{33,34,35}},{{37,38,39},{40,41,42}}};
//                    0  1  2   0  1  2       0  1  2    0  1  2     0  1  2    0   1  2     
		    


//- here VALUE store on matrices format.


//                                      COULMNS

//                           0               1          2       
//            
//               0          (0,0,0)      (0,0,1)     (0,0,2)    
//   ROWS:  0
//               1          (0,1,0)      (0,1,1)     (0,1,2)    
//    
              




//                                      COULMNS

//                           0               1          2       
//            
//               0          (1,0,0)      (1,0,1)     (1,0,2)    
//  ROWS:  1
//               1          (1,1,0)      (1,1,1)     (1,1,2)    
 




//                                      COULMNS

//                           0               1          2       
//            
//               0          (2,0,0)      (2,0,1)     (2,0,2)    
//  ROWS:  2
//               1          (2,1,0)      (2,1,1)     (2,1,2)    
 













