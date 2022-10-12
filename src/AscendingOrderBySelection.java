import java.util.Arrays;

public class AscendingOrderBySelection 
{
	public void makeAscending(int a[])
	{
		int i,j;
		int minimumEleIndex=0;
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
			  if(a[j]<a[minimumEleIndex])
			  {
				  minimumEleIndex=j;
			  }
				
			}	
			if(i!=minimumEleIndex)
			{
				int temp=a[i];
				a[i]=a[minimumEleIndex];
				a[minimumEleIndex]=temp;
						
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
		
		AscendingOrderBySelection asc=new AscendingOrderBySelection ();
		System.out.println("Array after sorting is:");
		asc.makeAscending(a);

	}

}
