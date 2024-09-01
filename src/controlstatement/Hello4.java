package controlstatement;

public class Hello4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
		      for (int j = i + 1; j <= 3; j++) {
		        System.out.println(j);
		      }
		    }
	}
}

// inti=1   1<=3  j=2(1+1)  2<=3    2    2+1=3
//                j=3       3<=3    3    3+1=4
//                j=4       4<=3   false          -    1+1=2
//inti=2   2<=3   j=3       3<=3    3   3+1=4
//                j=4       4<=3   false          -    2+1=3
//inti=3   3<=3   j=4       4<=3   false               3+1=4
//int i=4   4<=4   false 
