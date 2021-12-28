package dec20;



public class dec20 {
	//_____________________________________________3rd program______________________

public static int First(int t) {
	int[] arr= {1,2,3,3,3,3,3,4,5,6};
	
	int start=0;
	
	int end=arr.length-1;
	int f=-1;
	
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(t==arr[mid]) {
			f=mid;
			end=mid-1;
			
		}else if(t<arr[mid]) {
			end=mid-1;
		}else {
			start=mid+1;
		}
	}
	return f;
	
}

public static int last(int t) {
	int[] arr= {1,2,3,3,3,3,3,4,5,6};
	
	int start=0;
	
	int end=arr.length-1;
	
	int l=-1;
	
	while(start<=end) {
		int mid=start+(end-start);
		
		if(t==arr[mid]) {
			l=mid;
			start=mid+1;
			
		}else if(t<arr[mid]) {
			end=mid-1;
		}else {
			start=mid+1;
		}
	}
	return l;


	

}
//finf frquency of a target number__________________________________________________



	public static void main(String[] args) {
		System.out.println("first   :"+First(3));
		System.out.println("last  :"+last(3));

		//first problem___________________________________________________________________-
		int arr[]= {-1,0,3,5,9,12};
		
		
		
		int start=0;
		int end=arr.length-1;
		int t=9;
		int mid;
		
		while(start<=end) {
			mid=start+(end-start)/2;
			
			if(t==arr[mid]) {
				System.out.println("index no of target is  :"+mid);
				break;
			
				
				
				
			}else if(t<arr[mid]) {
				end=mid-1;
				
			}else {
				start=mid+1;
			}
			
		}
//2nd problem________________________________________________________________
		int x=25;
		int first=0 ;
		int last=x;
		int ans=0;
		boolean flag1=true;
		
		if(x==0 || x==1) {
			System.out.println(x);
		}
		
		while(first<=last) {
			int m=first+(last-first)/2;
			
			if(m*m==x) {
				flag1=false;
				System.out.println("squareroot no  :"+m);
				break;
				
			}else if(m*m<x) {
				first=m+1;
				ans=m;
				
			}else {
				last=m-1;
				
			}
			
			
		}
		if(flag1) {
			System.out.println("squareroot no  :"+ans);	
			
		}
		
		
		
	}

}
