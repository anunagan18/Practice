package problems;

public class ExcelTitleToNumber {

	public int titleToNumber(String title){
		int result = 0;
		for(int i =0;i<title.length();i++){
			result = 26*result+ (title.charAt(i)-'A'+1);
		}
		
		return result;
	}
	
	public static void main(String[] args){
		ExcelTitleToNumber e = new ExcelTitleToNumber();
		int result = e.titleToNumber("BB");
		System.out.println("Result" +result);
	}
}
