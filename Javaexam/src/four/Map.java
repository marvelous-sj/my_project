package four;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap map1=new LinkedHashMap();
		map1.put("�й�","china");
		map1.put("����","amrican");
		map1.put("�ձ�","Japan");
		
		
		
		Set<String>set=map1.keySet();
		for(String k:set)
		{
			String value=(String) map1.get(k);
			System.err.println("<"+k+","+value+">");
		}
		
		
		map1.remove("����");

		Iterator<String> it=map1.keySet().iterator();
		while(it.hasNext())
		{
			String k=it.next();
			String value=(String) map1.get(k);
			System.err.println("<"+k+","+value+">");
		}
		
	
	}

}
