package problems;

public class JumpGame {
public boolean jumpGame(int[] a){
	int max = 0;
	
	for(int i=0;i<a.length;i++){
		if(i>max){
			return false;
		}
		max = Math.max(a[i]+i, max);
	}
	return true;
}

public static void main(String[] args){
	JumpGame j = new JumpGame();
	int a[] = {2,3,1,1,4};
	boolean result = j.jumpGame(a);
	System.out.println("Result = "+result);
}

}
