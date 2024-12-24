import java.util.Scanner;
class ssort{
	void sel(int a[],int n){
		 int i,j,minpos,temp;
		 for(i=0;i<n-1;i++)
    		{
        		minpos=i;
        		for(j=i+1;j<n;j++)
        		{
           			if(a[j]<a[minpos])
                			minpos=j;
        		}
        		temp=a[i];
        		a[i]=a[minpos];
       			a[minpos]=temp;

		}
	}	
}
	
public class ss{
	public static void main(String[] args){
		int a[] = new int[10];
		int n;
		Scanner p = new Scanner(System.in);
		ssort s = new ssort();
		System.out.print("Enter the size of Array: ");
		n=p.nextInt();
		System.out.print("Enter elements of the Array: ");
		for(int i=0;i<n;i++)
			a[i]=p.nextInt();
		System.out.print("Elements Before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		s.sel(a,n);
		System.out.print("Elements After sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();		 	
	}
}


