import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

	public static Map<Integer,Integer> getSquares(int[] arary)
	{
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int n : arary)
		{
			map.put(n, n*n);
		}
	
		return map;
		
	}
	
}
