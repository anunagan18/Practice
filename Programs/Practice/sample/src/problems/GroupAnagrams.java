package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] str){
		List<List<String>> result = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for(String s:str){
			char[] a = s.toCharArray();
			Arrays.sort(a);
			String keyStr = new String(a);
			if(!map.containsKey(keyStr)){
				List<String> list = new ArrayList<>();
				map.put(keyStr, list);
			}
			map.get(keyStr).add(s);
		}
		
		
		return new ArrayList<List<String>>(map.values());
	}
	
	public static void main(String[] args){
		GroupAnagrams g = new GroupAnagrams();
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		g.groupAnagrams(str);
	}
}
