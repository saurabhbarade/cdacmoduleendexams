import java.util.*;
class Insertion{
	static void insertionSort(int a1[],int n){
		for(int i=1; i<n; i++){
			int k=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>k){
				a1[j+1]=a1[j];
				j--;
				for(int a:a1){
					System.out.print(a+" ");
				}
				System.out.println();
			}
			a1[j+1]=k;
		}
		for(int a2:a1){
			System.out.print(a2+" ");
		}
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1[] = new int[n];
		for(int i=0; i<n; i++){
			a1[i]= sc.nextInt();
		}
		
		insertionSort(a1,n);
		
}
}