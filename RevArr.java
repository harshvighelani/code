public class RevArr
{
	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5};
		int i, temp;
		for(i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i]=arr[4-i];
			arr[4-i]=temp;
		}
		System.out.println("reverse array: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}