package ejemplos;

public class E22_Onion {
	
	static int isOnionArray(int []a){
		int res=1;
		if(a.length==0){ return 1;}
		else{ if (a.length==1){return 0;}
		else{
			int j=0; int k=a.length-1;
			int sum= j+k+1;
		while (sum == a.length && j!=k && res==1){
			if(a[j]+ a[k]<=10){
				res=1;
				j++; k--;
				sum=j+k+1;
			}else {
				res=0;
				break;
			}
			
		}
		}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		
		System.out.println(isOnionArray(new int[]{1,2,19,4,5}));
		System.out.println(isOnionArray(new int[]{1,2,3,4,15}));
		System.out.println(isOnionArray(new int[]{1,3,9,8}));
		System.out.println(isOnionArray(new int[]{2}));
		System.out.println(isOnionArray(new int[]{}));		
		System.out.println(isOnionArray(new int[]{-2,5,0,5,12}));

	}

}
