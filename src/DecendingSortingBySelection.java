import java.util.Arrays;

public class DecendingSortingBySelection 
{
	public void makeDecending(int a[])
	{
		int i,j;
		int maximumEleIndex=0;
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
			  if(a[j]>a[maximumEleIndex])
			  {
				 maximumEleIndex=j;
			  }
				
			}	
			if(i!=maximumEleIndex)
			{
				int temp=a[i];
				a[i]=a[maximumEleIndex];
				a[maximumEleIndex]=temp;
						
			}
						
		}
		for(int x:a)
		{
			System.out.print(x+ " ");
		}
		
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {5,4,7,1,3,9,45,78,12,2};
		System.out.println("Array before sorting:");
		System.out.println(Arrays.toString(a));
		
		DecendingSortingBySelection d=new DecendingSortingBySelection ();
		System.out.println("Array after sorting is:");
		d.makeDecending(a);

		

	}

}
