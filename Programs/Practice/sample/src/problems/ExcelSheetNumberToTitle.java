package problems;

public class ExcelSheetNumberToTitle {
	public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n--;
            sb.append((char) ('A' + n%26));
            n=n/26;
        }
        return sb.reverse().toString();
    }
	
	public static void main(String[] args){
		ExcelSheetNumberToTitle e = new ExcelSheetNumberToTitle();
		String result = e.convertToTitle(2);
		System.out.println("Result" +result);
	}
}
