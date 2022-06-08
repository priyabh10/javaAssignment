class ArrayDemo2{
	public static void main(String[] args){
		int[] arr = new int[10];
		
		// initialization
		for(int i=0;i<arr.length;i++){
			arr[i] = (i+1)*10;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int val : arr){
			System.out.print(val+" ");
			val = 20;// this will not reflect in an array
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}