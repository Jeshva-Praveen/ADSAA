import java.util.Scanner;
class bubble {
	void bsort(int a[],int n){
		int t;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;		
				}			
			}
		}
	}
}
public class bs{
	public static void main(String[] args){
		int a[] = new int[10];
		int n;
		Scanner p = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		n=p.nextInt();
		System.out.print("Enter elements of the Array: ");
		for(int i=0;i<n;i++)
			a[i]=p.nextInt();
		System.out.print("Elements Before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		bubble b = new bubble();
		System.out.println();
		b.bsort(a,n);
		System.out.print("Elements After sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();		 	
	}
}
