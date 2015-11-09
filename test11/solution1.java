public class solution1
{
	public int reverse(int x)
	{
		int res = 0;
		while (x != 0)
		{
			int rest_next = res*10 + x%10;
				x=x/10;
//			if (rest_next/10 != res)
//			{
//			}

			res = rest_next;
		}
		return res;

	}

	public static void main(String[] args) 
	{
		solution1 ss = new solution1();
		
		int a = ss.reverse(123);
		System.out.println("a = "+a);	
	}
}
