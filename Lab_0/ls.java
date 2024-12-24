import java.util.Scanner;
class linear{
	void lsearch(int a[], int n, int key){
		int count=-1,i;
		for(i=0;i<n;i++){
			if (key==a[i])
				count=i;
		}
		if(count==-1)
			System.out.println("unsuccessful search");
		else
			System.out.println("Key is found at index:"+count);
	}
}

public class ls{
	public static void main(String[] args){
		int a[] = new int[10];
		int n,key;
		Scanner p = new Scanner(System.in);
		linear l = new linear();
		System.out.print("Enter the size of Array: ");
		n=p.nextInt();
		System.out.print("Enter elements of the Array: ");
		for(int i=0;i<n;i++)
			a[i]=p.nextInt();
		System.out.print("Enter elements of list:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.print("Enter the key value:");
		key=p.nextInt();
		l.lsearch(a,n,key);		
	}
}
