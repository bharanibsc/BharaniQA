package array;

public class Task1 {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array	
		//int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int a[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	     int sum=0;
	    
	      for (int i = 0; i < a.length; i++) {
	    	  sum =sum+a[i];	
		}
	      System.out.println("Sum values of an array :"+sum);
	      
	    //Write a Java program to calculate the average value of array elements.
	  	int b[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int sum2=0;
	     
	       for (int i = 0; i < a.length; i++) {	   
	    	   sum2=sum2+b[i];
	  	}
	       double avg = sum2/b.length;
	       System.out.println("average value of array:" + avg);
	}

}
