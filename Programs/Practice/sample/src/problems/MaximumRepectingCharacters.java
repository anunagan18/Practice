package problems;

public class MaximumRepectingCharacters {

	public char findMaxRepeatingCharacters(String s){
		int count = 1;
		int maxCount = 0;
		char result = 0;
		for(int i=0;i<s.length();i++){
			if(i< s.length()-1 && s.charAt(i) == s.charAt(i+1)){
				count++;
			}else{
				if(maxCount < count){
					maxCount = count;
					result = s.charAt(i);
				}
				count =1;
				
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args){
		MaximumRepectingCharacters m = new MaximumRepectingCharacters();
		String s = "aaaabbbbbbaaccde";
		char result = m.findMaxRepeatingCharacters(s);
		System.out.println("Result =" +result);
	}
}
