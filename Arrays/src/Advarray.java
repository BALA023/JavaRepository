public class Advarray {

	public static void main(String[] args) {
		
		int[] arr= {23,37,55,67,76,78,22,34,90};
		int l=arr[0]; 
				int s=arr[0];
		for(int x :arr) {
			if(x >= l) {
		   l = x;
		   }
			if(s >= x) {
				s =x;
			}
	    }
		System.out.println("Greatest Number : " + l);
		System.out.println("Smallest Number : " + s);
	}
}
