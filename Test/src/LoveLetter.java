import java.util.Scanner;


public class LoveLetter {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tests = sc.nextInt();
		String[] input = new String[tests];
		for(int i = 0 ;i<tests;i++){
			input[i] = sc.next();
		}
		solve(input);
		sc.close();
	}

	private static void solve(String[] input) {
		
		for (String str:input){
			recordChanges(str);
		}
		
	}

	private static void recordChanges(String str) {
		int changes = 0;
		char []ch = str.toCharArray();
		int i=0,j=ch.length-1;
		
		
		while(i<j){
			if(!(ch[i]==ch[j])){
				//System.out.println(ch[i] + "->"+  ch[j]);
				changes+= Math.abs(ch[i] - ch[j]);
			}
			i++;
			j--;
			
		}
		
		System.out.println(changes);
		
	}
	
}
