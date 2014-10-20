import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		int N = Integer.parseInt(str.split(" ")[0]); // length of freeway
		int T = Integer.parseInt(str.split(" ")[1]); // tests
		String []wid = sc.nextLine().split(" ");
		int []width = new int[N];
		// convert to int array
		for (int i=0;i<wid.length;i++){
			width[i]=Integer.parseInt(wid[i]);
		}
		
		// take as string value // will convert to two integers at a later stage
		String []entexits = new String[T];
		for (int i=0;i<T;i++){
			entexits[i] = sc.nextLine();
		}

		solve(width,entexits);
		sc.close();
				
		
	}

	private static void solve(int []width, String []entexits) {
		
		// iterate of the ent exits
		for (String str: entexits){
			int ent = Integer.parseInt((str.split(" ")[0]));
			int exit = Integer.parseInt((str.split(" ")[1]));
			int min_width = Integer.MAX_VALUE;
			for (int i = ent;i<=exit;i++){
				if(width[i]<min_width)
					min_width = width[i];
			}
			
			System.out.println(min_width);
		}
		
	}
}
