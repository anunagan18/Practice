package problems;

public class ZigZagConversion {

	public String zigzagconversion(String s, int numRows){
		char[] c = s.toCharArray();
        int len =c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0;i<sb.length;i++){
            sb[i] = new StringBuffer();
        }
        
        int i=0;
        while(i<len){
            for(int idx=0;idx<numRows && i<len;idx++){
                sb[idx].append(c[i++]);
                
            }
            for(int idx = numRows-2;idx>=1 && i<len;idx--){
                sb[idx].append(c[i++]);
            }
        }
        for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
		
	}
	
	public static void main(String[] args){
		ZigZagConversion z = new ZigZagConversion();
		String result  = z.zigzagconversion("PAYPALISHIRING", 3);
		
		System.out.println("Result =" +result);
	}
}

