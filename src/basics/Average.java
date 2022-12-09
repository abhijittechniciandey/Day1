package basics;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int arr[]= {10,20,30,40,50,10,10,80,90};
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int average=(sum/n);
		System.out.printf("The average is %d",average);
	}

}
