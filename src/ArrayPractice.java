import java.util.Random;

public class ArrayPractice 
{

	public static void main(String[] args) 
	{
		Random rand=new Random();
		int[] arr; //created array variable, but no array~!
		//arr= new int[20]; //create an array and store its reference into "arr" ..
		
		arr= new int[rand.nextInt(21)+10]; //newew //use rand.nextInt(range your looking for)+minimum value
		
		
		//3rd element in array equal to 5;
		arr[2]=5; //3rd slot, (0,1,2) || sets element at index 2 equal to 5.
		
		System.out.println(arr[2]); 
		
		
		
		
		//for loop, initialize every element into a random number(0-50)
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]=rand.nextInt(50));
			
			
		}
		
		
		
		//for loop, use prntln, print every value in every index
		for(int i=0;i< arr.length;i++) //use  {{.length}} instead of 20, for use of any array
		{
			System.out.println(arr[i]); //prints each individual element, this is CORRECTAMUNDO, very common to do "i"(i=iterator)
		}
	    //(start at 0, end when length is done), want to think in general terms
		
		
		
		//int something= arr[0]
		//for(int i=0; i< arr.length; i++)
		//if(arr[i]> something)
		//something=arr[i];
		
		//array should be the counter
		
		//count[sum-2]++
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
