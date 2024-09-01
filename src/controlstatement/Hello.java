package controlstatement;

public class Hello {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(j);
		      }
		    
	}
}}

//     1      2    a    b     c       d      4
//int i =1   1<=3  j=1  1<=3   1     1+1=2 
//                 j=2  2<=3   2     2+1=3
//                 j=3  3<=3   3     3+1=4
//                 j=4  4<=3  false          
//int i =2   2<=3  j=1  1<=3   1     1+1=2 
//                 j=2  2<=3   2     2+1=3
//                 j=3  3<=3   3     3+1=4
//                 j=4  4<=3  false    
//int i =3   3<=3  j=1  1<=3   1     1+1=2 
//                 j=2  2<=3   2     2+1=3
//                 j=3  3<=3   3     3+1=4
//                 j=4  4<=3  false   