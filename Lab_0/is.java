import java.util.Scanner;
class insort{
	void isort(int a[],int n){
		int i, j, item;
   		for(i=0; i<n; i++) 
   		 {
        		item = a[i];
        		for(j=i-1; j>=0 && a[j]>item; j--){
            			a[j+1] = a[j];
        			a[j] = item;
			}		
		}			
	}
}
	
public class is{
	public static void main(String[] args){
		int a[] = new int[10];
		int n;
		Scanner p = new Scanner(System.in);
		insort is = new insort();
		System.out.print("Enter the size of Array: ");
		n=p.nextInt();
		System.out.print("Enter elements of the Array: ");
		for(int i=0;i<n;i++)
			a[i]=p.nextInt();
		System.out.print("Elements Before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		is.isort(a,n);
		System.out.print("Elements After sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();		 	
	}
}
