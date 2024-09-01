package controlstatement;

public class Hello2 {
	public static void main(String[] args) {
		
		 for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(i);
		      }		
	}
}}
   
//     1      2     a     b      c      d      3     4 
//int i=1   1<=3   j=1   1<=3     1    1+1=2  
//                 j=2   2<=3     1   2+1=3
//                 j=3   3<=3     1   3+1=4
//                 j=4   4<=4    false         1     1+1=2
//int i=2   2<=3   j=1   1<=3     2    1+1=2    
//                 j=2   2<=3     2    2+1=3
//                 j=3   3<=3     2    3+1=4
//                 j=4   4<=4     false        2     2+1=3 
//int i=3   3<=3    j=1   1<=3    3     1+1=2   
//                 j=2   2<=3     3    2+1=3
//                 j=3   3<=3     3    3+1=4
//                 j=4   4<=4    false         3     3+1=4
//int i=4   4<=3  false 
 