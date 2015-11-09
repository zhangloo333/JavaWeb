class ReverseString
{
	public String revers(String ss)
	{
		if (ss == "" || ss.length() == 0)
		{
			return " ";
		}
		else
		{
			String [] array = ss.split(" ");

			StringBuilder sb = new StringBuilder();
			for (int i =array.length-1; i>=0 ;--i) // forget a anousement i  and > = not >
			{
				if (!array[i].equals(""))
				{
					sb.append(array[i]).append(" ");
				}
			}


			return sb.length() == 0 ? " " : sb.substring(0, sb.length()-1);
		
		}
	
	}
	public static void main(String[] args) 
	{
		ReverseString rs = new ReverseString();
		String s = rs.revers("Hello World!");
		System.out.println(s);
	}
}


public class Solution {
    public void reverseWords(char[] s) {
        if (s.length == 0) return;
        reverse(s, 0, s.length-1);
        int last = 0;
        for (int i=0; i<s.length; i++) {
            if (s[i] == ' ') {
                reverse(s, last, i-1);
                last = i + 1;
            }
        }
    }
    
    public void reverse(char[] s, int l, int r) {
        while (l <= r) {
            int temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}