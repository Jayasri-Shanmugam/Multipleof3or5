package PythontoJava;
/*
 If we list all the natural numbers below 10 
 that are multiples of 
3 or 5
, we get 
 and 
. The sum of these multiples is 23
.

Find the sum of all the multiples of 
3 or 5 
 below 1000
.

*/

public class Multiple0f3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		for(int i=3;i<1000;i++)
		{
			 if(i%3==0||i%5==0)
			{
				sum1+=i;
			}
			
		}
		System.out.println(sum1);
  /*  for(int i=5;i<10;i++)
    {
    	if(i%5==0)
    	{
    		sum2+=i;
    	}
    }
    System.out.println(sum2);
    System.out.println(sum1+sum2);*/
	}

}
