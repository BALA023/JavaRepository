
public class Source {

	public static void main(String[] args) {
		int[] arr= {23,37,55,67,76,78,22,34,90};
		int sumo = 0;
		int sume = 0;
		for(int i =0; i<arr.length; i++) {
			if((arr[i]%2)==0) {
		    sume += arr[i];
			}
			else {
			sumo += arr[i];
			}

		}
	System.out.println("Sum of odd numbers is: "+ sumo);
	System.out.println("Sum of even numbers is: "+ sume);

}
}
