package problems;

public class EvenAndOdd {

	public int[] separateEvenAndOdd(int[] num){
	int i =0;
	int j = num.length-1;
	
	while(i<j){
		if(num[i] % 2 == 0){
			i++;
			
		}else if(num[j] %2 == 1){
			j--;
		}else{
			int temp = num[i];
			num[i] = num[j];
			num[j] =temp;
			i++;
			j--;
		}
	}
	return num;

	}
	
	public static void main(String[] args){
		EvenAndOdd e = new EvenAndOdd();
		int[] num = {1,2,3,4,6,8,7,12};
		
		
		int[] result = e.separateEvenAndOdd(num);
		for(int i=0;i<result.length-1;i++){
			System.out.print("Result="+ result[i]);
		}
	}
}
