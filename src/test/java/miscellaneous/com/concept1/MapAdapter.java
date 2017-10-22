package miscellaneous.com.concept1;

import java.util.HashMap;
import java.util.Map;

public class MapAdapter {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		Integer[][] arr={{2,4},{3,5},{5,6}};
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		for(Object [] mapping:arr)
		{
			map.put(mapping[0], mapping[1]);
		}
		System.out.println(map);
		
		
	}

}
