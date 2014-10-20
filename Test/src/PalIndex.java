import java.util.Scanner;

public class PalIndex {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		String []in = new String[tests];
		int i=0;
		while(tests>0 && i<in.length){
			tests--;
			in[i] = sc.next();
			i++;
		}
		
		for (String str : in){
			System.out.println(solve(str));
		}	
		sc.close();
		
	}

	private static int solve(String s) {
		
		char []chs = s.toCharArray();
		if (isPalindrome(s)) return -1;
		
		
		for (int i=0;i<chs.length;i++){
			
			if ((i==0))
			{		
				if(isPalindrome(s.substring(i+1,chs.length)))
					return i;
			}
			
			if ((i==chs.length-1)){
				if(isPalindrome(s.substring(0,i)))
					return i;
			
			}
			
			if ( i!=0 && i!=chs.length-1  ){
				
				if (isPalindrome(s.substring(0,i) + s.substring(i+1,chs.length)  ) ){
					return i;
				}
			}
			
		}
		return -1;
		
	}

	private static boolean isPalindrome(String s) {

		char[] chs = s.toCharArray();
		int i = 0;
		int j = chs.length - 1;
		while (i < j) {
			if (!(chs[i] == chs[j])) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
