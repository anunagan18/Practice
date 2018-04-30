package problems;

public class FirstUniqueCharacter {

	public int firstUniqueCharacter(String s){
		int[] freq =  new int[26];
		for(int i=0;i<s.length();i++){
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++){
			if(freq[s.charAt(i)-'a']==1){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		FirstUniqueCharacter f = new FirstUniqueCharacter();
		int i = f.firstUniqueCharacter("fffffl");
		System.out.println("Index = "+i);
	}
}
