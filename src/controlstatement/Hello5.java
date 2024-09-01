package controlstatement;

public class Hello5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
		      for (int j = i + 1; j <= i; j++) {
		        System.out.println(j);
		      }
		    }
	}
}
//   1        2      a      b         c       d      3      4
//int i=1    i<=3   j=2    2<=1     false                  1+1=2
//int i=2    2<=3   j=3    3<=1     false 