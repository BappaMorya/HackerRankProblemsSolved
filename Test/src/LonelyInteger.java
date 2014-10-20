import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class LonelyInteger {

	
	static int lonelyinteger(int[] a) {
        if (null == a || a.length == 0) {
            return 0;
        }
        int result = 0;
//        for (int value : s) {
//            result ^= value;
//        }
       Object[]arr = initMap(a).keySet().toArray();
        
        if (arr.length==1){
        	result = (Integer) arr[0];
        }
        
        return result;

    }
	
	private static Map<Integer,Integer> initMap(int []s){
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>(s.length);
		
		for(int value:s){
			if (mp.containsKey(value))
				mp.remove(value);
			else
				mp.put(value, 1);
		}
		
		return mp;
		
		
	}
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);
        in.close();
    }
	
	
	
}
